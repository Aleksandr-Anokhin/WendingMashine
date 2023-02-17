import java.util.ArrayList;

public class HotVendingMachine extends DrinkVendingMachine {
    public ArrayList<Product> getProducts(String lookUp, int vol, int temp) {
        ArrayList<Product> findDrinks = new ArrayList<>();
        for (Product pr: goods) {
            if (pr instanceof HotDrink) {
                HotDrink ht = (HotDrink) pr;
                if (lookUp.equals((ht.getName())) && vol == ht.getVolume() && temp == ht.getTemperature()) {
                    findDrinks.add(ht);
                }
            }
        }
        return findDrinks;
    }
}
