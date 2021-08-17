package equationSolver.equationSolver.linearEquationSolver;

import java.util.ArrayList;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class EquationSide {
	
	/*
	 * Member variables
	 */
	private ArrayList<EquationComponent> components;
	
	public EquationSide() {}
	
	/*****************************************************
	 * Methods for splitting and processing the component
	 * beans
	 * 
	 * 
	 * 
	 * 
	 *****************************************************/
	
	/*
	 * Method to split the given side of the equation into its
	 * constituent components by storing all values into the 
	 * EquationComponent beans 
	 */
	public void splitIntoComponents(String eqSide) {
		
	}
	
	/******************************************************
	 * Getters and Setters
	 * 
	 * 
	 * 
	 * 
	 * 
	 ******************************************************/

	public ArrayList<EquationComponent> getComponents() {
		return components;
	}

	public void setComponents(ArrayList<EquationComponent> components) {
		this.components = components;
	}
	
}