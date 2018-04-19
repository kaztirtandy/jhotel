
/**
 * kelas customer ini merupakan kelas yang berfungsi untun mengambil
 * dan memberikan nilai pada variabel id dan nama
 *
 * @author Kazhka Tirtandy
 * @version 1.7
 * @since 2018-02-22
 */
import java.util.Date;
import java.util.regex.*;
import java.text.*;
import java.util.*;
public class Customer
{
    protected int id;
    protected String nama;
    protected String email;
    protected Date dob;
    
    /**
     * method ini berfungsi untuk mendeklarasikan id dan nama pada saat
     * pembuatan class
     * 
     * @pram id Paramater dengan tipe data integer
     * @pram nama Parameter dengan tipe data string
     * @return tidak ada
     * 
     */
    public Customer(String nama, int tanggal, int bulan, int tahun){
        this.id =  DatabaseCustomer.getLastCustomerId() + 1;
        this.nama = nama;
        this.dob = new GregorianCalendar(tahun,bulan,tanggal).getTime();
    }
    public Customer(int id, String nama, Date dob){
        this.id = DatabaseCustomer.getLastCustomerId() + 1;
        this.nama = nama;
        this.dob = dob;
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
    public String getEmail(){
        return email;
    }
    public Date getDOB() {
        SimpleDateFormat ft = new SimpleDateFormat ("dd MMMM yyyy");
        System.out.println("DOB: " + ft.format(dob));
        return dob;
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
    public void setEmail(String email) {
        if (email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
            System.out.println("Email match!");
        }else{
            System.out.println("Email not match!");
        }
    }
    public void setDOB(Date dob) {
        this.dob = dob;
    }
    public void printData() {
        System.out.println("Nama: " + nama);
        System.out.println("ID: " + id);
    }
    public String toString() {
        if(DatabasePesanan.getPesananAktif(this) == null)
        {
            System.out.println("\nCustomer ID: " + id +
            "\nNama: " + nama +
            "\nEmail: " + email +
            getDOB());
            return null;
        }
        else
        {
            System.out.println("\nCustomer ID: " + id +
            "\nNama: " + nama +
            "\nEmail: " + email +
            getDOB() + "Booking order is in progress");
            return null;
        }
    }

}
