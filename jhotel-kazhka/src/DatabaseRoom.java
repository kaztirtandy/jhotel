import java.util.ArrayList;
/**
 * Write a description of class DatabaseRoom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseRoom
{
    private static ArrayList<Room> ROOM_DATABASE;


    public static  ArrayList<Room> getRoomDatabase() {
        return ROOM_DATABASE;
    }
    
    
    public static boolean addRoom(Room baru) {
        int i;
        boolean berhasil = false;
        if (getRoom(baru.getHotel(),baru.getNomorKamar()) == null) {
            ROOM_DATABASE.add(baru);
            berhasil = true;
        }
        return berhasil;
    }
    public static Room getRoom(Hotel hotel,String nomor_kamar) {
        boolean ada = false;
        int i;

        for(i=0; i<ROOM_DATABASE.size(); i++) {
            if (ROOM_DATABASE.get(i).getHotel() == hotel && ROOM_DATABASE.get(i).getNomorKamar().equals(nomor_kamar)) {
                ada = true;
                break;
            }
        }
        if (ada) {
            return ROOM_DATABASE.get(i);
        }
        else {
            return null;
        }
    }
    public static ArrayList<Room> getRoomsFromHotel (Hotel hotel) {
        ArrayList<Room> ROOMS_FROM_HOTEL = new ArrayList<>();
        int i;
        boolean ada = false;

        for(i=0; i<ROOM_DATABASE.size(); i++) {
            if (ROOM_DATABASE.get(i).getHotel() == hotel) {
                ROOMS_FROM_HOTEL.add(ROOM_DATABASE.get(i));
                ada = true;
            }
        }
        if (ada) {
            return ROOMS_FROM_HOTEL;
        }
        else {
            return null;
        }
    }
    public static ArrayList<Room> getVacantRooms () {
        boolean ada = false;
        ArrayList<Room> VACANT_ROOMS = new ArrayList<>();
        int i;

        for(i=0; i<ROOM_DATABASE.size(); i++) {
            if (ROOM_DATABASE.get(i).getStatusKamar() == StatusKamar.Vacant) {
                VACANT_ROOMS.add(ROOM_DATABASE.get(i));
                ada = true;
            }
        }
        if (ada) {
            return VACANT_ROOMS;
        }
        else {
            return null;
        }
    }

    public static boolean removeRoom(Hotel hotel, String nomor_kamar) {
        Room roomFound = getRoom(hotel,nomor_kamar);
        boolean sukses = false;

        if (roomFound != null) {
            Administrasi.pesananDibatalkan(roomFound);
            ROOM_DATABASE.remove(roomFound);
            sukses = true;
        }
        return sukses;
    }
}
