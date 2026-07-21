public class Main {
    public static void main(String[] args) throws InterruptedException {
        PoolSimbolo pool = new PoolSimbolo();
        Animacao animacao = new Animacao(pool);
        animacao.animar();
    }
}