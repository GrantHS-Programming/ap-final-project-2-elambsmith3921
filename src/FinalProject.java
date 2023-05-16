import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FinalProject {
    JFrame window = new JFrame("Color Grid");
    JButton blueButton = new JButton("Blue");
    JButton greenButton = new JButton("Green");
    //JButton[][] board = new JButton[1][1];
    ArrayList<JButton> board = new ArrayList<>();

    public static void main(String[] args) {
        new FinalProject();
    }

}
