package command;

/**
 * @author Jerry Salonen
 */
public class ScreenButton {
    Command c;

    public ScreenButton(Command c) {
        this.c = c;
    }

    public void press() {
        c.execute();
    }
}
