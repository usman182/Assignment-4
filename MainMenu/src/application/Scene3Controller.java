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

public class Scene3Controller implements Initializable{

    @FXML
    private ChoiceBox<String> myChoiceBox1;

    @FXML
    private ChoiceBox<String> myChoiceBox2;
    
    private String[] BMI1 = {"Weight"};
    private String[] BMI2 = {"Height"};

    @FXML
    private Label myLabel1;

    @FXML
    private Label myLabel2;

    @FXML
    private TextField myTextField1;

    @FXML
    private TextField myTextField2;
    
    String weight, height;

    @FXML
    void calculate(ActionEvent event) {
    	weight = myTextField1.getText();
    	height = myTextField2.getText();

    	// first we need to convert the height into meter square
    	double conversion = Integer.parseInt(height) / 100.0;
    	double result = Integer.parseInt(weight) / (conversion*conversion);
    	
    	DecimalFormat df = new DecimalFormat("#.#");
		df.setRoundingMode(RoundingMode.CEILING);
		String Finalresult = df.format(result);
    
    	myLabel1.setText(String.valueOf(Finalresult));
    	
    	if (result >= 16.0 && result <= 18.5)
    	{
    		myLabel2.setText("Underweight");
    	}
    	
    	else if (result >= 18.6 && result <= 25.0)
    	{
    		myLabel2.setText("Normal");
    	}
    	
    	else if (result >= 25.1 && result <= 40.0)
    	{
    		myLabel2.setText("Overweight");
    	}
    }
    
    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		myChoiceBox1.getItems().addAll(BMI1);
		myChoiceBox2.getItems().addAll(BMI2);
		myChoiceBox1.setOnAction(this::getBMI1);
		myChoiceBox2.setOnAction(this::getBMI2);
	}
	
	public void getBMI1(ActionEvent event) {
		String bmi1 = myChoiceBox1.getValue();
		//myTextField1.setText(bmi1);
		
	}
	
	public void getBMI2(ActionEvent event) {
		String bmi2 = myChoiceBox1.getValue();
		//myTextField2.setText(bmi2);	
	}

}
