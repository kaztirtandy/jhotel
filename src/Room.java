
/**
 * Write a description of class Room here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Room
{
    // instance variables - replace the example below with your own
    private Hotel hotel;
    private String nomor_kamar;
    protected double dailyTariff;
    private StatusKamar status_kamar;
    private Pesanan pesan;
    
    
    public Room(Hotel hotel, String nomor_kamar, StatusKamar status_kamar) {
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        this.status_kamar = status_kamar;
    }
    public Hotel getHotel() {
        return hotel;
    }
    public String getNomorKamar() {
        return nomor_kamar;
    }
    public double getDailyTariff() {
        return dailyTariff;
    }
    public StatusKamar getStatusKamar() {
        return status_kamar;
    }
    public Pesanan getPesanan() {
        return pesan;
    }
    public abstract TipeKamar getTipeKamar();
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    public void setNomorKamar(String nomor_kamar) {
        this.nomor_kamar = nomor_kamar;
    }
    public void setDailyTariff(double dailyTariff) {
        this.dailyTariff = dailyTariff;
    }
    public void setStatusKamar(StatusKamar status_kamar) {
        this.status_kamar = status_kamar;
    }
    public void setPesanan(Pesanan pesan) {
        this.pesan = pesan;
    }
    public String toString() {
        if(isAvailable=true){
            System.out.println("Nama Hotel: " + hotel.getNama());
            System.out.println("Tipe Kamar: " + getTipeKamar());
            System.out.println("Harga Kamar: " + dailyTariff);
            System.out.println("Status Kamar: " + status_kamar);
        }
        else{
            System.out.println("Nama Hotel: " + hotel.getNama());
            System.out.println("Tipe Kamar: " + getTipeKamar());
            System.out.println("Harga Kamar: " + dailyTariff);
            System.out.println("Status Kamar: " + status_kamar);
            System.out.println("Pelanggan: " + pesan.getPelanggan().getNama());
        }
        return null;
    }
    
}
