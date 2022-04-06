package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Formulas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainViewController implements Initializable {

	@FXML
	private Label wA;

	@FXML
	private Label slots;
	
	@FXML
	private Label wDef;
	
	@FXML
	private Label mDef;

	@FXML
	private Button btCalc;

	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}
	

	@FXML
	public void onBtCalc(ActionEvent event) {
		
		//getting the items status
		int weapon_attack = Integer.parseInt(wA.getText());
		int slot = Integer.parseInt(slots.getText());
		int weapon_def = Integer.parseInt(wDef.getText());
		int magic_def = Integer.parseInt(mDef.getText());
		
		//adding the formula
		String newSlot = String.valueOf(Formulas.decreaseSlotNumber(slot));
		String newWeaponAttack = String.valueOf(Formulas.generateChaosEffect(weapon_attack, slot));
		String newWeaponDef = String.valueOf(Formulas.generateChaosEffect(weapon_def, slot));
		String newMagicDef = String.valueOf(Formulas.generateChaosEffect(magic_def, slot));
		
		//log
		int diff = Integer.parseInt(newWeaponAttack) - weapon_attack;
		System.out.println("difference of status: " + diff);
		
		//setting the data
		wA.setText(newWeaponAttack);
		wDef.setText(newWeaponDef);
		mDef.setText(newMagicDef);
		slots.setText(newSlot);

	}

	@FXML
	public void resetStatus() {
		wA.setText("4");
		wDef.setText("20");
		mDef.setText("25");
		slots.setText("5");
	}
}
