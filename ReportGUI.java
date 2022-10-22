import java.awt.event.*;
import java.awt.TextField; 
import java.awt.TextArea;
import java.awt.Frame;
import java.awt.Label;
import java.awt.FlowLayout;
import java.awt.Button;

public class ReportGUI implements ActionListener {
    TextArea ta;
    TextField tf;
    Label lbl;
    Button btn1, btn2, btn3;
    Frame frame;

    public ReportGUI () {
        frame = new Frame("Report Program");
        ta = new TextArea();
        tf = new TextField(20);
        lbl = new Label();

        frame.setLayout( new FlowLayout() );
        frame.add(ta);
        frame.add(tf);
        /* 
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        */
        
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