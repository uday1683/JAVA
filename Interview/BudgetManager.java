package Interview;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class BudgetManager {
    private static final String STORAGE_FILE = "budget_data.txt";
    private static List<Record> records = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        loadRecords();

        while (true) {
            System.out.println("\n===== Budget Tracker Menu =====");
            System.out.println("1. Record Income");
            System.out.println("2. Record Expense");
            System.out.println("3. Show Monthly Report");
            System.out.println("4. Save & Exit");
            System.out.print("Enter your choice: ");
            
            int option = input.nextInt();

            switch (option) {
                case 1 -> addEntry("Income");
                case 2 -> addEntry("Expense");
                case 3 -> displaySummary();
                case 4 -> {
                    saveRecords();
                    System.out.println("Data saved successfully. Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid selection. Please try again.");
            }
        }
    }

    private static void addEntry(String recordType) {
        input.nextLine(); // clear buffer
        System.out.print("Specify category (" + (recordType.equals("Income") ? "Salary, Bonus" : "Food, Rent, Travel") + "): ");
        String category = input.nextLine();
        System.out.print("Enter the amount (₹): ");
        double value = input.nextDouble();

        if (value <= 0) {
            System.out.println("Amount must be positive!");
            return;
        }

        records.add(new Record(recordType, category, value, LocalDate.now()));
        System.out.println(recordType + " has been recorded.");
    }

    private static void displaySummary() {
        double incomeSum = 0, expenseSum = 0;
        Map<String, Double> categoryTotals = new HashMap<>();
        LocalDate today = LocalDate.now();

        for (Record r : records) {
            if (r.getDate().getMonthValue() == today.getMonthValue() &&
                r.getDate().getYear() == today.getYear()) {

                if (r.getType().equalsIgnoreCase("Income")) {
                    incomeSum += r.getAmount();
                } else {
                    expenseSum += r.getAmount();
                }

                categoryTotals.put(r.getCategory(), 
                    categoryTotals.getOrDefault(r.getCategory(), 0.0) + r.getAmount());
            }
        }

        System.out.println("\n📊 Monthly Financial Summary - " + today.getMonth() + " " + today.getYear());
        System.out.printf("Total Income: ₹%.2f\n", incomeSum);
        System.out.printf("Total Expenses: ₹%.2f\n", expenseSum);
        System.out.printf("Remaining Balance: ₹%.2f\n", (incomeSum - expenseSum));

        System.out.println("Detailed by Category:");
        for (var entry : categoryTotals.entrySet()) {
            System.out.printf("- %s: ₹%.2f\n", entry.getKey(), entry.getValue());
        }
    }

    private static void saveRecords() {
        try (PrintWriter out = new PrintWriter(new FileWriter(STORAGE_FILE))) {
            for (Record r : records) {
                out.println(r);
            }
        } catch (IOException e) {
            System.out.println("Error writing to file!");
        }
    }

    private static void loadRecords() {
        File file = new File(STORAGE_FILE);
        if (!file.exists()) return;

        try (Scanner fileInput = new Scanner(file)) {
            while (fileInput.hasNextLine()) {
                records.add(Record.parse(fileInput.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("Error loading existing data.");
        }
    }
}
