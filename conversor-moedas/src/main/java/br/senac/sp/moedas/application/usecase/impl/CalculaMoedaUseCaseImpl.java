package br.senac.sp.moedas.application.usecase.impl;

import br.senac.sp.moedas.application.dto.MoedaRequest;
import br.senac.sp.moedas.application.usecase.CalculaMoedaUseCase;
import br.senac.sp.moedas.domain.entity.DollarEntity;
import br.senac.sp.moedas.domain.entity.PesoArgentinoEntity;
import org.springframework.stereotype.Service;

@Service
public class CalculaMoedaUseCaseImpl implements CalculaMoedaUseCase {

    @Override
    public Double converterMoeda(MoedaRequest request) {
        switch (request.getConverterPara().toUpperCase()) {
            case "DOLLAR":
                return new DollarEntity(request.getValorReais())
                        .converterMoedaParaDollarAmericano();
            case "PESO":
                return new PesoArgentinoEntity(request.getValorReais())
                        .converterMoedaParaPesoArgentino();
            default:
                throw new RuntimeException("Nao foi localizado o tipo de moeda");
        }
    }

}
