package Exercise7;

public class ProductDescription {
    private String description;
    private int price;

    public ProductDescription(String description, int price) {
        this.description = description;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
