import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> units;

    public StorageFacility() {
        this.units = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.units.putIfAbsent(unit, new ArrayList<>());
        this.units.get(unit).add(item);
    }

    public void remove(String unit, String item) {
        if(!this.units.containsKey(unit)) {
            return;
        }

        ArrayList<String> targetUnit = this.units.get(unit);

        if(!targetUnit.contains(item)) {
            return;
        }

        targetUnit.remove(item);

        if(targetUnit.isEmpty()) {
            this.units.remove(unit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> storageNames = new ArrayList<>();

        for(String unitKey: this.units.keySet()) {
            storageNames.add(unitKey);
        }

        return storageNames;
    }

    public ArrayList<String> contents(String storageUnit) {
        if(!this.units.containsKey(storageUnit)) {
            return new ArrayList<>();
        }

        if(this.units.get(storageUnit).isEmpty()) {
            return new ArrayList<>();
        }

        return this.units.get(storageUnit);
    }
}
