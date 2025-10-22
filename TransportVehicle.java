// Определить класс Транспортное средство с полями
// марка, модель, номер, мощность.
// Определить функции назначения и изменения полей и функцию
// вывода на экран.

package transport;

public class TransportVehicle(){
    String mark;
    String model;
    int number;
    double power;
    public TransportVehicle(mark, model, number, power){
        this.mark = mark;
        this.model = model;
        this.number number;
        this.power = power;
    }
    public String getMark(){
        return this.mark;
    }

    public String getModel(){
        return this.model;
    }

    public int getNumber(){
        return this.number;
    }

    public int getPower(){
        return this.Power()
    }

    public void setMark(String mark){
        this.mark = mark;
    }

    public void SetModel(String model){
        this.model = model;
    }
    public setNumber(int number){
        this.number=number;
    }

    public setPower(int power){
        this.power = power;
    }

    public void print(){
        System.out.println(mark);
        System.out.println(model);
        System.out.println(number);
        System.out.println(power);
}
