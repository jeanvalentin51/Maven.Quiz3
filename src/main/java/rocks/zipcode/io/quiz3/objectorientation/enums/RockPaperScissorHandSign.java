package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK,
    PAPER,
    SCISSOR;


    private boolean forWinner = false;

    public RockPaperScissorHandSign getWinner() {
        forWinner = true;
        return getRockPaperScissorHandSign();

    }

    public RockPaperScissorHandSign getLoser() {
        forWinner = false;
        return getRockPaperScissorHandSign();
    }

    private RockPaperScissorHandSign getRockPaperScissorHandSign() {
        RockPaperScissorHandSign winner = null;
        RockPaperScissorHandSign looser = null;


        RockPaperScissorHandSign rock = RockPaperScissorHandSign.ROCK;
        RockPaperScissorHandSign paper = RockPaperScissorHandSign.PAPER;
        RockPaperScissorHandSign scissors = RockPaperScissorHandSign.SCISSOR;

        if (this == rock) winner =  PAPER;
        if (this == paper) winner =  SCISSOR;
        if (this == scissors) winner =  ROCK;

        if (this == rock) looser =  SCISSOR;
        if (this == paper) looser =  ROCK;
        if (this == scissors) looser =  PAPER;

        if (this.forWinner) return winner;
        return looser;
    }
}
