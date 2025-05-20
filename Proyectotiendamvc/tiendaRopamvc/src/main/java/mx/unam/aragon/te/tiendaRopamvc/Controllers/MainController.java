package mx.unam.aragon.te.tiendaRopamvc.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class MainController {

    @GetMapping("/")
    public String obtenerInicial() {
        return "index";
    }
}
