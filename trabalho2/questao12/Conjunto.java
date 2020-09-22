
import java.util.Arrays;

class Conjunto
{
    int vetConjunto[];
    int tamanho;
    int cont;
    
    void getConjunto (Conjunto c1){
        System.out.println(Arrays.toString(c1.vetConjunto));
    }
       
    Conjunto(int valor) {
        vetConjunto = new int[valor];
        tamanho = valor;
        cont = 0;
    }

    void Inserir(int valor) {
        if(Pertence(valor)){
            return;
        }
        vetConjunto[cont] = valor;
        cont += 1;
    }

    boolean Pertence(int valor) {
        for(int i = 0; i < cont; i++) {
            if(valor == vetConjunto[i]) {
                return true;
            }
        } 
        return false;
    }

    boolean SubConjunto(Conjunto c2){
        int aux = 0;

        for(int i = 0; i < c2.tamanho; i++){
            for(int j = 0; j < tamanho; j++){
                if(c2.vetConjunto[i] == vetConjunto[j]){
                    aux += 1;
                }
            }
        }    
        if(aux == cont){
            return true;
        }    
        return false;
    }
    int[] Uniao(Conjunto c2) {
        Conjunto conjAux = new Conjunto(tamanho+c2.tamanho);
        int novo[] = new int[tamanho+c2.tamanho];
        conjAux.vetConjunto = novo;
        int aux = 0;
        for(int i = 0; i < cont; i++){
            novo[i] = vetConjunto[i];
            aux += 1;
        }
        for(int i = 0; i < c2.cont; i++){
            if(!(Pertence(c2.vetConjunto[i]))){
                novo[aux] = c2.vetConjunto[i];
                aux += 1;
            }
        }
        
        return novo;
    }

    int[] Interseccao(Conjunto c2) {
        Conjunto conjAux = new Conjunto(tamanho);
        int novo[] = new int[tamanho+c2.tamanho];
        conjAux.vetConjunto = novo;
        for(int i = 0; i < c2.cont; i++){
            if(Pertence(c2.vetConjunto[i])){
                novo[i] = c2.vetConjunto[i];
            }
        }
        
        return novo;
    }
    void Diferenca(Conjunto c2) {

        Conjunto conjAux = new Conjunto(tamanho);
        int novo[] = new int[tamanho+c2.tamanho];
        conjAux.vetConjunto = novo;
        int aux = 0;
        int aux2 = 0;
        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < c2.tamanho; j++){
                if(c2.vetConjunto[j] == vetConjunto[i]){
                    aux += 1;
                }
            }
            if(aux == 0) {
                novo[aux2] = vetConjunto[i];
                aux2 += 1;
            }
            aux = 0;
        }   
        
        System.out.println("Diferença (ignoremos os 0's): "+Arrays.toString(novo));
    }



}