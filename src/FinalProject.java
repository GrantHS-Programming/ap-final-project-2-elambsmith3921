import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FinalProject implements ActionListener {

    int x = 2;
    int y = 2;


    JFrame window = new JFrame("Color Grid");
    JButton[][] grid = new JButton[1][1];
    JButton[][] colorButtons = new JButton[x][y];
    String[][] gridColor = new String[x][y];


    public static void main(String[] args) {
        new FinalProject();
    }

    public FinalProject() {
        window.setLayout(new BorderLayout());
        window.setSize(800, 800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container colorButtonsContainer = new Container();
        Container guessContainer = new Container();
        Container boardContainer = new Container();
        colorButtonsContainer.setLayout(new GridLayout(2,1));
        guessContainer.setLayout(new GridLayout(1,1));
        boardContainer.setLayout(new GridLayout(20, 20));

        JButton blue = colorButtons[0][0] = new JButton("blue");
        blue.setBackground(Color.blue);
        colorButtons[0][0].addActionListener(this);
        JButton green = colorButtons[1][0] = new JButton("green");
        green.setBackground(Color.green);
        colorButtons[1][0].addActionListener(this);
        guessContainer.add(blue);
        guessContainer.add(green);

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                grid[row][col] = new JButton();
                grid[row][col].addActionListener(this);
                boardContainer.add(grid[row][col]);
            }
        }

//maybe make the color guesses a grid of 2, formatting weird here

        window.add(guessContainer, BorderLayout.NORTH);
        window.add(boardContainer, BorderLayout.SOUTH);

        window.setVisible(true);
        instructions();
        getColor();
        gridColor[0][0] = getColor();
    }

    public void doubleColors(){
        window.setVisible(false);
        //close window
        //set new arrays

        JFrame window = new JFrame("Color Grid");

        window.setLayout(new BorderLayout());
        window.setSize(800, 800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container colorButtonsContainer = new Container();
        Container guessContainer = new Container();
        Container boardContainer = new Container();
        colorButtonsContainer.setLayout(new GridLayout(2,1));
        guessContainer.setLayout(new GridLayout(1,1));
        boardContainer.setLayout(new GridLayout(20, 20));

        JButton blue = colorButtons[0][0] = new JButton("blue");
        blue.setBackground(Color.blue);
        colorButtons[0][0].addActionListener(this);
        JButton green = colorButtons[1][0] = new JButton("green");
        green.setBackground(Color.green);
        colorButtons[1][0].addActionListener(this);
        guessContainer.add(blue);
        guessContainer.add(green);
        JButton red = colorButtons[2][1] = new JButton("red");
        blue.setBackground(Color.blue);
        colorButtons[2][1].addActionListener(this);
        JButton yellow = colorButtons[3][1] = new JButton("yellow");
        green.setBackground(Color.green);
        colorButtons[3][1].addActionListener(this);
        guessContainer.add(blue);
        guessContainer.add(green);

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                grid[row][col] = new JButton();
                grid[row][col].addActionListener(this);
                boardContainer.add(grid[row][col]);
            }
        }

//maybe make the color guesses a grid of 2, formatting weird here

        window.add(guessContainer, BorderLayout.NORTH);
        window.add(boardContainer, BorderLayout.SOUTH);

        window.setVisible(true);
        instructions();
        getColor();
        gridColor[0][0] = getColor();


    }

    public void instructions(){
        JOptionPane.showMessageDialog(null, "Welcome to this fun game of pure luck! The grey box is either green or blue to start. Click either the green or blue button depending on which color you think it is. If you guess right the color options will double. If you guess wrong you start over.");
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
        boolean guessCheck = false;
        if(e.getSource().equals(colorButtons[0][0]) && gridColor[0][0].equals("blue")){
            guessCheck = true;
         }
        if(e.getSource().equals(colorButtons[1][0]) && gridColor[0][0].equals("green")){
            guessCheck = true;
        }
        if(e.getSource().equals(colorButtons[0][0]) && !gridColor[0][0].equals("blue")){
            guessCheck = false;
        }
        if(e.getSource().equals(colorButtons[1][0]) && !gridColor[0][0].equals("green")){
            guessCheck = false;
        }
        if(guessCheck == true){
            JOptionPane.showMessageDialog(null, "Congratulations! You guessed right! Can you keep your streak with twice as many color options?");
            x= x*2;
            y= y*2;
            doubleColors();
            //clearBoard();
            //reset: random color, doubled color
        }
        if(guessCheck == false){
            JOptionPane.showMessageDialog(null, "Sorry, you guessed wrong.");
            x=1;
            y=1;
            //clearBoard();
            //start over
        }


    }

}