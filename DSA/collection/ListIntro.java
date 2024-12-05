package collection;

import java.math.BigInteger;
import java.util.*;

public class ListIntro {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        Product product1 = new Product(100, "Earbuds", 99.99, "Tech");
        Product product2 = new Product(101, "Phone", 999.99, "Tech");
        list.add(product1);
        list.add(product2);
        System.out.println(list);
    }
}
class Product{
    private int pid;
    private String pname;
    private double price;
    private String category;

    public Product(){

    }

    public Product(int pid, String pname, double price, String category){
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString(){
        return "\n  {PID: " + pid + "\n    PNAME: "+ pname + "\n     PRICE: " + price + "\n    CATEGORY: " + category + "\n  }";
    } 
}
