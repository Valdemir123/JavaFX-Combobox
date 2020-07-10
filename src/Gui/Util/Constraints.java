package Gui.Util;

import javafx.scene.control.TextField;

public class Constraints {

	public static void setTextFieldInteger(TextField _txt) {
		_txt.textProperty().addListener((_obs, _oldValue, _newValue) -> {
			if (_newValue != null && !_newValue.matches("\\d*")) {
				_txt.setText(_oldValue);
			}
		});
	}

	public static void setTextFieldDouble(TextField _txt) {
		_txt.textProperty().addListener((_obs, _oldValue, _newValue) -> {
			if (_newValue != null && !_newValue.matches("\\d*([\\.]\\d*)?")) {
				_txt.setText(_oldValue);
			}
		});
	}

	public static void setTextFieldMaxLenght(TextField _txt, int _max) {
		_txt.textProperty().addListener((_obs, _oldValue, _newValue) -> {
			if (_newValue != null && _newValue.length() > _max) {
				_txt.setText(_oldValue);
			}
		});
	}

}
