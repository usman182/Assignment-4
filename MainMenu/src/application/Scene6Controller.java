package application;

import java.io.IOException;
import java.util.Vector;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class Scene6Controller {

    @FXML
    private ToggleGroup investment;

    @FXML
    private TextField myTextField1;

    @FXML
    private TextField myTextField2;

    @FXML
    private TextField myTextField3;
    
    @FXML
    private Label durationLabel;
    
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public void submit(ActionEvent event) throws IOException {
    	//System.out.println(myTextField1.getText());
    	//System.out.println(myTextField2.getText());
    	//System.out.println(durationLabel.getText());
    	
    	String duration = durationLabel.getText();
    	System.out.println(duration);
    	
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("ResultofInvestment.fxml"));
    	root = loader.load();
    	
    	Scene7Controller scene7controller = loader.getController();
    	scene7controller.displayTextField1(duration);
    	
    	String amount = myTextField1.getText();
    	String annualRate = myTextField2.getText();
    	String durationPeriod = durationLabel.getText();
    	
    	// now we will tekenize the duration period
    	Vector vector = new Vector();
    	String[] wordsDeliminator = new String[500];
    	String[] storeWords = new String[500];
    	int queryCounter=0;
    	wordsDeliminator = durationPeriod.split(" ");
    	
    	for (String w : wordsDeliminator)
    	{
    		vector.add(w);
    		storeWords[queryCounter] = w;
    		System.out.println(storeWords[queryCounter]);
    		queryCounter++;
    	}
    	
    	String[] storeNumbers = new String[10];
    	for (int i=0; i<queryCounter; i+=2)
    	{
    		storeNumbers[i] = storeWords[i];
    	}
    	int year = Integer.parseInt(storeNumbers[0]);
    	int month = Integer.parseInt(storeNumbers[2]);
    	double amountofInvestment = Integer.parseInt(amount);
    	System.out.println("Amount of interest: " + amountofInvestment);
    	double annualRateofInvestment = Integer.parseInt(annualRate);
    	System.out.println("Annual rate of investment: " + annualRateofInvestment);
    	
    	// now loop will run till the years time
    	boolean flag1=true;
    	boolean flag2=true;
    	double res0=0;
    	double res1=0;
    	double result = amountofInvestment;
    	//double result2 = 0;
    	for (int i=0; i<year; i++)
    	{
    		double result2 = result * (annualRateofInvestment/100);
    		double answer = result2 + result; 
    		result = answer;
    		
    		
    	}
    	scene7controller.displayTextField1(durationPeriod);
    	scene7controller.displayTextField2(String.valueOf(result));
    	scene7controller.displayTextField3(String.valueOf(amountofInvestment));
    	scene7controller.displayTextField4(String.valueOf(result));
    	
    	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	scene = new Scene(root);
    	stage.setScene(scene);
    	stage.show();
    }

}
