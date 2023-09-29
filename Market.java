import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour{
    List <Actor> WhoInMarket = new ArrayList<>();;
    Queue<Actor> que = new LinkedList<>();
    int orders=0;
    @Override
    public void takeInQueue(Actor actor) {
     que.add(actor);
    //System.out.println("que:"+que.size());
    }

    @Override
    public void takeOrders() {
        orders++;
      //  System.out.println("orders:"+orders);
 
    }

    @Override
    public void giveOrders() {
      orders--;
     // System.out.println("orders:"+orders);
    }

    @Override
    public void releaseFromQueue() {
    que.remove();
   // System.out.println("que:"+ que.size());
    }

    @Override
    public void acceptToMarket(Actor actor) {
    System.out.println(actor.getName()+ " пришел в магазин");
    WhoInMarket.add(actor);
    //System.out.println(WhoInMarket);
    takeInQueue(actor);
    System.out.println(actor.getName()+ " встал в очередь");
    takeOrders();

    }

    @Override
    public void releaseFromMarket(Actor actor) {
     if ((orders+1 == que.size())&&(actor.getName()==que.element().getName()))
     {
     releaseFromQueue();
     System.out.println(actor.getName()+ " вышел из очереди");
     System.out.println(actor.getName()+ " ушел из магазина");
     WhoInMarket.remove(actor);
        //System.out.println(WhoInMarket)
    }
    else {
        System.out.println("Warning! " +actor.getName() +" пока не может уйти из магазин,нужен update,либо он не в начале очереди!");}

    }

    @Override
    public void update() {
     giveOrders();
    }
}