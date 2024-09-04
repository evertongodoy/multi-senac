package br.senac.sp.temperaturas.domain.entity;

import java.util.Objects;

public class TemperaturaKelvinEntity {

    private final Double temperaturaCelsius;

    public TemperaturaKelvinEntity(Double temperaturaCelsius){
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public Double converterTemperaturKelvin(){
        return temperaturaCelsius + 273.15;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TemperaturaKelvinEntity that = (TemperaturaKelvinEntity) o;
        return Objects.equals(temperaturaCelsius, that.temperaturaCelsius);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(temperaturaCelsius);
    }

}