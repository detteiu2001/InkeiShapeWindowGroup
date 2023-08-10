import javax.swing.*;
import java.util.Objects;

public class Tama extends JFrame {
    enum side{
        left,
        right
    }
    Tama(side side){
        int xpos = 180;
        if (Objects.requireNonNull(side) == Tama.side.right) {
            xpos = 220;
        }
        setBounds(xpos,280,20,20);
        setUndecorated(true);
    }
    public void render() {
        setVisible(true);
    }
}
