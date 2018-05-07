package Exercise7.Sales;

import Exercise7.ProductDescription;

public class SLI {
    private ProductDescription productDescription;
    private int quantity;

    public SLI(ProductDescription productDescription, int quantity) {
        this.productDescription = productDescription;
        this.quantity = quantity;
    }

    public int subTotal() {
        return productDescription.getPrice() * quantity;
    }

    public ProductDescription getProductDescription() {
        return productDescription;
    }

    public int getQuantity() {
        return quantity;
    }
}
