import java.util.*;

public class PoolSimbolo {

    private List<Simbolo> simbolos;

    public PoolSimbolo() {
        simbolos = new ArrayList<>(List.of(
                new Simbolo("Limão",    "🍋"),
                new Simbolo("Maçã",     "🍎"),
                new Simbolo("Laranja",  "🍊"),
                new Simbolo("Morango",  "🍓"),
                new Simbolo("Uva",      "🍇"),
                new Simbolo("Melão",    "🍈"),
                new Simbolo("Banana",   "🍌"),
                new Simbolo("Cereja",   "🍒"),
                new Simbolo("Pêssego",  "🍑"),
                new Simbolo("Pera",     "🍐"),
                new Simbolo("Abacaxi",  "🍍"),
                new Simbolo("Kiwi",     "🥝"),
                new Simbolo("Mirtilo",  "🫐"),
                new Simbolo("Coco",     "🥥"),
                new Simbolo("Manga",    "🥭"),
                new Simbolo("Melancia", "🍉")
        ));
    }

    // Sorteia 3 símbolos aleatórios
    public List<String> sortear() {
        Random gerador = new Random();
        List<String> resultado = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int index = gerador.nextInt(simbolos.size());
            resultado.add(simbolos.get(index).toString());
        }
        return resultado;
    }

    // Retorna um símbolo aleatório — usado na animação
    public String sortearUm() {
        int index = (int)(Math.random() * simbolos.size());
        return simbolos.get(index).toString();
    }
}