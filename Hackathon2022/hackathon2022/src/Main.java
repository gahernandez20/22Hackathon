import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class Main extends Application {
    TextField txfName, txfAge;
    Label lbl1, lbl2, lbl3, lbl4;

    public void start(Stage primaryStage ) {
        try {
            GridPane grdPane = createGUI();

            Scene scene = new Scene( grdPane, 480, 350 );

            primaryStage.setScene( scene );
            primaryStage.setTitle("Report Program");
            primaryStage.show();
            
        } catch( Exception e ) {
            e.printStackTrace();
        }
    }
    
    private GridPane createGUI() {

        GridPane grdPane = new GridPane();
        //Creates text field where user will type in
        lbl1 = new Label("Name:");
        txfName = new TextField();
        lbl2 = new Label("Age:");
        txfAge = new TextField();
        
        grdPane.add(lbl1, 0, 0);
        grdPane.add(txfName, 0, 1);
        grdPane.add(lbl2, 1, 0);
        grdPane.add(txfAge, 1, 1);

        return grdPane;
    }

    public static void main (String[] args) {

    }
}