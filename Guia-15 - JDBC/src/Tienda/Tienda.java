package principal;
import java.util.*;
import java.sql.*;
import principal.Servicios.tiendaServicio;
/**
 *
 * @author chuki
 */
public class Tienda{

   
    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in);
  tiendaServicio ts = new tiendaServicio();
        try{
        
            ts.Menu();
            
        } catch ( Exception e){
            System.out.println(e);
        }
    }

    }


