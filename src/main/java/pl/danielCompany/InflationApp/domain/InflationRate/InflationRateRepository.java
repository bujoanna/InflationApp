package pl.danielCompany.InflationApp.domain.InflationRate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InflationRateRepository {

    private List<InflationRate> averageAnnualInflation = new ArrayList<>();

    //tworzenie nowej średniej rocznej
    InflationRate createNewAverageAnnualInflation(int year, Double averageAnuall) {

        Random r = new Random();
        InflationRate newOne = new InflationRate(r.nextInt(), year, averageAnuall);
        this.averageAnnualInflation.add(newOne);
        return newOne;

    }


}
