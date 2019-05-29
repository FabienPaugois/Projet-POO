package menu;

import javax.swing.JFrame;

public class viewFrame {
	
	public viewFrame() {
	    JFrame fenetre = new JFrame("Rock'N Diamond");
	    fenetre.setSize(1920, 1080);
	    fenetre.setLocationRelativeTo(null);
	    fenetre.setResizable(false);
	    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    fenetre menu = new fenetre();

	    fenetre.setContentPane(menu);
	    fenetre.setVisible(true);
	}
}
