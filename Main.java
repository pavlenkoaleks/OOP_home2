public class Main {
    public static void main(String[] args) {
        Human Human1 = new Human();
        Human1.setName("Aleksandr");
       // Human1.setMakeOrder();
       // Human1.setTakeOrder();
        
        Human Human2 = new Human();
        Human2.setName("Anastasia");
        //Human2.setMakeOrder();
       // Human2.setTakeOrder();


        //System.out.println(Human1);
        //System.out.println(Human2);

        Market Market = new Market();
        Market.acceptToMarket(Human1);
        Market.acceptToMarket(Human2);
       
        Market.update();
        
        Market.releaseFromMarket(Human1);
       
        Market.releaseFromMarket(Human2);




    }
}