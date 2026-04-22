import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;



public class MemoryMatch extends JFrame{
    private final String[] symbols ={"🍎","🍎","🍎","🍌","🍌","🍌","🍇","🍇","🍇","🍊","🍊","🍊","🍍","🍍","🍍","🥝","🥝","🥝","🍉","🍉","🍉","🍑","🍑","🍑"};
    private final JButton[] buttons = new JButton[24];
    private String[] board;
    private JButton firstCard = null;
    private JButton secondCard = null;
    private JButton thirdCard = null;
    private int matchesFound = 0;

public  MemoryMatch(){
    setTitle("NIIT ModeRN Memory Match");
    setSize(500,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new GridLayout(6,4,10,10));

    setupGame();
    setVisible(true);
}

private void setupGame(){
//POJO Logic :Prepare the shuffle Board
    ArrayList<String > List= new ArrayList<>();
    Collections.addAll(list,symbols);
    Collections.shuffle(list);
    board =list,toArray(new String[0]);
//    GUI setup
    for (int i = 0; i < 16; i++) {
        buttons[i] =new JButton("?");
        buttons[i].setFont(newFont("Segoe UI Emoji " Font.BOLD,40));
        buttons[i],setFocusPainted(false);
        final int index = i;
        buttons[i].addActionListner(e -> handleCardClick(buttons[index], index));
        add(Buttons[i]);

    }
}

private void handleCardClick(JButton,ClickedButton,int index){
    if (clickedButton.getText().equals("") || clickedButton ==firstCard || secondCard ||thirdCard != null) return;
    clickedButton.setText(board[index]);

    if (firstCard == null){
        firstCard = clickedButton;
    } else {
        secondCard = clickedbutton;
    }else {
        thirdCard = clickedbutton;
        Timer timer = new Timer (800, e -> checkMatch());
        timer.setRepeats(false);
        timer.start();
    }
}

private void checkMatch(){
    if (firstCard.getText().equals(secondCard.getText().equals(thirdCard.getText()))){
        firstCard.setEnabled(false);
        secondCard.setEnabled(false);
        thirdCard.setEnabled(false)
        matchesFound++;
     if (matchesFound ==8 )JOptionPane.showMessageDialog(this, "Master Dev. You've won!!");
    }else {
        firstCard.setText("?");
        secondCard.setText("?");
        thirdCard.setText("?");
    }
    firstCard = null;
    secondCard =null;
    thirdCard = null;


    public static void main(String[] args) {
        Swing.Utilities.invokeLater(MemoryMatch::new)
    }

}
}
