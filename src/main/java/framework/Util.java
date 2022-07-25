package framework;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Optional;

public class Util {

    /**
     * @param name Locator name to look in CSV
     * @return Locator and BY according to Page CSV
     */
    public By getLocator(String name) {
        String locator = getCSVvalue(name, "Locator");

        if (locator.startsWith("//") || locator.startsWith("(")) {
            return By.xpath(locator);
        } else if (locator.startsWith("#")) {
            return By.cssSelector(locator);
        }
        return By.id(locator);
    }

    /**
     * @param name
     * @param column - Locator
     * @return Get Locator value from CSV, can be extended to another values
     */
    public String getCSVvalue(String name, String column) {

        CSVParser records;
        try {
            CSVFormat csvFormat = CSVFormat.Builder.create().setSkipHeaderRecord(true).setHeader("Name", "Locator").build();
            records = csvFormat.parse(readFile(getLocatorCSVPath()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (CSVRecord record : records) {
            if (record.get("Name").equals(name))
                return record.get(column);

        }
        System.out.println("Element isn't found in CSV");
        return null;
    }

    /**
     * Used to read file content
     *
     * @param filepath path to file
     * @return file content
     */
    public Reader readFile(String filepath) {

        Reader in;
        try {
            in = new FileReader(filepath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return in;
    }

    /**
     * Used to locate CSV file in the project near pages
     *
     * @return path to file
     */
    public String getLocatorCSVPath() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        Optional<StackTraceElement> stackTraceElement = Arrays.stream(stackTraceElements).filter((i -> i.getClassName().contains("pages."))).findFirst();
        return Paths.get("src", "main", "java")
                .normalize()
                .toAbsolutePath() + "/" + stackTraceElement
                .get()
                .getClassName()
                .replaceAll("\\.", "/") + ".csv";
    }
}