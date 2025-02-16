import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CrucigramaValores extends JFrame {
   private final char[][] tablero = {
    {'R', 'E', 'S', 'P', 'E', 'T', 'O', ' '},  // Añadido un espacio extra
    {' ', ' ', ' ', ' ', ' ', ' ', ' ' , ' '},  // Añadido un espacio extra
    {'H', 'O', 'N', 'E', 'S', 'T', 'I', 'D'},
    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
    {'S', 'O', 'L', 'I', 'D', 'A', 'R', ' '},
    {' ', ' ', ' ', ' ', ' ', ' ', ' ' , ' '},  // Añadido un espacio extra
    {'A', 'M', 'I', 'S', 'T', 'A', 'D', ' '}
};


    private final JTextField[][] campos;

    public CrucigramaValores() {
        setTitle("Crucigrama de Valores");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(tablero.length, tablero[0].length));
        
        campos = new JTextField[tablero.length][tablero[0].length];
        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                campos[i][j] = new JTextField(1);
                campos[i][j].setHorizontalAlignment(JTextField.CENTER);
                if (tablero[i][j] != ' ') {
                    campos[i][j].setBackground(Color.LIGHT_GRAY);
                } else {
                    campos[i][j].setEnabled(false);
                }
                add(campos[i][j]);
            }
        }
        
        JButton verificar = new JButton("Verificar");
        verificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificarSolucion();
            }
        });
        add(verificar);
    }

    private void verificarSolucion() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] != ' ') {
                    if (!campos[i][j].getText().equalsIgnoreCase(String.valueOf(tablero[i][j]))) {
                        campos[i][j].setBackground(Color.RED);
                    } else {
                        campos[i][j].setBackground(Color.GREEN);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CrucigramaValores().setVisible(true));
    }
}

