package client;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GameBoard {
    private JFrame frame;
    private JPanel boardPanel;
    private List<String> crosswordPuzzle;

    public GameBoard(List<String> puzzle) {
        this.crosswordPuzzle = puzzle;
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Crossword Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        boardPanel = new JPanel(new GridLayout(crosswordPuzzle.size(), crosswordPuzzle.get(0).length()));
        populateBoard();
        frame.add(boardPanel);
        frame.setVisible(true);
    }

    private void populateBoard() {
        for (String row : crosswordPuzzle) {
            for (char cell : row.toCharArray()) {
                JTextField textField = new JTextField(String.valueOf(cell));
                textField.setHorizontalAlignment(JTextField.CENTER);
                textField.setEditable(cell == ' '); // Editable only for empty cells
                boardPanel.add(textField);
            }
        }
    }

    public void updateBoard(List<String> newPuzzle) {
        this.crosswordPuzzle = newPuzzle;
        boardPanel.removeAll();
        populateBoard();
        boardPanel.revalidate();
        boardPanel.repaint();
    }
}