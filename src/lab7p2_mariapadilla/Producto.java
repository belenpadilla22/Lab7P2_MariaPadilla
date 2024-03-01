
package lab7p2_mariapadilla;

public class Producto {
    private int id;
    private String name;
    private int category;
    private double price;
    private int aisle;
    private double bin;
    
    
    ///

    public Producto(int id, String name, int category, double price, int aisle, double bin) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.aisle = aisle;
        this.bin = bin;
    }

    public Producto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAisle() {
        return aisle;
    }

    public void setAisle(int aisle) {
        this.aisle = aisle;
    }

    public double getBin() {
        return bin;
    }

    public void setBin(double bin) {
        this.bin = bin;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + ", aisle=" + aisle + ", bin=" + bin + '}';
    }
    
    
    
}
