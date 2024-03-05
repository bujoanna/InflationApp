package pl.danielCompany.InflationApp.domain.InflationRate;

public class InflationRate {


    private long id;
    private int year;
    private Double averageAnuall;

    InflationRate(long id, int year, Double averageAnuall) {
        this.id = id;
        this.year = year;
        this.averageAnuall = averageAnuall;
    }
}
