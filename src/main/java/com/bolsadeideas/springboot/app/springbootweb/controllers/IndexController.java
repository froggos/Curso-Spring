package com.bolsadeideas.springboot.app.springbootweb.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
        usuario.setEmail("benja.v.o@hotmail.com");

        model.addAttribute("titulo", "Perfil de usuario: ".concat(usuario.getNombre()));
        model.addAttribute("usuario", usuario);
        
        return "perfil";
    }

    @RequestMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("titulo", "Listado de usuarios");

        return "listar";
    }

    @ModelAttribute("usuarios")
    public List<Usuario> poblarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();

        usuarios.add(new Usuario("Benjamín", "Osorio", "benja.v.o@hotmail.com"));
        usuarios.add(new Usuario("Santiago", "Sueldo", "santiagosueldo@hotmail.com"));
        usuarios.add(new Usuario("Erwin", "Hernández", "erwinazo@hotmail.com"));
        
        return usuarios;
    }
}