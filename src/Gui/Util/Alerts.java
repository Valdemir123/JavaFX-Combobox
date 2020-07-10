package Gui.Util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Alerts {

	public static void ShowAlert(String title, String header, String content, AlertType type) {
		Alert _alert = new Alert(type);
		_alert.setTitle(title);
		_alert.setHeaderText(header);
		_alert.setContentText(content);

		_alert.show();
	}
}
