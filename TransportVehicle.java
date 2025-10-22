// Определить класс Транспортное средство с полями
// марка, модель, номер, мощность.
// Определить функции назначения и изменения полей и функцию
// вывода на экран.

package transport1;

public class TransportVehicle{
    String mark;
    String model;
    int number;
    int power;
    public TransportVehicle(
            String mark, String model, int number, int power
        ){
        this.mark = mark;
        this.model = model;
        this.number = number;
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
        return this.power;
    }

    public void setMark(String mark){
        this.mark = mark;
    }

    public void setModel(String model){
        this.model = model;
    }
    public void setNumber(int number){
        this.number=number;
    }

    public void setPower(int power){
        this.power = power;
    }

    public void print(){
        System.out.println(mark);
        System.out.println(model);
        System.out.println(number);
        System.out.println(power);
    }
}
