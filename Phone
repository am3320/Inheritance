import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Phone {
    private Timer timer;
    private ArrayList<String> hints;
    private int index = 0;

    public Phone(ArrayList<String> hints, int intervalTime) {
        this.hints = hints;
        timer = new Timer();

        timer.schedule(new TimerTask() {
            public void run() {
                if (index < hints.size()) {
                    System.out.println("💬 Hint: " + hints.get(index));
                    index++;
                } else {
                    System.out.println("✅ All hints delivered.");
                    timer.cancel();
                }
            }
        }, 0, intervalTime*60*1000);
    }
}
