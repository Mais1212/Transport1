// Определить производный класс — «Самолет», экземпляры которого имеют поле
// ФИО пилота, кол-во посадочных мест
// Определить функцию вывода на экран
// Определить функцию переназначения ФИО пилота, количества посадочных мест

package transport;

public class Airplane() extends TransportVehicle{
    String pilot;
    int places;

    public Airplane(
            String mark, String model, int number,
            int power, String pilot, int places
        )
    {
        super();
        this.pilot = pilot;
        this.places = places;
    }
    public void setPilot(String pilot) {
        this.pilot = pilot;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public String setPilot() {
        return pilot;
    }

    public int getPlaces() {
        return places;
    }

    public void print(){
        super().print();
        System.out.println(places);
        System.out.println(pilot);
    }
}
