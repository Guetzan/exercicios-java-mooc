import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicles;

    public VehicleRegistry() {
        this.vehicles = new HashMap<>();
    }

    public boolean add(LicensePlate plate, String owner) {
        if(!(this.vehicles.get(plate) == null)) {
            return false;
        }

        this.vehicles.put(plate, owner);
        return true;
    }

    public boolean remove(LicensePlate licensePlate) {
        if(!(this.vehicles.containsKey(licensePlate))) {
            return false;
        }

        this.vehicles.remove(licensePlate);
        return true;
    }

    public String get(LicensePlate plate) {
        return this.vehicles.get(plate);
    }

    public void printLicensePlates() {
        for(LicensePlate plate: this.vehicles.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> printedOwners = new ArrayList<>();

        for(String owner: this.vehicles.values()) {
            if(printedOwners.contains(owner)) {
                continue;
            }
            
            System.out.println(owner);
            printedOwners.add(owner);
        }
    }
}
