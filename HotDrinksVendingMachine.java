package hw_1;

public class HotDrinksVendingMachine implements VendingMachine{

    @Override
    public HotDrink getProduct(String name, int volume, int temperature) {
        return new HotDrink(name, volume, temperature);
    }
}
    

