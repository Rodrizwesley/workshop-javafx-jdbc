package gui.util;

import javafx.scene.control.TextField;

public class Constraints {
	
	public static void setTextFieldInteger(TextField txt) {
		txt.textProperty().addListener((obs, oldValues, newValue) -> {
			if (newValue != null && !newValue.matches("\\d*")) {
				txt.setText(oldValues);
			}
		});
	}

	public static void setTextFieldMaxLength(TextField txt, int max) {
		txt.textProperty().addListener((obs, oldValues, newValue) -> {
			if (newValue != null && newValue.length() > max) {
				txt.setText(oldValues);
			}
		});
	}
	
	public static void setTextFieldDouble(TextField txt) {
		txt.textProperty().addListener((obs, oldValues, newValue) -> {
			if (newValue != null && !newValue.matches("\\d*([\\.]\\d*)?")) {
				txt.setText(oldValues);
			}
		});
	}
}
