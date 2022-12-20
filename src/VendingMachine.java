import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    void initProducts(List<Product> products) {

        //return products;
        //Product product = products.get(0);
        //product.getName();
        //Product product1 = new Product("Chocolate", 60);
        //Ets product2 = new Ets("Chips", 50, 40, 100);
    }

    public  Product getProduct (String name){
        return new Product(name);
    }

    public Product getProduct (String name, double cost){
        return new Product(name, cost);
    }

    public void makeProduct(Product something){
        System.out.println("Напиток " + something.getName() + " приготовлен");
    }

    static void restore() {
        System.out.println("Продукт выдан");
    }

}
