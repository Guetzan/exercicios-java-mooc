import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> list;

    public IOU() {
        this.list = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.list.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        if(!this.list.containsKey(toWhom)) {
            this.list.put(toWhom, 0.0);
        }

        return this.list.get(toWhom);
    }
}
