import java.util.Scanner;

public class StockPredictor {

    public  int predictStockRunOutDays(Product product, int averageDailySales) {

        if (averageDailySales <= 0) {
            return -1;
        }
        return product.getStockLevel() / averageDailySales;
    }

    public  String suggestRestockingStrategy(Product product, int averageDailySales) {
        int dayleft = predictStockRunOutDays(product, averageDailySales);
        if (dayleft <= 2) {
            return "Urgent restock needed!";
        } else {
            return "Restock Suggestion: Moderate: Consider restocking soon.";
        }
    }
}

