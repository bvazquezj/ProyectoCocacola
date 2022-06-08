
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;


public class Bienvenida extends JFrame implements ActionListener,MouseListener{

    private final JLabel lbl1;
    private final JLabel lbl2,lbl3,lbl4;
    private final JTextField tfld1;
    private final JPasswordField tfld2;
    private final JButton btn1,btn2;
    private final String passwrd="Jabon123";
    public static String usuario;
    public Bienvenida(){
        setLayout(null);
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        lbl1 = new JLabel();
        lbl1.setIcon(new ImageIcon("images/coca-cola.png"));
        lbl1.setBounds(50, 50, 300, 150);
        lbl1.setVisible(true);
        add(lbl1);
        
        lbl2 = new JLabel("Introduce tu nombre:");
        lbl2.setBounds(50, 175, 150, 50);
        lbl2.setVisible(true);
        add(lbl2);
        
        tfld1 = new JTextField();
        tfld1.setBounds(100, 225, 200, 30);
        tfld1.setVisible(true);
        add(tfld1);
        
        lbl3 = new JLabel("Introduce la contraseña:");
        lbl3.setBounds(50, 250, 150, 50);
        lbl3.setVisible(true);
        add(lbl3);
        
        tfld2 = new JPasswordField();
        tfld2.setBounds(100, 300, 200, 30);
        tfld2.setVisible(true);
        add(tfld2);
        
        btn2 = new JButton(new ImageIcon("images/ver.png"));
        btn2.setBounds(310, 300, 30, 30);
        btn2.setBackground(Color.WHITE);
        btn2.setBorder(null);
        btn2.addMouseListener(this);
        btn2.setVisible(true);
        add(btn2);
        
        btn1 = new JButton("Ingresar");
        btn1.setBounds(250, 430, 100, 30);
        btn1.addActionListener(this);
        btn1.setVisible(true);
        add(btn1);
        
        lbl4 = new JLabel("©2022 The Coca-Cola Company -by: Brandon Juarez");
        lbl4.setBounds(25, 475, 350, 60);
        lbl4.setForeground(Color.red);
        lbl4.setVisible(true);
        add(lbl4);
    }
     
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn1) {
            if ((tfld1.getText().equals("")||(!(tfld2.getText().equals(passwrd))))) {
               JOptionPane.showMessageDialog(null, "verifica tu usuario y contraseña");
            }else if((!(tfld1.getText().equals("")))&&(tfld2.getText().equals(passwrd))){
                usuario=tfld1.getText().trim();
                //JOptionPane.showMessageDialog(null, "Bienvenido "+usuario);
                Licencia fm2 = new Licencia();
                fm2.setBounds(0, 0, 800, 600);
                fm2.setLocationRelativeTo(null);
                fm2.setVisible(true);
                fm2.setResizable(false);
                fm2.setDefaultCloseOperation(EXIT_ON_CLOSE);
                this.setVisible(false);
            }
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        tfld2.enableInputMethods(true);
        tfld2.setEchoChar((char)0);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        tfld2.setEchoChar('•');
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
    public static void main(String[] args) {
        Bienvenida fm = new Bienvenida();
        fm.getContentPane().setBackground(Color.WHITE);
        fm.setTitle("COCA-COLA Bran");
        fm.setBounds(0, 0, 400, 550);
        fm.setVisible(true);
        fm.setLocationRelativeTo(null);
        fm.setResizable(false);
        fm.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    
}