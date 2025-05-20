package mx.unam.aragon.te.tiendaRopamvc.Controllers;

import mx.unam.aragon.te.tiendaRopamvc.Models.Ropa;
import mx.unam.aragon.te.tiendaRopamvc.Servicios.ArtistaService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tienda")
public class RopaController {

    @Autowired
    private ArtistaService artistaService;
    @GetMapping("/home/")
    public String home() {
        return "home";
    }
    @GetMapping("/Ropa/")
    public String Ropa(Model model) {
        Ropa Ropa = new Ropa(1000,
                "Es una prenda unica de la nueva temporada",
                "Camisa de lino",
                83312,
                "https://static.zara.net/assets/public/1f0f/1ad5/063b41e8a14a/f4f7a3b69d8e/01063305250-p/01063305250-p.jpg?ts=1744818144022&w=744&f=auto");
        model.addAttribute("Ropa",Ropa);
        return "Ropa";//Objeto ropa
    }

    @GetMapping("/nuevo/")
    public String nuevo(Model model) {
        model.addAttribute("Ropa", new Ropa());
        return "formulario"; //Formulario
    }

    @PostMapping("/guardar")
    public String guardar(
            @ModelAttribute Ropa ropa
    ) {
        LoggerFactory.getLogger(RopaController.class).info("Ropa guardada" + ropa);
        artistaService.guardarRopa(ropa);
        return "redirect:/tienda/nuevo/"; //Bitacora en POST
    }
    @GetMapping("/artista/id")
    public String obtenerRopa(@RequestParam int id, Model model) {
model.addAttribute("Ropa",artistaService.obtenerRopa(id));
return "Ropa";
    }
}