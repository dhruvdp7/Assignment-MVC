import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorView extends JFrame{

	private JTextField num1=new JTextField(10);
	private JLabel addLabel=new JLabel("+");
	private JTextField num2=new JTextField(10);
	private JButton addButton=new JButton("ok");
	private JTextField solution=new JTextField(10);

	CalculatorView(){

	JPanel panel=new JPanel();

	//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(600,200);
	panel.add(num1);
	panel.add(addLabel);
	panel.add(num2);
	panel.add(addButton);
	panel.add(solution);

	this.add(panel);
	}
	
	public int getNum1(){
		
		return Integer.parseInt(num1.getText());

	}

	public int getNum2(){
		
		return Integer.parseInt(num2.getText());
	}

	//public int getSolution(){
		//return Integer.parseInt(solution.getText());

	//}
	public void setSolution(int result){
		solution.setText(Integer.toString(result));

	}

	void buttonListener(ActionListener listenForButton){
	addButton.addActionListener(listenForButton);
	
	}

	void displayErrorMessage(String errorMessage){
	JOptionPane.showMessageDialog(this,errorMessage);
	}
	

}