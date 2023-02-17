import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> goods = new ArrayList<>();
        goods.add(new Drink("still water", 30, 500));
        goods.add(new Drink("sparkling water", 33, 500));
        goods.add(new Product("chicken sandwich", 70));
        goods.add(new Product("snickers", 50));
        goods.add(new HotDrink("coffee 3 in 1", 30, 300, 80));
        goods.add(new HotDrink("black tea", 25, 300, 80));
        goods.add(new HotDrink("green tea", 25, 300, 80));

        HotVendingMachine hvm = new HotVendingMachine();
        hvm.setGoods(goods);

        ArrayList<Product> food = hvm.getProducts("green tea", 300, 80);
        for(Product prod: food){
            System.out.println(prod.toString());
        }
    }

}