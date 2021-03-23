
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/*
Write a program that converts US dollars into Canadian dollars, as shown in the following figure. 
The program let the user enter an amount in US dollars and display it equivalent value in Canadian dollars when clicking the Convert button. 
One dollar is 1.5 Canadian dollars.
Date: 3/22/21
*/

public class Conversion extends Application {

    //Create Textfield & Button
    protected TextField USDollars = new TextField();
	protected TextField CanadianDollars = new TextField();
        protected Button Convert = new Button("Convert");
    
    @Override
    public void start(Stage primaryStage) throws Exception {
       
            //Styling for Button and Textfields
                USDollars.setStyle("-fx-border-color: LIGHTBLUE");
                USDollars.setPrefWidth(275);
                USDollars.setMaxWidth(275);
                CanadianDollars.setStyle("-fx-border-color: LIGHTBLUE");
                Convert.setStyle("-fx-border-color: LIGHTBLUE");
                
        //Create Pane
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER_LEFT);
        pane.add(new Label("US Dollars"), 0, 0);
        pane.add(USDollars, 1, 0);
        pane.add(new Label("Canadian Dollars"), 0, 1);
	pane.add(CanadianDollars, 1, 1);
        pane.add(Convert, 1, 2);
        
        
        // Functioning Button
        Convert.setOnMousePressed(e -> {
          
            if(!USDollars.getText().equals("")){
                double Dollars = Double.parseDouble(USDollars.getText());
                double CDollars = Dollars * 1.5;
                CanadianDollars.setText("" + CDollars);
            }
      
        });
        
        
         // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 375, 125);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Convert US Dollars to Canadian Dollars");
        primaryStage.show();
        
        
    }
    
        public static void main(String[] args) {
        Application.launch(args);
    }
           
        }
    

    
          
        
