

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double cost, rate, orginalCost;
        int years;

        // Monit o wprowadzenie danych przez użytkownika
        System.out.print("Podaj cenę, rok i stopę inflacji: ");
        cost = input.nextDouble();
        years = input.nextInt();
        rate = input.nextDouble();

        orginalCost = cost; //zachowuje pierwotny koszt

        System.out.printf("Rok " + 0 + " ==> PLN %.2f%n", cost); // Drukuje kwotę za rok 0

        for (int i = 1980; i <= years; i++) {

            double amount = cost + (cost * (rate / 100)); // Oblicza kwotę

            if (i < years) {   // Drukuje kwotę za pozostałe lata
                System.out.printf("Rok " + i + " ==> PLN %.2f %n", amount);
            } else {             //  Drukuje kwotę za ostatni rok (i == lata)
                System.out.printf("\r\n" + "==== Wynik końcowy ===" + "\r\n");
                System.out.printf(" Kwota o wartości PLN" + orginalCost + " będzie koztować PLN%.2f", amount);
                System.out.printf(" po " + i + " roku.");
            }
            cost = amount;
        }

        System.out.println("\r\n" + "==== ============= ===" + "\r\n");
        input.close();
    }

}