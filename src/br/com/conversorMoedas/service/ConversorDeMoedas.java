package br.com.conversorMoedas.service;

import br.com.conversorMoedas.api.ConsumoAPI;
import br.com.conversorMoedas.model.ExchangeRate;

import java.io.IOException;
import java.util.Scanner;

public class ConversorDeMoedas {
    private ConsumoAPI client;
    private Scanner scanner;

    public ConversorDeMoedas() {
        this.client = new ConsumoAPI();
        this.scanner = new Scanner(System.in);
    }

    public void convertCurrency(String moedaBase, String moedaConverter) {
        try {
            ExchangeRate exchangeRate = client.getExchangeRate(moedaBase);
            Double rate = exchangeRate.getRates().get(moedaConverter);
            if (rate != null) {
                System.out.printf("A taxa de câmbio de %s para %s é: %.4f%n", moedaBase, moedaConverter, rate);
                System.out.println();
                System.out.printf("Digite o valor em %s que deseja converter: ", moedaBase);
                double amount = scanner.nextDouble();
                double convertedAmount = amount * rate;
                System.out.println();
                System.out.printf("%.2f %s equivalem a %.2f %s%n", amount, moedaBase, convertedAmount, moedaConverter);

            } else {
                System.out.printf("Não foi possível realizar o câmbio de %s para %s%n", moedaBase, moedaConverter);
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao obter taxas de câmbio: " + e.getMessage());
        }
    }

    public void closeScanner() {
        scanner.close();
    }
}
