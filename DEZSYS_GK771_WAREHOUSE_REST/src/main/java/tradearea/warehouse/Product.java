package tradearea.warehouse;
public class Product {
    private String productID;
    private String productName;
    private String productCategory;
    private int productQuantity;
    private String productUnit;


    /**
     * constructor w/ Parameters
     * @param productID ID as String
     * @param productName name of the product as String
     * @param productCategory category as String
     * @param productQuantity quantity of product as Integer
     * @param productUnit unit as String
     */
    public Product(String productID, String productName, String productCategory, int productQuantity, String productUnit) {
        this.setProductID(productID);
        this.setProductName(productName);;
        this.setProductCategory(productCategory);
        this.setProductQuantity(productQuantity);
        this.setProductUnit(productUnit);
    }

    public Product() {
        this.setProductID("00-000001");
        this.setProductName("Jasmin Tee");;
        this.setProductCategory("Lebensmittel");
        this.setProductQuantity(30);
        this.setProductUnit("Packung 20g");
    }

    // setters & getters
    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    // Getter und Setter für productName
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Getter und Setter für productCategory
    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    // Getter und Setter für productQuantity
    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    // Getter und Setter für productUnit
    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }
}
