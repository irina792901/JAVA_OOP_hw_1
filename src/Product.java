
public class Product {
    protected double cost;
    protected String name;// в будущем добавится int id

    public  Product(String name){
        this.name = name;
    }

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String toString() {
        return name + "цена: " + cost + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
