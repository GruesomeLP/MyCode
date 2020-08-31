package View;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Control.Control;

public class TestUnusedView extends JFrame {
	//Test
	
	Container cp;
	
	 
	private JList list;
	
	private JButton b1 = new JButton ("Finden");
	private JTextField t2 = new JTextField ("Name (oder Suchwort)");
	private JTextField t3 = new JTextField ("Ort o. PLZ");
	
	
	
	 String comboBoxListe[] = {"Standardsuche", "Standardsuche","Geldautomat","Notapotheke","Kino & Filme",
		"Erweiterte Suche","Rückwärtssuche","Postleitzahlsuche","Vorwahlsuche",
	  };
	 
	private JComboBox Standardsuche = new JComboBox(comboBoxListe);
	
	JPanel grund = new JPanel(new GridLayout());
	JPanel grund2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
	JPanel one = new JPanel(new FlowLayout());
	JPanel two = new JPanel(new FlowLayout());
	JPanel three = new JPanel(new FlowLayout());
	JPanel four = new JPanel(new FlowLayout());
	

public TestUnusedView() {
	
		cp = getContentPane();
		
		one.add(Standardsuche);
		two.add(t2);
		three.add(t3);
		four.add(b1);
	
		cp.add(grund);
		grund.add(grund2);
		grund2.add(one);
		grund2.add(two);
		grund2.add(three);
		grund2.add(four);
		

		setVisible(true);
		setSize(400,500);
	
		Standardsuche.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = (String) Standardsuche.getSelectedItem();
				
				switch(s) {
							
				case "Standardsuche":
					one.setVisible(true);
					t2.setText("Name (oder Suchwort)");
					break;
				case "Rückwärtssuche":
					one.add(Standardsuche);
					three.setVisible(false);
					t2.setText("Vorwahl und Telefonnummer");
						break;						
                }
			}
		  });

}

	




public String[] getComboBoxListe() {
	return comboBoxListe;
}



public JComboBox getStandardsuche() {
	return Standardsuche;
}


public void setStandardsuche(JComboBox standardsuche) {
	Standardsuche = standardsuche;


		}






public void zuhoehren(Control e) {
	b1.addActionListener(e);
	
}






public JButton getB1() {
	return b1;
}






public void setB1(JButton b1) {
	this.b1 = b1;
}
}
		


