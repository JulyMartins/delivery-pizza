package model;

public class Pedido {
    protected String nome;
    protected double preco;
    Pizza pizza;

    public Pedido() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void mostrarOpcoes(Pedido v[]) {
        for (int i = 0; i < v.length; i++) {
            System.out.print((i + 1) + " - ");
            v[i].mostrarNome();
        }
    }

    public void mostrarNome() {
        System.out.println(" - " + nome);
    }

    public void valorTotal(int tamanho, Pizza pizza, double preco2, double preco3) {
        if (tamanho == 1) {
            double precoTotal = pizza.getPrecoP() + preco2 + preco3;
            System.out.printf("Valor total: %.2f", precoTotal);
        } else if (tamanho == 2) {
            double precoTotal = pizza.getPrecoM() + preco2 + preco3;
            System.out.printf("Valor total: %.2f", precoTotal);
        } else if (tamanho == 3) {
            double precoTotal = pizza.getPrecoG() + preco2 + preco3;
            System.out.printf("Valor total: %.2f", precoTotal);
        } else {
            System.out.println("Valor inválido");
        }
    }

    public void valorTotalDoisSabores(int tamanho, double preco2, double preco3) {
        if (tamanho == 1) {
            double precoTotal = 65 + preco2 + preco3;
            System.out.printf("Valor total: %.2f", precoTotal);
        } else if (tamanho == 2) {
            double precoTotal = 75 + preco2 + preco3;
            System.out.printf("Valor total: %.2f", precoTotal);
        } else {
            double precoTotal = 85 + preco2 + preco3;
            System.out.printf("Valor total: %.2f", precoTotal);
        }
    }

    public void recibo(int i,String nome, String nome1, String nomeBorda, String nomeLugar) {
        if (i == 1) {
            System.out.println("--- RECIBO ---");
            System.out.println("Sabor: " + nome + "\nSabor da borda: " + nomeBorda +  "\nLocal: " + nomeLugar);
        } else {
            System.out.println("--- RECIBO ---");
            System.out.println("Sabores: " + nome + ", " + nome1 + "\nSabor da borda: " + nomeBorda + "\nLocal: " + nomeLugar);
        }
    }

}
