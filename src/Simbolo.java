public class Simbolo {
    private String nome;
    private String emoji;

    // Construtor da Classe
    public Simbolo(String nome, String emoji){
        this.nome = nome;
        this.emoji = emoji;
    }
    // Getters
    public String emoji()   {return this.emoji;}
    public String nome()    {return this.nome;}


    // Metodo toString
    @Override
    public String toString(){
        return this.nome + this.emoji;
    }


}
