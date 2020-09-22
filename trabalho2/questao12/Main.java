
import java.util.Arrays;

class Main
{
    public static void main (String args[])
    {      
        Conjunto c1 = new Conjunto(10);
        Conjunto c2 = new Conjunto(5);
        Conjunto c3 = new Conjunto(5);
        Conjunto c4 = new Conjunto(10);
        
        for(int i = 1; i<=10; i++){
            c1.Inserir(i); 
        }
        c1.getConjunto(c1);

        int aux = 2;
        for(int i = 0; i<5; i++){
            c2.Inserir(aux); 
            aux += 2;
        }
        c2.getConjunto(c2);
        aux = 1;
        for(int i = 0; i<5; i++){
            c3.Inserir(aux); 
            aux += 2;
        }
        c3.getConjunto(c3);
        c4.Inserir(2); 
        c4.Inserir(3); 
        c4.Inserir(5); 
        c4.Inserir(7); 
        c4.Inserir(11); 
        c4.Inserir(13); 
        c4.Inserir(17); 
        c4.Inserir(19); 
        c4.Inserir(23); 
        c4.Inserir(29); 
        c4.getConjunto(c4);

        c2.Uniao(c3);
        System.out.println ("lETRA A: "+c4.SubConjunto(c4));
        System.out.println ("lETRA C: "+Arrays.toString(c2.Uniao(c3))) ;
        ;
        System.out.println ("lETRA D: "+Arrays.toString(c1.Interseccao(c2)));
        
        // c1.Uniao(c2);
        // c1.Interseccao(c2);
        // c1.Diferenca(c2);
    }
}
        
        