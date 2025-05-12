package mx.unam.aragon.ico.te.musicamvc.controladores;

import mx.unam.aragon.ico.te.musicamvc.modelos.Artista;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tienda")
public class MusicaController {

    @GetMapping("/home/")
    public String home() {
        return "home";
    }
    @GetMapping("/artista/")
    public String artista(Model model) {
        Artista artista = new Artista("Freddie Mercury",45,"Rock","Freddie Mercury fue un cantante, compositor y showman británico, conocido por ser el vocalista principal de la banda Queen. Nació en Zanzíbar en 1946 y se destacó por su poderosa voz, carisma en el escenario y éxitos como “Bohemian Rhapsody” y “We Are the Champions”. Murió en 1991, pero sigue siendo una leyenda del rock.","https://singifyai.fineshare.com/song-ai/covers/freddie-mercury.webp");
        Model model2 = model.addAttribute("artista", artista);
        return "artista";
    }
}
