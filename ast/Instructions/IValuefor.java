package ast.Instructions;

import java.util.List;

import ast.Program;
import ast.Expressions.Accesses.A;
import exc.*;
import ast.Types.*;
import ast.Definitions.DTypedef;

public class IValuefor extends IBlock {
    private A var;
    private List<ValueforInstruction> cases;
    private ValueforInstruction defaultCase;

    public IValuefor(A exp, List<ValueforInstruction> cases) {
        super();
        this.cases = cases;
        this.var = exp;
        this.defaultCase = null;
    }
    public IValuefor(A exp, List<ValueforInstruction> cases, ValueforInstruction defaultCase) {
        super();
        this.cases = cases;
        this.var = exp;
        this.defaultCase = defaultCase;
    }

    public KindI kind() {
        return KindI.VALUEFOR;
    }

    public String toString(){
        if(defaultCase == null){
            return "valuefor(" + var.toString() + ")" + cases.toString();
        }
        return "valuefor(" + var.toString() + ")" + cases.toString() + ", " + defaultCase.toString();
    }

    public void bind() throws BindingException{
        var.bind();
        for(ValueforInstruction s: cases){
            s.bind();
        }
        if(defaultCase != null){
            defaultCase.bind();
        }
    }

    public void type() throws TypingException {
        var.type();
        if(!var.getType().kind().equals(KindT.BOOL) && !var.getType().kind().equals(KindT.INT)){
            throw new TypingException("Valuefor only gets type Int or type Bool. It is getting " + var.getType().toString());
        }

        for(ValueforInstruction s: cases){
            s.type();
            if(!s.getType().kind().equals(var.getType().kind())){
                throw new TypingException("A case of value for gets " + s.getType().toString() + " and expected " + var.getType().toString());
            }
        }
        if(defaultCase != null){
            defaultCase.type();
            if(!defaultCase.getType().kind().equals(var.getType().kind())){
                throw new TypingException("A case of value for gets " + defaultCase.getType().toString() + " and expected " + var.getType().toString());
            }
        }
    }

    public int setDelta(int delta){
        return delta;
    }

    public void generateCode() throws GCodingException {

        Program.getCode().println(" block $break"); 
        for(int i = 0; i < cases.size(); i++){
            Program.getCode().println(" block");
        }
        if(defaultCase != null){
            Program.getCode().println(" block");
        }
        for(int i = 0; i < cases.size(); i++){
            var.calculateAddress();
            cases.get(i).generateCode();
            Program.getCode().println(" i32.store");
            Program.getCode().println(" br $break");
            Program.getCode().println(" end");
        }

        if(defaultCase != null){
            var.calculateAddress();
            defaultCase.generateCode();
            Program.getCode().println(" i32.store");
            Program.getCode().println(" br $break");
            Program.getCode().println(" end");
        }
        Program.getCode().println(" end");
    }

    public int maxMemory(){
        return 0; //no se permiten declaraciones
    }

    public void typedef(List<DTypedef> typedefs){}
}
