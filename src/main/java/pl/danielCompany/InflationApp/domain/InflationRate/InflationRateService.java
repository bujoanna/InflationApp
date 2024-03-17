package pl.danielCompany.InflationApp.domain.InflationRate;

import java.io.FileNotFoundException;
import java.io.IOException;

public class InflationRateService {

    private InflationRateRepository repository = new InflationRateRepository();

    public InflationRate createAverageAnunualInflation(int year, double averageAnnual) {
        return this.repository.createNewAverageAnnualInflation(year, averageAnnual);
    }

    public void readAll() throws FileNotFoundException {
        this.repository.readAll();
    }
    public void saveAll() throws IOException {
        this.repository.saveAll();
    }

}
