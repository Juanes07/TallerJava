package Exercise4;


import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {

        double iva = 21;
        try {
            String dato = JOptionPane.showInputDialog("Ingrese el precio del producto");
            double price = Double.parseDouble(dato);
            double priceWithIva = price + ((iva / 100) * price);
            JOptionPane.showMessageDialog(null, "El precio del producto mas IVA es: " + priceWithIva);
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null,
                    "Si el precio tiene decimales intenta con el punto o caso contratio la coma. PD: ingresa solo numeros");
        }
    }
}
