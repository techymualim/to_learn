import java.util.Scanner;
public class Home_chef{
     static String meal_ofd; //static all of these because meal and sweet dishes and their prices will be same for all customers
     static String sweetdish_ofd;
     static int price_md;
     static int price_sd;
    
    Home_chef(String meal_,String sweetdish_,int price_,int price_s){
        meal_ofd=meal_;
        sweetdish_ofd=sweetdish_;
        price_md=price_;
        price_sd=price_s;
    }
  /* made the methods because asked in the problem that the chef can update the meals,sweets and their prices.*/
    public void meal_update(String meal_){
        meal_ofd=meal_;
    }
    public void sweet_update(String sweetdish_){
        sweetdish_ofd=sweetdish_;

    }
    public void meal_priceupdate(int price_){
        price_md=price_;

    }
    public void sweet_priceupdate(int price_s){
        price_sd=price_s;

    }
    public void Menu_viewer(){
        System.out.println("Meal of the day and its price :" + meal_ofd +" "+price_md +"\nSweet of the day and its price:" + sweetdish_ofd+" "+price_sd);
    }
    public static void main(String args[]) {
        Home_chef m1=new Home_chef("Biryani","Kheer",100,50);
        
        m1.Menu_viewer();
    }
}

 