package command;

/**
 * @author Jerry Salonen
 */
public class ScreenUpCmd implements Command {
    private Screen s;

    public ScreenUpCmd(Screen s) {
        this.s = s;
    }

    @Override
    public void execute() {
        s.rollUp();
    }
}
