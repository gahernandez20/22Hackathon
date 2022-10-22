import java.awt.event.*;
import java.awt.TextField; 
import java.awt.Frame;
import java.awt.Label;
import java.awt.FlowLayout;
import java.awt.Button;

public class ReportGUI implements ActionListener {
    
    TextField tf1, tf2, tf3;
    Label lbl1, lbl2, lbl3;
    Button btn1, btn2, btn3;
    Frame frame;

    public ReportGUI () {
        frame = new Frame("Report Program");
        
        tf1 = new TextField(20);
        tf2 = new TextField(20);
        tf3 = new TextField(20);
        lbl1 = new Label("Name");
        lbl2 = new Label("Age");
        lbl3 = new Label("Type of Report");

        frame.setLayout( new FlowLayout( FlowLayout.LEFT) );
        
        frame.add(lbl1);
        frame.add(tf1);
        frame.add(lbl2);
        frame.add(tf2);
        frame.add(lbl3);
        frame.add(tf3);
        
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            } 
        } );
        
        frame.setSize(600, 400);
        frame.setVisible(true);
    }

    public void actionPerformed( ActionEvent ae ) {

    }

    public static void main ( String[] args ) {
        try {
            new ReportGUI();
        } catch (Exception e ) {
            e.printStackTrace();
        }
    }
}