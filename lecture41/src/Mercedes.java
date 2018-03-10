public class Mercedes extends Car{
    private String name;
    private double price;

    public Mercedes(String name, int size, String material, String type, int doors, String name1, double price) {
        super(name, size, material, type, doors);
        this.name = name1;
        this.price = price;
    }

    @Override
    public void handStare() {
        super.handStare();
    }

    @Override
    public void changeGear() {
        super.changeGear();
    }

    @Override
    public void move(int speed) {
        super.move(speed);
    }

    public void makeCrashTest(int cars, int speed) {

    }
}
