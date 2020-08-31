import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View1 extends JFrame{
	//Test
	Container cp;
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	JPanel p5 = new JPanel();
	JPanel p6 = new JPanel();
	JLabel lbArt = new JLabel("Artikelnummer");
	JLabel lbBeschreibung = new JLabel("Beschreibung");
	JLabel lbAktuell = new JLabel("Aktuelles Gebot");
	JLabel lbNeues = new JLabel("Neues Gebot");
	JTextField tfArt = new JTextField(10);
	JTextField tfBeschreibung = new JTextField(10);
	JTextField tfAktuell = new JTextField(10);
	JTextField tfNeues = new JTextField(10);
	JButton btBack = new JButton("Zurück");
	JButton btWeiter = new JButton("Weiter");
	
	public View1() {
		super("View1");
		cp = getContentPane();
		p1.setLayout(new GridLayout(3,1));
		p1.add(lbArt);
		p1.add(tfArt);
		p1.add(lbBeschreibung);
		p1.add(tfBeschreibung);
		
		p2.setLayout(new FlowLayout(FlowLayout.LEFT));
		p2.add(p1);
		
		p3.setLayout(new GridLayout(3,2));
		p3.add(lbAktuell);
		p3.add(tfAktuell);
		p3.add(lbNeues);
		p3.add(tfNeues);
		p3.add(btBack);
		p3.add(btWeiter);
		
		p4.setLayout(new FlowLayout(FlowLayout.LEFT));
		p4.add(p3);
		
		cp.add(p2, BorderLayout.NORTH);
		cp.add(p4, BorderLayout.SOUTH);
		  setVisible(true);
		    setSize(370,210);
		    setDefaultCloseOperation(EXIT_ON_CLOSE);
		    
		    setResizable(true);
		
		
	}
	
	public static void main(String[] args) {
		View1 JF = new View1();
	}

}
