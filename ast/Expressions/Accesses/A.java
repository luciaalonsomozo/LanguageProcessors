package ast.Expressions.Accesses;

import ast.Expressions.E;
import ast.Expressions.KindE;
import exc.*;
import ast.Program;

public abstract class A extends E{
    
    public KindE kindExp(){
        return KindE.ACCESS;
    }

    public void calculateAddress() {};

    public void generateCode() throws GCodingException {
        Program.getCode().println(" ;;generating code for access");
        calculateAddress(); //calculamos la direccion del acceso
        Program.getCode().println(" i32.load"); //se va a la memoria con la posicion calculada y lo trae
        Program.getCode().println(" ;;end generating code for access");
    }

    public abstract KindA kindA();
}
