
package serializeJson;

import com.google.gson.Gson;
import invoice.DataF;
import invoice.builder;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author josemata
 */
public class jsonString {

    public DataF jsonWrite() throws IOException {
        
        builder read = new builder();
        
        DataF invoice = read.readInvoice("/home/josemata/Escritorio/global.csv");
        Gson gson = new Gson(); 
        String id = invoice.getId();
        String date = invoice.getDate();
        String total = invoice.getTotal();
        String customer = invoice.getCustomer();
        
        
        String Id = gson.toJson(id);
        String Total = gson.toJson(total);
        String Date = gson.toJson(date);
        String Customer = gson.toJson(customer);
        
        
        System.out.println("Exported: "+Date);
        System.out.println("Customer: "+Customer);
        System.out.println("Invoice N°: "+Id);
        System.out.println("Total $: "+Total);
        

        String json = gson.toJson(invoice);
  
            try {
                FileWriter writer = new FileWriter("/home/josemata/Documentos/global3.json");
                writer.write(json);
                writer.close();
  
            } catch (IOException e) {
                }
        return invoice;
        
    }  
    
}
