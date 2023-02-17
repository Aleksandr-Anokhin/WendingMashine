public class Product {
    private String name;
    private int price;
    Product(String name, int price){
        this.name = name;
        this.price = price;
    }
    public void consume(Product pr){

        System.out.println(pr.getName() + " spent");
    }
    public String getName(){

        return this.name;
    }
    public Integer getPrice(){

        return this.price;
    }
    public void setName(String name){

        this.name = name;
    }
    public void setPrice(Integer price){

        this.price = price;
    }
    @Override
    public String toString(){

        return name + ": " + price;
    }
}
