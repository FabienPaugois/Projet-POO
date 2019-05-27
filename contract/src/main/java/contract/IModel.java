package contract;

import java.awt.Image;
import java.util.Observable;

/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
public interface IModel {

	String getTabLine(int i, int j);

	Image getMap(int i, int j);
	
	int getLevel();

	void loadMap(int i);
	
	void setPosition(int i);

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();
}
