package br.senac.sp.temperaturas.application.service;

import br.senac.sp.temperaturas.application.dto.TemperaturaRequest;

public interface ConverterTemperaturaService {

    Double converterTemperatura(TemperaturaRequest temperaturaRequest);
}
