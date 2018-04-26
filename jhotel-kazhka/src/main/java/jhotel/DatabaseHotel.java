package jhotel;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Write a description of class DatabaseHotel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseHotel
{
    private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<>();
    private static int LAST_HOTEL_ID = 0;


    public static ArrayList<Hotel>getHotelDatabase(){
        return HOTEL_DATABASE;
    }
    public static int getLastHotelId() {
        return LAST_HOTEL_ID;
    }
    
    public static boolean addHotel(Hotel baru) throws HotelSudahAdaException {
        boolean success = false;

        if (getHotel(baru.getId()) == null){
            for (Hotel h : HOTEL_DATABASE) {
                if (h.getNama().equals(baru.getNama()) && h.getLokasi().equals(baru.getLokasi())) {
                    throw new HotelSudahAdaException(baru);
                }
            }
            HOTEL_DATABASE.add(baru);
            LAST_HOTEL_ID = baru.getId();
            return true;
        }
        throw new HotelSudahAdaException(baru);
    }
    public static Hotel getHotel(int id){
        for(Hotel h : HOTEL_DATABASE) {
            if (h.getId() == id) {
                return h;
            }
        }
        return null;
    }
    public static boolean removeHotel(int id) throws HotelTidakDitemukanException {
        Hotel hotelFound = getHotel(id);
        int i;
        boolean success = false;

        if (hotelFound != null) {
            ArrayList<Room> roomsel = DatabaseRoom.getRoomsFromHotel(hotelFound);
            for (i = 0; i<roomsel.size(); i++) {
                try {
                    DatabaseRoom.removeRoom(hotelFound, roomsel.get(i).getNomorKamar());
                }catch (RoomTidakDitemukanException b) {
                    System.out.println(b.getPesan());
                }
            }
            HOTEL_DATABASE.remove(hotelFound);
            success = true;
        }
        throw new HotelTidakDitemukanException(id);
    }

}
