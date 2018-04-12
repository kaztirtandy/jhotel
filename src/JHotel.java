
/**
 * Write a description of class JHotel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class JHotel
{
    public static void main(String[] args) {
       Customer cobaregex = new Customer(1, "Kazhka", 17, 12, 1996);
       cobaregex.setEmail("e.t.d@");
       cobaregex.setEmail("Ee_.td@ui.ac.id");
       cobaregex.setEmail("kazhka.modul5@netlab.com");
       
       Customer cust1 = new Customer(1, "Kazhka", new GregorianCalendar(2018,03,22).getTime());
       cust1.getDOB();
    }
    public JHotel(){  
        
    }
    
}
