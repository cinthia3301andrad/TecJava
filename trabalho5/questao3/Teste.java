
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Teste extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Teste() {
		setLayout(null);
		
		JButton btnGerar = new JButton("Click pra Gerar");
		btnGerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jButton1ActionPerformed(e);
			}
		});
		btnGerar.setBounds(166, 270, 172, 30);
		add(btnGerar);
		
		textField = new JTextField();
		textField.setBounds(105, 66, 283, 192);
		add(textField);
		textField.setColumns(10);

	}
	
    private void jButton1ActionPerformed(ActionEvent evt) {                                         
        // TODO add your handling code here:
        Random gerador = new Random();

        //pega numeros randomicos até 100, passa para uma variavel String
        String numero = String.valueOf((gerador.nextInt(100)));
        //seta o jTextField
        textField.setText(numero);


    }

}
