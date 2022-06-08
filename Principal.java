import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class Principal extends JFrame implements ActionListener, MenuListener{
    JMenuBar barr;
    JMenu ini_men, opc_men,ayu_men,ace_men,col_opc;
    JMenuItem roj_col, blk_col,wte_col, cal_opc, sop_ayu, lim_ini,sal_ini; 
    JLabel logo,wellcom,tittle,nom,appa,apma,dep,ant,res,copyrigth;
    JTextField nombre,paterno,materno;
    JComboBox depart,antigue;
    JTextArea resul;
    String trabajador;
    public void menu(){
        setLayout(null);
        setTitle("inicio Bran");
        getContentPane().setBackground(Color.WHITE);
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        //menu bat
        barr = new JMenuBar();
        barr.setBounds(0, 0, 800, 30);
        barr.setVisible(true);
        add(barr);
        //menus 
        ini_men = new JMenu("Inicio");
        ini_men.setVisible(true);
        barr.add(ini_men);
        
        opc_men = new JMenu("Opciones");
        opc_men.setVisible(true);        
        barr.add(opc_men);
        
        ayu_men = new JMenu("Ayuda");
        ayu_men.setVisible(true);        
        barr.add(ayu_men);
        
        ace_men = new JMenu("Acerca de");
        ace_men.addMenuListener((MenuListener) this);
        ace_men.setVisible(true);        
        barr.add(ace_men);
        //barra
        col_opc = new JMenu("cambiar color");
        col_opc.setVisible(true);
        opc_men.add(col_opc);
        //item menu
        roj_col = new JMenuItem("color rojo");
        roj_col.addActionListener(this);
        roj_col.setVisible(true);
        col_opc.add(roj_col);
        
        blk_col = new JMenuItem("color negro");
        blk_col.addActionListener(this);
        blk_col.setVisible(true);
        col_opc.add(blk_col);
        
        wte_col = new JMenuItem("color blanco");
        wte_col.addActionListener(this);
        wte_col.setVisible(true);
        col_opc.add(wte_col);
        
        cal_opc = new JMenuItem("Calcular");
        cal_opc.addActionListener(this);
        cal_opc.setVisible(true);
        opc_men.add(cal_opc);
        
        sop_ayu = new JMenuItem("Soporte");
        sop_ayu.addActionListener(this);
        sop_ayu.setVisible(true);
        ayu_men.add(sop_ayu);
        
        lim_ini = new JMenuItem("Limpiar");
        lim_ini.addActionListener(this);
        lim_ini.setVisible(true);
        ini_men.add(lim_ini); 
        
        sal_ini = new JMenuItem("Salir");
        sal_ini.addActionListener(this);
        sal_ini.setVisible(true);
        ini_men.add(sal_ini);    
    }
    public void layaut(){
        logo = new JLabel(new ImageIcon("images/coca-cola.png"));
        logo.setBounds(0,30,300,150);
        logo.setVisible(true);
        add(logo);
        
        wellcom = new JLabel("¡BIENVENIDO!");
        wellcom.setFont(new Font("Times new roman", 2, 30));
        wellcom.setForeground(Color.RED);
        wellcom.setBounds(400,95,200,35);
        add(wellcom);
        
        tittle = new JLabel("Datos del trabajador para el calculo de vacaciones");
        tittle.setFont(new Font("Arial", 0, 20));
        tittle.setForeground(Color.RED);
        tittle.setBounds(50, 175, 750, 25);
        add(tittle);
        
        nom = new JLabel("Nombre");
        nom.setBounds(20, 250, 200, 25);
        nom.setForeground(Color.RED);
        add(nom);
        
        nombre = new JTextField();
        nombre.setBounds(20, 275, 200, 20);
        add(nombre);
        
        appa = new JLabel("Apellido Paterno");
        appa.setBounds(20, 310, 200, 25);
        appa.setForeground(Color.RED);
        add(appa);
        
        paterno = new JTextField();
        paterno.setBounds(20, 335, 200, 20);
        add(paterno);
        
        apma = new JLabel("Apellido Materno");
        apma.setBounds(20, 370, 200, 25);
        apma.setForeground(Color.RED);
        add(apma);
        
        materno = new JTextField();
        materno.setBounds(20, 395, 200, 20);
        add(materno);
        
        dep = new JLabel("Seleccina departameento");
        dep.setBounds(260, 250, 200, 25);
        dep.setForeground(Color.RED);
        add(dep);
        
        depart = new JComboBox();
        depart.setBounds(260, 275, 200, 20);
        depart.setBackground(Color.WHITE);
        depart.addItem("");
        depart.addItem("Atencion all cliente");
        depart.addItem("Departamento de logistica");
        depart.addItem("Deparamento de gerencia");
        add(depart);
        
        ant = new JLabel("Selecciona Antiguedad");
        ant.setBounds(260, 310, 200, 25);
        ant.setForeground(Color.RED);
        add(ant);
        
        antigue = new JComboBox();
        antigue.setBounds(260, 335, 200, 20);
        antigue.setBackground(Color.WHITE);
        antigue.addItem("");
        antigue.addItem("1 año de servicio");
        antigue.addItem("2 a 6 años de servicio");
        antigue.addItem("7 años o mas de servicio");
        add(antigue);
        
        res = new JLabel("Resultado del calculo");
        res.setBounds(260, 370, 200, 25);
        res.setForeground(Color.RED);
        add(res);
        
        resul = new JTextArea("Aqui aparece el resultado del caluclo");
        resul.setForeground(Color.RED);
        resul.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        resul.setFocusable(false);
        resul.setCursor(null);
        resul.setBounds(260, 395, 500, 150);
        add(resul);
    }
    
    @Override
    public void menuSelected(MenuEvent e) {
        JOptionPane.showMessageDialog(null, "Dev by Brandon Vazquez");
        this.getContentPane().requestFocus();
    }

    @Override
    public void menuDeselected(MenuEvent e) {        
        
    }

    @Override
    public void menuCanceled(MenuEvent e) {
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==lim_ini) {
            nombre.setText("");
            paterno.setText("");
            materno.setText("");
            resul.setText("Aqui aparece el resultado del caluclo");
            depart.setSelectedIndex(0);
            antigue.setSelectedIndex(0);
            
        }if (e.getSource()==roj_col) {
            try {
                this.getContentPane().setBackground(Color.red);
                logo.setIcon(new ImageIcon("images/logo-coca.png"));
                wellcom.setForeground(Color.WHITE);
                tittle.setForeground(Color.WHITE);
                nom.setForeground(Color.WHITE);
                appa.setForeground(Color.WHITE);
                apma.setForeground(Color.WHITE);
                dep.setForeground(Color.WHITE);
                ant.setForeground(Color.WHITE);
                res.setForeground(Color.WHITE);
                copyrigth.setForeground(Color.WHITE);
        } catch (NullPointerException a) {
        }
            
            
        }if (e.getSource()==blk_col) {
            try {
                this.getContentPane().setBackground(Color.BLACK);
                logo.setIcon(new ImageIcon("images/logo-coca.png"));
                wellcom.setForeground(Color.WHITE);
                tittle.setForeground(Color.WHITE);
                nom.setForeground(Color.WHITE);
                appa.setForeground(Color.WHITE);
                apma.setForeground(Color.WHITE);
                dep.setForeground(Color.WHITE);
                ant.setForeground(Color.WHITE);
                res.setForeground(Color.WHITE);
                copyrigth.setForeground(Color.WHITE);
        } catch (NullPointerException a) {
            
        }
            
            
        }if (e.getSource()==wte_col) {
            try {
                this.getContentPane().setBackground(Color.WHITE);
                logo.setIcon(new ImageIcon("images/coca-cola.png"));
                wellcom.setForeground(Color.red);
                tittle.setForeground(Color.red);
                nom.setForeground(Color.red);
                appa.setForeground(Color.red);
                apma.setForeground(Color.red);
                dep.setForeground(Color.red);
                ant.setForeground(Color.red);
                res.setForeground(Color.red);
                copyrigth.setForeground(Color.red);
        } catch (NullPointerException a) {
        }
            
            
        }if (e.getSource()==cal_opc) {
            
            if ((nombre.getText().isEmpty())||(paterno.getText().isEmpty())||(materno.getText().isEmpty())
                    || (antigue.getSelectedIndex()==0) || (depart.getSelectedIndex()==0)) {
                JOptionPane.showMessageDialog(null, "llena todos los campos ");
            }else{
                trabajador=nombre.getText().trim()+" "+paterno.getText().trim()+" "+materno.getText().trim();
                switch(depart.getSelectedIndex()){
                    case 1:
                        switch(antigue.getSelectedIndex()){
                            case 1:
                                resul.setText("\n El trabajador "+ trabajador+" "+
                                "\n quien labora en "+depart.getSelectedItem().toString()+" con "+antigue.getSelectedItem().toString()+
                                "\n recibe 6 dias de vacaciones. ");
                                break;
                            case 2:
                                resul.setText("\n El trabajador "+ trabajador+" "+
                                "\n quien labora en "+depart.getSelectedItem().toString()+" con "+antigue.getSelectedItem().toString()+
                                "\n recibe 14 dias de vacaciones. ");
                                break;
                            case 3:
                                resul.setText("\n El trabajador "+ trabajador+" "+
                                "\n quien labora en "+depart.getSelectedItem().toString()+" con "+antigue.getSelectedItem().toString()+
                                "\n recibe 20 dias de vacaciones. ");
                                break;                          
                        }
                
                        break;
                    case 2:
                        switch(antigue.getSelectedIndex()){
                            case 1:
                                resul.setText("\n El trabajador "+ trabajador+" "+
                                "\n quien labora en "+depart.getSelectedItem().toString()+" con "+antigue.getSelectedItem().toString()+
                                "\n recibe 7 dias de vacaciones. ");
                                break;
                            case 2:
                                resul.setText("\n El trabajador "+ trabajador+" "+
                                "\n quien labora en "+depart.getSelectedItem().toString()+" con "+antigue.getSelectedItem().toString()+
                                "\n recibe 15 dias de vacaciones. ");
                                break;
                            case 3:
                                resul.setText("\n El trabajador "+ trabajador+" "+
                                "\n quien labora en "+depart.getSelectedItem().toString()+" con "+antigue.getSelectedItem().toString()+
                                "\n recibe 22 dias de vacaciones. ");
                                break;
                        }
                        break;
                    case 3:
                        switch(antigue.getSelectedIndex()){
                            case 1:
                                resul.setText("\n El trabajador "+ trabajador+" "+
                                "\n quien labora en "+depart.getSelectedItem().toString()+" con "+antigue.getSelectedItem().toString()+
                                "\n recibe 10 dias de vacaciones. ");
                                break;
                            case 2:
                                resul.setText("\n El trabajador "+ trabajador+" "+
                                "\n quien labora en "+depart.getSelectedItem().toString()+" con "+antigue.getSelectedItem().toString()+
                                "\n recibe 20 dias de vacaciones. ");
                                break;
                            case 3:
                                resul.setText("\n El trabajador "+ trabajador+" "+
                                "\n quien labora en "+depart.getSelectedItem().toString()+" con "+antigue.getSelectedItem().toString()+
                                "\n recibe 30 dias de vacaciones. ");
                                break;                            
                        }
                        break;
                }
            }
            
        }if (e.getSource()==sop_ayu) {
            JOptionPane.showMessageDialog(null, "ingresa a la pagina \n www.soporteayudacocacola.com"
                    + "\n para mas informacion");
        }if (e.getSource()==sal_ini) {
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
    
    public static void main(String[] args) {
        
        Principal fm3 = new Principal();
        fm3.menu();
        fm3.layaut();
        fm3.setBounds(0, 0, 800, 600);
        fm3.setLocationRelativeTo(null);
        fm3.setVisible(true);
        fm3.setResizable(false);
        fm3.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    

}
