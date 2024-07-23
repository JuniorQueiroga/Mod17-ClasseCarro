package Generics;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rodrigo.pires
 */
public class PedidoMapa {

    private Map<Long, Marca> marcas;

    public PedidoMapa() {
        this.marcas = new HashMap<>();
    }

    public void add(Marca marca) {
        Marca marcCadastrado = this.marcas.get(marca.getCodigo());
        if (marcCadastrado == null) {
            this.marcas.put(marca.getCodigo(), marca);
        } else {
            marcCadastrado.addQuantidade();
        }
    }

    public void concluirVenda() {
        this.marcas.forEach((key, value) -> {
            System.out.println("Quantidade vendida: " + value.getQuantidade() + " da marca: " + value.getNome() + value.getNomeMod());
        });
    }
}