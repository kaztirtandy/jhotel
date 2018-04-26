package jhotel;
import java.util.ArrayList;

/**
 * kelas databasePesanan ini berisikan data dari pesanan yang
 * sudah dipesan dan selesai dipesan
 *
 * @author Kazhka Tirtandy
 * @version 1.7
 * @since 2018-02-22
 *
 */


public class DatabasePesanan
{
    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<>();
    private static int LAST_PESANAN_ID = 0;
    
    /**
     * method ini berfungsi untuk menambahkan pesanan baru
     * 
     * @return false
     */
    public static boolean addPesanan(Pesanan baru) throws PesananSudahAdaException{
        if (getPesananAktif(baru.getPelanggan())==null) {
            PESANAN_DATABASE.add(baru);
            LAST_PESANAN_ID = baru.getID();
            return true;
        }
        else {
            throw new PesananSudahAdaException(baru);
        }
    }
    /**
     * method ini berfungsi untuk menghapus pesanan yang telah usai
     * 
     * @pram pesan Parameter dengan tipe data pesanan
     * @return false
     */
    public static boolean removePesanan(Pesanan pesan) throws PesananTidakDitemukanException {
        Pesanan pesananFound = getPesanan(pesan.getID());
        boolean success = false;

        if (pesananFound != null) {
            Administrasi.pesananDibatalkan(pesananFound);
            PESANAN_DATABASE.remove(pesananFound);
            success = true;
        }
        throw new PesananTidakDitemukanException(pesan.getPelanggan());
    }
    /**
     * method ini berfungsi untuk menampilkan pesanan dari customer
     * 
     * @pram cust Parameter dengan tipe data customer
     * @return null
     */
    public static Pesanan getPesanan(int id){
        for(Pesanan p : PESANAN_DATABASE) {
            if (p.getID() == id) {
                return p;
            }
        }
        return null;
    }

    /**
     * method ini berfungsi untuk menampilkan database dari pesanan
     * 
     * @return null
     */
    public static Pesanan getPesanan(Room kamar) {
        for(Pesanan p : PESANAN_DATABASE) {
            if (p.getRoom() == kamar) {
                return p;
            }
        }
        return null;

    }
    public static Pesanan getPesananAktif(Customer pelanggan) {
        for(Pesanan p: PESANAN_DATABASE) {
            if (p.getPelanggan() == pelanggan) {
                if(p.getStatusAktif()) {
                    return p;
                }
            }
        }
        return null;
    }
    public static ArrayList<Pesanan> getPesananDatabase(){
        return PESANAN_DATABASE;
    }
    /**
     * method ini berfungsi untuk menambahkan pesanan yang telah selesai
     * 
     * @pram pesan Parameter dengan tipe data pesanna
     * @return tidak ada
     */
    public void pesananDibatalkan(Pesanan pesan){
    }
    public static int getLastPesananID() {
            return LAST_PESANAN_ID;
        }
    
}
