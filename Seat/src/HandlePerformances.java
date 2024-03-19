import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HandlePerformances {
    private Queue<Performance> performances;

    public HandlePerformances() {
        performances = new LinkedList<>();
    }

    public void handlePerformances() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("Options:");
            System.out.println("1. Add performances");
            System.out.println("2. Display all the performances");
            System.out.println("3. Start the performances");
            System.out.println("4. QUIT");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of performances to add: ");
                    int numPerformances = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    addPerformances(numPerformances, scanner);
                    break;
                case 2:
                    displayPerformances();
                    break;
                case 3:
                    startPerformance();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
        }
        scanner.close();
    }

    private void addPerformances(int numPerformances, Scanner scanner) {
        for (int i = 0; i < numPerformances; i++) {
            System.out.println("Enter details for performance " + (i + 1) + ":");
            System.out.print("ID: ");
            String id = scanner.nextLine();
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Lead Name: ");
            String leadName = scanner.nextLine();
            performances.add(new Performance(id, name, leadName));
        }
    }

    private void displayPerformances() {
        System.out.println("Performances:");
        for (Performance performance : performances) {
            System.out.println(performance);
        }
    }

    private void startPerformance() {
        if (!performances.isEmpty()) {
            Performance firstPerformance = performances.peek();
            System.out.println("Starting performance:");
            System.out.println(firstPerformance);
        } else {
            System.out.println("No performances to start.");
        }
    }
}
