package br.senac.sp.impostos.presentation.rest;


import br.senac.sp.impostos.application.dto.ImpostosRequest;
import br.senac.sp.impostos.application.service.CalcularImpostosService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/impostos")
public class ImpostosController {

    private final CalcularImpostosService calcularImpostosService;

    public ImpostosController(CalcularImpostosService calcularImpostosService){
        this.calcularImpostosService = calcularImpostosService;
    }

    @Operation(summary = "Faz o calculo do imposto baseado no salario bruto")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Imposto calculado com sucesso", content = @Content(mediaType = "application/json")),
            @ApiResponse(responseCode = "400", description = "Entrada inválida", content = @Content),
            @ApiResponse(responseCode = "500", description = "Erro no servidor", content = @Content)
    })
    @PostMapping
    public ResponseEntity<?> calcularImpostos(@RequestBody ImpostosRequest request){
        Double impostoCalculado = calcularImpostosService.calcularImpostos(request);
        return ResponseEntity.ok(impostoCalculado);
    }

}
