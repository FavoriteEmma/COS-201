import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Item Cost Calculator ===");

        System.out.print("Enter the name of the item: ");
        String itemName = input.nextLine();

        System.out.print("Enter the cost of one item: ");
        double unitCost = input.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        if (unitCost < 0 || quantity < 0) {
            System.out.println("Cost and quantity cannot be negative.");
        } else {
            double totalCost = unitCost * quantity;
            System.out.println("Item: " + itemName);
            System.out.println("Unit cost: " + unitCost);
            System.out.println("Quantity: " + quantity);
            System.out.printf("Total cost: %.2f%n", totalCost);
        }

        input.close();
    }
}
