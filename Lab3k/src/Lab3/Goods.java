package Lab3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Goods {
    private final String name;
    private final String category;
    private final int quantity;
    private final float cost;
    private final String description;
    private boolean inStock;
    private Date supplyDate;

    public Goods(String name, String category, float cost, int quantity, String description){
        this.name = name;
        this.category = category;
        this.cost = cost;
        this.quantity = quantity;
        this.description = description;
        this.inStock = true;
        this.supplyDate = null;
    }

    public Goods(String name, String category, float cost, int quantity, String description, String date ) throws ParseException{
        this(name, category, cost, quantity, description);
        this.inStock = true;
        this.supplyDate(date);
    }

    public Goods(String name, String category, float cost, int quantity, String description, boolean inStock){
        this(name, category, cost, quantity, description);
        this.inStock = inStock;
        this.supplyDate = null;
    }

    public void supplyDate(String date) throws ParseException {
        if(inStock = true){
            supplyDate = new SimpleDateFormat("dd.MM.yyyy").parse(date);
        }
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public Date getSupplyDate() {
        return supplyDate;
    }

    public void setSupplyDate(Date supplyDate) {
        this.supplyDate = supplyDate;
    }

    @Override
    public String toString() {
        return "Goods: " +
                "name = '" + name + '\'' +
                ", category = '" + category + '\'' +
                ", quantity = " + quantity +
                ", cost = " + cost +
                ", description = '" + description + '\'' +
                ", inStock = " + inStock +
                ", supplyDate = " + supplyDate;
    }
}
