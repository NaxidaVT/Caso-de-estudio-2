package com.hotel.controlador;

import com.hotel.modelo.Rol;
import com.hotel.repositorio.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RolController {

    @Autowired
    private RolRepository rolRepository;

    @GetMapping("/roles")
    public String listaRoles(Model model) {
        model.addAttribute("roles", rolRepository.findAll());
        return "listaRoles";
    }
    

    // Métodos para manejar las operaciones CRUD de los roles
}
