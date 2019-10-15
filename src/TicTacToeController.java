import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TicTacToeController {

	@FXML
    private TextField textField1;

    @FXML
    private TextField textField2;

    @FXML
    private TextField textField3;

    @FXML
    private TextField textField4;

    @FXML
    private TextField textField5;

    @FXML
    private TextField textField6;

    @FXML
    private TextField textField7;

    @FXML
    private TextField textField8;

    @FXML
    private TextField textField9;

    @FXML
    private Button quitButton;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Button button10;

    @FXML
    private Button button11;

    @FXML
    private Button button12;

    @FXML
    private Button button13;

    @FXML
    private Button button14;

    @FXML
    private Button button15;

    @FXML
    private Button button16;

    @FXML
    private Button button17;

    @FXML
    private Button button18;
	@FXML
	void buttonX1Press(ActionEvent event) {
			textField1.setText("X");

	}
	@FXML
	void buttonX2Press(ActionEvent event) {
			textField2.setText("X");

	}
	@FXML
	void buttonX3Press(ActionEvent event) {
			textField3.setText("X");

	}
	@FXML
	void buttonX4Press(ActionEvent event) {
			textField4.setText("X");

	}
	@FXML
	void buttonX5Press(ActionEvent event) {
			textField5.setText("X");

	}
	@FXML
	void buttonX6Press(ActionEvent event) {
		textField6.setText("X");

}
	@FXML
	void buttonX7Press(ActionEvent event) {
			textField7.setText("X");

	}
	@FXML
	void buttonX8Press(ActionEvent event) {
			textField8.setText("X");

	}
	@FXML
	void buttonX9Press(ActionEvent event) {
			textField9.setText("X");

	}
	@FXML
	void buttonO1Press(ActionEvent event) {
			textField1.setText("O");

	}
	@FXML
	void buttonO2Press(ActionEvent event) {
			textField2.setText("O");

	}
	@FXML
	void buttonO3Press(ActionEvent event) {
			textField3.setText("O");

	}
	@FXML
	void buttonO4Press(ActionEvent event) {
			textField4.setText("O");

	}
	@FXML
	void buttonO5Press(ActionEvent event) {
			textField5.setText("O");

	}
	@FXML
	void buttonO6Press(ActionEvent event) {
		textField6.setText("O");

}
	@FXML
	void buttonO7Press(ActionEvent event) {
			textField7.setText("O");

	}
	@FXML
	void buttonO8Press(ActionEvent event) {
			textField8.setText("O");

	}
	@FXML
	void buttonO9Press(ActionEvent event) {
			textField9.setText("O");

	}
	@FXML
	void quitButton(ActionEvent event) {
		System.exit(0);
	}

	@FXML
	void initialize() {
		assert button1 != null : "fx:id=\"button1\" was not injected: check your FXML file 'Final.fxml'.";
		assert button2 != null : "fx:id=\"button2\" was not injected: check your FXML file 'Final.fxml'.";
		assert button3 != null : "fx:id=\"button3\" was not injected: check your FXML file 'Final.fxml'.";
		assert button4 != null : "fx:id=\"button4\" was not injected: check your FXML file 'Final.fxml'.";
		assert button5 != null : "fx:id=\"button5\" was not injected: check your FXML file 'Final.fxml'.";
		assert button6 != null : "fx:id=\"button6\" was not injected: check your FXML file 'Final.fxml'.";
		assert button7 != null : "fx:id=\"button7\" was not injected: check your FXML file 'Final.fxml'.";
		assert button8 != null : "fx:id=\"button8\" was not injected: check your FXML file 'Final.fxml'.";
		assert button9 != null : "fx:id=\"button9\" was not injected: check your FXML file 'Final.fxml'.";
		assert textField1 != null : "fx:id=\"textField1\" was not injected: check your FXML file 'Final.fxml'.";
		assert textField2 != null : "fx:id=\"textField2\" was not injected: check your FXML file 'Final.fxml'.";
		assert textField3 != null : "fx:id=\"textField3\" was not injected: check your FXML file 'Final.fxml'.";
		assert textField4 != null : "fx:id=\"textField4\" was not injected: check your FXML file 'Final.fxml'.";
		assert textField5 != null : "fx:id=\"textField5\" was not injected: check your FXML file 'Final.fxml'.";
		assert textField6 != null : "fx:id=\"textField6\" was not injected: check your FXML file 'Final.fxml'.";
		assert textField7 != null : "fx:id=\"textField7\" was not injected: check your FXML file 'Final.fxml'.";
		assert textField8 != null : "fx:id=\"textField8\" was not injected: check your FXML file 'Final.fxml'.";
		assert textField9 != null : "fx:id=\"textField9\" was not injected: check your FXML file 'Final.fxml'.";

	}
}
