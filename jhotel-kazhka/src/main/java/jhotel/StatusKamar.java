package jhotel;
/**
 * Enumeration class StatusKamar - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum StatusKamar
{
    Booked("Booked"), Processed("Processed"), Vacant("Vacant");
    private String deskripsi;
   
    StatusKamar(){
    }
    StatusKamar(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    
    public String toString() {
        return this.deskripsi;
    }
}
