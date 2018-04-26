package jhotel.controller;

import jhotel.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.GregorianCalendar;
@RestController
public class PesananController {
    @RequestMapping(value ="/pesanancustomer/{id_customer}", method = RequestMethod.GET)
    public Pesanan pesananCust(@RequestParam(value = "id_customer") int id_customer) {
        Pesanan pesanan1 = DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer));
        return pesanan1;
    }

    @RequestMapping(value ="/pesanan/{id_pesanan}", method = RequestMethod.GET )
    public Pesanan getPesanan(@RequestParam(value = "id_pesanan") int id_pesanan) {
        Pesanan pesanan2 = DatabasePesanan.getPesanan(id_pesanan);
        return pesanan2;
    }
    @RequestMapping(value ="/bookpesanan", method = RequestMethod.POST)
    public Pesanan buatPesanan(@RequestParam(value = "jumlah_hari") int jumalah_hari, @RequestParam(value = "id_customer") int id_customer, @RequestParam(value = "id_hotel") int id_hotel, @RequestParam(value = "nomor_kamar") String nomor_kamar) throws PesananSudahAdaException {
        Pesanan pesanan3 = new Pesanan(jumalah_hari, DatabaseCustomer.getCustomer(id_customer));
        DatabasePesanan.addPesanan(pesanan3);
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer)), DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel), nomor_kamar));
        pesanan3.setTanggalPesan(new GregorianCalendar().getTime());
        return DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer));
    }
    @RequestMapping(value = "/cancelpesanan", method = RequestMethod.POST)
    public Pesanan batalkanPesanan(@RequestParam(value = "id_pesanan") int id_pesanan) {
        Administrasi.pesananDibatalkan(DatabasePesanan.getPesanan(id_pesanan));
        return DatabasePesanan.getPesanan(id_pesanan);
    }

    public Pesanan selesaikanPesanan(@RequestParam(value ="id_pesanan") int id_pesanan) {
        Administrasi.pesananSelesai(DatabasePesanan.getPesanan(id_pesanan));
        return DatabasePesanan.getPesanan(id_pesanan);
    }
}
