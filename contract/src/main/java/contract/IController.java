package contract;

import java.awt.Image;

import entity.Entity;

/**
 * The Interface IController.
 *
 * @author Fabien
 */
public interface IController {

	/**
	 * Control
	 */
	public void control();

	/**
	 * Order perform.
	 *
	 * @param controllerOrder
	 *          the controller order
	 */
	
	public void orderPerform(ControllerOrder controllerOrder);
	
	/**
	 * Initiate the movement and create the exit door
	 * 
	 * @param KeyCode
	 * 			The code of the Key pressed
	 */
	
	public void movement(int KeyCode);
	
	/**
	 * 
	 * @return
	 * 		The current model
	 */
	public IModel getModel();
}
