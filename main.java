
package transport1;

public class Main {
    public static void main(String[] args) {
        TransportVehicle vehicle = new TransportVehicle("Gnome", "Benz", 1234, 110);
        System.out.println("default:");
        vehicle.print();

        vehicle.setMark("GASSS");
        vehicle.setModel("Volga");
        vehicle.setPower(120);
        System.out.println("\n new:");
        vehicle.print();

        Airplane plane = new Airplane("Boing", "747", 5678, 9000, "Petrov ", 350);
        System.out.println("\nPlane:");
        plane.print();

        plane.setPilot("Sidorov");
        plane.setPlaces(400);
        System.out.println("\nNewPlane:");
        plane.print();

        String pilot = plane.getPilot();
        int places = plane.getPlaces();
        System.out.println("\ninf:");
        System.out.println("pilot: " + pilot);
        System.out.println("places: " + places);
    }
}
