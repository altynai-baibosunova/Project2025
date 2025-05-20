public class Train extends TransportVehicle{
    public Train(String name, int speed){
        super(name, speed);
    }

    @Override
   public void move(){
        System.out.println("train is accelerating");
    }
}
