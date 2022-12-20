import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine extends VendingMachine {

    static HotDrink getProduct(List<HotDrink> products, String nameDream, int volumeDream, int temperatureDream) {
        for (HotDrink i : products) {
            if (i.getName() == nameDream
                    && i.getVolume() == volumeDream
                    && i.getTemperature() == temperatureDream)
                return i;
        }
        return null;
    }

    static void restore() {
        System.out.println("горячий напиток выдан");
    }
}
