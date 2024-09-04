package br.senac.sp.moedas.application.service.impl;

import br.senac.sp.moedas.application.dto.MoedaRequest;
import br.senac.sp.moedas.application.service.ConverterMoedaService;
import br.senac.sp.moedas.application.usecase.CalculaMoedaUseCase;
import org.springframework.stereotype.Service;

@Service
public class ConverterMoedaServiceImpl implements ConverterMoedaService {

    private final CalculaMoedaUseCase calculaMoedaUseCase;

    public ConverterMoedaServiceImpl(CalculaMoedaUseCase calculaMoedaUseCase){
        this.calculaMoedaUseCase = calculaMoedaUseCase;
    }

    @Override
    public Double converterMoeda(MoedaRequest moedaRequest) {
        return calculaMoedaUseCase.converterMoeda(moedaRequest);
    }

}
