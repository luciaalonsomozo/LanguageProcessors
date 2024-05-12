package ast.Expressions.Accesses;
import exc.BindingException;
import exc.GCodingException;
import exc.TypingException;
import ast.Types.KindT;
import java.util.List;
import ast.Instructions.IDeclaration;
import ast.Types.TStruct;
import ast.Definitions.DStruct;
import ast.ASTNode;
import ast.Program;

public class AStruct extends A {
    private A access;
    private String field;
    private IDeclaration fieldNode;
    private static List<DStruct> ds;

    public AStruct(A ac, String f){
        this.access = ac;  
        this.field = f;
    }

    @Override
    public String toString(){
        return "AStruct(" + access.toString() + "." + field + ")";
    }
    @Override
    public void bind() throws BindingException {
        access.bind();
        this.bindNode = access.bindNode;
    }

    public void setListStructs(List<DStruct> structs){
        this.ds = structs;
    }

    public void type() throws TypingException {
        access.type();
        boolean foundField = false;
        // comprobamos si access es de tipo struct 
        if(access.getType().kind().equals(KindT.STRUCT)) {
            DStruct found;
            for(DStruct s: ds){
                if(s.getName().equals(access.getType().toString())){
                    found = s;
                    List<IDeclaration> fields = ((DStruct) found).getFields();
                    for(IDeclaration i: fields){
                        if(i.getName().equals(field)){
                            setType(i.getType());
                            foundField = true;
                            fieldNode = i;
                        }
                    }
                    break;
                }
            }
            if(!foundField){
                throw new TypingException("Error. Field " + field + " not found in struct.");
            }
        }
        else {
            throw new TypingException("Error typing in array "+ access.toString() + ".");
        }     
    }

    public void calculateAddress() {
        Program.getCode().println(" ;;generating code for struct access" + access.toString());
        access.calculateAddress();
        Program.getCode().println(" i32.const " + fieldNode.getDelta()); //cogemos el delta del struct
        Program.getCode().println(" i32.add"); //lo sumamos
        Program.getCode().println(" ;;end of generating code for struct access" + access.toString());
    }

    public KindA kindA(){
        return KindA.STRUCT;
    }
}
