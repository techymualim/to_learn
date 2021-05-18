import java.util.Scanner;
public class Home_chef{
     static String meal_ofd; //static all of these because meal and sweet dishes and their prices will be same for all customers
     static String sweetdish_ofd;
     static int price_md;
     static int price_sd;
    
    Home_chef(String meal_ofd,String sweetdish_ofd,int price_md,int price_sd){
        this.meal_ofd=meal_ofd;
        this.sweetdish_ofd=sweetdish_ofd;
        this.price_md=price_md;
        this.price_sd=price_sd;
    }
  /* made the methods because asked in the problem that the chef can update the meals,sweets and their prices.*/
    public void meal_update(String meal_ofd){
        this.meal_ofd=meal_ofd;
    }
    public void sweet_update(String sweetdish_ofd){
        this.sweetdish_ofd=sweetdish_ofd;

    }
    public void meal_priceupdate(int price_md){
        this.price_md=price_md;

    }
    public void sweet_priceupdate(int price_sd){
        this.price_sd=price_sd;

    }
    public void Menu_viewer(){
        System.out.println("Meal of the day and its price :" + meal_ofd +" "+price_md +"\nSweet of the day and its price:" + sweetdish_ofd+" "+price_sd);
    }
    public static void main(String args[]) {
        Home_chef m1=new Home_chef("Biryani","Kheer",100,50);
        
        m1.Menu_viewer();
    }
}

public class customer_order extends Home_chef{
    private String name;
   private String address;
   private int phone;
   private String mode_pay;
   private String meal;
   private int total_price;
   private int Quantity;
   Scanner myObj = new Scanner(System.in); 

   public void placeOrder(){
    System.out.println("Enter Name:");
    this.name=myObj.nextLine();
    System.out.println("Enter Address:");
    this.address=myObj.nextLine();
    System.out.println("Enter phone:");
    this.phone=myObj.nextInt();
    System.out.println("Enter Mode Of pay(card or cash on delivery):");
    this.mode_pay=myObj.nextLine();
    System.out.println("Select Meal or Sweet");
    this.meal=myObj.nextLine();
    System.out.println("Quantity");
    Quantity=myObj.nextInt();
    if(meal =="Meal"){
        this.total_price=price.md*Quantity;

    }else if(meal="Sweet"){
        this.total_price=price.sd*Quantity;
    }

   }
   public void updateOrder(){
    System.out.println("Enter Name:");
    this.name=myObj.nextLine();
    System.out.println("Enter Address:");
    this.address=myObj.nextLine();
    System.out.println("Enter phone:");
    this.phone=myObj.nextInt();
    System.out.println("Enter Mode Of pay(card or cash on delivery):");
    this.mode_pay=myObj.nextLine();
    System.out.println("Select Meal or Sweet");
    this.meal=myObj.nextLine();
    System.out.println("Quantity");
    Quantity=myObj.nextInt();
    if(meal =="Meal"){
        this.total_price=price.md*Quantity;

    }else if(meal="Sweet"){
        this.total_price=price.sd*Quantity;
    }
   }
   public void viewOrder(){
       System.out.println("Order of "+ this.name+ " Is"+this.meal+"\nTotal Amount is:"+this.total_price);

   }
   
}