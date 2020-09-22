
class Pessoa
{
    String nome;
    int idade;

    void setNome (String pnome){
        nome = pnome;

    }
    String getNome (){
        return nome;
    }
    void setIdade (int pidade){
        idade = pidade;

    }
    int getIdade (){
        return idade;
    }

    Pessoa(String nome, int idade){
        setNome(nome);
        setIdade(idade);
    } 
    void MethPrint (String nome, int idade){
        System.out.println ("Nome: "+nome+", Idade: "+idade);
       
    }
}