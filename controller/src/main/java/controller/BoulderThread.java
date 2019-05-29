package controller;

import java.awt.Image;

import contract.IModel;
import contract.IView;
import entity.Air;
import entity.Boulder;
import entity.Diamond;
import entity.Entity;
import entity.Character;

public class BoulderThread extends Thread {

	IView view;
	IModel model;

	int[][] tabBoulder = new int[2][200];
	Entity[][] tabEntity;
	Image[][] tabMap;

	Boulder boulder;
	Diamond diamond;

	public BoulderThread(String name, IView view, IModel model) {
		super(name);
		this.view = view;
		this.model = model;
	}

	public void run() {
		while (true)
			try {
				this.fall();
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

	public void swap(int i, int j) {
		Entity entity;
		entity = tabEntity[j][i];
		tabEntity[j][i] = tabEntity[j + 1][i];
		tabEntity[j + 1][i] = entity;
		Image image;
		image = tabMap[j][i];
		tabMap[j][i] = tabMap[j + 1][i];
		tabMap[j + 1][i] = image;
		model.update();
	}

	private int[][] definition() {
		this.tabEntity = model.getTabEntity();
		this.tabMap = model.getMap();
		int k = 0;
		for (int i = 0; i < 22; i++) {
			for (int j = 0; j < 40; j++) {
				if (tabEntity[i][j] instanceof Boulder || tabEntity[i][j] instanceof Diamond) {
					tabBoulder[0][k] = j;
					tabBoulder[1][k] = i;
					k++;
					tabEntity[i][j].setFalling(false);
					tabEntity[i][j].setCanBePushed(false);
				}
			}
		}
		return tabBoulder;
	}

	public void fall() {
		tabBoulder = definition();
		int j = 0;
		for (j = 0; j < 100; j++) {
			if (tabEntity[tabBoulder[1][j] + 1][tabBoulder[0][j]] instanceof Air
					|| tabEntity[tabBoulder[1][j] + 1][tabBoulder[0][j]] instanceof Character) {
				if (tabEntity[tabBoulder[1][j] + 1][tabBoulder[0][j]] instanceof Air) {
					swap(tabBoulder[0][j], tabBoulder[1][j]);
					tabEntity[tabBoulder[1][j] + 1][tabBoulder[0][j]].setFalling(true);
					if (tabEntity[tabBoulder[1][j] + 1][tabBoulder[0][j]].getFalling()
							&& tabEntity[tabBoulder[1][j] + 2][tabBoulder[0][j]] instanceof Character) {
						view.printMessage("t mort");
						model.loadMap(model.getLevel());
					}
				}
			}
			if (tabBoulder[0][j] != 0 && tabEntity[tabBoulder[1][j]][tabBoulder[0][j]] instanceof Boulder) {
				if (tabEntity[tabBoulder[1][j]][tabBoulder[0][j] - 1] instanceof Air
						|| tabEntity[tabBoulder[1][j]][tabBoulder[0][j] + 1] instanceof Air) {
					tabEntity[tabBoulder[1][j]][tabBoulder[0][j]].setCanBePushed(true);
				}
			}
		}
	}
}