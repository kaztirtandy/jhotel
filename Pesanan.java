
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
    private double jumlahHari;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    
    /**
     * method ini berfungsi untuk mendeklarasikan biaya dan pelanggan
     * pada saat pembuatan kelas
     * 
     * @pram biaya Parameter dengan tipe data double
     * @pram pelanggan Parameter dengan tipe data Customer
     * @return tidak ada
     */
    public Pesanan(double jumlahHari, Customer pelanggan, Room kamar) {
        this.pelanggan = pelanggan;
        this.jumlahHari = jumlahHari;
        this.kamar = kamar;
        this.biaya = jumlahHari * kamar.getDailyTariff();
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
        
    /**
     * method ini berfungsi untuk memberikan nilai pada biaya
     * 
     * @return tidak ada
     */
    public void setBiaya() {
        biaya = jumlahHari * kamar.getDailyTariff();
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
    public void printData() {
        System.out.println("Nama: " + getPelanggan().getNama());
        System.out.println("Jumlah Hari: " + jumlahHari);
        System.out.println("Status Layanan Diproses: " + isDiproses);
        System.out.println("Status Layanan Selesai: " + isSelesai);
        System.out.println("Biaya: " + getBiaya());
    }

}
