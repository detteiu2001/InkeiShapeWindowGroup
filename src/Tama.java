import javax.swing.*;
import java.util.Objects;

public class Tama extends JFrame {
    enum side{
        left,
        right
    }
    Tama(int size,int xpos,int ypos,side side){
        int xposi = xpos - size;
        if (Objects.requireNonNull(side) == Tama.side.right) {
            xposi = xpos + size;
        }
        setBounds(xposi,ypos + (size * 4),size,size);
        setUndecorated(true);
    }
    public void render() {
        setVisible(true);
    }
}
