
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;




public class Licencia extends JFrame implements ActionListener,ChangeListener{
    
    JLabel lbl1,lbl2;
    JScrollPane br;
    JTextArea txa;
    JCheckBox cbx;
    JButton btn1,btn2;
    
    public Licencia(){
        setLayout(null);
        setTitle("Terminos y condiciones");
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        getContentPane().setBackground(new Color(85, 0, 0));
        
        lbl1 = new JLabel("TERMINOS Y CONDICIONES");
        lbl1.setBounds(175, 10,450, 50);
        lbl1.setForeground(Color.WHITE);
        lbl1.setFont(new Font("Forte", Font.BOLD, 30));
        lbl1.setVisible(true);
        add(lbl1);
        
        txa = new JTextArea();
        txa.setEditable(false);
        txa.setFont(new Font("Arial", Font.PLAIN, 15));
        txa.setText(
                "\n\n          TERMINOS Y CONDICIONES"+
                "\n\n          A.QUEDA PROHIBIDO LA VENTA O DISTRUBUCION SIN LA AUTORIZACION"+
                "\n          B.QUEDA PROHIBIDA LA MODIFICACION DEL CODIGO FUENTE Y SUS FUNCIONES"+
                "\n          C. EL DESSARROLLADOR NO SE HACE RESPONSABLE POR EL USO INADECUADO"+
                "\n\n          Se persigue la regulación el acceso y utilización del contenido, productos y/o servicios" +
                "\n          a disposición del público en general en el dominio planteado El titular se guarda el derecho" +
                "\n          de realizar cualquier tipo de reforma en la página en cualquier momento y sin previo aviso, "+
                "\n          al suscriptor. El acceso a la página web por parte del usuario es libre y gratuito, la "+
                "\n          utilización del contenido, productos y/o servicios conlleva un costo para el usuario. El sitio "+
                "\n          web está dirigido a un público principalmente oriundo de Mexico."+
                "\n\n          se ajusta a los parámetros legales establecidos en dicho territorio. La administración del"+
                "\n          sitio web puede ejercerse por terceros, es decir, personas distintas al titular, sin afectar"+
                "\n          esto los presentes términos"
        );
        br = new JScrollPane(txa);
        br.setBounds(50, 80, 700, 350);
        br.setVisible(true);
        add(br);
        
        cbx = new JCheckBox("yo "+Bienvenida.usuario +" he leido y acepto");
        cbx.setBounds(30, 450, 350, 30);
        cbx.addChangeListener(this);
        cbx.setFont(new Font("Arial", Font.PLAIN, 18));
        cbx.setBackground(new Color(85, 0, 0));
        cbx.setForeground(Color.WHITE);
        cbx.setVisible(true);
        add(cbx);
        
        lbl2 = new JLabel(new ImageIcon("images/logo-coca.png"));
        lbl2.setBounds(500, 430,300, 150);
        lbl2.setVisible(true);
        add(lbl2);
        
        btn1 = new JButton("Continuar");
        btn1.setBounds(30, 500, 100, 30);
        btn1.addActionListener(this);
        btn1.setEnabled(false);
        btn1.setVisible(true);
        add(btn1);
        
        btn2 = new JButton("No acepto");
        btn2.setBounds(150, 500, 100,30);
        btn2.addActionListener(this);
        btn2.setVisible(true);
        add(btn2);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn1) {
            Principal fm3 = new Principal();
            fm3.menu();
            fm3.layaut();
            fm3.setBounds(0, 0, 800, 600);
            fm3.setLocationRelativeTo(null);
            fm3.setVisible(true);
            fm3.setResizable(false);
            fm3.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setVisible(false);
        }else if (e.getSource()==btn2) {
            Bienvenida fm = new Bienvenida();
            fm.getContentPane().setBackground(Color.WHITE);
            fm.setTitle("COCA-COLA Bran");
            fm.setBounds(0, 0, 400, 550);
            fm.setVisible(true);
            fm.setLocationRelativeTo(null);
            fm.setResizable(false);
            fm.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setVisible(false);
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (cbx.isSelected()==true) {
            btn1.setEnabled(true);
        }else{
            btn1.setEnabled(false);
        }
    }
    
    public static void main(String[] args) {
        Licencia fm2 = new Licencia();
        fm2.setBounds(0, 0, 800, 600);
        fm2.setLocationRelativeTo(null);
        fm2.setVisible(true);
        fm2.setResizable(false);
        fm2.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}

