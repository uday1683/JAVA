package Interview;

import java.time.LocalDate;

public class Record {
    private String type;
    private String category;
    private double amount;
    private LocalDate date;

    public Record(String type, String category, double amount, LocalDate date) {
        this.type = type;
        this.category = category;
        this.amount = amount;
        this.date = date;
    }

    public String getType() { return type; }
    public String getCategory() { return category; }
    public double getAmount() { return amount; }
    public LocalDate getDate() { return date; }

    @Override
    public String toString() {
        return type + "," + category + "," + amount + "," + date;
    }

    public static Record parse(String line) {
        String[] data = line.split(",");
        return new Record(data[0], data[1], Double.parseDouble(data[2]), LocalDate.parse(data[3]));
    }
}
