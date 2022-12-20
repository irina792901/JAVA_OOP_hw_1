public class Drinks extends Product {
    protected int volume;

    public Drinks(String name, double cost, int volume) {
        super(name, cost);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return name + " " + volume + "мл" + " " + "цена: " + cost + "\n";
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
