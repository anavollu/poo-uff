package br.com.banco;

/**
 * Conta
 */
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente titular, int numero, String agencia, String dataAbertura) {
        super(titular, numero, agencia, dataAbertura);
    }    

    public double calcularRendimento(int periodo) {
        return (Math.pow(1.07, periodo) - 1);
    }

    public double calcularTributacao(int periodo) {
        return 0;
    }

    public String getTipo() {
        return "Conta Poupanca";
    }

}