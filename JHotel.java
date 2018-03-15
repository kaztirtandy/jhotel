
/**
 * Write a description of class JHotel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JHotel
{
    public static void main(String[] args) {
       Lokasi depok = new Lokasi(17, 12, "Depok");
       Hotel margo = new Hotel("Margo", depok, 4);
       Customer customer1 = new Customer(1, "Dilan");
       Room single1 = new SingleRoom(margo, "1712", true, StatusKamar.Vacant);
       single1.setDailyTariff(121700);
       Pesanan pesanan1 = new Pesanan(3, customer1, single1);
       
       depok.printData();
       customer1.printData();
       margo.printData();
       System.out.println("\n");
       Administrasi.pesananDitugaskan(pesanan1, single1);
       pesanan1.printData();
       single1.printData();
       System.out.println("\n");
       if(single1 instanceof DoubleRoom) {
           System.out.println("Benar Double Room");
        }
        else {
            System.out.println("Salah, bukan Double Room");
        }
       System.out.println("\n");
       Room double1 = new DoubleRoom(margo, "2712", true, StatusKamar.Vacant);
       Pesanan pesanan2 = new Pesanan(2, customer1, double1);
       double1.setDailyTariff(171200);
       pesanan2.setBiaya();
       
       Administrasi.pesananDitugaskan(pesanan2, double1);
       pesanan2.printData();
       double1.printData();
       System.out.println("\n");
       if(double1 instanceof DoubleRoom) {
           System.out.println("Benar Double Room");
        }
        else {
            System.out.println("Salah, bukan Double Room");
        }
    }
    public JHotel(){  
        
    }
    
}
