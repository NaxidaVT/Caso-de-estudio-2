package com.hotel.controlador;

import com.hotel.modelo.Hotel;
import com.hotel.repositorio.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HotelController {

    @Autowired
    private HotelRepository hotelRepository;

    @GetMapping("/hoteles")
    public String listaHoteles(Model model) {
        model.addAttribute("hoteles", hotelRepository.findAll());
        return "listaHoteles";
    }
    
    // Métodos para manejar otras operaciones CRUD de los hoteles
}
