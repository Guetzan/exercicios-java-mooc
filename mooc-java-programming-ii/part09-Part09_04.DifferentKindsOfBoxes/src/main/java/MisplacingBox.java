public class MisplacingBox extends Box {
    public void add(Item item) {
        super.getItems().add(item);
    }

    public boolean isInBox(Item item) {
        return false;
    }
}
