package br.senac.sp.estrutura.presentation.rest;

import br.senac.sp.estrutura.application.dto.ReservaRequest;
import br.senac.sp.estrutura.application.dto.ReservaResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Random;

@Controller
@RequestMapping(value = "v1")
public class EstruturaSitesController {

    @GetMapping("/reserva")
    public String home(Model model) {
//        model.addAttribute("nomeDoAtributo", "Treinaweb");
        model.addAttribute("request", new ReservaRequest());
        return "reservaForm";
    }

    @PostMapping("/enviarReserva")
    public String homePost(@ModelAttribute ReservaRequest request, Model model) {
//        model.addAttribute("nomeDoAtributo", "TreinawebPOST");
        ReservaResponse response = new ReservaResponse();
        response.setNome(request.getNome());
        response.setEmail(request.getEmail());
        response.setData(request.getData());
        response.setPessoas(request.getPessoas());
        response.setAnimal(request.getAnimal());
        response.setComentario(request.getComentario());
        response.setTelefone(request.getTelefone());
        int numeroAleatorio = new Random().nextInt(100) + 1; // Gera um número entre 1 e 100
        response.setStatus(numeroAleatorio % 2 == 0 ? "APROVADA" : "REPROVADA");
        model.addAttribute("reservaEnviada", response);
        return "result";
    }
}