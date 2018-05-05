package Lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException,IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        Shop myShop;

        Goods[] goods = {new Goods("Camell", "Cigarets", 17.8f, 20, "NOT FOR KIDS"),
                new Goods("Garage", "Drink", 7.5f, 4, "Alcohol", "19.04.2018"),
                new Goods("GreenField", "Tea", 3.0f, 0, "Tasty", false)
        };

        myShop = new Shop(goods);
        System.out.println("List: ");
        myShop.printList();
        System.out.println("Not in stock: ");
        myShop.printList(false);
        System.out.println("Пошук по категорії: ");
        String category = input.readLine();
        String categoryGood = myShop.findGoodByCategory(category);
        System.out.println(categoryGood);
    }
}
