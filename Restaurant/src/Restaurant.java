import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Restaurant {
    public static void menuList() {
        MenuItem pasta = new MenuItem("Pasta", "Freshest, fresh pasta noodles and sauce", "Entree", 12.00, 11 / 20, true);
        MenuItem sandwich = new MenuItem("Sandwich", "Top the bread with any meats and cheese", "Entree", 10.00, 10 / 20, true);
        MenuItem hummus = new MenuItem("Hummus", "House made hummus and fresh veggies", "Appetizer", 8.00, 6 / 20, false);
        MenuItem crabCakes = new MenuItem("Crab Cakes", "Fresh crab, served with dipping sauce", "Appetizer", 12.00, 8 / 20, false);
        MenuItem chocolateCake = new MenuItem("Chocolate Cake", "Three layers of the best cake you have ever tasted", "Dessert", 10.00, 6 / 20, false);
        MenuItem keyLimePie = new MenuItem("Key Lime Pie", "Tartest tart Key Lime Pie", "Dessert", 12.00, 12 / 20, true);


        ArrayList<Object> wholeMenu = new ArrayList<>();
        wholeMenu.add(pasta);
        wholeMenu.add(sandwich);
        wholeMenu.add(hummus);
        wholeMenu.add(crabCakes);
        wholeMenu.add(chocolateCake);
        wholeMenu.add(keyLimePie);

        for(int i = 0; i< wholeMenu.size(); i++){
            System.out.println(wholeMenu.get(i));


        }
        System.out.println(wholeMenu.get(1));
    }
}


//    String firstName = list.get(0);         //alex
//    String secondName = list.get(1);        //brian
//
//        System.out.println(firstName);
//                System.out.println(secondName);