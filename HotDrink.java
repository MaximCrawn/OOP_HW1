package hw_1;

public class HotDrink extends Drink {

    private int temperature;

    public HotDrink(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperanure(){
        return temperature;
    }




    
}
