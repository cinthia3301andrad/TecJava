
public class ContaXPTOExtreme extends Conta{
        //Polimorfismo de sobrecarga
        public ContaXPTOExtreme(String tipo, int id, double saldo){  
            super("ContaXPTOExtreme", id, saldo );
        }
        //Aqui temos um polimorfirmo de inclusão
        public ContaXPTOExtreme(int id) {
            super(id, "ContaXPTOExtreme");
        }

        public void creditar(double valor){
            this.saldo += valor + (valor*0.002);
    
        }
    
        public void debitar(double valor){
            this.saldo -= valor;
            this.saldo += (valor*0.002);
        }
}