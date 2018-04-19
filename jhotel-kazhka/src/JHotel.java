
/**
 * Write a description of class JHotel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class JHotel
{
    public static void main(String[] args) {
        DatabaseCustomer.addCustomer(new Customer("Customer1",17,12,2018));
        DatabaseCustomer.addCustomer(new Customer("Customer2",12,12,2018));
        DatabaseCustomer.addCustomer(new Customer("Customer3",23,12,2018));

        for (Customer c : DatabaseCustomer.getCustomerDatabase()){
            System.out.println(c.toString());
        }

        Lokasi location1 = new Lokasi(10,12,"Jakarta");
        Lokasi location2 = new Lokasi(7,9,"Bekasi");
        Lokasi location3 = new Lokasi(11,19,"Depok");

        DatabaseHotel.addHotel(new Hotel("RitzCarlton",location1,5));
        DatabaseHotel.addHotel(new Hotel("Haris",location2,5));
        DatabaseHotel.addHotel(new Hotel("Margo",location3,4));

        for (Hotel h : DatabaseHotel.getHotelDatabase()){
            System.out.println(h.toString());
        }


        DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(2),"111"));
        DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1),"222"));
        DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(3),"333"));
        DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(1),"444"));

        for (Room r : DatabaseRoom.getRoomDatabase()){
            System.out.println(r);
        }

        DatabasePesanan.addPesanan(new Pesanan(3,DatabaseCustomer.getCustomer(1)));
        DatabasePesanan.addPesanan(new Pesanan(2,DatabaseCustomer.getCustomer(2)));
        DatabasePesanan.addPesanan(new Pesanan(7,DatabaseCustomer.getCustomer(3)));

        for (Pesanan p : DatabasePesanan.getPesananDatabase()) {
            System.out.println(p);
        }

        Administrasi.pesananDitugaskan(DatabasePesanan.getPesanan(1),DatabaseRoom.getRoom(DatabaseHotel.getHotel(2),"111"));
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesanan(2),DatabaseRoom.getRoom(DatabaseHotel.getHotel(1),"222"));
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesanan(3),DatabaseRoom.getRoom(DatabaseHotel.getHotel(3),"333"));

        System.out.println("Setelah Ditugaskan");
        for (Pesanan p : DatabasePesanan.getPesananDatabase()) {
            System.out.println(p);
        }

        Administrasi.pesananDibatalkan(DatabasePesanan.getPesanan(1));
        Administrasi.pesananSelesai(DatabaseRoom.getRoom(DatabaseHotel.getHotel(1),"222"));

        System.out.println("Setelah Dibatalkan dan Selesai");
        for (Pesanan p : DatabasePesanan.getPesananDatabase()) {
            System.out.println(p);
        }









    }
    public JHotel(){  
        
    }
    
}
