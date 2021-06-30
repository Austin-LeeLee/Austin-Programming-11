package sample;
public class Game {

    int firstRoll, finalRoll;

    int diceSides, top;

    int bets;
    String confirm;

    int Win, Lose;

    int Dice1, Dice2;

    public Game(int diceSides, int top) {
        this.diceSides = diceSides;
        this.top = top;
    }

    public Game() {
        diceSides = 6;
        top = 1;
    }

    public void roll() {
        Dice1 = (int)(Math.random()*6)+1;
        Dice2 = (int)(Math.random()*6)+1;
    }

    public Game(int bets, String confirm) {

        this.bets = bets;
        this.confirm = confirm;

    }

    public int getBets() {
        return bets;
    }

    public int getWin() {
        Win++;
        return Win;
    }

    public int getLose() {
        Lose++;
        return Lose;
    }

    public int getTie(){
        if (firstRoll == finalRoll){

            Lose++;
        }
        return Lose;
    }

    public int getDice1(){
        return Dice1;
    }

    public int getDice2(){
        return Dice2;
    }


    public String toString () {return ("|You|");
    }

}




