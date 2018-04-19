import java.util.ArrayList;
/**
 * Write a description of class DatabaseRoom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseRoom
{
    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<>();


    public static  ArrayList<Room> getRoomDatabase() {
        return ROOM_DATABASE;
    }
    
    
    public static boolean addRoom(Room baru) throws RoomSudahAdaException {
        int i;
        boolean berhasil = false;
        if (getRoom(baru.getHotel(),baru.getNomorKamar()) == null) {
            ROOM_DATABASE.add(baru);
            berhasil = true;
        }
        throw new RoomSudahAdaException(baru);
    }
    public static Room getRoom(Hotel hotel,String nomor_kamar) {
        for(Room r : ROOM_DATABASE) {
            if (r.getHotel() == hotel || r.getNomorKamar().equals(nomor_kamar)) {
                return r;
            }
        }
        return null;
    }
    public static ArrayList<Room> getRoomsFromHotel (Hotel hotel) {
        ArrayList<Room> ROOMS_FROM_HOTEL = new ArrayList<>();
        int i;
        boolean ada = false;

        for(Room r : ROOM_DATABASE) {
            if (r.getHotel() == hotel) {
                ROOMS_FROM_HOTEL.add(r);
            }
        }
        return ROOMS_FROM_HOTEL;
    }
    public static ArrayList<Room> getVacantRooms () {
        boolean ada = false;
        ArrayList<Room> VACANT_ROOMS = new ArrayList<>();
        int i;

        for(Room r : ROOM_DATABASE) {
            if (r.getStatusKamar() == StatusKamar.Vacant) {
                VACANT_ROOMS.add(r);
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

    public static boolean removeRoom(Hotel hotel, String nomor_kamar) throws RoomTidakDitemukanException {
        Room roomFound = getRoom(hotel,nomor_kamar);
        boolean sukses = false;

        if (roomFound != null) {
            Administrasi.pesananDibatalkan(roomFound);
            ROOM_DATABASE.remove(roomFound);
            sukses = true;
        }
        throw new RoomTidakDitemukanException(hotel, nomor_kamar);
    }
}
