package jhotel.controller;

import jhotel.DatabaseHotel;
import jhotel.Hotel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class HotelController {
    @RequestMapping(value ="/hotel", method = RequestMethod.GET )
    public ArrayList<Hotel> hotelList() {
        ArrayList<Hotel> hotel1 = DatabaseHotel.getHotelDatabase();
        return hotel1;
    }

    @RequestMapping(value ="/hotel/{id_hotel}", method = RequestMethod.GET )
    public Hotel getHotel(@PathVariable(value ="id_hotel") int id_hotel) {
        Hotel hotel2 = DatabaseHotel.getHotel(id_hotel);
        return hotel2;
    }

}
