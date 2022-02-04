import java.util.concurrent.ThreadLocalRandom;

public class lmsOneLaneBridge {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle(1,"east");
        Vehicle v2 = new Vehicle(2,"west");

        east e1 = new east(v1);
        west w1 = new west(v2);
        e1.run();
        w1.run();

    }




}

class east implements Runnable{

    Vehicle v;
    east(Vehicle v){
        this.v = v;
    }
    @Override
    public void run() {
        System.out.println(v.name + " has started crossing in direction " + v.direction);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(v.name + " crossed the bridge");
    }

}

class west implements Runnable{

    Vehicle v;
    west(Vehicle v){
        this.v = v;
    }
    @Override
    public void run() {
        System.out.println(v.name + " has started crossing in direction " + v.direction);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(v.name + " crossed the bridge");
    }
}

class Vehicle{

    int name;
    String direction; // false for east, true for west

    Vehicle(int name, String direction){
        this.name = name;
        this.direction = direction;
    }
}
