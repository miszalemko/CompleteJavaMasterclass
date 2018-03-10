public class Car extends Vehicle{
    private String type;
    private int doors;

    public Car(String name, int size, String material, String type, int doors) {
        super(name, size, material);
        this.type = type;
        this.doors = doors;
    }

    public void handStare() {
        changeGear();
    }

    public void changeGear() {
        System.out.println("changing gears");
    }

    public void move(int speed) {
        System.out.println("Speed regulation");
    }
}
