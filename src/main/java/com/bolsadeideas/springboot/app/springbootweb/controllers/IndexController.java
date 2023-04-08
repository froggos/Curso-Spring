package com.bolsadeideas.springboot.app.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.app.springbootweb.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
    
    @GetMapping(value = {"/index", "/", "","/home"})
    public String index(Model model) {
        model.addAttribute("titulazo", "Wena cabros con model");
        
        return "index";
    }

    @RequestMapping("/perfil")
    public String perfil(Model model) {
        Usuario usuario = new Usuario();
        
        usuario.setNombre("Benjamín");
        usuario.setApellido("Osorio");

        model.addAttribute("titulo", "Perfil de usuario: ".concat(usuario.getNombre()));
        model.addAttribute("usuario", usuario);
        
        return "perfil";
    }
}