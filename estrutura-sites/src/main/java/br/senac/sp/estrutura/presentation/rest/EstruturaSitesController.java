package br.senac.sp.estrutura.presentation.rest;

import br.senac.sp.estrutura.application.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EstruturaSitesController {

    @GetMapping("/userForm")
    public String home(Model model) {
//        model.addAttribute("nomeDoAtributo", "Treinaweb");
        model.addAttribute("user", new User());
        return "userForm";
    }

    @PostMapping("/submitUser")
    public String homePost(@ModelAttribute User user, Model model) {
//        model.addAttribute("nomeDoAtributo", "TreinawebPOST");
        model.addAttribute("submittedUser", user);
        return "result";
    }
}