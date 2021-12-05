package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Vector;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Scene4Controller {

    @FXML
    private DatePicker myDatePicker1;

    @FXML
    private DatePicker myDatePicker2;

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
    private Label myLabel6;

    @FXML
    private TextField myTextField1;

    @FXML
    private TextField myTextField2;

    @FXML
    private TextField myTextField3;

    @FXML
    private TextField myTextField4;

    @FXML
    private TextField myTextField5;

    @FXML
    private TextField myTextField6;

    private int count1 = 0;
    private int count2 = 0;

    @FXML
    void calculate(ActionEvent event) {
    	
    	LocalDate myDate1 = myDatePicker1.getValue();
    	String myFormattedDate1 = myDate1.format(DateTimeFormatter.ofPattern("MMM-dd-yyyy"));
    	
    	
    	
    	// now we will tekenize the date of birth
    	Vector vector = new Vector();
    	String[] wordsDeliminator = new String[500];
    	String[] storeWords = new String[500];
    	int queryCounter=0;
    	wordsDeliminator = myFormattedDate1.split("-");
    	
    	for (String w : wordsDeliminator)
    	{
    		vector.add(w);
    		storeWords[queryCounter] = w;
    		//System.out.println(storeWords[queryCounter]);
    		queryCounter++;
    	}
    	
    	if (storeWords[0].equals("Jan"))
    	{
    		count1 = 0;
    	}
    	else if (storeWords[0].equals("Feb"))
    	{
    		count1 = 1;
    	}
    	else if (storeWords[0].equals("Mar"))
    	{
    		count1 = 2;
    	}
    	else if (storeWords[0].equals("Apr"))
    	{
    		count1 = 3;
    	}
    	else if (storeWords[0].equals("May"))
    	{
    		count1 = 4;
    	}
    	else if (storeWords[0].equals("Jun"))
    	{
    		count1 = 5;
    	}
    	else if (storeWords[0].equals("Jul"))
    	{
    		count1 = 6;
    	}
    	else if (storeWords[0].equals("Aug"))
    	{
    		count1 = 7;	
    	}
    	else if (storeWords[0].equals("Sep"))
    	{
    		count1 = 8;
    	}
    	else if (storeWords[0].equals("Oct"))
    	{
    		count1 = 9;
    	}
    	else if (storeWords[0].equals("Nov"))
    	{
    		count1 = 10;
    	}
    	else if (storeWords[0].equals("Dec"))
    	{
    		count1 = 11;
    	}
    	
    	LocalDate myDate2 = myDatePicker2.getValue();
    	String myFormattedDate2 = myDate2.format(DateTimeFormatter.ofPattern("MMM-dd-yyyy"));
    	
    	// now we will tekenize todays date
    	Vector vector2 = new Vector();
    	String[] wordsDeliminator2 = new String[500];
    	String[] storeWords2 = new String[500];
    	int queryCounter2=0;
    	wordsDeliminator2 = myFormattedDate2.split("-");
    	
    	for (String w : wordsDeliminator2)
    	{
    		vector.add(w);
    		storeWords2[queryCounter2] = w;
    		//System.out.println(storeWords2[queryCounter2]);
    		queryCounter2++;
    	}	
    	
    	if (storeWords2[0].equals("Jan"))
    	{
    		count2 = 0;
    	}
    	else if (storeWords2[0].equals("Feb"))
    	{
    		count2 = 1;
    	}
    	else if (storeWords2[0].equals("Mar"))
    	{
    		count2 = 2;
    	}
    	else if (storeWords2[0].equals("Apr"))
    	{
    		count2 = 3;
    	}
    	else if (storeWords2[0].equals("May"))
    	{
    		count2 = 4;
    	}
    	else if (storeWords2[0].equals("Jun"))
    	{
    		count2 = 5;
    	}
    	else if (storeWords2[0].equals("Jul"))
    	{
    		count2 = 6;
    	}
    	else if (storeWords2[0].equals("Aug"))
    	{
    		count2 = 7;	
    	}
    	else if (storeWords2[0].equals("Sep"))
    	{
    		count2 = 8;
    	}
    	else if (storeWords2[0].equals("Oct"))
    	{
    		count2 = 9;
    	}
    	else if (storeWords2[0].equals("Nov"))
    	{
    		count2 = 10;
    	}
    	else if (storeWords2[0].equals("Dec"))
    	{
    		count2 = 11;
    	}
    	
    	//System.out.println("Count 1 is : " + count1);
    	//System.out.println("Count 2 is : " + count2);
    	int todaysYear = Integer.parseInt(storeWords2[2]);
    	int dateOfBirthYear = Integer.parseInt(storeWords[2]);
    	
    	int years = todaysYear - dateOfBirthYear;
    	myLabel1.setText(String.valueOf(years));
    	
    	int todaysMonth = count2;
    	int dateOfBirthMonth = count1;
    	
    	double months = todaysMonth - dateOfBirthMonth;
    	myLabel3.setText(String.valueOf(Math.abs(months)));
    	
    	int todaysDay = Integer.parseInt(storeWords2[1]);
    	int dateOfBirthDay = Integer.parseInt(storeWords[1]);
    	
    	double days = todaysDay - dateOfBirthDay;
    	myLabel4.setText(String.valueOf(Math.abs(days)));
    	
    	// now we have to calculate the next birthday
    	int nextMonthsCounter=0;
    	for (int i=0; i<count1; i++)
    	{
    		
    		if (count1 == count2)
    		{
    			System.out.println("Next month is: " + storeWords2[0]);
    			break;
    		}
    		else
    		{
    			count2++;
    			nextMonthsCounter++;
    		}
    		
    		if (count2 == 11)
    		{
    			count2 = 0;
    		}    		
    	}
    		nextMonthsCounter++;
    		myLabel5.setText(String.valueOf(nextMonthsCounter));
    		myTextField1.setText(String.valueOf(years));
    		int overallMonths = (years * 12) + (int)months;
    		myTextField2.setText(String.valueOf(overallMonths));
    		
    		int weeks = (years*365) + ((4*(int)months)*7) + ((int)days+((int)months*3));
    		weeks /= 7;
    		myTextField3.setText(String.valueOf(Math.round(weeks)));
    		
    		double overallDays = ((days/30) + months)/12;
    		
    		overallDays = (Math.round(overallDays) + years) * 365;
    		System.out.println(overallDays);
    		System.out.println(overallDays);
    		overallDays = overallDays + (years/4);
    		System.out.println(overallDays);
    		//int overallDays = (years * 365) + (months * 30) + days;
    		myTextField4.setText(String.valueOf(Math.round(overallDays)));
    		
    		int overallHours = (int)overallDays * 24;
    		myTextField5.setText(String.valueOf(overallHours));
    		
    		int overallMinutes = overallHours * 60;
    		myTextField6.setText(String.valueOf(overallMinutes));
    }
    

}
