import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Solicitar los coeficientes de la ecuación
        double a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de A"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de B"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de C"));

        // Crear el objeto ecuacion con los datos recogidos
        EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado(a, b, c);

        // Calcular las soluciones y mostrar el resultado
        String resultado = ecuacion.calcularSoluciones();
        JOptionPane.showMessageDialog(null, resultado);
    }
}
