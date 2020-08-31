import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class View extends JFrame{
	Container cp;
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	JPanel p5 = new JPanel();
	JPanel p6 = new JPanel();
	JRadioButton rbNach = new JRadioButton("Nachnahme (Gebühr: 5€)");
	JRadioButton rbRechnung = new JRadioButton("Rechnung (nicht für Erstkunden)");
	JRadioButton rbBank = new JRadioButton("Bankeinzug (Gebühr: 2€)");
	JLabel lbBlz = new JLabel("BLZ");
	JLabel lbKonto = new JLabel("Kontonummer");
	JTextField tfBlz = new JTextField(15);
	JTextField tfKonto = new JTextField(15);
	JButton btBack = new JButton("Zurück");
	JButton btWeiter = new JButton("Weiter");
	ButtonGroup wahl = new ButtonGroup();
	
	public View(){
		super("View");
		cp = getContentPane();
		wahl.add(rbNach);
		wahl.add(rbRechnung);
		wahl.add(rbBank);
		p1.setLayout(new GridLayout(3,0));
		p1.add(rbNach);
		p1.add(rbRechnung);
		p1.add(rbBank);
		
		p2.setLayout(new FlowLayout(FlowLayout.LEFT));
		p2.add(p1);
		
		p3.setLayout(new GridLayout(2,2,2,2));
		p3.add(lbBlz);
		p3.add(tfBlz);
		p3.add(lbKonto);
		p3.add(tfKonto);
		
		p4.setLayout(new FlowLayout(FlowLayout.LEFT));
		p4.add(p3);
		
		p5.setLayout(new GridLayout(0,2));
		p5.add(btBack);
		p5.add(btWeiter);
		
		p6.setLayout(new FlowLayout(FlowLayout.LEFT));
		p6.add(p5);
		
		cp.add(p2, BorderLayout.NORTH);
		cp.add(p4, BorderLayout.CENTER);
		cp.add(p6, BorderLayout.SOUTH);
		
	    setVisible(true);
	    setSize(370,210);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
	    setResizable(true);
	}
	
	public static void main(String[] args) {
		View JF = new View();
	}

}
