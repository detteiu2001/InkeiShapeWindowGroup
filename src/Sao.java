import javax.swing.*;

public class Sao extends JFrame {
    Sao(int size, int xpos, int ypos){
        setBounds(xpos,ypos,size,(size * 5));
        setUndecorated(true);
    }

    public void render() {
        setVisible(true);
    }
}
