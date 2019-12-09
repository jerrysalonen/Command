package command;

public class Main {

    public static void main(String[] args) {
	    Screen s = new Screen();
	    Command screenUpCmd = new ScreenUpCmd(s);
        Command screenDownCmd = new ScreenDownCmd(s);
        ScreenButton sb1 = new ScreenButton(screenUpCmd);
        ScreenButton sb2 = new ScreenButton(screenDownCmd);

        sb1.press();
        sb2.press();
    }
}
