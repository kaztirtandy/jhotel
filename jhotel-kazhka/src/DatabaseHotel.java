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
    private static ArrayList<Hotel> HOTEL_DATABASE;
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
        boolean exist = false;
        int i;

        for(i=0; i<HOTEL_DATABASE.size(); i++) {
            if (HOTEL_DATABASE.get(i).getId() == id) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return HOTEL_DATABASE.get(i);
        }
        else {
            return null;
        }
    }
    public static boolean removeHotel(int id) {
        Hotel hotelFound = getHotel(id);
        int i;
        boolean success = false;

        if (hotelFound != null) {
            ArrayList<Room> rooms = DatabaseRoom.getRoomsFromHotel(hotelFound);
            for (i = 0; i<rooms.size(); i++) {
                DatabaseRoom.removeRoom(hotelFound,rooms.get(i).getNomorKamar());
            }
            HOTEL_DATABASE.remove(hotelFound);
            success = true;
        }
        return success;
    }

}
