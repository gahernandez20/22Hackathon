package prob3;

import java.awt.event.*;
import java.awt.TextField; 
import java.awt.Frame;
import java.awt.Label;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.TextArea;


public class ReportGUI {
    
    //Declare GUI component variables
    PersonHandler personHandler = new PersonHandler();
    TextField tf1, tf2, tf3, tf4;
    TextArea txaMessage;
    Label lbl1, lbl2, lbl3, lbl4, lbl5, lblPainScale, lblPainScale1, lblPainScale2, lblPainScale3;
    CheckboxGroup painType;
    Checkbox typePain1, typePain2, typePain3; 
    Button submitButton;
    Frame frame;

    public ReportGUI () {
        
        //Initialize GUI variables
        frame = new Frame("Report Program");
        tf1 = new TextField(20);
        tf2 = new TextField(20);
        tf3 = new TextField();
        lbl1 = new Label("Name:");
        lbl2 = new Label("Age:");
        lbl3 = new Label("Pain level:");
        lbl4 = new Label("Type of Report:");
        lbl5 = new Label("Description of Report:");
        lblPainScale = new Label("Pain Scale: ");
        lblPainScale1 = new Label("1 - Pain is barely noticable");
        lblPainScale2 = new Label("5 - Pain is very distracting and stops me from participating in normal activities");
        lblPainScale3 = new Label("10 - Pain is severe enough where I cannot move");
        
        painType = new CheckboxGroup();
        typePain1 = new Checkbox("Pain", false, painType);
        typePain2 = new Checkbox("Drowiness", false, painType);
        typePain3 = new Checkbox("Mental Health Condition", false, painType);
        submitButton = new Button("Submit Report");
        txaMessage = new TextArea();

        //Create elements of GUI
        frame.setLayout( null );
        addButtonListener();
        createPositionsForComponents();
        addComponentsToGUI();
        
        //Ensures window opened is closed when red X is pressed
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            } 
        } );
        
        //Displays GUI
        frame.setSize(600, 400);
        frame.setVisible(true);
    }

    //Function that adds an eventhandler for the "submit button" that will create Person object and
    //  a Report object based on info entered in GUI text boxes
    private void addButtonListener() {
        submitButton.addActionListener( new ActionListener() {
            public void actionPerformed( ActionEvent ae ) {
                Report report = null;
                Person patient = new Person(tf1.getText(), Integer.parseInt(tf2.getText()));
                
                if( painType.getSelectedCheckbox().getLabel().equals("Pain")) {
                    report = new Pain(Integer.parseInt(tf3.getText()), txaMessage.getText() );
                } 
                else if ( painType.getSelectedCheckbox().getLabel().equals("Drowsiness")) {
                    report = new Drowsiness(Integer.parseInt(tf3.getText()), txaMessage.getText() );
                }
                else if ( painType.getSelectedCheckbox().getLabel().equals("Mental Health Condition") ) {
                    report = new MentalHealth(Integer.parseInt(tf3.getText()), txaMessage.getText() );
                }
                
                patient.addRep(report);
                personHandler.addPerson(patient);
                personHandler.writeReportRecord( patient.getID() );
                clearText();
            }
        } );

    }

    //Method that will size the components of GUI and set their positions
    private void createPositionsForComponents() {

        lbl1.setBounds(20, 40, 40, 30);
        tf1.setBounds(175, 40, 150, 30);
        lbl2.setBounds(20, 75, 40, 30);
        tf2.setBounds(175, 75, 150, 30);
        lbl3.setBounds(20, 110, 100, 30);
        tf3.setBounds(175, 110, 150, 30);
        lbl4.setBounds(20, 145, 120, 30);
        typePain1.setBounds(175, 145, 60, 30);
        typePain2.setBounds(240, 145, 100, 30);
        typePain3.setBounds(345, 145, 190, 30);
        lbl5.setBounds(20, 180, 150, 30);
        lblPainScale.setBounds(350, 40, 200, 30);
        lblPainScale1.setBounds(350, 75, 200, 30);
        lblPainScale3.setBounds(350, 105, 400, 30);
        submitButton.setBounds(225, 365, 120, 30);
        txaMessage.setBounds(20, 215, 500, 150);

    }

    //Method that will add all components to GUI 
    private void addComponentsToGUI() {

        frame.add(lbl1);
        frame.add(tf1);
        frame.add(lbl2);
        frame.add(tf2);
        frame.add(lbl3);
        frame.add(tf3);
        frame.add(lbl4);
        frame.add(typePain1);
        frame.add(typePain2);
        frame.add(typePain3);
        frame.add(lbl5);
        frame.add(lblPainScale);
        frame.add(lblPainScale1);
        frame.add(lblPainScale3);
        frame.add(txaMessage);
        frame.add(submitButton);

    }

    private void clearText() {
        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
        txaMessage.setText("");
        typePain1.setState(false);
        typePain2.setState(false);
        typePain3.setState(false);
    }

    public static void main ( String[] args ) {
        try {
            new ReportGUI();
        } catch (Exception e ) {
            e.printStackTrace();
        }
    }
}