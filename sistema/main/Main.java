package main;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;

import util.Interface;
import modelo.Financiamento;
import modelo.Apartamento;
import modelo.Casa;
import modelo.Terreno;

public class Main {

    public static void main(String[] args) {
        Interface Interface = new Interface();
        DecimalFormat decimal = new DecimalFormat("#,###.00", new DecimalFormatSymbols(Locale.US));

        ArrayList<Financiamento> financiamentos = new ArrayList<>();

        // Peça os dados do usuário para um financiamento
        double valorImovel = Interface.solicitarValorImovel();
        int prazoFinanciamento = Interface.solicitarPrazoFinanciamento();
        double taxaJurosAnual = Interface.solicitarTaxaJurosAnual();

        // Crie dois financiamentos de Casa
        financiamentos.add(new Apartamento(valorImovel, prazoFinanciamento, taxaJurosAnual));
        financiamentos.add(new Apartamento(valorImovel, prazoFinanciamento, taxaJurosAnual));

        // Crie dois financiamentos de Apartamento
        financiamentos.add(new Casa(valorImovel, prazoFinanciamento, taxaJurosAnual));
        financiamentos.add(new Casa(valorImovel, prazoFinanciamento, taxaJurosAnual));

        // Crie um financiamento de Terreno
        financiamentos.add(new Terreno(valorImovel, prazoFinanciamento, taxaJurosAnual));

        double totalImoveis = 0.0;
        double valorFinanciamentos = 0.0;

        for (int i = 0; i < financiamentos.size(); i++) {
            Financiamento financiamento = financiamentos.get(i);
            double valorImovelFinanciamento = financiamento.getValorImovel();
            double valorFinanciamento = financiamento.calcularPagamentoTotal();

            System.out.println("Financiamento " + (i + 1) + " - valor do imóvel: R$" + 
                                decimal.format(valorImovelFinanciamento) + ", valor do financiamento: R$" 
                                + decimal.format(valorFinanciamento));

            totalImoveis += valorImovelFinanciamento;
            valorFinanciamentos += valorFinanciamento;
        }

        System.out.println("Total de todos os imóveis: R$" + decimal.format(totalImoveis));
        System.out.println("Total de todos os financiamentos: R$" + decimal.format(valorFinanciamentos));
    }
}
