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
    public static void main(String args[]) {
        Home_chef m1=new Home_chef("Biryani","Kheer",100,50);
        
    }
}

