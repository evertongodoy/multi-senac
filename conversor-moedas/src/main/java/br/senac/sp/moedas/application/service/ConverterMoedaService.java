package br.senac.sp.moedas.application.service;

import br.senac.sp.moedas.application.dto.MoedaRequest;

public interface ConverterMoedaService {

    Double converterMoeda(MoedaRequest moedaRequest);
}
