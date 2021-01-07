package org.launchcode;
import java.util.ArrayList;

public class MenuItems {
   private ArrayList<Item> menuItems;
   private ArrayList<Item> results;

   public  MenuItems(){
        menuItems = new ArrayList<Item>();
        results = new ArrayList<Item>();
   }
   public MenuItems(ArrayList<Item> existingMenu) {
       for(Item item : existingMenu)
           menuItems.add(item);
   }
   results = new ArrayList<Item>();

}
