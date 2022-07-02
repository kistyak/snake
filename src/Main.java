import javax.swing.*;

public class Main extends JFrame {
    public Main() {
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(345, 320);
        setLocation(800, 300);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        Main mw = new Main();
    }
}
