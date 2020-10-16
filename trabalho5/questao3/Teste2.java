import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;

public class Teste2 extends JFrame {

    public Teste2() {
        this.setSize(400, 400);
        final JButton meuButao = new JButton("Click para Gerar");
        meuButao.setBackground(Color.PINK);
        meuButao.setBounds(119, 323, 155, 35);

        meuButao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	jButtonActionPerformed(e);
            }
        });
        getContentPane().setLayout(null);

        this.getContentPane().add(meuButao);
        
        JPanel panel = new JPanel();
        panel.setBounds(31, 12, 316, 299);
        getContentPane().add(panel);
        panel.setLayout(new GridLayout(10, 1));
    }
    private void jButtonActionPerformed(ActionEvent evt) {      
   	 ArrayList<String> valores = new ArrayList<>();

       try (BufferedReader b = new BufferedReader(new FileReader("random.txt"));) {
           for ( int i = 1; i <= 10; ++i) {
        	   double aux = getGaussian();
        	   
        	   valores.add(Double.toString(aux));
           }
           JPanel panel = new JPanel();
           panel.setBounds(31, 12, 316, 299);
           getContentPane().add(panel);
           panel.setLayout(new GridLayout(10, 1));
           for (String i: valores) {
        	   JLabel line = new JLabel(i);
        	   panel.add(line);
  
           }
           panel.validate();
           Collections.sort(valores);
           gravarArquivo(valores);
           
       } catch (IOException e) {
           e.printStackTrace();
       }


   }
    private Random fRandom = new Random();
    private double getGaussian() {
    	double aMean = 100.0f;
    	double aVariance = 5.0f;
        return aMean + fRandom.nextGaussian()*aVariance;
    }

    public static void gravarArquivo(ArrayList<String> valores) {
        PrintStream p = null;
        File arquivo = new File("random.txt");
        try {
            p = new PrintStream(arquivo);
            for (int i = 0; i < 10; ++i) {
                p.println(valores.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (p != null) {
            p.close();
        }
    }
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teste2().setVisible(true);
            }
        });
    }
}