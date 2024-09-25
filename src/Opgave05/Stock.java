package Opgave05;

public class Stock {
    //instance variable
    String symbol;
    String name;
    double previousClosingPrice;
    double CurrentPrice;

    //Constructor to initialize symbol and name
    public Stock(String symbol, String name, double previousClosingPrice, double currentPrice ) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.CurrentPrice = currentPrice;

    }

    //Method to calculate the percent change
    public double getChangePercent() {
        return ((CurrentPrice - previousClosingPrice) / previousClosingPrice) * 100;

    }

    public static void main(String[] args) {
        Stock stock = new Stock("Orcl", "Oracle Corporation", 1500, 1525);
        System.out.println("Percentage change for: " + stock.getChangePercent() + "%");
    }

}
