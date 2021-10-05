package week4;

public class Product {

    private String name;
    private String type;
    private String mainType;
    private String explanation;
    private String price;
    private String discountPrice;

    Product(String mainType, String type, String name, String price, String discountPrice, String explanation)
    {
        setMainType(mainType);
        setType(type);
        setName(name);
        setPrice(price);
        setDiscountPrice(discountPrice);
        setExplanation(explanation);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(String discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getMainType() {
        return mainType;
    }

    public void setMainType(String mainType) {
        this.mainType = mainType;
    }
}
