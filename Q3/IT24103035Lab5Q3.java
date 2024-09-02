import java.util.Scanner;

public class IT24103035Lab5Q3 {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int roomChargePerDay = 48000;
        final int discount3To4Days = 10;
        final int discount5OrMoreDays = 20;
        final int minDate = 1;
        final int maxDate = 31;

        System.out.println("Room charge per day: Rs " + roomChargePerDay);

        System.out.print("Enter start date (1-31): ");
        int startDate = scanner.nextInt();
        System.out.print("Enter end date (1-31): ");
        int endDate = scanner.nextInt();

        if (startDate < minDate || startDate > maxDate || endDate < minDate || endDate > maxDate) {
            System.out.println("Error: Days must be between 1 and 31.");
        } else if (startDate >= endDate) {
            System.out.println("Error: Start date should be less than the end date.");
        } else {
            int days = endDate - startDate;
            int discount = days >= 5 ? discount5OrMoreDays : (days >= 3 ? discount3To4Days : 0);
            int totalAmount = days * roomChargePerDay;
            int finalAmount = totalAmount * (100 - discount) / 100;

            System.out.println("Number of days reserved: " + days);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Total amount to be paid: Rs " + finalAmount);
        }
    }
}