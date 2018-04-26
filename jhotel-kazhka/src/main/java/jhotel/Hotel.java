package jhotel;

/**
 * Kelas hotel ini merupakan kelas yang berfungsi untun mengambil
 * dan memberikan nilai pada variabel nama, lokasi dan bintang
 *
 * @author Kazhka Tirtandy
 * @version 1.7
 * @since 2018-02-22
 */
public class Hotel
{
    private String nama;
    private Lokasi lokasi;
    private int bintang;
    private int id;
    
    /**
     * method ini berfungsi untuk mendeklarasikan nama, lokasi dan
     * bintang pada saat pembuatan kelas
     * 
     * @pram nama Parameter dengan tipe data string
     * @pram lokasi Parameter dengan tipe data Lokasi
     * @pram bintang Parameter dengan tipe data integer
     * 
     * @return tidak ada
     * 
     */
    public Hotel (String nama, Lokasi lokasi, int bintang) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang;
        this.id = DatabaseHotel.getLastHotelId() + 1;
    }
    /**
     * method ini berfungsi untuk menampilkan nilai bintang
     * 
     * @return bintang
     */
    public int getBintang() {
        return bintang;
    }
    /**
     * method ini berfungsi untuk menampilkan nilai nama
     * 
     * @return nama
     */
    public String getNama() {
        return nama;
    }
    /**
     * method ini berfungsi untuk menampilkan nilai lokasi
     * 
     * @return lokasi
     */
    public Lokasi getLokasi() {
        return lokasi;
    }
    /**
     * method ini berfungsi untuk memberikan nilai nama
     * 
     * @pram nama Parameter dengan tipe data String
     * @return tidak ada
     */
    public int getId() {
        return id;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    /**
     * method ini berfungsi untuk memberikan nilai lokasi
     * 
     * @pram lokasi Parameter dengan tipe data Lokasi
     * @return tidak ada
     */
    public void setId(int id) {
        this.id = id;
    }

    public void setLokasi(Lokasi lokasi) {
        this.lokasi = lokasi;
    }/**
     * method ini berfungsi untuk memberikan nilai nama
     * 
     * @pram nama Parameter dengan tipe data String
     * @return tidak ada
     */
    public void setBintang(int bintang) {
        this.bintang = bintang;
    }
    public void printData() {
        System.out.println("Nama Hotel: " + nama);
        System.out.println("Deskripsi: " + lokasi.getDeskripsi());
        System.out.println("Bintang: " + bintang);
    }
    public String toString() {
        return ("\nHotel" + 
        "\nNama Hotel: " + nama +
        "\nDeskripsi: " + getLokasi().getDeskripsi() +
        "\nBintang: " + bintang);
    }
}
