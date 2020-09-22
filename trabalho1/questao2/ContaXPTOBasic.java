
public class ContaXPTOBasic extends Conta{
    
    //Aqui temos polimorfismo de sobrecarga
    ContaXPTOBasic(String tipo, int id, double saldo){
        super("ContaXPTOBasic", id, saldo);
    }
    ContaXPTOBasic(int id){
        super(id, "ContaXPTOBasic");
    }

    void debitar(double valor) {
        this.saldo-=valor;
    }
    void creditar(double valor) {
        this.saldo+=valor;
    }

}