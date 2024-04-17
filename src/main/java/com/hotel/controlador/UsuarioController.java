package com.hotel.controlador;

import com.hotel.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/usuarios")
    public String listaUsuarios(Model model) {
        model.addAttribute("usuarios", usuarioRepository.findAll());
        return "listaUsuarios";
    }
}