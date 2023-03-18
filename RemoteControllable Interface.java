//Implements interface
public interface RemoteControllable()
{

    public String getStatusReport();

    public void updateMission(String newMission);
}

// Class writeups
public class Rover implements RemoteController {
    private double lat;
    private double longs;
    private String mission;

    public String getStatusReport() {
        return (getLocation() + "The rover is driving to:\n" + mission);
    }

    void setLocation(double latitude, double longitude) {
        this.lat = latitude;
        this.longs = longitude;
    }

    public String getLocation() {
        return ("The rover is located " + latitude + ", " + longitude + " on the planet");
    }

    private updateMission(String mission)
    {
        this.mission = mission;
    }
}

public class SpaceStation implements RemoteController {
    private String planet;
    private String mission;

    SpaceStation(String planet) {
        this.planet = planet;
    }

    String getLocation() {
        return ("The space station floats around the planet " + planet);
    }

    String getStatusReport() {
        return ("The station is on a mission to:\n" + mission);
    }

    void updateMission(String mission) {
        this.mission = mission;
    }
}