package jhotel;
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
    public static boolean addCustomer(Customer baru) throws PelangganSudahAdaException {
        boolean success = false;

        if (getCustomer(baru.getID()) == null) {
            for (Customer c : CUSTOMER_DATABASE) {
                if (c.getEmail().equals(baru.getEmail())) {
                    throw new PelangganSudahAdaException(baru);
                }
            }
            CUSTOMER_DATABASE.add(baru);
            LAST_CUSTOMER_ID = baru.getID();
            return true;
        }
        throw new PelangganSudahAdaException(baru);
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
    public static boolean removeCustomer(int id) throws PelangganTidakDitemukanException {
        boolean success = false;
        Customer customerFound = getCustomer(id);
        int i;

        if (customerFound != null) {
            ArrayList<Pesanan> pesanansel = DatabasePesanan.getPesananDatabase();
            for(i = 0; i<pesanansel.size(); i++) {
                try {
                    if (pesanansel.get(i).getPelanggan() == customerFound) {
                        DatabasePesanan.removePesanan(pesanansel.get(i));
                    }
                } catch (PesananTidakDitemukanException a){
                    System.out.println(a.getPesan());
                }
            }
            CUSTOMER_DATABASE.remove(customerFound);
            success = true;
        }
        throw new PelangganTidakDitemukanException(id);

    }


}
