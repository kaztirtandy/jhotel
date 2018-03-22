
/**
 * kelas databasePesanan ini berisikan data dari pesanan yang
 * sudah dipesan dan selesai dipesan
 *
 * @author Kazhka Tirtandy
 * @version 1.7
 * @since 2018-02-22
 */
public class DatabasePesanan
{
    private Pesanan list_pesanan;
    
    /**
     * method ini berfungsi untuk menambahkan pesanan baru
     * 
     * @return false
     */
    public boolean addPesanan(Pesanan baru){
        return false;
    }
    /**
     * method ini berfungsi untuk menghapus pesanan yang telah usai
     * 
     * @pram pesan Parameter dengan tipe data pesanan
     * @return false
     */
    public boolean removePesanan(Pesanan pesan){
        return false;
    }
    /**
     * method ini berfungsi untuk menampilkan pesanan dari customer
     * 
     * @pram cust Parameter dengan tipe data customer
     * @return null
     */
    public static Pesanan getPesanan(Customer cust){
        return null;
    }
    /**
     * method ini berfungsi untuk menampilkan database dari pesanan
     * 
     * @return null
     */
    public Pesanan getPesananDatabase(){
        return null;
    }
    /**
     * method ini berfungsi untuk menambahkan pesanan yang telah selesai
     * 
     * @pram pesan Parameter dengan tipe data pesanna
     * @return tidak ada
     */
    public void pesananDibatalkan(Pesanan pesan){
    }
    
}
