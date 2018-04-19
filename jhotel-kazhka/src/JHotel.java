
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
        System.out.println("----------------------------TEST EXCEPTION----------------------------------------");

        try {
            DatabaseCustomer.addCustomer(new Customer("Abi", 11, 5, 2018, "abi@yahoo.com"));
            DatabaseCustomer.addCustomer(new Customer("Budi", 12, 6, 2018, "budi@yahoo.com"));
            DatabaseCustomer.addCustomer(new Customer("Cece", 13, 7, 2018, "cece@yahoo.com"));
            DatabaseCustomer.addCustomer(new Customer("Abi", 11, 5, 2018, "abi@gyahoo.com"));
        } catch (PelangganSudahAdaException a) {
            System.out.println("-Exception Pelanggan Sudah Ada-");
            System.out.println(a.getPesan());
            System.out.println();
        }
        try {
            DatabasePesanan.addPesanan(new Pesanan(2, DatabaseCustomer.getCustomer(1)));
            DatabasePesanan.addPesanan(new Pesanan(3, DatabaseCustomer.getCustomer(1)));
            //DatabasePesanan.addPesanan(new Pesanan(4, DatabaseCustomer.getCustomer(2)));
        } catch (PesananSudahAdaException b) {
            System.out.println("-Exception Pesanan Sudah Ada-");
            System.out.println(b.getPesan());
            System.out.println();
        }
        Lokasi location1 = new Lokasi(10,12,"Jakarta");
        Lokasi location2 = new Lokasi(7,9,"Bekasi");
        Lokasi location3 = new Lokasi(11,19,"Depok");
        try {
            DatabaseHotel.addHotel(new Hotel("Haris", location1, 4));
            DatabaseHotel.addHotel(new Hotel("Hilton", location2, 5));
            DatabaseHotel.addHotel(new Hotel("Margo", location3, 4));
            DatabaseHotel.addHotel(new Hotel("Haris", location1, 4));
        } catch (HotelSudahAdaException c) {
            System.out.println("-Exception Hotel Sudah Ada-");
            System.out.println(c.getPesan());
            System.out.println();
        }
        try {
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "111"));
            DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(2), "222"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(3), "333"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(2), "222"));
        } catch (RoomSudahAdaException d) {
            System.out.println("-Exception Room Sudah Ada-");
            System.out.println(d.getPesan());
            System.out.println();
        }

        try {
            DatabaseCustomer.removeCustomer(4);
        } catch (PelangganTidakDitemukanException e) {
            System.out.println("-Exception Pelanggan Tidak Ditemukan-");
            System.out.println(e.getPesan());
            System.out.println();
        }
        try {
            Pesanan p = new Pesanan(2,DatabaseCustomer.getCustomer(3));
            DatabasePesanan.removePesanan(p);
        } catch (PesananTidakDitemukanException h) {
            System.out.println("-Exception Pesanan Tidak Ditemukan-");
            System.out.println(h.getPesan());
            System.out.println();
        }

        try {
            DatabaseHotel.removeHotel(4);
        } catch (HotelTidakDitemukanException f) {
            System.out.println("-Exception Hotel Tidak Ditemukan-");
            System.out.println(f.getPesan());
            System.out.println();
        }

        try {
            DatabaseRoom.removeRoom(DatabaseHotel.getHotel(1), "D404");
        } catch (RoomTidakDitemukanException g) {
            System.out.println("-Exception Room Tidak Ditemukan-");
            System.out.println(g.getPesan());
            System.out.println();
        }


        System.out.println("-------------------------------HASIL-------------------------------------");

        for (Customer c : DatabaseCustomer.getCustomerDatabase()) {
            System.out.println(c.toString());
        }
        System.out.println();
        for (Hotel h : DatabaseHotel.getHotelDatabase()) {
            System.out.println(h.toString());
        }
        System.out.println();
        for (Room r : DatabaseRoom.getRoomDatabase()){
            System.out.println(r);
        }
        System.out.println();
        for (Pesanan p : DatabasePesanan.getPesananDatabase()) {
            System.out.println(p);
        }


        /*try {
            DatabaseHotel.addHotel(new Hotel("RitzCarlton", location1, 5));
            DatabaseHotel.addHotel(new Hotel("Haris", location2, 5));
            DatabaseHotel.addHotel(new Hotel("Margo", location3, 4));
            DatabaseHotel.addHotel(new Hotel("Haris", location2, 5));
        } catch (HotelSudahAdaException d) {
            System.out.println(d.getPesan());
        }*/
        /*for (Hotel h : DatabaseHotel.getHotelDatabase()){
            System.out.println(h.toString());
        }*/

        /*try {
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(2), "111"));
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "222"));
            DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(3), "333"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(1), "444"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(1), "444"));
        } catch (RoomSudahAdaException e) {
            System.out.println(e.getPesan());
        }*/
        /*for (Room r : DatabaseRoom.getRoomDatabase()){
            System.out.println(r);
        }*/

        /*try {
            DatabasePesanan.addPesanan(new Pesanan(3, DatabaseCustomer.getCustomer(1)));
            DatabasePesanan.addPesanan(new Pesanan(2, DatabaseCustomer.getCustomer(2)));
            DatabasePesanan.addPesanan(new Pesanan(7, DatabaseCustomer.getCustomer(3)));
            DatabasePesanan.addPesanan(new Pesanan(7, DatabaseCustomer.getCustomer(3)));
        } catch (PesananSudahAdaException f) {
            System.out.println(f.getPesan());
        }*/

        /*for (Pesanan p : DatabasePesanan.getPesananDatabase()) {
            System.out.println(p);
        }*/

        /*
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


*/

        /*try {
            DatabaseCustomer.addCustomer(new Customer("Customer1", 17, 12, 2018, "haha2@gmail.com"));
            DatabaseCustomer.addCustomer(new Customer("Customer2", 12, 12, 2018, "haha3@gmail.com"));
            DatabaseCustomer.addCustomer(new Customer("Customer3", 23, 12, 2018, "haha4@gmail.com"));
            DatabaseCustomer.addCustomer(new Customer("Customer4", 19, 12, 2018, "haha4@gmail.com"));
        } catch (PelangganSudahAdaException c) {
            System.out.println(c.getPesan());
        }*/




    }
    public JHotel(){  
        
    }
    
}
