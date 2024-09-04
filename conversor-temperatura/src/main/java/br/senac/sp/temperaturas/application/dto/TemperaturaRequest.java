package br.senac.sp.temperaturas.application.dto;

import java.util.Objects;

public class TemperaturaRequest {

    private Double temperaturaCelsius;
    private String converterPara;

    public TemperaturaRequest(final Double temperaturaCelsius,
                              final String converterPara){
        this.temperaturaCelsius = temperaturaCelsius;
        this.converterPara = converterPara;
    }

    public Double getTemperaturaCelsius() {
        return temperaturaCelsius;
    }

    public TemperaturaRequest setTemperaturaCelsius(Double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
        return this;
    }

    public String getConverterPara() {
        return converterPara;
    }

    public TemperaturaRequest setConverterPara(String converterPara) {
        this.converterPara = converterPara;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TemperaturaRequest that = (TemperaturaRequest) o;
        return Objects.equals(temperaturaCelsius, that.temperaturaCelsius) && Objects.equals(converterPara, that.converterPara);
    }

    @Override
    public int hashCode() {
        return Objects.hash(temperaturaCelsius, converterPara);
    }

}