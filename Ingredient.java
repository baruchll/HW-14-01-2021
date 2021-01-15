public class Ingredient {
    private String ingID;
    private String ingName;
    private double ingPrice;

     public Ingredient(String ingID, String ingName, double ingPrice){
         this.ingID = ingID;
        this.ingName = ingName;
        this.ingPrice = ingPrice;
    }

    public String getIngID() {
        return ingID;
    }

    public void setIngID(String ingID) {
        this.ingID = ingID;
    }

    public String getIngName() {
        return ingName;
    }

    public void setIngName(String ingName) {
        this.ingName = ingName;
    }

    public double getIngPrice() {
        return ingPrice;
    }

    public void setIngPrice(double ingPrice) {
        this.ingPrice = ingPrice;
    }
}
