package command;

/**
 * @author Jerry Salonen
 */
public class ScreenDownCmd implements Command {
    private Screen s;

    public ScreenDownCmd(Screen s) {
        this.s = s;
    }

    @Override
    public void execute() {
        s.rollDown();
    }
}
