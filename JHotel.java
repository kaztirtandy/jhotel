
/**
 * Write a description of class JHotel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JHotel
{
    public void main(String[] args) {
        Customer kazhka = new Customer(12, "kazhka");
        Lokasi rumahku = new Lokasi(1, 0, "rumahku aman");
        Hotel mantap = new Hotel("mantap", rumahku, 5); 
        Pesanan pesananpertama = new Pesanan(1506744210, kazhka);
        System.out.println(mantap);
        System.out.println(pesananpertama);
        pesananpertama.printData();
        mantap.printData();
        kazhka.setNama("nanda");
        kazhka.printData();
        pesananpertama.printData();
    }
    public JHotel(){  
        
    }
    
}
