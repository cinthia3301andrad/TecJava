public class Sistema {

    private String id;
    private String tipo;
    private double saldo;

    void ContaXPTOBasic(String id) {
        toString(id,"Conta XPTO Basic", 0 );
    }
    void ContaXPTOExtreme(String id) {
        toString(id,"Conta XPTO Extreme", 0 );
    }
    void ContaXPTOPlus(String id) {
        toString(id,"Conta XPTO Plus", 0 );
    }
    
    public String toString(String id, String tipo, double saldo) {
        String s = "[ ";
        s += "Tipo: " + tipo;
        s += "Id: " + id;
        s += "Saldo: " + saldo;
        s += " ]";
        return s;
    }

}
 

