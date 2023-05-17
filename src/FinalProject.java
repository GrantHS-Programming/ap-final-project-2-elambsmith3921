import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FinalProject implements ActionListener {
    JFrame window = new JFrame("Color Grid");
    JButton guess = new JButton("Click the color you think the grey");
    JButton blueButton = new JButton("Blue");
    JButton greenButton = new JButton("Green");
    //JButton[][] board = new JButton[1][1];
    ArrayList<JButton> board = new ArrayList<>();

    public static void main(String[] args) {
        new FinalProject();
    }

    public FinalProject() {
        window.setLayout(new BorderLayout());
        window.setSize(800, 800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container blueContainer = new Container();
        Container greenContainer = new Container();
        Container boardContainer = new Container();
        blueContainer.setLayout(new GridLayout(1, 1));
        greenContainer.setLayout(new GridLayout(1, 1));
        boardContainer.setLayout(new GridLayout(20, 20));

        blueButton.addActionListener(this);
        blueContainer.add(blueButton);
        greenButton.addActionListener(this);
        greenContainer.add(greenButton);

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                board[row][col] = new JButton();
                board[row][col].addActionListener(this);
                boardContainer.add(board[row][col]);
            }
        }


        window.add(blueContainer, BorderLayout.NORTH);
        window.add(greenContainer, BorderLayout.NORTH);
        window.add(boardContainer, BorderLayout.CENTER);

        window.setVisible(true);
    }

    public void guess(){

    }
    public void expansion(){
        if()
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}