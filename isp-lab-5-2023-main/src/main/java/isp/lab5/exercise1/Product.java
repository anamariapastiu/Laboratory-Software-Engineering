package isp.lab5.exercise1;

public class Product {
    private String productID;
    private String name;
    private double price;
    private ProductCategory productCategory;
    private Customer customer;

    public Product(String productID, String name, double price, ProductCategory productCategory) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.productCategory = productCategory;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", productCategory=" + productCategory +
                ", customer=" + customer +
                '}';
    }

    public static void main(String[] args) {
        Product prod=new Product("21","watch",250,ProductCategory.FASHION);

    }
}
