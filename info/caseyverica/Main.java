package info.caseyverica;

class Car {
    private int cylinders;
    private int wheels;
    private String name;
    private boolean engine;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        System.out.println("Check engine light lol");
        return engine;
    }

    public void startEngine() {
        boolean engine = isEngine();
        int size = getCylinders();
        System.out.println("There is an engine: " + engine + ".\nIt has " + size + " cylinders.\n\tStarting engine");
    }

    public void accelerate() {
        System.out.println("The Car is accelerating.");
    }

    public void brake() {
        System.out.println("The Car is braking.");
    }
}


class Corvette extends Car {

    public Corvette() {
        super(8, "'63 Stingray Mk II'");
    }

    @Override
    public void accelerate() {
        System.out.println("The car peels out down the street.");
    }

    @Override
    public void brake() {
        System.out.println("The car screeches to a halt.");
    }
}

class MiniCooper extends Car {
    public MiniCooper() {
        super(4, "Mini Cooper");
    }

    @Override
    public void startEngine() {
        System.out.println("Pull lever to start");
        super.startEngine();
    }

    @Override
    public void accelerate() {
        System.out.println("The car starts bumbling along");
    }

    @Override
    public void brake() {
        System.out.println("Since the car is so light, it comes to a stop effortlessly.");
    }
}

class Vanquish extends Car {
    public Vanquish() {
        super(12, "Aston Martin Vanquish");
    }

    @Override
    public void startEngine() {
        System.out.println("Push Button to start.");
        super.startEngine();
    }

    @Override
    public void accelerate() {
        System.out.println("With a gentle hum, the car pins you to your seat.");
    }

    @Override
    public void brake() {
        System.out.println("Pressed to your seatbelt, the car smoothly stops.");
    }
}


public class Main {

    public static void main(String[] args) {
	Car vette = new Corvette();
	Car mini = new MiniCooper();
	Car AM = new Vanquish();

	vette.startEngine();
	vette.accelerate();
	vette.brake();
    mini.startEngine();
    mini.accelerate();
    mini.brake();
    AM.startEngine();
    AM.accelerate();
    AM.brake();
    }
}
