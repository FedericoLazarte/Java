package model;

public class Moneda {
    private String monedaPrincipal;
    private String monedaACambiar;
    private double valor;
    private double conversion;

    public Moneda(MonedaRecord monedaRecord, double valor) {
        this.monedaPrincipal = monedaRecord.baseCode();
        this.monedaACambiar = monedaRecord.targetCode();
        this.valor = valor;
        this.conversion = monedaRecord.conversionRate();
    }

    public double conversionConValor() {
        return this.valor * this.conversion;
    }
    @Override
    public String toString() {
        return "Moneda{" +
                "monedaPrincipal='" + monedaPrincipal + '\'' +
                ", monedaACambiar='" + monedaACambiar + '\'' +
                ", valor=" + valor +
                ", conversion=" + conversion +
                ", El total es= " + this.conversionConValor() +
                '}';
    }
}