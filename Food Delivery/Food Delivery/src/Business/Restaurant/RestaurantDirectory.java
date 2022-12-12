/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Restaurant;

import Business.Customer.Customer;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author srikr
 */
public class RestaurantDirectory {
    
    private ArrayList<Restaurant> restaurantDirectory;
    private Restaurant restaurant;
    private Dishes menu;
    public RestaurantDirectory(){
        restaurantDirectory = new ArrayList<Restaurant>();
    }

    public ArrayList<Restaurant> getRestaurantDirectory() {
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(ArrayList<Restaurant> restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    
    
     public Restaurant createUserAccount(String username){
        restaurant = new Restaurant(username);
        restaurantDirectory.add(restaurant);
        return restaurant;
    }
     
     public void updateRestaurantInfo(Restaurant restro, String name,String number,String address ){
         restro.setName(name);
         restro.setAddress(address);
         restro.setNumber(number);
     }
     
    
    
    public void deleteRestaurant(String username){
        for(int i=0;i<restaurantDirectory.size();i++){
            if(restaurantDirectory.get(i).getUserName()==username){
                restaurantDirectory.remove(i);
            }
        }
    
    }
    
    public Dishes AddMenuDishes(Restaurant restro,String name,String desc,String amount){
        menu=new Dishes(name, desc, amount);
        restro.addFoodItem(menu);
        return menu;
    }
    
    public void DeleteDishes(Restaurant restro,Dishes menu){
        restro.removeFoodItem(menu);
        
    }
    
    public Dishes CheckDish(String fname, String fdescription,String Price){
        for(Dishes d : restaurant.getMenu()){
            if (d.getName().equals(fname) && d.getDescription().equals(fdescription)&& d.getPrice().equals(Price)){
                return d;
            }
        }
        return null;
    }
    
}
