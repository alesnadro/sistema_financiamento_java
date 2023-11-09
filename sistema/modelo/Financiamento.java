package modelo;

public class Financiamento { // atributo
    private final double valorImovel;
    private final int prazoFinanciamento;
    private final double taxaJurosAnual;

    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) { // método construtor com 3 parâmetros
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public double getValorImovel() {
        return valorImovel;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public double calcularPagamentoMensal() {
        return (valorImovel / prazoFinanciamento) * (1 + (taxaJurosAnual / 12));
    }

    public double calcularPagamentoTotal() {
        return calcularPagamentoMensal() * prazoFinanciamento;
    }
}