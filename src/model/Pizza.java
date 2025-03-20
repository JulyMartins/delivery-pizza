package model;
public class Pizza extends Pedido {

    private double precoP;
    private double precoM;
    private double precoG;

    public Pizza(String nome, double precoP, double precoM, double precoG) {
        this.nome = nome;
        this.precoP = precoP;
        this.precoM = precoM;
        this.precoG = precoG;
    }

    public double getPrecoP() {
        return precoP;
    }

    public void setPrecoP(double precoP) {
        this.precoP = precoP;
    }

    public double getPrecoM() {
        return precoM;
    }

    public void setPrecoM(double precoM) {
        this.precoM = precoM;
    }

    public double getPrecoG() {
        return precoG;
    }

    public void setPrecoG(double precoG) {
        this.precoG = precoG;
    }

    /*public void valorTotal(int tamanho, double preco1, double preco2, double preco3) {
        if (tamanho == 1) {
            double precoTotal = preco1 + preco2 + preco3;
            System.out.printf("Valor total: %.2f", precoTotal);
        } else if (tamanho == 2) {
            double precoTotal = preco1 + preco2 + preco3;
            System.out.printf("Valor total: %.2f", precoTotal);
        } else {
            double precoTotal = preco1 + preco2 + preco3;
            System.out.printf("Valor total: %.2f", precoTotal);
        }
    }*/

}
