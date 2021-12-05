package application;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class Scene2Controller {
	private String s1 = "hello";	
	boolean flag = false;
	
	@FXML
	private Label myLabel;

    @FXML
    private TextField myTextField1;
    
    @FXML
    private TextField myTextField2;
    
    @FXML
    private TextField myTextField3;
    
    @FXML
    private TextField myTextField4;
    
    

    //@FXML
    private Text savedNumbers;

    private String firstNumber = "";

    private String currentNumber = "";
    private String currentNumber2 = "";

    private String calculationType;
    
    
    
    @FXML
    public void calculateDiscount(ActionEvent event)
    {
    	String originalPrice = myTextField1.getText();
    	String discount = myTextField2.getText();
    	
    	int originalPriceInInt = Integer.parseInt(originalPrice);
    	int discountInInt = Integer.parseInt(discount);
    	
    	int result = originalPriceInInt - (originalPriceInInt*discountInInt/100);
    	myTextField3.setText(String.valueOf(result));
    	myTextField4.setText("You saved " + String.valueOf(discountInInt));
    }
    
    @FXML
    public void writebutton1(ActionEvent event)
    {
    	myTextField2.setText("2");
    }
    
    @FXML
    public void calculate(ActionEvent event) {
        int firstNumberInt = Integer.parseInt(firstNumber);
        int secondNumberInt = Integer.parseInt(currentNumber);

        switch (calculationType) {
            case "+" -> {
                int calculatedNumber = firstNumberInt + secondNumberInt;
                savedNumbers.setText(firstNumber + " + " + currentNumber + " = " + calculatedNumber);
                myTextField1.setText(String.valueOf(calculatedNumber));
            }
            case "-" -> {
                int calculatedNumber = firstNumberInt - secondNumberInt;
                savedNumbers.setText(firstNumber + " - " + currentNumber + " = " + calculatedNumber);
                myTextField1.setText(String.valueOf(calculatedNumber));
            }
            case "/" -> {
                double calculatedNumber = firstNumberInt / (double)secondNumberInt;
                savedNumbers.setText(firstNumber + " / " + currentNumber + " = " + calculatedNumber);
                myTextField1.setText(String.valueOf(calculatedNumber));
            }
            case "*" -> {
                int calculatedNumber = firstNumberInt * secondNumberInt;
                savedNumbers.setText(firstNumber + " * " + currentNumber + " = " + calculatedNumber);
                myTextField1.setText(String.valueOf(calculatedNumber));
            }
        }
    }

    

    public void calculationSetup(String calculationType){
        this.calculationType = calculationType;
        firstNumber = currentNumber;
        currentNumber = "";
        savedNumbers.setText(firstNumber + " " + calculationType);
    }

   

    @FXML
    void clearTextField(ActionEvent event) {
        currentNumber = "";
        myTextField1.setText("");
        savedNumbers.setText("");
    }

    @FXML
    void button0Clicked(ActionEvent event) {
        if(!currentNumber.equals("")){
            addNumber("0");
        }
    }

    @FXML
    void button1Clicked(ActionEvent event) {
        addNumber("1");
    }

    @FXML
    void button2Clicked(ActionEvent event) {
        addNumber("2");
    }

    @FXML
    void button3Clicked(ActionEvent event) {
        addNumber("3");
    }

    @FXML
    void button4Clicked(ActionEvent event) {
        addNumber("4");
    }

    @FXML
    void button5Clicked(ActionEvent event) {
        addNumber("5");
    }

    @FXML
    void button6Clicked(ActionEvent event) {
        addNumber("6");
    }

    @FXML
    void button7Clicked(ActionEvent event) {
        addNumber("7");
    }

    @FXML
    void button8Clicked(ActionEvent event) {
        addNumber("8");
    }

    @FXML
    void button9Clicked(ActionEvent event) {
        addNumber("9");
    }

    public void updateTextField1(){
    	
    }

    public void addNumber(String number){
    			
    		if (flag == false)
    		{
    			
    		
    			if (myTextField2.getOnMousePressed() != null)
    			{
    				flag = true;
    			}
    			
    			
    			//flag = true;
    			
    			currentNumber += number;
    			myTextField1.setText(currentNumber);
    		}
    		else
    		{
    			currentNumber2 += number;
    			myTextField2.setText(currentNumber);
    		}
    }
}