package br.senac.sp.temperaturas.application.usecase;

import br.senac.sp.temperaturas.application.dto.TemperaturaRequest;

public interface CalculaTemperaturaUseCase {

    Double calcularTemperatura(TemperaturaRequest request);

}