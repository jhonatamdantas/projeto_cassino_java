import java.util.*;

public class Animacao {

    private PoolSimbolo pool;

    public Animacao(PoolSimbolo pool) {
        this.pool = pool;
    }

    public void animar() throws InterruptedException {
        exibirCabecalho();

        List<String> resultado = pool.sortear();

        for (int rolo = 0; rolo < 3; rolo++) {
            int frames = 10 + rolo * 5;

            for (int f = 0; f < frames; f++) {
                String girando = pool.sortearUm();

                StringBuilder linha = new StringBuilder("  [ ");
                for (int j = 0; j < 3; j++) {
                    if (j < rolo)       linha.append(resultado.get(j));
                    else if (j == rolo) linha.append(girando);
                    else                linha.append("???   ");
                    if (j < 2) linha.append(" | ");
                }
                linha.append(" ]");

                System.out.print("\r" + linha);
                System.out.flush();
                Thread.sleep(80);
            }

            Thread.sleep(400);
        }

        exibirResultado(resultado);
    }

    private void exibirCabecalho() throws InterruptedException {
        System.out.println();
        System.out.println("==========================");
        System.out.println("     CASSINO DOS CRIAS     ");
        System.out.println("==========================");
        System.out.println();
        Thread.sleep(800);
    }

    private void exibirResultado(List<String> resultado) {
        System.out.println("\r  [ " + resultado.get(0) + " | " +
                resultado.get(1) + " | " +
                resultado.get(2) + " ]");
        System.out.println();

        if (resultado.get(0).equals(resultado.get(1)) &&
                resultado.get(1).equals(resultado.get(2))) {
            System.out.println("  *** JACKPOT! VOCE GANHOU! ***");
        } else {
            System.out.println("  Quase... tente de novo.");
        }

        System.out.println();
    }
}