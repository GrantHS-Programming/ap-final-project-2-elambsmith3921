import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FinalProject implements ActionListener {

    int x = 1;
    int y = 1;

    JFrame window = new JFrame("Color Grid");
    JButton guess = new JButton("Click the color you think the grey square is");
    JButton blueButton = new JButton("Blue");
    JButton greenButton = new JButton("Green");
    JButton[][] grid = new JButton[x][y];


    public static void main(String[] args) {
        new FinalProject();
    }

    public FinalProject() {
        window.setLayout(new BorderLayout());
        window.setSize(800, 800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container guessContainer = new Container();
        Container blueContainer = new Container();
        Container greenContainer = new Container();
        Container boardContainer = new Container();
        guessContainer.setLayout(new GridLayout(1,1));
        blueContainer.setLayout(new GridLayout(1, 1));
        greenContainer.setLayout(new GridLayout(1, 1));
        boardContainer.setLayout(new GridLayout(20, 20));

        blueButton.addActionListener(this);
        blueContainer.add(blueButton);
        greenButton.addActionListener(this);
        greenContainer.add(greenButton);

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                grid[row][col] = new JButton();
                grid[row][col].addActionListener(this);
                boardContainer.add(grid[row][col]);
            }
        }


        window.add(blueContainer, BorderLayout.NORTH);
        window.add(guessContainer, BorderLayout.NORTH);
        window.add(greenContainer, BorderLayout.CENTER);
        window.add(boardContainer, BorderLayout.SOUTH);

        window.setVisible(true);
        getColor();

    }

    public String getColor(){
        String color = "yetToBeSet";
        int numColor = (int)(Math.random()*grid.length);
        if(numColor % 2 == 0){
            color = "blue";
        }
        if((numColor % 2 != 0)){
            color = "green";
        }
        return color;
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(blueButton) && getColor().equals("blue")){
            boolean guessCheck = true;
            x = x*2;
            y=  y*2;
         }
    }

}