package models;

import play.mvc.Result;
import scala.util.parsing.combinator.testing.Str;

/**
 * Created by User on 07/24/2018.
 */
public class  Products {
    private String id,name;
    private Double price;
    private int amount;

    public Products(String id, String name, Double price, int amount){
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


}
