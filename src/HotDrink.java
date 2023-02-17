public class HotDrink extends Drink{
    private int temperature;
    HotDrink (String name, int price, int volume, int temp) {
        super(name, price, volume);
        this.temperature = temp;
    }
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
