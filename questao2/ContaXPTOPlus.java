
public class ContaXPTOPlus extends Conta{ 
  
    //Polimorfismo de sobrecarga
    public ContaXPTOPlus(String tipo, int id, double saldo){  
        super("ContaXPTOPlus", id, saldo );
    }
    //Aqui temos um polimorfirmo de inclusão
    public ContaXPTOPlus(int id) {
        super(id, "ContaXPTOPlus");
    }

    public void debitar(double valor){
        this.saldo -= valor;
    }
    public void creditar(double valor){
        this.saldo += valor+(valor*0.005);
    }
}