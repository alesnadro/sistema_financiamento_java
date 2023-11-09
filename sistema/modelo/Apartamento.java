package modelo;

public class Apartamento extends Financiamento {

    public Apartamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
    }

    @Override
    public double calcularPagamentoMensal() {
        double taxaMensal = getTaxaJurosAnual() / 12;
        int meses = getPrazoFinanciamento() * 12;
        double numerador = getValorImovel() * taxaMensal * Math.pow(1 + taxaMensal, meses);
        double denominador = Math.pow(1 + taxaMensal, meses) - 1;
        return numerador / denominador;
    }
}
