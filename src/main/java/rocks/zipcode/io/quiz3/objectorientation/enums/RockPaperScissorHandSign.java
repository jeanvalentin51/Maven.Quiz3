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

        if (this == ROCK) winner =  PAPER;
        if (this == PAPER) winner =  SCISSOR;
        if (this == SCISSOR) winner =  ROCK;

        if (this == ROCK) looser =  SCISSOR;
        if (this == PAPER) looser =  ROCK;
        if (this == SCISSOR) looser =  PAPER;

        if (this.forWinner) return winner;
        return looser;
    }
}
