
package invoice;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author josemata
 */
public class builder {
    
    public DataF readInvoice(String archivo) throws IOException {  
    
       DataF dataf = new DataF();
       CSVReader leer = null;
        try {
           leer = new CSVReader(new FileReader(archivo));
           String[] nextLine;
           
           boolean customer = false;
           boolean total = false ;
           boolean FACTURA = false ;
           boolean exported = false ;
           while ((nextLine = leer.readNext()) != null) {
                
                for(String data:nextLine){ 
                    
                        if(data.contains(DataF.CSV_INVOICE_NAME)){
                         FACTURA = true; 
                         data = "";
                        }
                        if(FACTURA == true){
                            if(data.length() != 0){
                             dataf.setId(data);
                             FACTURA = false;
                            }
                        } 
                        if(data.contains(DataF.CSV_INVOICE_CUSTOMER)){
                         customer = true; 
                         data = "";
                        }
                        if(customer == true){
                            if(data.length() != 0){
                             dataf.setCustomer(data);
                             customer = false;
                            }
                        } 
                        
                        if(data.contains(DataF.CSV_INVOICE_DATE)){
                         exported = true; 
                         data = "";
                        }
                        if(exported == true){
                            if(data.length() != 0){
                             dataf.setDate(data);
                             exported = false;
                            }
                        } 
                        if(data.contains(DataF.CSV_INVOICE_TOTAL)){
                         total = true; 
                         data = "";
                        }
                        if(total == true){
                            if(data.length() != 0){
                             dataf.setTotal(data);
                             total = false;
                            }
                        } 
                
                }
            }    

        } catch (Exception e) {
            } finally {
               if (null != leer) {
           leer.close();
           } 
            }
      return dataf; 
    }        
}
