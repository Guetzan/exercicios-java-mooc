public class BoxWithMaxWeight extends Box {
    private final int maxWeight;
    private int weight;

    public BoxWithMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
        this.weight = 0;
    }

    @Override
    public void add(Item item) {
        if(this.weight + item.getWeight() > this.maxWeight) {
            return;
        }

        super.getItems().add(item);
        this.weight += item.getWeight();
    }

    @Override 
    public boolean isInBox(Item item) {
        return super.getItems().contains(item);
    }
}
