import java.util.Scanner;
import java.util.UUID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


        Product laptop = new Product("Laptop", 1200.0, 20, 5);
        Product smartphone = new Product("Smartphone", 800.0, 10, 3);

        System.out.print("Enter average daily sales for Laptop: ");
        int laptop_avg = scanner.nextInt();

        System.out.print("Enter average daily sales for Smartphone: ");
        int Smartphone_avg = scanner.nextInt();

        StockPredictor laptopStock = new StockPredictor();
        StockPredictor smartphoneStock = new StockPredictor();

        System.out.println("\nProduct Details:");
        System.out.println("Product ID: " + laptop.getProductId());
        System.out.println("Name: " + laptop.getName());
        System.out.println("Price: $" + laptop.getPrice());
        System.out.println("Stock Level: " + laptop.getStockLevel());
        System.out.println("Reorder Threshold: " + laptop.getReorderThreshold());
        System.out.println("----------------------------");
        System.out.println("Product ID: " + smartphone.getProductId());
        System.out.println("Name: " + smartphone.getName());
        System.out.println("Price: $" + smartphone.getPrice());
        System.out.println("Stock Level: " + smartphone.getStockLevel());
        System.out.println("Reorder Threshold: " + smartphone.getReorderThreshold());
        System.out.println("----------------------------");

        System.out.println("Stock Prediction for Laptop:");
        System.out.println("Days until stock out: " + laptopStock.predictStockRunOutDays(laptop,laptop_avg));
        System.out.println("Restock Suggestion: " + laptopStock.suggestRestockingStrategy(laptop,laptop_avg));

        System.out.println("\nStock Prediction for Smartphone:");
        System.out.println("Days until stock out: " + smartphoneStock.predictStockRunOutDays( smartphone,Smartphone_avg));
        System.out.println("Restock Suggestion: " + smartphoneStock.suggestRestockingStrategy(smartphone,Smartphone_avg));


        UUID productId = UUID.randomUUID();
        Order order1 = new Order("John", productId, 5);
        OrderManager orderManager = new OrderManager();
        orderManager.processOrder(order1);
        orderManager.shutdown();

    }
}

