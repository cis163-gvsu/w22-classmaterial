package gui;

public class Converter {
    public static double convertToCelsius(double temp) {
        double ctemp = (temp - 32) * 5.0/9.0;
        return ctemp;
    }

    public static double convertToFahrenheit(double temp) {
        double ftemp = (temp * 9.0/5.0) + 32;
        return ftemp;
    }
}