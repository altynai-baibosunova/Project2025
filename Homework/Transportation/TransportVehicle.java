public abstract class TransportVehicle {
    public String name;
    public int speed;

    public TransportVehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

   public abstract void move();
}