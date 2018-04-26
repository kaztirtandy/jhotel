package jhotel;
/**
 * Write a description of class Administrasi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Administrasi
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Administrasi
     */
    public Administrasi()
    {
       
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param    a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar) {
        if (kamar.getStatusKamar().equals(StatusKamar.Vacant)) {
            pesan.setStatusSelesai(false);
            pesan.setStatusDiproses(true);
            pesan.setRoom(kamar);
        }else {
            pesan.setStatusAktif(false);
        }
    }
    public static void pesananDibatalkan(Room kamar) {
        Pesanan pesan = DatabasePesanan.getPesananAktif(kamar);

        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        kamar.setStatusKamar(StatusKamar.Vacant);
        pesan.setStatusAktif(false);
    }
    public static void pesananSelesai(Room kamar) {
        Pesanan pesan = DatabasePesanan.getPesananAktif(kamar);

        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        kamar.setStatusKamar(StatusKamar.Vacant);
        pesan.setStatusAktif(false);
    }
    public static void pesananDibatalkan(Pesanan pesan) {
        Room kamar = pesan.getRoom();

        kamar.setStatusKamar(StatusKamar.Vacant);
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
    }
    public static void pesananSelesai(Pesanan pesan) {
        Room kamar = pesan.getRoom();

        kamar.setStatusKamar(StatusKamar.Vacant);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
    }
    
    
}
