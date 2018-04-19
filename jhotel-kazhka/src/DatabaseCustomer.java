import java.util.ArrayList;
/**
 * kelas databasePesanan ini berisikan data dari pesanan yang
 * sudah dipesan dan selesai dipesan
 * 
 * @author Kazhka Tirtandy
 * @version 1.7
 * @since 2018-02-22
 */
public class DatabaseCustomer
{
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();
    private static int LAST_CUSTOMER_ID = 0;


    public static ArrayList<Customer> getCustomerDatabase(){
        return CUSTOMER_DATABASE;
    }
    public static int getLastCustomerId() {
        return LAST_CUSTOMER_ID;
    }
    /**
     * method ini berfungsi untuk menambah jumlah customer baru
     * 
     * @pram baru Parameter dengan tipe data customer
     * @return false
     */
    public static boolean addCustomer(Customer baru){
        boolean success = false;

        if (getCustomer(baru.getID()) == null){
            CUSTOMER_DATABASE.add(baru);
            LAST_CUSTOMER_ID = baru.getID();
            success = true;
        }
        return success;
    }
    public static Customer getCustomer(int id) {
        for(Customer c : CUSTOMER_DATABASE) {
            if (c.getID() == id) {
                return c;
            }
        }
        return null;
    }
    /**
     * method ini berfungsi untuk menghilangkan customer
     * 
     * @pram id Parameter dengan tipe data int
     * @return false
     */
    public boolean removeCustomer(int id) {
        boolean success = false;
        Customer customerFound = getCustomer(id);
        int i;

        if (customerFound != null) {
            ArrayList<Pesanan> pesanansel = DatabasePesanan.getPesananDatabase();
            for(i = 0; i<pesanansel.size(); i++) {
                if (pesanansel.get(i).getPelanggan() == customerFound) {
                    DatabasePesanan.removePesanan(pesanansel.get(i));
                }
            }
            CUSTOMER_DATABASE.remove(customerFound);
            success = true;
        }
        return success;

    }


}
