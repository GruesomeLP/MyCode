package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.TicTacToe;

public class Controller implements ActionListener {
	private TicTacToe v;
	
	public Controller() {
		v = new TicTacToe();
		v.zuhoeren(this);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="Start") {
			System.out.println("test");
		}
		
	}

}
