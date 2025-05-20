package mx.unam.aragon.ico.te.tiendaRopaMvc.controladores;

import mx.unam.aragon.ico.te.tiendaRopaMvc.modelos.Ropa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tienda")
public class RopaController {

    @GetMapping("/home/")
    public String home() {
        return "home"; // Página principal
    }

    @GetMapping("/camisas/")
    public String camisas(Model model) {
        Ropa camisa = new Ropa(
                1000,
                "Nueva temporada",
                "Camisa de lino",
                234234,
                "https://static.zara.net/assets/public/002b/d4a1/9086448889fc/beda0d7c6a35/04274010500-p/04274010500-p.jpg?ts=1742554934023&w=744&f=auto"
        );
        model.addAttribute("camisa", camisa); // Nombre singular, pues es un solo objeto
        return "camisas"; // Nombre de la vista, que puede mostrar esa camisa
    }
}