import java.util.Scanner;

public class IT24103035Lab5Q2 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of new members introduced: ");
        
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid number.");
            return;
        }
        
        int numOfMembers = scanner.nextInt();
        
        if (numOfMembers < 0) {
            System.out.println("Invalid input! The number of new members must be greater than or equal to 0.");
            return;
        }
        
        String prize;
        switch (numOfMembers) {
            case 0:
                prize = "No Prize";
                break;
            case 1:
                prize = "Pen";
                break;
            case 2:
                prize = "Umbrella";
                break;
            case 3:
                prize = "Bag";
                break;
            case 4:
                prize = "Travelling Chair";
                break;
            default:
                prize = "Headphone";
                break;
        }
        
        System.out.println("The customer is entitled to: " + prize);
    }
}
