package br.senac.sp.temperaturas.application.usecase.impl;

import br.senac.sp.temperaturas.application.dto.TemperaturaRequest;
import br.senac.sp.temperaturas.application.usecase.CalculaTemperaturaUseCase;
import br.senac.sp.temperaturas.domain.entity.TemperaturaFahrenheitEntity;
import br.senac.sp.temperaturas.domain.entity.TemperaturaKelvinEntity;
import org.springframework.stereotype.Service;

@Service
public class CalculaTemperaturaUseCaseImpl implements CalculaTemperaturaUseCase {

    @Override
    public Double calcularTemperatura(TemperaturaRequest request) {
        switch (request.getConverterPara().toUpperCase()) {
            case "FAHRENHEIT":
                return new TemperaturaFahrenheitEntity(request.getTemperaturaCelsius())
                        .converterTemperaturaFahrenheit();
            case "KELVIN":
                return new TemperaturaKelvinEntity(request.getTemperaturaCelsius())
                        .converterTemperaturKelvin();
            default:
                throw new RuntimeException("Nao foi localizado o tipo de temperatura");
        }
    }

}