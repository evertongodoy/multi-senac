package br.senac.sp.moedas.application.usecase;

import br.senac.sp.moedas.application.dto.MoedaRequest;

public interface CalculaMoedaUseCase {

    Double converterMoeda(MoedaRequest request);

}