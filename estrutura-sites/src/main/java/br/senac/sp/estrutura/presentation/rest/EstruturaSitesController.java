package br.senac.sp.estrutura.presentation.rest;

import br.senac.sp.estrutura.application.dto.LoginRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/estrutura-site")
public class EstruturaSitesController {

    @PostMapping("/login")
    public ResponseEntity<?> executar(@ModelAttribute LoginRequest loginRequest, Model model){
        return ResponseEntity.ok().body("Retornou um OK");
    }

}