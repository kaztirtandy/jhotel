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
    private static ArrayList<Customer> CUSTOMER_DATABASE;
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
    public boolean addCustomer(Customer baru){
        boolean success = false;

        if (getCustomer(baru.getID()) == null){
            CUSTOMER_DATABASE.add(baru);
            LAST_CUSTOMER_ID = baru.getID();
            success = true;
        }
        return success;
    }
    public Customer getCustomer(int id) {
        boolean exist = false;

        int i;
        for( i=0; i<CUSTOMER_DATABASE.size(); i++) {
            if (CUSTOMER_DATABASE.get(i).getID() == id) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return CUSTOMER_DATABASE.get(i);
        }
        else {
            return null;
        }
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
            ArrayList<Pesanan> pesanans = DatabasePesanan.getPesananDatabase();
            for(i = 0; i<pesanans.size(); i++) {
                if (pesanans.get(i).getPelanggan() == customerFound) {
                    DatabasePesanan.removePesanan(pesanans.get(i));
                }
            }
            CUSTOMER_DATABASE.remove(customerFound);
            success = true;
        }
        return success;

    }


}
