
package invoice;


public class DataF {
    
    
    
    
    final static String CSV_INVOICE_NAME = "FACTURA";
    
    final static String CSV_INVOICE_TOTAL = "Total:";
    
    final static String CSV_INVOICE_DATE = "Exported";
    
    
    final static String CSV_INVOICE_CUSTOMER = "Customer";
    
    private String id;
    private String date;
    private String total;
    private String customer;

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
    
}
