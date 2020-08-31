package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Controller.Controller;


public class TicTacToe extends JFrame{
  Container cp;
  JPanel p1 = new JPanel();
  JPanel p2 = new JPanel();
  JPanel p3 = new JPanel();
  JPanel p4 = new JPanel();
  JButton button[][] = new JButton[3][3];
  JLabel lbX = new JLabel("Spieler X");
  JLabel lbO = new JLabel("Spieler O");
  JTextField tfX = new JTextField(10);
  JTextField tfO = new JTextField(10);
  JButton btStart = new JButton("Start");
  JButton btAbbruch = new JButton("Abbruch");
  JButton btReset = new JButton("Reset");
  JLabel lbStatus = new JLabel("Status:");
  JTextArea tfStatus = new JTextArea();
  
  public TicTacToe() {
    super("TicTacToe");
    int anzahl = 1;
    cp = getContentPane();
    p1.setLayout(new GridLayout(3,3,10,10));
    for(int i = 0; i< 3;i++) {
    	for(int j = 0; j<3;j++) {
    		button[i][j] = new JButton();
    		button[i][j].setActionCommand("i/j");
    		button[i][j].setIcon(new ImageIcon("images/b" + anzahl + ".jpg"));
    		p1.add(button[i][j]);
    		anzahl++;
    	}
    	
        
    }

    p2.setLayout(new FlowLayout());
    p2.add(p1);
    
    p3.setLayout(new GridLayout(5,3,5,20));
    p3.add(lbX);
    p3.add(tfX);
    p3.add(lbO);
    p3.add(tfO);
    p3.add(btStart);
    p3.add(btAbbruch);
    p3.add(btReset);
    p3.add(lbStatus);
    p3.add(tfStatus);
    
    
    p4.setLayout(new FlowLayout());
    p4.add(p3);
    
    cp.add(p1, BorderLayout.CENTER);
    cp.add(p4, BorderLayout.EAST);
    
    btStart.setActionCommand("Start");
    btAbbruch.setActionCommand("Abbruch");
    btReset.setActionCommand("Reset");
    
    tfStatus.setEditable(false);
    setVisible(true);
      setSize(500,300);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      setResizable(true);
  }
  
  public void zuhoeren(Controller controller) {
	  btStart.addActionListener(controller);
	  btAbbruch.addActionListener(controller);
	  btReset.addActionListener(controller);
	  for(int i=0; i<3;i++) {
		  for(int j=0;j<3;j++) {
			  button[i][j].addActionListener(controller);
		  }
	  }
	  
  }
  
  
 
  
  


}
