package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class Scene5AController 
{

    @FXML
    private TextField textField;

    @FXML
    private Text savedNumbers;

    private String firstNumber = "";

    private String currentNumber = "";

    private String calculationType;
    
    
    // Butting (0-9) pressing functions
    
    @FXML
    void button0Clicked(ActionEvent event) 
    {
            addNumber("0");
    }

    @FXML
    void button1Clicked(ActionEvent event) 
    {
        addNumber("1");
    }

    @FXML
    void button2Clicked(ActionEvent event) 
    {
        addNumber("2");
    }

    @FXML
    void button3Clicked(ActionEvent event) 
    {
        addNumber("3");
    }

    @FXML
    void button4Clicked(ActionEvent event) 
    {
        addNumber("4");
    }

    @FXML
    void button5Clicked(ActionEvent event) 
    {
        addNumber("5");
    }

    @FXML
    void button6Clicked(ActionEvent event) 
    {
        addNumber("6");
    }

    @FXML
    void button7Clicked(ActionEvent event) 
    {
        addNumber("7");
    }

    @FXML
    void button8Clicked(ActionEvent event) 
    {
        addNumber("8");
    }

    @FXML
    void button9Clicked(ActionEvent event) 
    {
        addNumber("9");
    }
    
    public void addNumber(String number)
    {
        currentNumber += number;
        textField.setText(currentNumber);
    }
    
    

    @FXML
    void addAction(ActionEvent event) 
    {
        calculationSetup("+");
    }

    @FXML
    void minusAction(ActionEvent event) 
    {
        calculationSetup("-");
    }

    @FXML
    void multiplicationAction(ActionEvent event) 
    {
        calculationSetup("*");
    }
    
    @FXML
    void divideAction(ActionEvent event) 
    {
        calculationSetup("/");
    }
    
    
    @FXML
    void modulusAction(ActionEvent event) 
    {
        calculationSetup("%");
    }
    
    public void calculationSetup(String calculationType)
    {
        this.calculationType = calculationType;
        firstNumber = currentNumber;
        currentNumber = "";
        savedNumbers.setText(firstNumber + " " + calculationType);
    }
    

    @FXML
    void calculate(ActionEvent event) 
    {
        int firstNumberInt = Integer.parseInt(firstNumber);
        int secondNumberInt = Integer.parseInt(currentNumber);
        
        if (this.calculationType == "+")
        {
        		int calculatedNumber = firstNumberInt + secondNumberInt;
        		savedNumbers.setText(firstNumber + " + " + currentNumber + " = " + calculatedNumber);
        		textField.setText(String.valueOf(calculatedNumber));
        }

        else if (this.calculationType == "-")
        {
                int calculatedNumber = firstNumberInt - secondNumberInt;
                savedNumbers.setText(firstNumber + " - " + currentNumber + " = " + calculatedNumber);
                textField.setText(String.valueOf(calculatedNumber));
        }
        
        else if (this.calculationType == "*")
        {
                int calculatedNumber = firstNumberInt * secondNumberInt;
                savedNumbers.setText(firstNumber + " * " + currentNumber + " = " + calculatedNumber);
                textField.setText(String.valueOf(calculatedNumber));
        }
        
        else if (this.calculationType == "/")
        {
                int calculatedNumber = firstNumberInt / secondNumberInt;
                savedNumbers.setText(firstNumber + " / " + currentNumber + " = " + calculatedNumber);
                textField.setText(String.valueOf(calculatedNumber));
        }
        
        else if (this.calculationType == "%")
        {
                int calculatedNumber = firstNumberInt - secondNumberInt;
                savedNumbers.setText(firstNumber + " % " + currentNumber + " = " + calculatedNumber);
                textField.setText(String.valueOf(calculatedNumber));
        }
            
        
    }

    @FXML
    void clearTextField(ActionEvent event) 
    {
        currentNumber = "";
        textField.setText("");
        savedNumbers.setText("");
    }

}