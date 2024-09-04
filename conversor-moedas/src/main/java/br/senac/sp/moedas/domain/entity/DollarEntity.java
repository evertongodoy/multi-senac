package br.senac.sp.moedas.domain.entity;

import java.util.Objects;

public class DollarEntity {

    private Double moedaReais;

    public DollarEntity(Double moedaReais){
        this.moedaReais = moedaReais;
    }

    public Double converterMoedaParaDollarAmericano(){
        return moedaReais / 5.48;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DollarEntity that = (DollarEntity) o;
        return Objects.equals(moedaReais, that.moedaReais);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(moedaReais);
    }
}