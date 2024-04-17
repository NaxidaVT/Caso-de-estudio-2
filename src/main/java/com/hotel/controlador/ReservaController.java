package com.hotel.controlador;

import com.hotel.modelo.Reserva;
import com.hotel.repositorio.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReservaController {

    @Autowired
    private ReservaRepository reservaRepository;

    @GetMapping("/reservas")
    public String listaReservas(Model model) {
        model.addAttribute("reservas", reservaRepository.findAll());
        return "listaReservas";
    }
    
    // Métodos para manejar otras operaciones CRUD de las reservas
}
