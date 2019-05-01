package br.com.banco;

/**
 * SegurodeVida
 */

public class SeguroDeVida implements Tributavel {
    private int apolice;
    private Cliente titular;
    private double valor;

    public SeguroDeVida (Cliente titular, int apolice, double valor) {
        this.titular = titular;
        this.setApolice(apolice);
        this.valor = valor;
    }

    //Método para pegar a apolice
    public int getApolice() {
        return apolice;
    }

    //Método para inserir a apolice
    public void setApolice(int apolice) {
        this.apolice = apolice;
    }

    //Método para pegar o titular
    public String getTitular() {
        return this.titular.toString();
    }

    public String getTipo() {
        return "Seguro de Vida";
    }

    //SeguroDeVida tem uma faixa fixa de R$500 + 2% do valor do seguro
    public double getValorImposto() {
        return (500 + (0.02 * this.valor));
    }

}