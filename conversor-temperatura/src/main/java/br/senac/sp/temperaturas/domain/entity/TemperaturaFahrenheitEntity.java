package br.senac.sp.temperaturas.domain.entity;

import java.util.Objects;

public class TemperaturaFahrenheitEntity {

    private final Double temperaturaCelsius;

    public TemperaturaFahrenheitEntity(Double temperaturaCelsius){
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public Double converterTemperaturaFahrenheit(){
        return (temperaturaCelsius * 1.8) + 32.0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TemperaturaFahrenheitEntity that = (TemperaturaFahrenheitEntity) o;
        return Objects.equals(temperaturaCelsius, that.temperaturaCelsius);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(temperaturaCelsius);
    }
}