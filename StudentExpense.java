
import java.util.Scanner;

public class StudentExpense {

    // Instance Variables
    String studentName;
    double dailyBudget;
    double foodExpense;
    double travelExpense;
    double studyExpense;
    double otherExpense;

    // 1. Calculate Total Expense
    double calculateTotalExpense() {
        double totalExpense = foodExpense + travelExpense
                + studyExpense + otherExpense;

        return totalExpense;
    }

    // 2. Calculate Remaining Amount
    double calculateRemainingAmount() {
        double totalExpense = calculateTotalExpense();

        return dailyBudget - totalExpense;
    }

    // 3. Check Whether Within Budget
    boolean isWithinBudget() {
        double totalExpense = calculateTotalExpense();

        if (totalExpense <= dailyBudget) {
            return true;
        } else {
            return false;
        }
    }

    // 4. Calculate Exceeded Amount
    double calculateExceededAmount() {
        double totalExpense = calculateTotalExpense();

        if (totalExpense > dailyBudget) {
            return totalExpense - dailyBudget;
        } else {
            return 0;
        }
    }

    // 5. Get Budget Status
    String getBudgetStatus() {
        double totalExpense = calculateTotalExpense();

        if (totalExpense < dailyBudget) {
            return "Within Budget";
        } else if (totalExpense == dailyBudget) {
            return "Budget Fully Used";
        } else {
            return "Budget Exceeded";
        }
    }

    // 6. Display Expense Report
    void displayExpenseReport() {

        System.out.println("---------- DAILY EXPENSE REPORT ----------");
        System.out.println("Student Name      : " + studentName);
        System.out.println("Daily Budget      : " + dailyBudget);
        System.out.println("Food Expense      : " + foodExpense);
        System.out.println("Travel Expense    : " + travelExpense);
        System.out.println("Study Expense     : " + studyExpense);
        System.out.println("Other Expense     : " + otherExpense);
        System.out.println("Total Expense     : " + calculateTotalExpense());

        if (isWithinBudget()) {
            System.out.println("Remaining Amount  : " + calculateRemainingAmount());
        } else {
            System.out.println("Exceeded Amount   : " + calculateExceededAmount());
        }

        System.out.println("Budget Status     : " + getBudgetStatus());
        System.out.println("------------------------------------------");
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create StudentExpense object
        StudentExpense student = new StudentExpense();

        // Accept student name
        System.out.print("Enter student name: ");
        student.studentName = sc.nextLine();

        // Accept daily budget
        do {
            System.out.print("Enter daily budget: ");
            student.dailyBudget = sc.nextDouble();

            if (student.dailyBudget < 0) {
                System.out.println("Budget cannot be negative. Enter again.");
            }
        } while (student.dailyBudget < 0);

        // Accept food expense
        do {
            System.out.print("Enter food expense: ");
            student.foodExpense = sc.nextDouble();

            if (student.foodExpense < 0) {
                System.out.println("Expense cannot be negative. Enter again.");
            }
        } while (student.foodExpense < 0);

        // Accept travel expense
        do {
            System.out.print("Enter travel expense: ");
            student.travelExpense = sc.nextDouble();

            if (student.travelExpense < 0) {
                System.out.println("Expense cannot be negative. Enter again.");
            }
        } while (student.travelExpense < 0);

        // Accept study expense
        do {
            System.out.print("Enter study expense: ");
            student.studyExpense = sc.nextDouble();

            if (student.studyExpense < 0) {
                System.out.println("Expense cannot be negative. Enter again.");
            }
        } while (student.studyExpense < 0);

        // Accept other expense
        do {
            System.out.print("Enter other expense: ");
            student.otherExpense = sc.nextDouble();

            if (student.otherExpense < 0) {
                System.out.println("Expense cannot be negative. Enter again.");
            }
        } while (student.otherExpense < 0);

        // Display report
        student.displayExpenseReport();

        // Close Scanner
        sc.close();
    }
}
