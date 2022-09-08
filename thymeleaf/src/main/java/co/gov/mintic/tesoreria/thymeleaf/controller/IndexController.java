package co.gov.mintic.tesoreria.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class IndexController {

    private final Logger LOG = Logger.getLogger(""+IndexController.class);

    @GetMapping("/")
    public String index(Model model){
        LOG.log(Level.INFO,"index");
        var mensaje = "Bienvenidos al sistema de gestión de ingresos y egresos ";
        model.addAttribute("mensaje", mensaje);
        return "index";
    }
}
