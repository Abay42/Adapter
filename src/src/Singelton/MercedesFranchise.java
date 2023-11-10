package Singelton;

public class MercedesFranchise {

    private static MercedesFranchise instance;
    private String location;

    private MercedesFranchise(String location) {
        this.location = location;
    }

    public static MercedesFranchise getInstance(String location) {
        if (instance == null) {
            instance = new MercedesFranchise(location);
        }
        return instance;
    }

    public String getLocation() {
        return location;
    }
}