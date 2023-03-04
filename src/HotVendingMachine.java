import java.util.ArrayList;

public class HotVendingMachine extends DrinkVendingMachine<HotDrink> {
    public HotVendingMachine(String firstMachine) {
        super(firstMachine);
        super.setProductList(new ArrayList<HotDrink>());
    }

    public HotDrink getProduct(String name, int volume, int temperature) {
        for (HotDrink el : super.getProductList()) {
            if (el.getName().equals(name) && el.getVolume() == volume &&
                    el.getTemperature() == temperature) {
                return el;
            }
        }
        return null;
    }
}
