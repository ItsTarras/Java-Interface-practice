//Implements interface
public interface RemoteControllable {
    public String getStatusReport();

    public void updateMission(String newMission);
}

// Class writeups
class Rover implements RemoteControllable {
    private double latitude;
    private double longitude;
    private String mission;

    public String getStatusReport() {
        return (getLocation() + "\nThe rover is driving to: " + mission);
    }

    public void setLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getLocation() {
        return ("The rover is located " + latitude + ", " + longitude + " on the planet");
    }

    public void updateMission(String mission) {
        this.mission = mission;
    }
}

class SpaceStation implements RemoteControllable {
    private String planet;
    private String mission;

    public SpaceStation(String planet) {
        this.planet = planet;
    }

    public String getLocation() {
        return ("The space station floats around the planet " + planet);
    }

    public String getStatusReport() {
        return (getLocation() + "\nThe station is on a mission to: " + mission);
    }

    public void updateMission(String mission) {
        this.mission = mission;
    }

}
