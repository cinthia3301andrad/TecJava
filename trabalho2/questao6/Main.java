class Main
{
    public static void main (String args[])
    {
        Pessoa p1 = new Pessoa();
        p1.setNome("Ana");
        p1.setIdade(18);
        Pessoa p2 = new Pessoa();
        p2.setNome("João");
        p2.setIdade(22);
        System.out.println ("Nome1: "+p1.getNome());
        System.out.println (p1.getIdade());
        System.out.println ("Nome1: "+p2.getNome());
        System.out.println (p2.getIdade());


    }
}