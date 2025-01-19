package login;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;  // Correct import here
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;


public class LoginPage  extends Application  {
	Text Username = new Text("Username:");
	TextField usernameField = new TextField();
	Text Password = new Text("Password:");
	PasswordField passwordField = new PasswordField();
	Button login = new Button("Login");
	
	public static void main(String[] args){
		//System.out.println("r");
			launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Login Page");
        GridPane gridPane = new GridPane();
        gridPane.add(Username, 0, 0);
        gridPane.add(Password, 0, 1);
        gridPane.add(usernameField, 1, 0);
        gridPane.add(passwordField, 1, 1);
        gridPane.add(login, 1, 2);

        
        Scene scene = new Scene(gridPane, 300,250);
 		primaryStage.setScene(scene);
    	primaryStage.show();

		
	}
	
	
	
}
