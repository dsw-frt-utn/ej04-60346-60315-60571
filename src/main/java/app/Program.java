package app;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;
import views.ListarVehiculosView;
import javax.swing.JOptionPane;
import views.AgregarVehiculoView;
public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        Persistencia.inicializar();
        ListarVehiculosView view = new ListarVehiculosView();
        view.setVisible(true);
        String opcion = JOptionPane.showInputDialog(
    "1. Listar Vehículos\n2. Agregar Vehículo"
);

if (opcion.equals("1")) {
    new ListarVehiculosView().setVisible(true);
} else if (opcion.equals("2")) {
     new AgregarVehiculoView(view).setVisible(true);
    
}
    }
}
