package pl.sda.zadania_encapsulation.task.item;

public class ItemManager {
    public ItemModel createShopItem(String title, String description, double price) {
        return new ItemModel(title, description, price);
    }
}
