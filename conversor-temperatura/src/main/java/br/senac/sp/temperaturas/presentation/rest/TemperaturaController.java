package br.senac.sp.temperaturas.presentation.rest;


import br.senac.sp.temperaturas.application.dto.TemperaturaRequest;
import br.senac.sp.temperaturas.application.service.ConverterTemperaturaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/temperatura")
public class TemperaturaController {

    private final ConverterTemperaturaService converterTemperaturaService;

    public TemperaturaController(ConverterTemperaturaService converterTemperaturaService){
        this.converterTemperaturaService = converterTemperaturaService;
    }

    @PostMapping
    public ResponseEntity<?> converterTemperatura(@RequestBody TemperaturaRequest request){
        Double temperaturaFahrenheit = converterTemperaturaService.converterTemperatura(request);
        return ResponseEntity.ok(temperaturaFahrenheit);
    }

}
