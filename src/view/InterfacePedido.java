package view;

import model.Bordas;
import model.Lugares;
import model.Pedido;
import model.Pizza;

import java.util.Scanner;

public class InterfacePedido {

    public static void mostrarInterface() {
        Scanner sc = new Scanner(System.in);

        int[] quantSabores = {1,2};

        Pedido[] pizzas = new Pizza[5];
        pizzas[0] = new Pizza("Portuguesa", 45.99, 55.99, 65.99);
        pizzas[1] = new Pizza("Calabresa", 42.99,52.99, 62.99);
        pizzas[2] = new Pizza("Frango com Catupiry", 48.99, 58.99, 68.99);
        pizzas[3] = new Pizza("Chocolate", 50.99, 60.99, 70.99);
        pizzas[4] = new Pizza("Carne seca", 47.99, 57.99, 67.99);

        Pedido[] bordas = new Bordas[3];
        bordas[0] = new Bordas("Sem recheio", 0);
        bordas[1] = new Bordas("Chocolate", 5.99);
        bordas[2] = new Bordas("Catupiry", 4.99);

        Pedido[] lugares = new Lugares[5];
        lugares[0] = new Lugares("Cruzeiro",10.99);
        lugares[1] = new Lugares("Sudoeste",12.99);
        lugares[2] = new Lugares("Asa Sul",18.99);
        lugares[3] = new Lugares("Asa Norte",20.99);
        lugares[4] = new Lugares("Samambaia",25.99);

        System.out.println("Olá! Faça o seu pedido aqui");
        System.out.println("1 - Pizza de 1 sabor");
        System.out.println("2 - Pizza de 2 sabores");

        int quantidadeSabores = sc.nextInt();

        if(quantidadeSabores == quantSabores[0]) {
            Pedido pedido = new Pedido();

            System.out.println("Escolha o sabor da pizza: ");
            pedido.mostrarOpcoes(pizzas);
            int saborPizza = (sc.nextInt() - 1);

            System.out.println("Escolha o sabor da borda da pizza: ");
            pedido.mostrarOpcoes(bordas);
            int saborBorda = (sc.nextInt() - 1);

            System.out.println("Escolha o tamanho da pizza: ");
            System.out.println("1 - Pequena\n2 - Média\n3 - Grande");
            int tamanhoPizza = sc.nextInt();

            System.out.println("Escolha o endereço: ");
            pedido.mostrarOpcoes(lugares);
            int lugarRetirada = (sc.nextInt() - 1);

            try {
                pedido.recibo(1, pizzas[saborPizza].getNome(), "", bordas[saborBorda].getNome(), lugares[lugarRetirada].getNome());
                pedido.valorTotal(tamanhoPizza, (Pizza) pizzas[saborPizza], bordas[saborBorda].getPreco(), lugares[lugarRetirada].getPreco());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Valores inválidos. Não foi possível finalizar o pedido");
            }

        } else if(quantidadeSabores == quantSabores[1]) {
            Pedido pedido = new Pedido();

            System.out.println("Escolha o primeiro sabor da pizza: ");
            pedido.mostrarOpcoes(pizzas);
            int saborPizza1 = (sc.nextInt() - 1);

            System.out.println("Escolha o segundo sabor da pizza: ");
            pedido.mostrarOpcoes(pizzas);
            int saborPizza2 = (sc.nextInt() - 1);

            if (saborPizza2 == saborPizza1) {
                System.out.println("Sabores iguais. Escolha outro sabor:");
                pedido.mostrarOpcoes(pizzas);
                saborPizza2 = (sc.nextInt() - 1);
            }

            System.out.println("Escolha o sabor da borda da pizza: ");
            pedido.mostrarOpcoes(bordas);
            int saborBorda = (sc.nextInt() - 1);

            System.out.println("Escolha o tamanho da pizza: ");
            System.out.println("1 - Pequena\n2 - Média\n3 - Grande");
            int tamanhoPizza = sc.nextInt();

            System.out.println("Escolha o endereço: ");
            pedido.mostrarOpcoes(lugares);
            int lugarRetirada = (sc.nextInt() - 1);

            try {
                pedido.recibo(2, pizzas[saborPizza1].getNome(), pizzas[saborPizza2].getNome(), bordas[saborBorda].getNome(), lugares[lugarRetirada].getNome());
                pedido.valorTotalDoisSabores(tamanhoPizza, bordas[saborBorda].getPreco(), lugares[lugarRetirada].getPreco());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Valores inválidos. Não foi possível finalizar o pedido");
            }

        } else {
            System.out.println("Valor inválido");
        }
    }
}
