import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 1. Реализуйте класс Product (товар), содержащий данные о товаре,
 * и VendingMachine (торговый автомат), содержащий в себе методы
 * initProducts (List <Product>) и
 * getProduct (String name)
 * <p>
 * 2.Реализовать конструкторы, get/set методы, построить логику
 * VendingMachine на основе кода реализованного в задании 1.
 * <p>
 * 3.Реализовать наследника класса Product, добавив новому классу
 * доп переменную (например вес или объем напитка).
 * <p>
 * 4.Реализовать у класса VendingMachine, метод void restore() и
 * реализовать логику.
 * Создать в main список из нескольких объектов VendingMachine и
 * нескольких объектов его наследников.
 * Вызвать метод restore() для каждого элемента в списке.
 * Переопределить метод restore() у потомков и повторить пункт 3
 *
 * @author Ирина Шипунова группа 3417/2
 */

public class Main<enumerate> {
    public static void main(String[] args) {
        //List<VendingMachine> vm = new ArrayList<>();
        //vm.add(new VendingMachine());
        //vm.add(new DrinkVendingMachine());
        //for (VendingMachine i : vm) {
        //    i.restore();
        //}
        List<Product> products = new ArrayList<>(Arrays.asList(
                new Ets("Чипсы с грибами", 80, 50),
                new Ets("Кириешки", 20, 30),
                new Ets("Арахис в шоколаде", 50, 40),
                new Ets("Батончик Сникерс", 50, 40),
                new Ets("Шоколад Алёнка", 85, 90),
                new Ets("Жев. резинка Орбит со вкусом клубники", 35, 12),
                new Drinks("Сок яблочный", 30, 100),
                new Drinks("Сок яблочно-виноградный", 30, 100),
                new Drinks("Мин. вода Карачинская газированная", 30, 500),
                new Drinks("Мин. вода Карачинская", 30, 500),
                new Drinks("Зеленый чай", 60, 330),
                new Drinks("Кока-кола", 45, 330),
                new HotDrink("Кофе", 65, 120, 80),
                new HotDrink("Горячий шоколад", 75, 120, 80),
                new HotDrink("Горячий шоколад", 100, 200, 80),
                new HotDrink("Чай чёрный", 30, 170, 70),
                new HotDrink("Бульон", 50, 330, 60),
                new HotDrink("Кипяченая вода", 20, 330, 80)));

        List<HotDrink> assortimentHotDrinks = new ArrayList<>();
        for (var i : products) {
            if (i.getClass() == HotDrink.class) {
                assortimentHotDrinks.add((HotDrink) i);
            }
        }


        //vm4.makeProduct(vm4.getProduct("вода"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите что желаете: \n");

        String[] hotDrinks = {"Кофе", "Чай чёрный", "Горячий шоколад",
                "Кипяченая вода", "Бульон"};
        menu(hotDrinks, "");
        String nameDream = hotDrinks[Integer.parseInt(sc.next()) - 1];
        System.out.println("Выберите желаемый объём: ");
        String[] volumes = {"120", "170", "200", "330"};
        menu(volumes, "мл");
        int volumeDream = Integer.parseInt(volumes[Integer.parseInt(sc.next()) - 1]);
        System.out.println("Выберите температуру напитка °C: ");
        String[] temperatures = {"60", "70", "80"};
        menu(temperatures, "°С");
        int temperatureDream = Integer.parseInt(temperatures[Integer.parseInt(sc.next()) - 1]);
        sc.close();


        HotDrink dream = HotDrinkVendingMachine.getProduct(assortimentHotDrinks, nameDream, volumeDream, temperatureDream);
        if (dream !=null) {System.out.println(dream);
            HotDrinkVendingMachine.restore();}
        else System.out.println("Такого продукта приготовить не могу");
    }

    public static void menu(String[] arr, String simbol) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= arr.length; i++) {
            sb.append(i + " - " + arr[i - 1] + simbol + "\n");
        }
        System.out.println(sb);
    }
}
