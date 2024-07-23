package Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author queiroga
 */
public class AppExemploMapa {

    public static void main(String args[]) {
        List<Marca> marcas = getMarcasAleatorios(10);
        PedidoMapa pedido = new PedidoMapa();
        marcas.forEach(marc-> pedido.add(marc));
        pedido.concluirVenda();
    }

    public static List<Marca> getMarcasAleatorios(int quantidade) {
        List<Marca> marcas = new ArrayList<>();
        List<Marca> marcasCadastrados = ClasseGeraMarcas.criarMarcas(100);

        Random r = new Random();
        for (int i=0; i<quantidade; i++) {
            int numAleatorio1 = r.nextInt(marcasCadastrados.size());
            Marca marc = marcasCadastrados.get(numAleatorio1);
            marcas.add(marc);
        }
        return marcas;
    }


}