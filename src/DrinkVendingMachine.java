public class DrinkVendingMachine extends VendingMachine{

    public Drinks getProduct(String name, double cost, int volume){
        return new Drinks(name, cost, volume);
    }


    static void restore() {
        System.out.println("Напиток выдан");
    }
}
