package br.senac.sp.temperaturas.application.service.impl;

import br.senac.sp.temperaturas.application.dto.TemperaturaRequest;
import br.senac.sp.temperaturas.application.service.ConverterTemperaturaService;
import br.senac.sp.temperaturas.application.usecase.CalculaTemperaturaUseCase;
import org.springframework.stereotype.Service;

@Service
public class ConverterTemperaturaServiceImpl implements ConverterTemperaturaService {

    private CalculaTemperaturaUseCase calculaTemperaturaUseCase;

    public ConverterTemperaturaServiceImpl(CalculaTemperaturaUseCase calculaTemperaturaUseCase){
        this.calculaTemperaturaUseCase = calculaTemperaturaUseCase;
    }

    @Override
    public Double converterTemperatura(TemperaturaRequest temperaturaRequest) {
        return calculaTemperaturaUseCase.calcularTemperatura(temperaturaRequest);
    }



}
