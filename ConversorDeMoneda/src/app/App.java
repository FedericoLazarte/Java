package app;

import model.Conversion;
import model.Moneda;
import model.MonedaRecord;
import service.MonedaService;

import java.io.IOException;
import java.util.*;

public class App {
    private static final Set<String> MONEDAS_VALIDAS = new HashSet<>(Arrays.asList("ARS", "USD", "EUR", "GBP", "JPY", "CAD"));
    private static final List<Conversion> HISTORIAL_CONVERSIONES = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MonedaService servicio = new MonedaService();
        String[] tipoMonedas = {"ARS", "USD", "EUR", "GBP", "JPY", "CAD"};
        boolean continuar = true;

        while (continuar) {
            System.out.printf("""
                    Ingrese el valor el tipo de moneda base:
                    1. %s
                    2. %s
                    3. %s
                    4. %s
                    5. %s
                    6. %s
                    7. Historial de Conversiones
                    8. Salir
                    """, tipoMonedas[0], tipoMonedas[1], tipoMonedas[2], tipoMonedas[3], tipoMonedas[4], tipoMonedas[5]);

            System.out.print("Selecciona una opción (1-8): ");
            int opcion = scanner.nextInt();

            if (opcion == 8) {
                System.out.println("Saliendo...");
                continuar = false;
                continue;
            }

            if (opcion == 7) {
                mostrarHistorial();
                continue;
            }

            if (opcion < 1 || opcion > 6) {
                System.out.println("Opción inválida. Por favor, selecciona una opción entre 1 y 8.");
                continue;
            }

            String monedaInicial = tipoMonedas[opcion - 1];

            System.out.print("Ingrese la moneda a convertir (ej. USD, ARS, EUR, GBP, JPY, CAD): ");
            String monedaAConvertir = scanner.next().toUpperCase();

            if (!MONEDAS_VALIDAS.contains(monedaAConvertir)) {
                System.out.println("Moneda de conversión inválida. Las monedas válidas son: " + MONEDAS_VALIDAS);
                continue;
            }

            System.out.print("Ingrese el monto a convertir: ");
            double monto = scanner.nextDouble();
            if (monto <= 0) {
                System.out.println("El monto debe ser un valor positivo.");
                continue;
            }

            try {
                MonedaRecord record = servicio.getConversionRate(monedaInicial, monedaAConvertir);
                Moneda moneda = new Moneda(record, monto);
                double montoConvertido = moneda.conversionConValor();
                HISTORIAL_CONVERSIONES.add(new Conversion(monedaInicial, monedaAConvertir, monto, montoConvertido));
                System.out.println(moneda);
            } catch (IOException | InterruptedException e) {
                System.err.println("Error al obtener la tasa de conversión: " + e.getMessage());
            }
        }
        scanner.close();
    }

    private static void mostrarHistorial() {
        if (HISTORIAL_CONVERSIONES.isEmpty()) {
            System.out.println("No hay conversiones en el historial.");
        } else {
            System.out.println("Historial de Conversiones:");
            for (Conversion c : HISTORIAL_CONVERSIONES) {
                System.out.println(c);
            }
        }
    }
}