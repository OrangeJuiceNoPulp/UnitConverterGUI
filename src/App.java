import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

import convert.UnitConverter;


public class App extends Application {
    private int currentIndex;
    private Label lblOutput = new Label();
    private boolean sciNot = true;

    // Displays the converted value
    public void displayConversion(TextField tfInput, ToggleGroup grpIn, ToggleGroup grpOut){
        RadioButton rdo1 = (RadioButton) grpIn.getSelectedToggle();
        RadioButton rdo2 = (RadioButton) grpOut.getSelectedToggle();
        lblOutput.setText(UnitConverter.convertUnits(tfInput.getText(), rdo1.getText(), rdo2.getText(), sciNot));
    }

    
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    Label lblEnterStartingValue = new Label("Enter starting value:");
    TextField tfStartingValue = new TextField();
    lblOutput.setFont(new Font(16));

    HBox hBoxInput = new HBox(5);
    hBoxInput.getChildren().addAll(lblEnterStartingValue, tfStartingValue);
    hBoxInput.setAlignment(Pos.CENTER);

    HBox hBoxOutput = new HBox(10);
    hBoxOutput.getChildren().addAll(lblOutput);
    hBoxOutput.setAlignment(Pos.CENTER);
    
    // Radio buttons for starting value, mass
    ToggleGroup grpMassIn = new ToggleGroup();
    RadioButton rdo_mgIn = new RadioButton("mg");
    rdo_mgIn.setToggleGroup(grpMassIn);
    rdo_mgIn.setSelected(true);
    RadioButton rdo_gIn = new RadioButton("g");
    rdo_gIn.setToggleGroup(grpMassIn);
    RadioButton rdo_kgIn = new RadioButton("kg");
    rdo_kgIn.setToggleGroup(grpMassIn);
    RadioButton rdo_ozIn = new RadioButton("oz");
    rdo_ozIn.setToggleGroup(grpMassIn);
    RadioButton rdo_lbIn = new RadioButton("lb");
    rdo_lbIn.setToggleGroup(grpMassIn);
    
    VBox vBoxMassIn = new VBox(10);
    vBoxMassIn.getChildren().addAll(new Label("Select starting unit: "), rdo_mgIn, rdo_gIn, rdo_kgIn, rdo_ozIn, rdo_lbIn);
    vBoxMassIn.setAlignment(Pos.TOP_LEFT);

    // Radio buttons for desired value, mass
    ToggleGroup grpMassOut = new ToggleGroup();
    RadioButton rdo_mgOut = new RadioButton("mg");
    rdo_mgOut.setToggleGroup(grpMassOut);
    rdo_mgOut.setSelected(true);
    RadioButton rdo_gOut = new RadioButton("g");
    rdo_gOut.setToggleGroup(grpMassOut);
    RadioButton rdo_kgOut = new RadioButton("kg");
    rdo_kgOut.setToggleGroup(grpMassOut);
    RadioButton rdo_ozOut = new RadioButton("oz");
    rdo_ozOut.setToggleGroup(grpMassOut);
    RadioButton rdo_lbOut = new RadioButton("lb");
    rdo_lbOut.setToggleGroup(grpMassOut);

    VBox vBoxMassOut = new VBox(10);
    vBoxMassOut.getChildren().addAll(new Label("Select desired unit: "), rdo_mgOut, rdo_gOut, rdo_kgOut, rdo_ozOut, rdo_lbOut);
    vBoxMassOut.setAlignment(Pos.TOP_LEFT);

    // Radio buttons for starting value, length
    ToggleGroup grpLengthIn = new ToggleGroup();
    RadioButton rdo_mmIn = new RadioButton("mm");
    rdo_mmIn.setToggleGroup(grpLengthIn);
    rdo_mmIn.setSelected(true);
    RadioButton rdo_cmIn = new RadioButton("cm");
    rdo_cmIn.setToggleGroup(grpLengthIn);
    RadioButton rdo_mIn = new RadioButton("m");
    rdo_mIn.setToggleGroup(grpLengthIn);
    RadioButton rdo_kmIn = new RadioButton("km");
    rdo_kmIn.setToggleGroup(grpLengthIn);
    RadioButton rdo_inIn = new RadioButton("in");
    rdo_inIn.setToggleGroup(grpLengthIn);
    RadioButton rdo_ftIn = new RadioButton("ft");
    rdo_ftIn.setToggleGroup(grpLengthIn);
    RadioButton rdo_ydIn = new RadioButton("yd");
    rdo_ydIn.setToggleGroup(grpLengthIn);
    RadioButton rdo_miIn = new RadioButton("mi");
    rdo_miIn.setToggleGroup(grpLengthIn);

    VBox vBoxLengthIn = new VBox(10);
    vBoxLengthIn.getChildren().addAll(new Label("Select starting unit: "), rdo_mmIn, rdo_cmIn, rdo_mIn, rdo_kmIn, rdo_inIn, rdo_ftIn, rdo_ydIn, rdo_miIn);
    vBoxLengthIn.setAlignment(Pos.TOP_LEFT);

    // Radio buttons for desired value, length
    ToggleGroup grpLengthOut = new ToggleGroup();
    RadioButton rdo_mmOut = new RadioButton("mm");
    rdo_mmOut.setToggleGroup(grpLengthOut);
    rdo_mmOut.setSelected(true);
    RadioButton rdo_cmOut = new RadioButton("cm");
    rdo_cmOut.setToggleGroup(grpLengthOut);
    RadioButton rdo_mOut = new RadioButton("m");
    rdo_mOut.setToggleGroup(grpLengthOut);
    RadioButton rdo_kmOut = new RadioButton("km");
    rdo_kmOut.setToggleGroup(grpLengthOut);
    RadioButton rdo_inOut = new RadioButton("in");
    rdo_inOut.setToggleGroup(grpLengthOut);
    RadioButton rdo_ftOut = new RadioButton("ft");
    rdo_ftOut.setToggleGroup(grpLengthOut);
    RadioButton rdo_ydOut = new RadioButton("yd");
    rdo_ydOut.setToggleGroup(grpLengthOut);
    RadioButton rdo_miOut = new RadioButton("mi");
    rdo_miOut.setToggleGroup(grpLengthOut);

    VBox vBoxLengthOut = new VBox(10);
    vBoxLengthOut.getChildren().addAll(new Label("Select desired unit: "), rdo_mmOut, rdo_cmOut, rdo_mOut, rdo_kmOut, rdo_inOut, rdo_ftOut, rdo_ydOut, rdo_miOut);
    vBoxLengthOut.setAlignment(Pos.TOP_LEFT);





    // Radio buttons for starting value, temperature
    ToggleGroup grpTempIn = new ToggleGroup();
    RadioButton rdo_CIn = new RadioButton("C");
    rdo_CIn.setToggleGroup(grpTempIn);
    rdo_CIn.setSelected(true);
    RadioButton rdo_KIn = new RadioButton("F");
    rdo_KIn.setToggleGroup(grpTempIn);
    RadioButton rdo_FIn = new RadioButton("K");
    rdo_FIn.setToggleGroup(grpTempIn);

    VBox vBoxTempIn = new VBox(10);
    vBoxTempIn.getChildren().addAll(new Label("Select starting unit: "), rdo_CIn, rdo_KIn, rdo_FIn);
    vBoxTempIn.setAlignment(Pos.TOP_LEFT);



    // Radio buttons for desired value, temperature
    ToggleGroup grpTempOut = new ToggleGroup();
    RadioButton rdo_COut = new RadioButton("C");
    rdo_COut.setToggleGroup(grpTempOut);
    rdo_COut.setSelected(true);
    RadioButton rdo_KOut = new RadioButton("F");
    rdo_KOut.setToggleGroup(grpTempOut);
    RadioButton rdo_FOut = new RadioButton("K");
    rdo_FOut.setToggleGroup(grpTempOut);

    VBox vBoxTempOut = new VBox(10);
    vBoxTempOut.getChildren().addAll(new Label("Select desired unit: "), rdo_COut, rdo_KOut, rdo_FOut);
    vBoxTempOut.setAlignment(Pos.TOP_LEFT);


    // Radio buttons for starting value, time
    ToggleGroup grpTimeIn = new ToggleGroup();
    RadioButton rdo_msIn = new RadioButton("ms");
    rdo_msIn.setToggleGroup(grpTimeIn);
    rdo_msIn.setSelected(true);
    RadioButton rdo_sIn = new RadioButton("s");
    rdo_sIn.setToggleGroup(grpTimeIn);
    RadioButton rdo_minIn = new RadioButton("min");
    rdo_minIn.setToggleGroup(grpTimeIn);
    RadioButton rdo_hIn = new RadioButton("h");
    rdo_hIn.setToggleGroup(grpTimeIn);
    RadioButton rdo_dIn = new RadioButton("d");
    rdo_dIn.setToggleGroup(grpTimeIn);

    VBox vBoxTimeIn = new VBox(10);
    vBoxTimeIn.getChildren().addAll(new Label("Select starting unit: "), rdo_msIn, rdo_sIn, rdo_minIn, rdo_hIn, rdo_dIn);
    vBoxTimeIn.setAlignment(Pos.TOP_LEFT);


    // Radio buttons for desired value, time
    ToggleGroup grpTimeOut = new ToggleGroup();
    RadioButton rdo_msOut = new RadioButton("ms");
    rdo_msOut.setToggleGroup(grpTimeOut);
    rdo_msOut.setSelected(true);
    RadioButton rdo_sOut = new RadioButton("s");
    rdo_sOut.setToggleGroup(grpTimeOut);
    RadioButton rdo_minOut = new RadioButton("min");
    rdo_minOut.setToggleGroup(grpTimeOut);
    RadioButton rdo_hOut = new RadioButton("h");
    rdo_hOut.setToggleGroup(grpTimeOut);
    RadioButton rdo_dOut = new RadioButton("d");
    rdo_dOut.setToggleGroup(grpTimeOut);

    VBox vBoxTimeOut = new VBox(10);
    vBoxTimeOut.getChildren().addAll(new Label("Select desired unit: "), rdo_msOut, rdo_sOut, rdo_minOut, rdo_hOut, rdo_dOut);
    vBoxTimeOut.setAlignment(Pos.TOP_LEFT);



    // Radio buttons for notation of conversion when displayed
    ToggleGroup grpSciNotation = new ToggleGroup();
    RadioButton rdo_SciNotation = new RadioButton("Scientific Notation");
    rdo_SciNotation.setToggleGroup(grpSciNotation);
    rdo_SciNotation.setSelected(true);
    RadioButton rdo_Float = new RadioButton("Float Value");
    rdo_Float.setToggleGroup(grpSciNotation);

    // Options for dimensions which can have their units be converted
    ComboBox<String> cboDimensions = new ComboBox<>();
    ObservableList<String> items = FXCollections.observableArrayList
      ("Mass", "Length", "Temperature", "Time");
    cboDimensions.getItems().addAll(items);
    cboDimensions.setValue(items.get(0));

    VBox vBoxLeftDisplay = new VBox(30);
    vBoxLeftDisplay.getChildren().addAll(cboDimensions, rdo_Float, rdo_SciNotation);
    vBoxLeftDisplay.setAlignment(Pos.TOP_LEFT);

    // Create a pane to hold nodes 
    BorderPane pane = new BorderPane();
    pane.setTop(hBoxInput);
    pane.setBottom(hBoxOutput);
    pane.setLeft(vBoxLeftDisplay);
    pane.setCenter(vBoxMassIn);
    pane.setRight(vBoxMassOut);

    // Clears changes the displayed radio buttons and clears any input or output text
    cboDimensions.setOnAction(e -> {
      
        currentIndex = items.indexOf(cboDimensions.getValue());
        tfStartingValue.setText("");
        if(currentIndex == 0) {
            rdo_mgIn.setSelected(true);
            rdo_mgOut.setSelected(true);
            pane.setCenter(vBoxMassIn);
            pane.setRight(vBoxMassOut);
        }
        else if(currentIndex == 1) {
            rdo_mmIn.setSelected(true);
            rdo_mmOut.setSelected(true);
            pane.setCenter(vBoxLengthIn);
            pane.setRight(vBoxLengthOut);
        }
        else if(currentIndex == 2) {
            rdo_CIn.setSelected(true);
            rdo_COut.setSelected(true);
            pane.setCenter(vBoxTempIn);
            pane.setRight(vBoxTempOut);
        }
        else if(currentIndex == 3) {
            rdo_msIn.setSelected(true);
            rdo_msOut.setSelected(true);
            pane.setCenter(vBoxTimeIn);
            pane.setRight(vBoxTimeOut);
        }
        lblOutput.setText("");
    });


    // Display conversion when radio button is toggled, notation buttons
    rdo_SciNotation.setOnAction(e -> {
        RadioButton rdo1 = (RadioButton) grpSciNotation.getSelectedToggle();
        if (rdo1.getText().equals("Scientific Notation")) {
            sciNot = true;
        }
        else {
            sciNot = false;
        }
        if(currentIndex == 0) {
            displayConversion(tfStartingValue, grpMassIn, grpMassOut);
        }
        else if(currentIndex == 1) {
            displayConversion(tfStartingValue, grpLengthIn, grpLengthOut);
        }
        else if(currentIndex == 2) {
            displayConversion(tfStartingValue, grpTempIn, grpTempOut);
        }
        else if(currentIndex == 3) {
            displayConversion(tfStartingValue, grpTimeIn, grpTimeOut);
        }
    });
    rdo_Float.setOnAction(e -> {
        RadioButton rdo1 = (RadioButton) grpSciNotation.getSelectedToggle();
        if (rdo1.getText().equals("Scientific Notation")) {
            sciNot = true;
        }
        else {
            sciNot = false;
        }
        if(currentIndex == 0) {
            displayConversion(tfStartingValue, grpMassIn, grpMassOut);
        }
        else if(currentIndex == 1) {
            displayConversion(tfStartingValue, grpLengthIn, grpLengthOut);
        }
        else if(currentIndex == 2) {
            displayConversion(tfStartingValue, grpTempIn, grpTempOut);
        }
        else if(currentIndex == 3) {
            displayConversion(tfStartingValue, grpTimeIn, grpTimeOut);
        }
    });

    // Display conversion when radio button is toggled, mass
    rdo_mgIn.setOnAction(e -> {displayConversion(tfStartingValue, grpMassIn, grpMassOut);});
    rdo_gIn.setOnAction(e -> {displayConversion(tfStartingValue, grpMassIn, grpMassOut);});
    rdo_kgIn.setOnAction(e -> {displayConversion(tfStartingValue, grpMassIn, grpMassOut);});
    rdo_ozIn.setOnAction(e -> {displayConversion(tfStartingValue, grpMassIn, grpMassOut);});
    rdo_lbIn.setOnAction(e -> {displayConversion(tfStartingValue, grpMassIn, grpMassOut);});

    rdo_mgOut.setOnAction(e -> {displayConversion(tfStartingValue, grpMassIn, grpMassOut);});
    rdo_gOut.setOnAction(e -> {displayConversion(tfStartingValue, grpMassIn, grpMassOut);});
    rdo_kgOut.setOnAction(e -> {displayConversion(tfStartingValue, grpMassIn, grpMassOut);});
    rdo_ozOut.setOnAction(e -> {displayConversion(tfStartingValue, grpMassIn, grpMassOut);});
    rdo_lbOut.setOnAction(e -> {displayConversion(tfStartingValue, grpMassIn, grpMassOut);});

    // Display conversion when radio button is toggled, length
    rdo_mmIn.setOnAction(e -> {displayConversion(tfStartingValue, grpLengthIn, grpLengthOut);});
    rdo_cmIn.setOnAction(e -> {displayConversion(tfStartingValue, grpLengthIn, grpLengthOut);});
    rdo_mIn.setOnAction(e -> {displayConversion(tfStartingValue, grpLengthIn, grpLengthOut);});
    rdo_kmIn.setOnAction(e -> {displayConversion(tfStartingValue, grpLengthIn, grpLengthOut);});
    rdo_inIn.setOnAction(e -> {displayConversion(tfStartingValue, grpLengthIn, grpLengthOut);});
    rdo_ftIn.setOnAction(e -> {displayConversion(tfStartingValue, grpLengthIn, grpLengthOut);});
    rdo_ydIn.setOnAction(e -> {displayConversion(tfStartingValue, grpLengthIn, grpLengthOut);});
    rdo_miIn.setOnAction(e -> {displayConversion(tfStartingValue, grpLengthIn, grpLengthOut);});

    rdo_mmOut.setOnAction(e -> {displayConversion(tfStartingValue, grpLengthIn, grpLengthOut);});
    rdo_cmOut.setOnAction(e -> {displayConversion(tfStartingValue, grpLengthIn, grpLengthOut);});
    rdo_mOut.setOnAction(e -> {displayConversion(tfStartingValue, grpLengthIn, grpLengthOut);});
    rdo_kmOut.setOnAction(e -> {displayConversion(tfStartingValue, grpLengthIn, grpLengthOut);});
    rdo_inOut.setOnAction(e -> {displayConversion(tfStartingValue, grpLengthIn, grpLengthOut);});
    rdo_ftOut.setOnAction(e -> {displayConversion(tfStartingValue, grpLengthIn, grpLengthOut);});
    rdo_ydOut.setOnAction(e -> {displayConversion(tfStartingValue, grpLengthIn, grpLengthOut);});
    rdo_miOut.setOnAction(e -> {displayConversion(tfStartingValue, grpLengthIn, grpLengthOut);});


    // Display conversion when radio button is toggled, temperature
    rdo_CIn.setOnAction(e -> {displayConversion(tfStartingValue, grpTempIn, grpTempOut);});
    rdo_KIn.setOnAction(e -> {displayConversion(tfStartingValue, grpTempIn, grpTempOut);});
    rdo_FIn.setOnAction(e -> {displayConversion(tfStartingValue, grpTempIn, grpTempOut);});

    rdo_COut.setOnAction(e -> {displayConversion(tfStartingValue, grpTempIn, grpTempOut);});
    rdo_KOut.setOnAction(e -> {displayConversion(tfStartingValue, grpTempIn, grpTempOut);});
    rdo_FOut.setOnAction(e -> {displayConversion(tfStartingValue, grpTempIn, grpTempOut);});

    
    // Display conversion when radio button is toggled, time
    rdo_msIn.setOnAction(e -> {displayConversion(tfStartingValue, grpTimeIn, grpTimeOut);});
    rdo_sIn.setOnAction(e -> {displayConversion(tfStartingValue, grpTimeIn, grpTimeOut);});
    rdo_minIn.setOnAction(e -> {displayConversion(tfStartingValue, grpTimeIn, grpTimeOut);});
    rdo_hIn.setOnAction(e -> {displayConversion(tfStartingValue, grpTimeIn, grpTimeOut);});
    rdo_dIn.setOnAction(e -> {displayConversion(tfStartingValue, grpTimeIn, grpTimeOut);});

    rdo_msOut.setOnAction(e -> {displayConversion(tfStartingValue, grpTimeIn, grpTimeOut);});
    rdo_sOut.setOnAction(e -> {displayConversion(tfStartingValue, grpTimeIn, grpTimeOut);});
    rdo_minOut.setOnAction(e -> {displayConversion(tfStartingValue, grpTimeIn, grpTimeOut);});
    rdo_hOut.setOnAction(e -> {displayConversion(tfStartingValue, grpTimeIn, grpTimeOut);});
    rdo_dOut.setOnAction(e -> {displayConversion(tfStartingValue, grpTimeIn, grpTimeOut);});

    // Display conversion when new text is entered in the textfield
    tfStartingValue.setOnAction(e -> {
        if(currentIndex == 0) {
            displayConversion(tfStartingValue, grpMassIn, grpMassOut);
        }
        else if(currentIndex == 1) {
            displayConversion(tfStartingValue, grpLengthIn, grpLengthOut);
        }
        else if(currentIndex == 2) {
            displayConversion(tfStartingValue, grpTempIn, grpTempOut);
        }
        else if(currentIndex == 3) {
            displayConversion(tfStartingValue, grpTimeIn, grpTimeOut);
        }

    });
    

    

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 350, 350);
    primaryStage.setResizable(false); // Set the stage to not be resizable
    primaryStage.setTitle("Unit Converter"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage   

  }

  
  public static void main(String[] args) {
    launch(args);
  }
}