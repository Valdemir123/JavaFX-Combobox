package Gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import Model.Entities.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class ViewController implements Initializable {

	@FXML
	private ComboBox<Person> cboPerson;
	
	@FXML
	private Label lblResult;
	
	private Button btALl;	

	private ObservableList<Person> obsList;
	
	@FXML
	public void onComboxBoxPersonAction() {
		Person _person = cboPerson.getSelectionModel().getSelectedItem();
		
		lblResult.setText(_person.getName());
	};
	
	@FXML
	public void onBtALL() {
		for(Person _person : cboPerson.getItems()) {
			System.out.println(_person);
		}
	};

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		List<Person> _list = new ArrayList<>();

		_list.add(new Person(1, "Maria", "maria@email.com"));
		_list.add(new Person(1, "Alex", "alex@email.com"));
		_list.add(new Person(1, "Bob", "bob@email.com"));

		obsList = FXCollections.observableArrayList(_list);
		cboPerson.setItems(obsList);

		Callback<ListView<Person>, ListCell<Person>> _fact = lv -> new ListCell<Person>() {
			@Override
			protected void updateItem(Person _item, boolean _empty) {
				super.updateItem(_item, _empty);
				setText(_empty ? "" : _item.getName());
			}
		};

		cboPerson.setCellFactory(_fact);
		cboPerson.setButtonCell(_fact.call(null));
	}
}
