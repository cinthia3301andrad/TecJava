import java.util.*;
public class Sistema {

    ArrayList<Conta> contas = new ArrayList<Conta>();
    int auxId;



    public void criarContaXPTOBasic(int id) {
        checarId(id);
        contas.add(new ContaXPTOBasic(id));
     }
    public void criarContaXPTOExtreme(int id) {
        checarId(id);
        contas.add(new ContaXPTOExtreme(id));

    }
    public void criarContaXPTOPlus(int id) {
        checarId(id);
        contas.add(new ContaXPTOPlus(id));
    }

    public void debitar(int id, double valor){
        searchById(id).debitar(valor);

    }

    public void creditar(int id, double valor){
        searchById(id).creditar(valor);       
        
    }

    public double consultarSaldo(int id){
        return searchById(id).consultarSaldo();
        
    }

    public Conta searchById(int id){
        for(Conta c:contas){
            if(c.getId()==id){
                return c;
            }
        }
        return null;
    }

        // Aqui teremos polimorfismos de sobrecarga 
        private void checarId(int id) {
            if (id > auxId) {
                auxId = id;
            }
    
        }
        public void criarContaXPTOBasic() {
            criarContaXPTOBasic(++auxId);
        }
        
        public void criarContaXPTOPlus() {
            criarContaXPTOPlus(++auxId);
        }
        
        public void criarContaXPTOExtreme() {
            criarContaXPTOExtreme(++auxId);
        }
    
    

}
 

