import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        int rowConut = 21;
        int columnCount = 19;
        int titleSize = 32;
        int boardWidth = columnCount * titleSize;
        int boardHeight = rowConut * titleSize;

    JFrame frame = new JFrame("Pac Man");
    frame.setVisible(true);
    frame.setSize(boardWidth, boardHeight);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    PacMan pacmanGame = new PacMan();
    frame.add(pacmanGame);
    frame.pack();
    pacmanGame.requestFocus();
    frame.setVisible(true);

    }
}
