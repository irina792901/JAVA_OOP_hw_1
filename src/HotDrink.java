import java.util.ArrayList;

public class HotDrink extends Drinks {
    private int temperature;

    public HotDrink(String name, double cost, int volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

      @Override
    public String toString() {
        return name + " " + volume + "мл" + " " + temperature + "°С" + " " + "цена: " + cost + "\n";
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
