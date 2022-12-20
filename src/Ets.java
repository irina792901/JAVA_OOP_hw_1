public class Ets extends Product {
    private int weight;

    public Ets(String name, double cost, int weight) {
        super(name, cost);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " " + weight + "г" + " " + "цена: " + cost + "\n";
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
