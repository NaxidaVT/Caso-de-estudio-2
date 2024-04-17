package com.hotel.controlador;

import com.hotel.modelo.Empleado;
import com.hotel.repositorio.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpleadoController {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @GetMapping("/empleados")
    public String listaEmpleados(Model model) {
        model.addAttribute("empleados", empleadoRepository.findAll());
        return "listaEmpleados";
    }
    
    // Métodos para manejar otras operaciones CRUD de los empleados
}
