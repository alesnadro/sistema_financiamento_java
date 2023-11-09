package util;

import java.util.Scanner;

public class Interface { // atributo
    private static final Scanner scanner = new Scanner(System.in);

    public static double solicitarValorImovel() { // método publico
        double valorImovel;
        
        do {
            System.out.println("Valor do imóvel: ");
            valorImovel = scanner.nextDouble();
            if (valorImovel < 0) {
                System.out.println("Apenas números positivos. Digite novamente!");
            }
        } while (valorImovel < 0);

        return valorImovel;
    }
    
    public static int solicitarPrazoFinanciamento() { // método publico
        int prazoFinanciamento;

        do {
            System.out.print("Prazo de financiamento: ");
            prazoFinanciamento = scanner.nextInt();
            if (prazoFinanciamento < 0) {
                System.out.println("Apenas números positivos. Digite novamente!");
            }
        } while (prazoFinanciamento < 0);
            
        return prazoFinanciamento;
    }

    public static double solicitarTaxaJurosAnual() { // método publico
        double taxaJurosAnual;

        do {
            System.out.print("Taxa de juros: ");
            taxaJurosAnual = scanner.nextDouble();
            if (taxaJurosAnual < 0) {
                System.out.println("Apenas números positivos. Digite novamente!");
            }
        } while (taxaJurosAnual < 0);

        return taxaJurosAnual;
    }
}
