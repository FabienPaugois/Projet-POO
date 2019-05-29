package menu;

import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class fenetre extends JPanel implements ActionListener {

	private ImageIcon screen;
	private Image imgScreen;
	private int back1;
	private JButton but1;
	private JButton but2;
	private JButton but3;
	private JButton but4;
	private JButton but5;

	public fenetre() {
		super();
		this.setLayout(null);
		this.back1 = 0;
		but1 = new JButton();
		but1.addActionListener(this);
		this.add(but1);
		but1.setBounds(520, 325, 940, 95);
		but1.setOpaque(false);
		but1.setContentAreaFilled(false);
		but1.setBorderPainted(false);

		but2 = new JButton();
		but2.addActionListener(this);
		this.add(but2);
		but2.setBounds(520, 461, 940, 95);
		but2.setOpaque(false);
		but2.setContentAreaFilled(false);
		but2.setBorderPainted(false);

		but3 = new JButton();
		but3.addActionListener(this);
		this.add(but3);
		but3.setBounds(520, 600, 940, 95);
		but3.setOpaque(false);
		but3.setContentAreaFilled(false);
		but3.setBorderPainted(false);

		but4 = new JButton();
		but4.addActionListener(this);
		this.add(but4);
		but4.setBounds(520, 735, 940, 95);
		but4.setOpaque(false);
		but4.setContentAreaFilled(false);
		but4.setBorderPainted(false);

		but5 = new JButton();
		but5.addActionListener(this);
		this.add(but5);
		but5.setBounds(518, 868, 940, 95);
		but5.setOpaque(false);
		but5.setContentAreaFilled(false);
		but5.setBorderPainted(false);
		
		screen = new ImageIcon(getClass().getResource("/imgbg/Menu.png"));
		this.imgScreen = this.screen.getImage();
	}
	
	public void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics g2 = (Graphics2D) g;

        g2.drawImage(this.imgScreen, this.back1, 0, null);
    }

	public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == but1) {
            System.out.println("niveau 1");
            /** replace sysout by the level path */
        } else if (source == but2) {
            System.out.println("niveau 2");
            /** replace sysout by the level path */
        } else if (source == but3) {
            System.out.println("niveau 3");
            /** replace sysout by the level path */
        } else if (source == but4) {
            System.out.println("niveau 4");
            /** replace sysout by the level path */
        } else if (source == but5) {
            System.out.println("niveau 5");
            /** replace sysout by the level path */
        }
    }
}
