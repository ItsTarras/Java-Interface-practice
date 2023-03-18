class Main {
    public static void main(String[] args) {
        SpaceStation station = new SpaceStation("Mars");
        System.out.println(station instanceof RemoteControllable);
        station.updateMission("Store food rations for hungry space travelers");
        System.out.println(station.getStatusReport() + "\n");

        Rover rover = new Rover();
        System.out.println(rover instanceof RemoteControllable);
        rover.setLocation(100.0, 42.0);
        rover.updateMission("Find water");
        System.out.println(rover.getStatusReport());
    }
}