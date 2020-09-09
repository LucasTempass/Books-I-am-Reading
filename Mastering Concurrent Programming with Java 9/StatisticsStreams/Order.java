package StatisticsStreams;

public class Order {
    
    private String country;
    private String invoiceNumber;
    private String customer;
    private int quantity;
    private String stockCode;
    private String description;
    private String invoiceDate;
    private double unitPrice;
    
    public Order(String[] attributes) {
        
        invoiceNumber = attributes[0];
        stockCode = attributes[1];
        description = attributes[2];
        quantity = Integer.parseInt(attributes[3]);
        invoiceDate = attributes[4];
        unitPrice = Double.parseDouble(attributes[5]);
        customer = attributes[6];
        country = attributes[7];
        
    }
    
    public String getInvoiceNumber() {
        return invoiceNumber;
    }
    
    public void setInvoiceNumber(String iInvoiceNumber) {
        invoiceNumber = iInvoiceNumber;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String iDescription) {
        description = iDescription;
    }
    
    public String getInvoiceDate() {
        return invoiceDate;
    }
    
    public void setInvoiceDate(String iInvoiceDate) {
        invoiceDate = iInvoiceDate;
    }
    
    public double getUnitPrice() {
        return unitPrice;
    }
    
    public void setUnitPrice(double iUnitPrice) {
        unitPrice = iUnitPrice;
    }
    
    public String getCountry() {
        return country;
    }
    
    public void setCountry(String iCountry) {
        country = iCountry;
    }
    
    public String getCustomer() {
        return customer;
    }
    
    public void setCustomer(String iCustomer) {
        customer = iCustomer;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int iQuantity) {
        quantity = iQuantity;
    }
    
    public String getStockCode() {
        return stockCode;
    }
    
    public void setStockCode(String iStockCode) {
        stockCode = iStockCode;
    }
    
}
