package fr.uparis.energy.model;

/**
 * Represents a level that can be played or edited.
 */
public class Level {

    private final int number;
    private final Board board;
    private final State state;

    /**
     * This level state.
     */
    public enum State {
        EDITING,
        PLAYING;
    }

    /**
     * Builds a level with the given specifications.
     * @param number of the level.
     * @param state of the level.
     * @param board of the level.
     */
    public Level(int number, State state, Board board) {
        this.number = number;
        this.state = state;
        this.board = board;
    }

    /**
     * Checks if the level is solved (i.e. we won)
     * @return true it all tiles which contain lamps are powered.
     */
    public boolean isSolved() {
        return false;
    }

    /**
     * Prepares a level by shuffling its board.
     * @return true if the level can be played (i.e. it is not in a winning state after 100 shuffles)
     */
    public boolean start() {
        int i = 0;
        while (isSolved() && i < 100) {
            board.shuffle();
            i++;
        }
        return i != 100;
    }

    /**
     * Level's number getter.
     * @return this level's number.
     */
    public int getNumber() {
        return this.number;
    }

    /**
     * Textual representation.
     * @return a String that can be witten to a file to save the level.
     */
    @Override
    public String toString() {
        return this.board.toString();
    }
}
