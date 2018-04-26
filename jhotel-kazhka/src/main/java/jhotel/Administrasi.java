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
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar) {
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setRoom(kamar);
        kamar.setStatusKamar(StatusKamar.Booked);
    }
    public static void pesananDibatalkan(Room kamar) {
        Pesanan pesan = DatabasePesanan.getPesanan(kamar);

        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        kamar.setStatusKamar(StatusKamar.Vacant);
        pesan.setStatusAktif(false);
    }
    public static void pesananSelesai(Room kamar) {
        Pesanan pesan = DatabasePesanan.getPesanan(kamar);

        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        kamar.setStatusKamar(StatusKamar.Vacant);
        pesan.setStatusAktif(false);
    }
    public static void pesananDibatalkan(Pesanan pesan) {
        Room kamar = pesan.getRoom();

        kamar.setStatusKamar(StatusKamar.Vacant);
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        pesan.setStatusAktif(false);
    }
    public static void pesananSelesai(Pesanan pesan) {
        Room kamar = pesan.getRoom();

        kamar.setStatusKamar(StatusKamar.Vacant);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        pesan.setStatusAktif(false);
    }
    
    
}
