package Generics;

import java.util.ArrayList;
import java.util.List;

public class ClasseGeraMarcas {
    public static List<Marca> criarMarcas(int quantidade) {
        List<Marca> marcas = new ArrayList<>();
        for (int i=0; i<quantidade; i++) {
            Marca marcHonda = criarHonda(i);
            Marca marcToyota = criarToyota(i);
            Marca marcFord = criarFord(i);
            marcas.add(marcHonda);
            marcas.add(marcToyota);
            marcas.add(marcFord);
        }
        return marcas;
    }

    private static Marca criarHonda(int indice) {
        Marca marc = new Honda();
        marc.setNome("Honda");
        marc.setNomeMod("Civic Touring 2021");
        marc.setQuantidade(1l);
        marc.setPreco(150000d);
        marc.setCodigo(1l);
        return marc;
    }

    private static Marca criarToyota(int indice) {
        Marca marc = new Toyota();
        marc.setNome("Toyota");
        marc.setNomeMod("Corolla Exs 2021");
        marc.setQuantidade(1l);
        marc.setPreco(130000d);
        marc.setCodigo(2l);
        return marc;
    }

    private static Marca criarFord(int indice) {
        Marca marc = new Ford();
        marc.setNome("Ford");
        marc.setNomeMod("Fusion 2021");
        marc.setQuantidade(1l);
        marc.setPreco(120000d);
        marc.setCodigo(3l);
        return marc;
    }
}
