
/**
 * Write a description of class JHotel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JHotel
{
    public void main(String[] args) {
        Lokasi jakarta = new Lokasi(17, 12, "Jakarta");
        Hotel haris = new Hotel("Haris", jakarta, 4);
        Customer customer1 = new Customer(1, "Tirtan");
        Pesanan pesanan1 = new Pesanan(17000000, customer1);
        Room room1 = new Room(haris, "1712", true, customer1, 17000000, StatusKamar.Vacant);
        System.out.println("Welcome to Jhotel");
        System.out.println("Lokasi");
        jakarta.printData();
        System.out.println("Customer");
        customer1.printData();
        System.out.println("Hotel");
        haris.printData();
        System.out.println("=====Method 1=====");
        Administrasi.pesananDitugaskan(pesanan1, room1);
        pesanan1.printData();
        room1.printData();
        System.out.println("=====Method 2=====");
        Administrasi.pesananDibatalkan(room1);
        pesanan1.printData();
        room1.printData();
        System.out.println("=====Method 3=====");
        Administrasi.pesananDitugaskan(pesanan1, room1);
        Administrasi.pesananSelesai(room1);
        pesanan1.printData();
        room1.printData();
        System.out.println("=====Method 4=====");
        Administrasi.pesananDitugaskan(pesanan1, room1);
        Administrasi.pesananDibatalkan(pesanan1);
        pesanan1.printData();
        room1.printData();
        System.out.println("=====Method 5=====");
        Administrasi.pesananDitugaskan(pesanan1, room1);
        Administrasi.pesananSelesai(pesanan1);
        pesanan1.printData();
        room1.printData();
    }
    public JHotel(){  
        
    }
    
}
