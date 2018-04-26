package jhotel.controller;

import jhotel.DatabaseHotel;
import jhotel.DatabaseRoom;
import jhotel.Room;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class RoomController {
    @RequestMapping(value ="/vacantrooms", method = RequestMethod.GET)
    public ArrayList<Room> vacantRoom(){
        ArrayList<Room> room1 = DatabaseRoom.getVacantRooms();
        return room1;
    }

    @RequestMapping(value ="/hotel/{id_hotel}/{room_no}", method = RequestMethod.GET )
    public Room getRoom(@PathVariable(value ="id_hotel") int id_hotel, @PathVariable(value ="room_no") String nomor_kamar) {
        Room room2 = DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel), nomor_kamar);
        return room2;
    }


}
