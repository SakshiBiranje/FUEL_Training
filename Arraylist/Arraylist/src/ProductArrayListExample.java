
import java.util.ArrayList;

public class ProductArrayListExample {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(1, "Laptop", 50000, 2));
        products.add(new Product(2, "Mobile", 20000, 3));
        products.add(new Product(3, "Mouse", 500, 5));

        for (Product p : products) {
            p.display();
        }
    }
}
