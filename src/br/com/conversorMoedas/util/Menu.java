package br.com.conversorMoedas.util;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public int showMainMenu() {
        System.out.println("==========================================");
        System.out.println();
        System.out.println("Seja bem-vindo(a) ao Conversor de Moedas!");
        System.out.println();
        System.out.println("==========================================");
        System.out.println("1: Dólar para Peso argentino");
        System.out.println("2: Peso argentino para Dólar");
        System.out.println("3: Dólar para Real brasileiro");
        System.out.println("4: Real brasileiro para Dólar");
        System.out.println("5: Dólar para Peso colombiano");
        System.out.println("6: Peso colombiano para Dólar");
        System.out.println("7: Sair");
        System.out.print("Escolha uma opção válida: ");
        return scanner.nextInt();
    }

    public String[] getCurrencies(int choice) {
        String moedaBase = "";
        String moedaConverter = "";

        switch (choice) {
            case 1:
                moedaBase = "USD";
                moedaConverter = "ARS";
                break;
            case 2:
                moedaBase = "ARS";
                moedaConverter = "USD";
                break;
            case 3:
                moedaBase = "USD";
                moedaConverter = "BRL";
                break;
            case 4:
                moedaBase = "BRL";
                moedaConverter = "USD";
                break;
            case 5:
                moedaBase = "USD";
                moedaConverter = "COP";
                break;
            case 6:
                moedaBase = "COP";
                moedaConverter = "USD";
                break;
            default:
                System.out.println("Opção inválida, escolha uma opção válida.");
                break;
        }

        return new String[]{moedaBase, moedaConverter};
    }

    public String getDecision() {
        return scanner.next();
    }

    public void closeScanner() {
        scanner.close();
    }
}
