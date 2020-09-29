package udemy.java_programming_masterclass.section12.sortedCollections;

import java.util.Collections;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> list;

    public StockList(Map<String, StockItem> list) {
        this.list = list;
    }

    public int addStock(StockItem item) {
        if (item != null) {
            // check if already have quantities of this item
            StockItem inStock = list.getOrDefault(item.getName(), item);
//            StockItem inStock = list.get(item.getName());

            // If there are already stocks on this item, adjust the quantity
            if (inStock != item) {
                item.adjustStock(inStock.quantityInStock());
            }

            list.put(item.getName(), item);
            return item.quantityInStock();
        }
        return 0;
    }

    public int sellStock(String item, int quantity) {
        StockItem inStock = list.getOrDefault(item, null);
        if ((inStock != null) && (inStock.quantityInStock() >= quantity) && (quantity > 0)) {
            inStock.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }

    public StockItem get(String key) {
        return list.get(key);
    }

    public Map<String, StockItem> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0.0;
        for (Map.Entry<String, StockItem> item : list.entrySet()) {
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.quantityInStock();

            s = s + ". There are " + stockItem.quantityInStock() + " in stock. Value of item: ";
            s = s + itemValue + "\n";
            totalCost += itemValue;
        }

        return s + "Total stock value" + totalCost;
    }
}