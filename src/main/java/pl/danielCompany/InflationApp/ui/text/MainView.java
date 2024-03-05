package pl.danielCompany.InflationApp.ui.text;

import pl.danielCompany.InflationApp.domain.InflationRate.InflationRateService;

import java.util.Scanner;

public class MainView {

    private InflationRateService inflationRateService = new InflationRateService();

    public void init() {
        System.out.println(" Inflations Application ");
        System.out.println(" Wybierz działanie: ");
        Scanner input = new Scanner(System.in);
        int option = -1;

        while (option != 0) {
            System.out.println("1. Wpisz średnią inflacyjną.");
            System.out.println("0. Wyjdź z programu.");
            option = Integer.parseInt(input.nextLine()); //żeby czytało całą
            if (option == 1) {
                this.createAloneNewAverageAnnualInflation(input);
            } else if (option == 0) {
                System.out.println("Zamykam program.");
            }


        }

    }

    private void createAloneNewAverageAnnualInflation(Scanner input) {
        System.out.println("Podaj rok: ");
        int yearInfl = Integer.parseInt(input.nextLine());
        System.out.println("Podaj nową średnią inflacyjną: ");
        int annualAverageInfl = Integer.parseInt(input.nextLine());
        this.inflationRateService.createAverageAnunualInflation(yearInfl,annualAverageInfl);

    }
}