package alex;

import asint.ClaseLexica;

public class ALexOperations {
   private AnalizadorLexicoTiny alex;
   public ALexOperations(AnalizadorLexicoTiny alex) {
      this.alex = alex;   
   }
   public UnidadLexica unidadImport(){
      return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.IMP); 
   }
   public UnidadLexica unidadId() {
      return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.IDEN,alex.lexema()); 
   } 
   public UnidadLexica unidadArchivo(){
      return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.FILE,alex.lexema()); 
   }
   public UnidadLexica unidadTipoInt() {
      return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.TYPEINT); 
   }
   public UnidadLexica unidadTipoBool() {
      return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.TYPEBOOL); 
   }
   public UnidadLexica unidadTipoVoid() {
   return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.VOID); 
   } 
   public UnidadLexica unidadEnt() {
      return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.ENT, alex.lexema()); 
   }  
   public UnidadLexica unidadTrue() {
      return new UnidadLexica(alex.fila(),alex.columna(), ClaseLexica.TRUE, alex.lexema());
   }
   public UnidadLexica unidadFalse() {
      return new UnidadLexica(alex.fila(),alex.columna(), ClaseLexica.FALSE, alex.lexema());
   }
   public UnidadLexica unidadList(){
      return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.LIST);
   }
   public UnidadLexica unidadSuma() {
      return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.SUM); 
   } 
   public UnidadLexica unidadResta() {
      return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.SUB); 
   } 
   public UnidadLexica unidadMul() {
      return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.MUL); 
   } 
   public UnidadLexica unidadDiv() {
      return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.DIV); 
   }
   public UnidadLexica unidadMod() {
      return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.MOD); 
   }
   public UnidadLexica unidadSumLista() {
      return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.SUML); 
   }
   public UnidadLexica unidadProdLista() {
      return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.PRODL); 
   }
   public UnidadLexica unidadMayor() {
   return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.GREATER);
   }
   public UnidadLexica unidadMenor() {
   return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.LESS);
   }
   public UnidadLexica unidadMayorIgual() {
   return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.GREQ);
   }
   public UnidadLexica unidadMenorIgual() {
   return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.LEQ);
   }
   public UnidadLexica unidadDistinto() {
      return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.DISTINCT);
   }
   public UnidadLexica unidadIgualdad() {
   return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.EQUAL);
   }
   public UnidadLexica unidadAnd() {
   return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.AND);
   } 
   public UnidadLexica unidadOr() {
      return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.OR);
   }
   public UnidadLexica unidadNegacion() {
   return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.NOT);
   }
   public UnidadLexica unidadPAp() {
      return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.PAP); 
   } 
   public UnidadLexica unidadPCierre() {
      return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.PCIERRE); 
   }
   public UnidadLexica unidadCAp() {
   return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.CAP); 
   } 
   public UnidadLexica unidadCCierre() {
   return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.CCIERRE); 
   }
   public UnidadLexica unidadLLAp() {
   return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.LLAP); 
   } 
   public UnidadLexica unidadLLCierre() {
   return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.LLCIERRE); 
   }  
   public UnidadLexica unidadIgual() {
      return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.IGUAL); 
   } 
   public UnidadLexica unidadComa() {
      return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.COMA); 
   }
   public UnidadLexica unidadPuntoYComa() {
   return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.PUNTOYCOMA); 
   }
   public UnidadLexica unidadWhile() {
      return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.WHILE);
   }
   public UnidadLexica unidadFor() {
      return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.FOR);
   }
   public UnidadLexica unidadRepeat(){
      return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.REPEAT);
   }
   public UnidadLexica unidadIf() {
   return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.IF);
   }
   public UnidadLexica unidadElse() {
   return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.ELSE);
   }
   public UnidadLexica unidadStruct() {
   return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.STRUCT);
   }
   public UnidadLexica unidadSwitch() {
   return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.SWITCH);
   }
   public UnidadLexica unidadValueFor() {
      return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.VALUEFOR);
      }
   public UnidadLexica unidadCase() {
   return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.CASE);
   }
   public UnidadLexica unidadBreak() {
      return new UnidadLexica(alex.fila(),alex.columna(), ClaseLexica.BREAK);
   }
   public UnidadLexica unidadDefault() {
   return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.DEFAULT);
   }
   public UnidadLexica unidadReturn() {
   return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.RETURN);
   }
   public UnidadLexica unidadShow() {
   return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.SHOW);
   }
   public UnidadLexica unidadRead() {
   return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.READ);
   }
   public UnidadLexica unidadEof() {
      return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.EOF); 
   }
   public UnidadLexica unidadAmpersand(){
      return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.AMPERSAND);
   }
   public UnidadLexica unidadPunto(){
      return new UnidadLexica(alex.fila(),  alex.columna(), ClaseLexica.PUNTO);
   }
   public UnidadLexica unidadDosPuntos(){
      return new UnidadLexica(alex.fila(),  alex.columna(), ClaseLexica.DOSPUNTOS);
   }
   public UnidadLexica unidadTypedef(){
      return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.TYPEDEF);
   }
   public UnidadLexica unidadFlecha(){
      return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.FLECHA);
   }
   public UnidadLexica unidadNew(){
      return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.NEW);
   }
   public UnidadLexica unidadConstante(){
      return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.CONST);
   }
   public void error() {
      System.err.println("***"+alex.fila()+", "+alex.columna()+" Caracter inesperado: "+alex.lexema());
   }
}