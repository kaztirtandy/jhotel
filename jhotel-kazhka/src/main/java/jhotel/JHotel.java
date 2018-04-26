package jhotel;
/**
 * Write a description of class JHotel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JHotel
{
    public static void main(String[] args) throws HotelSudahAdaException, RoomSudahAdaException{


        Lokasi jakarta = new Lokasi(10,12, "Jakarta");
        Lokasi bandung = new Lokasi(11,13, "Bandung");
    try{
        DatabaseHotel.addHotel(new Hotel("Ibis", jakarta, 4));
        DatabaseHotel.addHotel(new Hotel("Hilton", bandung, 5));
        DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "A101"));
        DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(2), "B202"));
        DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(2), "C303"));
    } catch(HotelSudahAdaException e){
    } catch(RoomSudahAdaException e){

    }



        SpringApplication.run(JHotel.class, args);

    }
    public JHotel(){  
        
    }
    
}
