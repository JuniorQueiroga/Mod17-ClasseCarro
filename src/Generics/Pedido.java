package Generics;

import java.util.*;


public class Pedido {
    private Set<Marca> marcas;

    public Pedido() {
        this.marcas = new HashSet<>();
    }

    public void add(Marca marca) {
        if (this.marcas.contains(marca)) {
            Iterator<Marca> it = this.marcas.iterator();
            while(it.hasNext()) {
                Marca marc = it.next();
                if (marca.equals(marc)) {
                    marc.addQuantidade();
                    break;
                }
            }
            return;
        }
        this.marcas.add(marca);
    }

    public void concluirVenda() {
        this.marcas.forEach(marc -> {
            System.out.println("Quantidade vendida: " + marc.getQuantidade() + " da marca: " + marc.getNome() + marc.getNomeMod());
        });
    }
}
