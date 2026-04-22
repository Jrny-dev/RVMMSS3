import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        String name;
        double balance = 100000.00;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name to proceed with banking");
        name = scanner.nextLine();
        System.out.println(name + "  Welcome to Trash Bank where we only care about your name and your balance");
        System.out.println("Dear " + name + " Your Current Balance is " + balance);
        System.out.println("Enter amount to deposit");
        double deposit = scanner.nextDouble();
        balance += deposit;
        System.out.println("Your deposit was sucessful");
        System.out.println(name + "\n Your New Balance is : "+ balance);
        System.out.println("Goodbye and Thanks for Transacting with Trash Bank");
        scanner.close();
    }
}
