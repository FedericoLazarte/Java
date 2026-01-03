package model;

import java.time.LocalDateTime;

public class Conversion {
    private String baseMoneda;
    private String monedaConvertida;
    private double montoOriginal;
    private double montoConvertido;
    private LocalDateTime timestamp;

    public Conversion(String baseMoneda, String monedaConvertida, double montoOriginal, double montoConvertido) {
        this.baseMoneda = baseMoneda;
        this.monedaConvertida = monedaConvertida;
        this.montoOriginal = montoOriginal;
        this.montoConvertido = montoConvertido;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return String.format("Conversion [baseMoneda=%s, monedaConvertida=%s, montoOriginal=%.2f, montoConvertido=%.2f, timestamp=%s]",
                baseMoneda, monedaConvertida, montoOriginal, montoConvertido, timestamp);
    }
}