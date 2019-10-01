package pt3;

public class Product {
    private String name;
    private int price;
    private int quantity;

    static int countBigQuantity=0;
    static String bigQuantity;
    static int countBigPrice=0;
    static int countBigPriceQuantity=0;
    static String bigPrice;

    private void check(int p, int q, String n){
        if (p>countBigPrice){
            countBigPrice = p;
            countBigPriceQuantity =q;
            bigPrice = n;
        }
        if (q>countBigQuantity){
            countBigQuantity=q;
            bigQuantity = n;
        }
    }

    public void printMostExpensive(){
        System.out.println(bigPrice+" quantity: "+countBigPriceQuantity);
    }
    public void printBiggestQuantity(){
        System.out.println(bigQuantity);
    }
    public Product() {
    }

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        check(price,quantity,name );
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        check(price, this.quantity, this.name);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        check(this.price, quantity, this.name);
    }
}
