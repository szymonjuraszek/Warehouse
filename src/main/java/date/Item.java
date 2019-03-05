package date;

public class Item implements Comparable<Item> {

    private String name;
    private ItemCondition condition;
    private double mass;
    private int value;

    public Item() {
    }

    public Item(String name, ItemCondition condition, double mass, int value) {
        this.name = name;
        this.condition = condition;
        this.mass = mass;
        this.value = value;
    }

    public void increaseValueOfProduct(int value){
        this.value += value;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemCondition getCondition() {
        return condition;
    }

    public void setCondition(ItemCondition condition) {
        this.condition = condition;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", condition=" + condition +
                ", mass=" + mass +
                ", value=" + value +
                '}';
    }

    public int compareTo(Item o) {
        return name.compareTo(o.getName());
    }
}
