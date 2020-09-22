class Main
{
    public static void main (String args[])
    {
        Pessoa p1 = new Pessoa("Ana", 18);
    
        Pessoa p2 = new Pessoa("João", 23);
     
        System.out.println ("Nome1: "+p1.getNome());
        System.out.println (p1.getIdade());
        System.out.println ("Nome1: "+p2.getNome());
        System.out.println (p2.getIdade());


    }
}