package employeeInterface;

public class Invoice implements IPayable {

    private String partNumber;      //partNum
    private String partDescription; //partDesc
    private int quantity;           //quan
    private double pricePerItem;    //pricePI

    public Invoice(String partNum, String partDesc, int quan, double pricePI){
        this.partNumber = partNum;
        this.partDescription = partDesc;
        this.quantity = quan;
        this.pricePerItem = pricePI;
    }


    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem();
    }


    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
}
