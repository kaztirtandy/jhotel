package jhotel;
/**
 * Kelas lokasi ini merupakan kelas yang berfungsi untun mengambil
 * dan memberikan nilai pada variabel x_coord, y_coord dan deskripsiLokasi
 * @author Kazhka Tirtandy
 * @version 1.7
 * @since 2018-02-22
 */
public class Lokasi
{
    // instance variables - replace the example below with your own
    private float x_coord;
    private float y_coord;
    private String deskripsiLokasi;
    
    /**
     * method ini berfungsi untuk mendeklarasikan x_coord, y_coord dan
     * deskripsiLokasi pada saat pembuatan kelas
     * 
     * @pram x_coord Parameter dengan tipe data float
     * @pram y_coord Parameter dengan tipe data float
     * @pram deskripsiLokasi Parameter dengan tipe data String
     * 
     * @return tidak ada
     * 
     */
    public Lokasi(float x_coord, float y_coord, String deskripsiLokasi) {
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.deskripsiLokasi = deskripsiLokasi;
    } 
    /**
     * method yang berfungsi untuk menampilkan nilai X
     * 
     * @return x_coord
     */
    public float getX() {
        return x_coord;
    }
    /**
     * method yang berfungsi untuk menampilkan nilai Y
     * 
     * @return y_coord
     */
    public float getY() {
        return y_coord;
    }
    /**
     * method yang berfungsi untuk menampilkan lokasi
     * 
     * @return deskripsiLokasi
     */
    public String getDeskripsi() {
        return deskripsiLokasi;
    }
    /**
     * method yang berfungsi untuk memberikan nilai X
     * 
     * @pram x_coord Parameter dengan tipe data float
     * @return tidak ada
     */
    public void setX (float x_coord) {
        this.x_coord = x_coord;
    }
    /**
     * method yang berfungsi untuk memberikan nilai Y
     * 
     * @pram y_coord Parameter dengan tipe data float
     * @return tidak ada
     */
    public void setY (float y_coord) {
        this.y_coord = y_coord;
    }
    /**
     * method yang berfungsi untuk memberikan nilai lokasi
     * 
     * @pram deskripsi Parameter dengan tipe data string
     * @return tidak ada
     */
    public void setDeskripsi (String deskripsi) {
        deskripsiLokasi = deskripsi;
    }
    public String toString() {
        return ("\nLokasi" + 
        "\nKoordinat X: " +  x_coord +
        "\nKoordinat Y: " + y_coord +
        "\nDeskripsi Lokasi: " + deskripsiLokasi);
    }
    
}
