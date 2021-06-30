package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    public Button btnGetConfirmation;
    public TextField textGetBet;
    public TextField GetFirstRoll;
    public TextField GetSecondRoll;
    public Button btnRoll;
    public ListView <Game> resultList = new ListView<>();
    public Label gameWon;
    public Label gameLost;
    public Label moneyBet;
    public Button btnGetResult;
    public Button btnClear;
    Game g;

    public void AddConfirmation(ActionEvent actionEvent) {

        int bets = Integer.parseInt(textGetBet.getText());
        String confirm = btnGetConfirmation.getText();
        Game XXIPoints = new Game(bets, confirm);
        resultList.getItems().add(XXIPoints);
        textGetBet.clear();
        btnGetConfirmation.setDisable(true);

    }

    public void initialize() {
        g = new Game(6, 1);
        btnRoll.setOnAction(event -> roll());

        AddRoll();
    }
    public void AddRoll() {

        GetFirstRoll.setText("" + g.getDice1());
        GetSecondRoll.setText("" + g.getDice2());
        btnRoll.setDisable(false);
    }

    public void roll(){
        g.roll();
        AddRoll();
    }

    public void DisplayList(MouseEvent actionEvent){

        Game list;
        list = resultList.getSelectionModel().getSelectedItem();
        gameWon.setText(String.valueOf(list.getWin()));
        gameLost.setText(String.valueOf(list.getLose()));

    }

    public void gameResult(ActionEvent actionEvent) {

        Game list;
        list = resultList.getSelectionModel().getSelectedItem();

        gameWon.setText(Integer.toString(list.getWin()));
        gameLost.setText(Integer.toString(list.getLose()));
        gameLost.setText(Integer.toString(list.getTie()));
        moneyBet.setText(Integer.toString((list.getBets())));

        btnGetResult.setDisable(false);
    }

    public void AddClear(ActionEvent actionEvent) {

        btnClear.setDisable(false);

        GetFirstRoll.clear();
        GetSecondRoll.clear();
    }
}

