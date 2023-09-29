public class Human extends Actor {
    @Override
    public void setMakeOrder() {
        isMakeOrder = true;

    }

    @Override
    public void setTakeOrder() {
        isTakeOrder = true;

    }

    @Override
    public String toString() {
        return String.format(name 
       // +" :\n"+"Заказ принят  " + isMakeOrder + "\nЗаказ выдан " + isTakeOrder
        );
    }
}