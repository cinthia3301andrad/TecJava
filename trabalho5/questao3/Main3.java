import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main3 extends JFrame {
    int cont = 0;
    final JTextField textField = new JTextField();

    public Main3() {
        this.setSize(400, 400);
        final JButton meuButao = new JButton("teste");
        meuButao.setSize(100, 100);
      

        meuButao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cont++;
                textField.setText(cont + "");
            }
        });

        this.getContentPane().add(meuButao);
        this.getContentPane().add(textField);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main3().setVisible(true);
            }
        });
    }
}