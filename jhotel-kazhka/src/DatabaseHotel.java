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
    
    public static boolean addHotel(Hotel baru) {
        boolean success = false;

        if (getHotel(baru.getId()) == null){
            HOTEL_DATABASE.add(baru);
            LAST_HOTEL_ID = baru.getId();
            success = true;
        }
        return success;
    }
    public static Hotel getHotel(int id){
        for(Hotel h : HOTEL_DATABASE) {
            if (h.getId() == id) {
                return h;
            }
        }
        return null;
    }
    public static boolean removeHotel(int id) {
        Hotel hotelFound = getHotel(id);
        int i;
        boolean success = false;

        if (hotelFound != null) {
            ArrayList<Room> roomsel = DatabaseRoom.getRoomsFromHotel(hotelFound);
            for (i = 0; i<roomsel.size(); i++) {
                DatabaseRoom.removeRoom(hotelFound,roomsel.get(i).getNomorKamar());
            }
            HOTEL_DATABASE.remove(hotelFound);
            success = true;
        }
        return success;
    }

}
