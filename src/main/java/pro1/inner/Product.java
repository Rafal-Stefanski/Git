package pro1.inner;

import java.util.Comparator;

public class Product {
    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%d - %s", id, name);
    }

    protected static class ByNameReversed implements Comparator<Product> {
        @Override
        public int compare(Product o1, Product o2) {
            return o2.getName().compareTo(o1.getName());
        }
    }

    protected class ByNameAndId implements Comparator<Product> {
        @Override
        public int compare(Product o1, Product o2) {
            if(!o1.getName().equals(o2.getName())) {
                return o1.getName().compareTo(o2.getName());

            }

            //z tej klasy mamy dostęp do wszystkich pól i metod klasy nadrzędnej
            String name = Product.this.name;

            return o1.getId() - o2.getId();
        }
    }
}
