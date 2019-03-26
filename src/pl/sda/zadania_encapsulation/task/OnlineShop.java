package pl.sda.zadania_encapsulation.task;

import pl.sda.zadania_encapsulation.task.item.ItemManager;
import pl.sda.zadania_encapsulation.task.item.ItemModel;
import pl.sda.zadania_encapsulation.task.user.UserManager;

public class OnlineShop {
    public static void main(String[] args) {
        ItemManager itemManager = new ItemManager();
        ItemModel item = itemManager.createShopItem("Smart TV", "FullHD", 1999.99);
        System.out.println("item = " + item);

        UserManager userManager = new UserManager();
        userManager.createUser("Janek", "Dolas", 33);
        System.out.println("user = " + userManager.getUser());

        ShopCart shopCart = new ShopCart();
        shopCart.addItem(item, 3);
        shopCart.buy();
    }
}
