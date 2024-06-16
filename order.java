//create the class definition
public class order
{
    private String orderID;
    private String customerName;
    private String customerAddress;
    private String productName;
    private String orderStatus;
    private int quantityOrdered;
    private double pricePerUnit;
    private double totalPrice;
    
    //constructor without parameter
    public order()
    {
        orderID = "";
        customerName = "";
        customerAddress = "";
        productName = "";
        orderStatus = "Pending";
        quantityOrdered = 0;
        pricePerUnit = 0.0;
        totalPrice = 0.0;
    }
    
    //contrusctor with parameter
    public order (String oID, String cN, String cA, String pN, String oS, int qO, double pU)
    {
        orderID = oID;
        customerName = cN;
        customerAddress = cA;
        productName = pN;
        orderStatus = oS;
        quantityOrdered = qO;
        pricePerUnit = pU;
        totalPrice = qO * pU;
    }
    
    //mutator for each attributes
    public void setsOrderID (String oID)
    {
        orderID = oID;
    }
    public void setsCustomerName (String cN)
    {
        customerName = cN;
    }
    public void setsCustomerAddress (String cA)
    {
        customerAddress = cA;
    }
    public void setsProductName (String pN)
    {
        productName = pN;
    }
    public void setsOrderStatus (String oS)
    {
        orderStatus = oS;
    }
    public void setsQuanityOrdered (int qO)
    {
        quantityOrdered = qO;
    }
    public void setsPricePerUnit (double pU)
    {
        pricePerUnit = pU;
    }
    
    //mutator for all attributes
    public void setAll(String oID, String cN, String cA, String pN, String oS, int qO, double pU)
    {
        orderID = oID;
        customerName = cN;
        customerAddress = cA;
        productName = pN;
        orderStatus = oS;
        quantityOrdered = qO;
        pricePerUnit = pU;
        totalPrice = qO * pU;
    }
    
    //accessor methods
    public String getOrderID() 
    {
        return orderID;
    }
    public String getCustomerName() 
    {
        return customerName;
    }
    public String getCustomerAddress() 
    {
        return customerAddress;
    }
    public String getProductName() 
    {
        return productName;
    }
    public String getOrderStatus() 
    {
        return orderStatus;
    }
    public int getQuantityOrdered() 
    {
        return quantityOrdered;
    }
    public double getPricePerUnit() 
    {
        return pricePerUnit;
    }
    public double getTotalPrice() 
    {
        return totalPrice;
    }
    
    
    private void calculateTotalPrice()
    {
        totalPrice = quantityOrdered * pricePerUnit;
    }
    
    public String toString() {
        return ("Order ID: " + orderID + "\n" + "Customer Name: " + customerName + "\n" + "Customer Address: " + customerAddress + "\n" +
               "Product Name: " + productName + "\n" + "Quantity Ordered: " + quantityOrdered + "\n" + "Price Per Unit: " + pricePerUnit + "\n" +
               "Total Price: " + totalPrice + "\n" + "Order Status: " + orderStatus + "\n");
    }
}