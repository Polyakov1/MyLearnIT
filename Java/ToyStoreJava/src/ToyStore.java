import java.util.List;
import java.util.ArrayList;
import java.io.FileWriter;
import java.util.Random;
import java.io.IOException;
public class ToyStore {
    private List<Toy> toys;

    public ToyStore() {
        toys = new ArrayList<>();
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void updateWeight(int toyId, int weight) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setWeight(weight);
                break;
            }
        }
    }

    public Toy getPrizeToy() {
        int totalWeight = toys.stream().mapToInt(Toy::getWeight).sum();
        int randomWeight = new Random().nextInt(totalWeight) + 1;
        int currentWeight = 0;

        for (Toy toy : toys) {
            currentWeight += toy.getWeight();
            if (randomWeight <= currentWeight) {
                Toy prizeToy = new Toy(toy.getId(), toy.getName(), 1, toy.getWeight());
                toy.setQuantity(toy.getQuantity() - 1);
                if (toy.getQuantity() == 0) {
                    toys.remove(toy);
                }
                return prizeToy;
            }
        }

        return null;
    }

    public void savePrizeToy(Toy toy) {
        try (FileWriter writer = new FileWriter("prize_toys.txt", true)) {
            writer.write(toy.getName() + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
