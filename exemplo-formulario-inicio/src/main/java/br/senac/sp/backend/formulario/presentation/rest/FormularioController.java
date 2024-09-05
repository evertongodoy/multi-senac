package br.senac.sp.backend.formulario.presentation.rest;

import br.senac.sp.backend.formulario.application.service.ServiceAqui;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.senac.sp.backend.formulario.application.dto.FormularioRequest;

@RestController
@RequestMapping("/api/formulario")
public class FormularioController {

    private final ServiceAqui serviceAqui;

    public FormularioController(ServiceAqui serviceAqui){
        this.serviceAqui = serviceAqui;
    }

    @PostMapping
    public ResponseEntity<?> realizarReserva(final FormularioRequest request) {
        return ResponseEntity.ok().body("Numero " + request.getNumero() + " Nome " + request.getNome());
    }

    @PostMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> realizarReservaJson(@RequestBody final FormularioRequest request) {

        String jsonBuilder = "{" +
                "\"numero\":" + request.getNumero() + "," +
                "\"nome\":\"" + request.getNome() + "\"" +
                "}";

        return ResponseEntity.ok().body(jsonBuilder);
    }

}