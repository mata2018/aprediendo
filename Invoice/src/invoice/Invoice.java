
package invoice;

import java.io.IOException;
import serializeJson.jsonString;

public class Invoice {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
    
    builder read = new builder();
    jsonString write = new jsonString();
    DataF dataf = read.readInvoice("/home/josemata/Escritorio/global.csv");
    
    System.out.println("Exported: " + dataf.getDate());
    System.out.println("Invoice N°: " + dataf.getId()); 
    System.out.println("Total $: " + dataf.getTotal()); 
    System.out.println("Customer: " + dataf.getCustomer()); 
    
    System.out.println(write.jsonWrite()); 
    
        
      
    }
    
}
