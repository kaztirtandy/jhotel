package jhotel;
/**
 * Write a description of class DoubleRoom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DoubleRoom extends Room
{
    private Customer customer2;
    private static TipeKamar TIPE_KAMAR = TipeKamar.Double;
    
    public DoubleRoom(Hotel hotel, String nomor_kamar) {
        super (hotel, nomor_kamar);
    }
    public Customer getCustomer2() {
        return customer2;
    }
    public TipeKamar getTipeKamar() {
        return TIPE_KAMAR;
    }
    public void setCustomer2(Customer customer2) {
        this.customer2 = customer2;
    }
}
