import java.util.ArrayList;
public class DrinkVendingMachine extends VendingMachine {
    public DrinkVendingMachine(String firstMachine) {
        super(firstMachine);
        super.setProductList(new ArrayList<Drink>());
    }
}
