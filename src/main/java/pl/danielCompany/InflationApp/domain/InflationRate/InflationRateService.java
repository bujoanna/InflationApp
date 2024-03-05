package pl.danielCompany.InflationApp.domain.InflationRate;

public class InflationRateService {

    private InflationRateRepository repository = new InflationRateRepository();

    public InflationRate createAverageAnunualInflation(int year, double averageAnnual) {
        return this.repository.createNewAverageAnnualInflation(year, averageAnnual);
    }

}
