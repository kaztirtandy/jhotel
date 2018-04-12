
/**
 * Kelas hotel ini merupakan kelas yang berfungsi untun mengambil
 * dan memberikan nilai pada variabel biaya, pelanggan, nama_pelanggan,
 * jenis_kamar, isDiproses, dan isSelesai
 *
 * @author Kazhka Tirtandy
 * @version 1.7
 * @since 2018-02-22
 */
import java.util.Date;
import java.util.*;
public class Pesanan
{
    private double biaya;
    private int id;
    private Customer pelanggan;
    private double jumlahHari;
    private boolean isDiproses;
    private boolean isSelesai;
    private boolean isAktif;
    private Room kamar;
    private Date tanggalPesan;

    
    /**
     * method ini berfungsi untuk mendeklarasikan biaya dan pelanggan
     * pada saat pembuatan kelas
     * 
     * @pram biaya Parameter dengan tipe data double
     * @pram pelanggan Parameter dengan tipe data Customer
     * @return tidak ada
     */
    public Pesanan(double jumlahHari, Customer pelanggan, Date tanggalPesan) {
        this.pelanggan = pelanggan;
        this.jumlahHari = jumlahHari;
        this.tanggalPesan = tanggalPesan;
        this.isAktif = true;
    }
    /**
     * method ini berfungsi untuk menampilkan nilai biaya
     * 
     * @return biaya
     */
    public double getBiaya() {
        return biaya;
    }
    /**
     * method ini berfungsi untuk menampilkan nilai pelanggan
     * 
     * @return pelanggan
     */
    public int getID() { return int; }
    public Customer getPelanggan() {
        return pelanggan;
    }
    public double getJumlahHari() {
        return jumlahHari;
    }
    /**
     * method ini berfungsi untuk menampilkan status yang telah diproses
     * 
     * @return isDiproses
     */
    public boolean getStatusDiproses() {
        return isDiproses;
    }
    /**
     * method ini berfungsi untuk menampilkan status yang sudah selesai
     * 
     * @return isSelesai
     */
    public boolean getStatusSelesai() {
        return isSelesai;
    }
    public Room getRoom() {
        return kamar;
    }
    public Date getTanggalPesan() {
        return tanggalPesan;
    }
    public boolean getStatusAktif() {return isAktif;}

    public boolean isAktif() {
        return isAktif;
    }

    /**
     * method ini berfungsi untuk memberikan nilai pada biaya
     * 
     * @return tidak ada
     */
    public void setBiaya() {
        biaya = jumlahHari * kamar.getDailyTariff();
    }

    public void setStatusAktif(boolean aktif) {
        isAktif = aktif;
    }

    public void setID(int id) {
        this.id = id;
    }

    /**
     * method ini berfungsi untuk memberikan nilai pada pelanggan
     * 
     * @return tidak ada
     */

    public void setPelanggan(Customer baru) {
        pelanggan = baru;
    }
    public void setJumlahHari(double jumlahHari) {
        this.jumlahHari = jumlahHari;
    }
    /**
     * method ini berfungsi untuk memberikan nilai pada status yang
     * telah diproses
     * 
     * @return tidak ada
     */
    public void setStatusDiproses(boolean diproses){
        isDiproses = diproses;
    }
    /**
     * method ini berfungsi untuk memberikan nilai pada status yang
     * telah selesai
     * 
     * @return tidak ada
     */
    public void setStatusSelesai(boolean diproses){
        isSelesai = diproses;
    }
    public void setRoom(Room kamar){
        this.kamar = kamar;
    }
    public void setTanggalPesan(Date tanggalPesan) {
        this.tanggalPesan = tanggalPesan;
    }
    public String toString() {
        private String final_status = "KOSONG";
         if(isDiproses==true && isSelesai==false){
            this.final_status="DIPROSES";
        }
        else if(isDiproses==false && isSelesai==false){
            this.final_status="KOSONG";
        }
        else{
            this.final_status="SELESAI";
        }
        
        return "Dibuat oleh" + getPelanggan().getNama()
            + ". Proses booking untuk " + getRoom().getHotel().getNama()
            + "kamar nomor " + getRoom().getNomorKamar()
            + "dengan tipe kamar yang diinginkan " + getRoom().getTipeKamar().toString()
            + ". Status: " + final_status + ".";
    }

}
