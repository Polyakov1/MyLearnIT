public class Toy {

    private String name;
    private int quantity;
    private float chance;

    public void setChance(float chance) {
        this.chance = chance;
    }

    public Toy(String name, int quantity, float chance)
    {

        this.chance = chance;
        this.name = name;
        this.quantity = quantity;
    }

}
