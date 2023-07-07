import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class HolaMundo {
    private JPanel rootPanel;
    private JButton calcularButton;
    private JLabel resultado;
    private JTextField numero1;
    private JTextField numero2;
    private JButton button1;
    private JLabel peso;
    private JLabel estatura;
    private JButton button2;

    public HolaMundo() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(numero1.getText());
                double num2 = Double.parseDouble(numero2.getText());

                String result = "Número 1: " + num1 + "\nNúmero 2: " + num2;
                resultado.setText(result);

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio");
        frame.setContentPane(new HolaMundo().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
