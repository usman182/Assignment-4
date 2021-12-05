package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Scene7Controller {
	
	@FXML
    private Label myLabel, myLabel2;

    @FXML
    private TextField TextField1;

    @FXML
    private TextField TextField2;

    @FXML
    private TextField TextField3;

    @FXML
    private TextField TextField4;
    
    
    
    public void displayTextField1(String duration)
    {
    	myLabel.setText(duration);
    }
    
    public void displayTextField2(String result)
    {
    	myLabel2.setText(result);
    }
    
    public void displayTextField3(String result)
    {
    	TextField3.setText(result);
    }
    
    public void displayTextField4(String result)
    {
    	TextField4.setText(result);
    }
    
    

}
