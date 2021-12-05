package application;

import java.math.RoundingMode;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Scene5Controller implements Initializable{

    @FXML
    private ChoiceBox<String> myChoiceBox1;

    @FXML
    private ChoiceBox<String> myChoiceBox2;

    @FXML
    private ChoiceBox<String> myChoiceBox3;
    
    private String[] currency1 = {"PKR", "USD", "EUR"};
    private String[] currency2 = {"PKR", "USD", "EUR"};
    private String[] currency3 = {"PKR", "USD", "EUR"};
    double conversion=0;

    @FXML
    private Label myLabel1;

    @FXML
    private Label myLabel2;

    @FXML
    private Label myLabel3;

    @FXML
    private Label myLabel4;

    @FXML
    private Label myLabel5;

    @FXML
    private TextField myTextField1;

    @FXML
    private Text savedNumbers;
    
    String currentNumber = "";

    @FXML
    void button0Clicked(ActionEvent event) {
    	currentNumber += "0";
    	myTextField1.setText(currentNumber);
    	
    }

    @FXML
    void button1Clicked(ActionEvent event) {
    	currentNumber += "1";
    	myTextField1.setText(currentNumber);
    }

    @FXML
    void button2Clicked(ActionEvent event) {
    	currentNumber += "2";
    	myTextField1.setText(currentNumber);
    }

    @FXML
    void button3Clicked(ActionEvent event) {
    	currentNumber += "3";
    	myTextField1.setText(currentNumber);
    }

    @FXML
    void button4Clicked(ActionEvent event) {
    	currentNumber += "4";
    	myTextField1.setText(currentNumber);
    }

    @FXML
    void button5Clicked(ActionEvent event) {
    	currentNumber += "5";
    	myTextField1.setText(currentNumber);
    }

    @FXML
    void button6Clicked(ActionEvent event) {
    	currentNumber += "6";
    	myTextField1.setText(currentNumber);
    }

    @FXML
    void button7Clicked(ActionEvent event) {
    	currentNumber += "7";
    	myTextField1.setText(currentNumber);
    }

    @FXML
    void button8Clicked(ActionEvent event) {
    	currentNumber += "8";
    	myTextField1.setText(currentNumber);
    }

    @FXML
    void button9Clicked(ActionEvent event) {
    	currentNumber += "9";
    	myTextField1.setText(currentNumber);
    }

    @FXML
    void calculate(ActionEvent event) {

    }

    @FXML
    void clearTextField(ActionEvent event) {
    	myTextField1.setText(null);
    	myLabel1.setText("cleared");
    	myLabel2.setText("cleared");
    	myLabel3.setText("cleared");
    	myLabel4.setText("cleared");
    	myLabel5.setText("cleared");
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		myChoiceBox1.getItems().addAll(currency1);
		myChoiceBox2.getItems().addAll(currency2);
		myChoiceBox3.getItems().addAll(currency3);
		myChoiceBox1.setOnAction(this::getCurrency1);
		myChoiceBox2.setOnAction(this::getCurrency2);
		myChoiceBox3.setOnAction(this::getCurrency3);
	}
	
	public void getCurrency1(ActionEvent event) {
		String currency1 = myChoiceBox1.getValue();
		String fullNameOfCurrency1 = "";
		if (currency1 == "PKR")
		{
			fullNameOfCurrency1 = "Pakistani rupee";
		}
		else if (currency1 == "USD")
		{
			fullNameOfCurrency1 = "United States dollar";
		}
		else if (currency1 == "EUR")
		{
			fullNameOfCurrency1 = "Euro";
		}
		myLabel1.setText(fullNameOfCurrency1);
		
		
	}
	
	public void getCurrency2(ActionEvent event) {
		String currency1 = myChoiceBox2.getValue();
		String fullNameOfCurrency1 = "";
		if (currency1 == "PKR")
		{
			conversion = Integer.parseInt(myTextField1.getText());
			fullNameOfCurrency1 = "Pakistani rupee";
		}
		else if (currency1 == "USD")
		{
			conversion = Integer.parseInt(myTextField1.getText()) / 175.347;
			fullNameOfCurrency1 = "United States dollar";
		}
		else if (currency1 == "EUR")
		{
			conversion = Integer.parseInt(myTextField1.getText()) / 199.002;
			fullNameOfCurrency1 = "Euro";
		}
		myLabel3.setText(fullNameOfCurrency1);
		
		DecimalFormat df = new DecimalFormat("#.####");
		df.setRoundingMode(RoundingMode.CEILING);
		String result = df.format(conversion);
		myLabel2.setText(result);
		
		
	}
	
	public void getCurrency3(ActionEvent event) {
		String currency1 = myChoiceBox3.getValue();
		String fullNameOfCurrency1 = "";
		if (currency1 == "PKR")
		{
			conversion = Integer.parseInt(myTextField1.getText());
			fullNameOfCurrency1 = "Pakistani rupee";
		}
		else if (currency1 == "USD")
		{
			conversion = Integer.parseInt(myTextField1.getText()) / 175.347;
			fullNameOfCurrency1 = "United States dollar";
		}
		else if (currency1 == "EUR")
		{
			conversion = Integer.parseInt(myTextField1.getText()) / 199.002;
			fullNameOfCurrency1 = "Euro";
		}
		myLabel5.setText(fullNameOfCurrency1);
		
		DecimalFormat df = new DecimalFormat("#.####");
		df.setRoundingMode(RoundingMode.CEILING);
		String result = df.format(conversion);
		myLabel4.setText(result);
		
		
	}
	
	@FXML
	public void decreaseTextField(ActionEvent event) {
	
		/*int result2 = currentNumber.lastIndexOf(0);
		String finalResult = String.valueOf(result2);
		finalResult = null;
		//int result = Integer.parseInt(currentNumber)-1;
		myTextField1.setText(String.valueOf(result));*/
	}

}
