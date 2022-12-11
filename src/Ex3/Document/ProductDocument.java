package Ex3.Document;

import java.util.Date;

public class ProductDocument extends Document{
    String productType;
    int productCount;

    public ProductDocument(){

    }

    public ProductDocument(int number, Date date, String productType, int productCount){
        super(number, date);
        this.productType = productType;
        this.productCount = productCount;
    }

    @Override
    public String toString() {
        return "ProductDocument{" +
                "number=" + number +
                ", date=" + date +
                ", productType='" + productType + '\'' +
                ", productCount=" + productCount +
                '}';
    }
}
