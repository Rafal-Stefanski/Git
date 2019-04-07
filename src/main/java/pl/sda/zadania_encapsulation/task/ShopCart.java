package pl.sda.zadania_encapsulation.task;

import pl.sda.zadania_encapsulation.task.item.ItemModel;

import java.util.ArrayList;
import java.util.List;

/**
 * 5. Utwórz klasę, która będzie zapewniać API do zarządzania sklepem: użytkownik dodaje wybrane przedmioty w zadanej ilości do swojego koszyka,
 *    a następnie dokonuje zakupu. Wykonywane operacje powinny być wyświetlane na konsoli.
 *    Zadbaj o odpowiednią hermetyzację swojego API oraz właściwe modyfikatory dostępu.
 */

public class ShopCart {
    private List<ItemModel> itemModels = new ArrayList<>();

    public ShopCart addItem(ItemModel item, int count) {
        for (int i = 0; i < count; i++) {
            itemModels.add(item);
        }

        System.out.printf("Dodano do koszyka produkt: %s, w ilości: %d%n", item, count);
        return this;
    }

    public double buy() {
        int total = 0;
        double totalPrice = 0;
        for (ItemModel itemModel : itemModels) {
            total++;
            totalPrice+= itemModel.getPrice();
        }

        System.out.printf("Zakupiono produkty o łącznej wartości: %.2fzł, w ilości: %d sztuk%n", totalPrice, total);
        return totalPrice;
    }
}
