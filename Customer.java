
/**
 * kelas customer ini merupakan kelas yang berfungsi untun mengambil
 * dan memberikan nilai pada variabel id dan nama
 *
 * @author Kazhka Tirtandy
 * @version 1.7
 * @since 2018-02-22
 */
public class Customer
{
    protected int id;
    protected String nama;
    /**
     * method ini berfungsi untuk mendeklarasikan id dan nama pada saat
     * pembuatan class
     * 
     * @pram id Paramater dengan tipe data integer
     * @pram nama Parameter dengan tipe data string
     * @return tidak ada
     * 
     */
    public Customer(int id, String nama){
        this.id = id;
        this.nama = nama;
    }
    /**
     * method ini berfungsi untuk menampilkan id
     * 
     * @return id
     */
    public int getID() {
        return id;
    }
    /**
     * method ini berfungsi untuk menampilkan nama
     * 
     * @return nama
     */
    public String getNama(){
        return nama;
    }
    /**
     * method ini berfungsi untuk memberikan nilai id
     * 
     * @pram id Parameter dengan tipe data integer
     * @return tidak ada
     */
    public void setID(int id){
        this.id = id;
    }
    /**
     * method ini berfungsi untuk memberikan nilai nama
     * 
     * @pram nama Parameter dengan tipe data string
     * @return tidak ada
     */
    public void setNama(String nama){
        this.nama = nama;
    }
    public void printData() {
        System.out.println(nama);
    }

}
