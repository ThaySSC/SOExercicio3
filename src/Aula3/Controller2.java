package Aula3;

import javax.swing.JOptionPane;

public class Controller2 extends Thread {

	@Override
	public void run() {
		
	JOptionPane.showMessageDialog(null, "Thread TID: " + this.getId());
	}
	
}