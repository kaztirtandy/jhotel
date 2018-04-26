package jhotel;
/**
 * Enumeration class TipeKamar - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum TipeKamar
{
    Single("Single"), Double("Double"), Premium("Premium");
    
    private String deskripsi;
    
    TipeKamar(){
    }
    
    TipeKamar(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    
    public String toString() {
        return this.deskripsi;
    }
}
