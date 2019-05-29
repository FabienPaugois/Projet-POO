package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import contract.IModel;

public class ViewButton extends JPanel implements ActionListener{
	
	private ImageIcon screen;
	private Image imgScreen;
	private int back1;
	private JButton but1;
	private JButton but2;
	private JButton but3;
	private JButton but4;
	private JButton but5;
	private IModel model;
	private ViewFrame view;

	public ViewButton(IModel model, ViewFrame view) {
		super();
		this.model = model;
		this.view = view;
		this.setLayout(null);
		this.back1 = 0;
		but1 = new JButton("Level 1");
		but1.addActionListener(this);
		this.add(but1);
		but1.setBounds(360, 530, 80, 30);

		but2 = new JButton("Level 2");
		but2.addActionListener(this);
		this.add(but2);
		but2.setBounds(480, 530, 80, 30);

		but3 = new JButton("Level 3");
		but3.addActionListener(this);
		this.add(but3);
		but3.setBounds(600, 530, 80, 30);

		but4 = new JButton("Level 4");
		but4.addActionListener(this);
		this.add(but4);
		but4.setBounds(720, 530, 80, 30);

		but5 = new JButton("Level 5");
		but5.addActionListener(this);
		this.add(but5);
		but5.setBounds(840, 530, 80, 30);

		screen = new ImageIcon(getClass().getResource("/images/menu.jpg"));
		this.imgScreen = this.screen.getImage();

	}

	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		Graphics g2 = (Graphics2D) g;

		g2.drawImage(this.imgScreen, 0, 0, this.getWidth(), this.getHeight(), this);
	}

	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == but1) {
			model.loadMap(1);
		} else if (source == but2) {
			model.loadMap(2);
		} else if (source == but3) {
			model.loadMap(3);
		} else if (source == but4) {
			model.loadMap(4);
		} else if (source == but5) {
			model.loadMap(5);
		}
	}
}
