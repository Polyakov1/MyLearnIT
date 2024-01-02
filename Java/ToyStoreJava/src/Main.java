

public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();

        Toy doll = new Toy(1, "Doll", 5, 20);
        Toy car = new Toy(2, "Car", 10, 30);
        Toy ball = new Toy(3, "Ball", 3, 50);

        toyStore.addToy(doll);
        toyStore.addToy(car);
        toyStore.addToy(ball);

        toyStore.updateWeight(1, 25);

        Toy prizeToy = toyStore.getPrizeToy();
        if (prizeToy != null) {
            toyStore.savePrizeToy(prizeToy);
        }
    }
}