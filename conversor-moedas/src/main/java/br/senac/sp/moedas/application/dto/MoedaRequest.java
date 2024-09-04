package br.senac.sp.moedas.application.dto;

import java.util.Objects;

public class MoedaRequest {

    private Double valorReais;
    private String converterPara;

    public MoedaRequest(final Double valorReais, final String converterPara){
        this.valorReais = valorReais;
        this.converterPara = converterPara;
    }

    public Double getValorReais() {
        return valorReais;
    }

    public MoedaRequest setValorReais(Double valorReais) {
        this.valorReais = valorReais;
        return this;
    }

    public String getConverterPara() {
        return converterPara;
    }

    public MoedaRequest setConverterPara(String converterPara) {
        this.converterPara = converterPara;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MoedaRequest that = (MoedaRequest) o;
        return Objects.equals(valorReais, that.valorReais) && Objects.equals(converterPara, that.converterPara);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valorReais, converterPara);
    }

}