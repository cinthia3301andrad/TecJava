
abstract class Conta {
    private String tipo;
    private int id;
   
    double saldo = 0;

    Conta(String tipo, int id, double saldo) {
        this.tipo = tipo;
        this.id = id;
        this.saldo = saldo;

    }
    Conta(int id, String tipo ) {
        this.tipo = tipo;
        this.id = id;

    }
    public String toString(String id, String tipo, double saldo) {
        String s = "[ ";
        s += "Tipo: " + tipo;
        s += "Id: " + id;
        s += "Saldo: " + saldo;
        s += " ]";
        return s;
    }

    //Aqui temos o polimorfismo do tipo coerção

    abstract void debitar(double valor);
    abstract void creditar(double valor);

    int getId() {
        return this.id;
    }
    void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    double consultarSaldo() {
        return this.saldo;
    }

}