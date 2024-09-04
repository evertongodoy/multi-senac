package br.senac.sp.moedas.presentation.rest;


import br.senac.sp.moedas.application.dto.MoedaRequest;
import br.senac.sp.moedas.application.service.ConverterMoedaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/moedas")
public class MoedaController {

    private final ConverterMoedaService converterMoedaService;

    public MoedaController(ConverterMoedaService converterMoedaService){
        this.converterMoedaService = converterMoedaService;
    }

    @PostMapping
    public ResponseEntity<?> converterMoeda(@RequestBody MoedaRequest request){
        Double moedaEmDollarAmericano = converterMoedaService.converterMoeda(request);
        return ResponseEntity.ok(moedaEmDollarAmericano);
    }

}
