package pl.danielCompany.InflationApp.domain.InflationRate;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
        System.out.println("Dodałem nową średnią rocząną z roku: " + newOne.getYear() + " ,która wynosi: " + newOne.getAverageAnuall());
        return newOne;

    }

    void readAll() throws FileNotFoundException {
        Gson gson = new Gson();
        FileReader fileReader = new FileReader("./InlationRate.json");
        List<InflationRate> loadedInflationRates = gson.fromJson(fileReader, new TypeToken<List<InflationRate>>() {
        }.getType());
        this.averageAnnualInflation.addAll(loadedInflationRates);
        this.averageAnnualInflation.forEach(inflationRate -> {
            System.out.println("Załadowano nową średnią inflacyjną " + inflationRate.getYear() + " i " + inflationRate.getAverageAnuall());
        });
    }

    void saveAll() throws IOException {
        Gson gson = new Gson();
        FileWriter fileWriter = new FileWriter("./InlationRate.json");
        gson.toJson(this.averageAnnualInflation, fileWriter);
        fileWriter.flush();
        fileWriter.close();
    }

}
