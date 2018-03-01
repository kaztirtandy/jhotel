
/**
 * Kelas hotel ini merupakan kelas yang berfungsi untun mengambil
 * dan memberikan nilai pada variabel biaya, pelanggan, nama_pelanggan,
 * jenis_kamar, isDiproses, dan isSelesai
 *
 * @author Kazhka Tirtandy
 * @version 1.7
 * @since 2018-02-22
 */
public class Pesanan
{
    private double biaya;
    private Customer pelanggan;
    private String nama_pelanggan;
    private String jenis_kamar;
    private boolean isDiproses;
    private boolean isSelesai;
    
    /**
     * method ini berfungsi untuk mendeklarasikan biaya dan pelanggan
     * pada saat pembuatan kelas
     * 
     * @pram biaya Parameter dengan tipe data double
     * @pram pelanggan Parameter dengan tipe data Customer
     * @return tidak ada
     */
    public Pesanan(double biaya, Customer pelanggan) {
        this.biaya = biaya;
        this.pelanggan = pelanggan;
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
    public Customer getPelanggan() {
        return pelanggan;
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
    /**
     * method ini berfungsi untuk memberikan nilai pada biaya
     * 
     * @return tidak ada
     */
    public void setBiaya(double biaya) {
        this.biaya = biaya;
    }
    /**
     * method ini berfungsi untuk memberikan nilai pada pelanggan
     * 
     * @return tidak ada
     */
    public void setPelanggan(Customer baru) {
        pelanggan = baru;
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
    public void printData() {
        System.out.println(biaya);
    }

}
