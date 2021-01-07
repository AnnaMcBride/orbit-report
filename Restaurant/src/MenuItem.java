
import java.util.Scanner;

public class MenuItem {
//
        private String name;
        private String description;
        private String itemCategory;
        private double itemPrice;
        private int dateAdded;
        private boolean isNew;

      //  public static Date;
       // Date date = new Date();


    public MenuItem (String name, String itemDescription, String itemCategory, double itemPrice, int dateAdded, boolean isNew) {
        this.name = name;
        this.description = itemDescription;
        this.itemCategory = itemCategory;
        this.itemPrice = itemPrice;
        this.dateAdded = dateAdded;
        this.isNew = isNew;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getDescription() {
        return  description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getItemCategory() {
        return itemCategory;
    }
    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public double getItemPrice(){
        return itemPrice;
    }
    public void setItemPrice(double itemPrice){
        this.itemPrice = itemPrice;
    }

    public int getDateAdded(){
        return dateAdded;
    }
    public void setDateAdded(int dateAdded){
        this.dateAdded = dateAdded;
    }

    public String getIsNew() {
        String x = "";
        if (isNew) {
            x = this.name + " is a new menu item!";
        }
        return x;

    }

    public void setIsNew(boolean isNew){
        this.isNew = isNew;
    }

    public String toString(){
        return this.name + " (" + this.itemCategory + ") " + this.description  + ", $" + this.itemPrice + " " +  getIsNew();
    }




};
