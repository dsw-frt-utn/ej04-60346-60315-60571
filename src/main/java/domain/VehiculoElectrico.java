package domain;

public class VehiculoElectrico extends Vehiculo {
   

    public VehiculoElectrico(String patente, Marca marca, String modelo, int anio, int capacidadCarga, Sucursal sucursal) {
        super(VehiculoTipo.ELECTRICO, patente, marca, modelo, anio, capacidadCarga, sucursal);
        
    }

    @Override
    public double calcularConsumo(double kilometros) {
        double total = (kilometros/100)*16;
        
        if (capacidadCarga >= 1200) {
            total = total * 1.15;
        }

        return total;
    }
}
