import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController{

	private CalculatorView view;
	private CalculatorModel model;

	CalculatorController(CalculatorView view, CalculatorModel model){

	this.view=view;
	this.model=model;

	this.view.buttonListener(new Listener());

	}

	class Listener implements ActionListener{
		
	public void actionPerformed(ActionEvent arg0){
	
	int num1,num2=0;

	try{
			num1=view.getNum1();
			num2=view.getNum2();
		
			int result=num1+num2;
			
			model.setResult(result);

			view.setSolution(model.getResult());

		}
catch(Exception e){
	view.displayErrorMessage(e.getMessage());;
}

	}


	}






}
