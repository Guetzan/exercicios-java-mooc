public class OneItemBox extends Box {
    public void add(Item item) {
        if(super.getItems().size() == 1) {
            return;
        }

        super.getItems().add(item);
    }

    public boolean isInBox(Item item) {
        return super.getItems().contains(item);
    }
}
