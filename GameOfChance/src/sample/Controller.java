package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.concurrent.TimeUnit;

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

    //Confirm bet
    public void AddConfirmation(ActionEvent actionEvent) {

        int bets = Integer.parseInt(textGetBet.getText());
        String confirm = btnGetConfirmation.getText();
        Game XXIPoints = new Game(bets, confirm);
        resultList.getItems().add(XXIPoints);
        textGetBet.clear();
        btnGetConfirmation.setDisable(true);
    }
    //Dice 1 - 6
    public void initialize() {
        g = new Game(6, 1);
        btnRoll.setOnAction(event -> roll());

        AddRoll();
    }
    //Roll Dice 1 and 2
    public void AddRoll() {

        GetFirstRoll.setText("" + g.getDice1());
        GetSecondRoll.setText("" + g.getDice2());

        btnRoll.setDisable(false);

        try {
            TimeUnit.MILLISECONDS.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //Roll Dice 1 and 2
    public void roll(){
        g.roll();
        AddRoll();
    }
    //Display List: Win, Loss, Tie (Loss), Bet Per Game
    public void DisplayList(MouseEvent actionEvent) {

        Game list;
        list = resultList.getSelectionModel().getSelectedItem();

    }
    //Result remains zero
    public void gameResult(ActionEvent actionEvent) throws InterruptedException {

        Game list;
        list = resultList.getSelectionModel().getSelectedItem();

        gameWon.setText("" + g.getWin());
        gameLost.setText("" + g.getLoss());
        gameLost.setText("" + g.getTie());
        moneyBet.setText(Integer.toString((list .getBets())));

        btnGetResult.setDisable(false);

        try {
            TimeUnit.MILLISECONDS.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    //End Game: Disable Button Confirmation, Roll
    public void AddClear(ActionEvent actionEvent) {

        btnClear.setDisable(true);

        GetFirstRoll.clear();
        GetSecondRoll.clear();

        btnGetConfirmation.setDisable(true);
        btnRoll.setDisable(true);
        btnGetResult.setDisable(true);
    }
}

