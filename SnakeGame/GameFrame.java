package SnakeGame;

import javax.swing.JFrame; // Required import for JFrame [2]

public class GameFrame extends JFrame { // Extends the JFrame class [2]

    GameFrame() { // Constructor for GameFrame [3]
        // Add an instance of GamePanel to this frame.
        // Using a shortcut as the named instance 'panel' is not used elsewhere [5].
        this.add(new GamePanel()); // Adds the game panel to the frame [5]

        this.setTitle("Snake"); // Sets the title of the game window [5]
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Sets the default close operation for the frame [6]
        this.setResizable(false); // Prevents the user from resizing the window [6]
        this.pack(); // Sizes the frame to fit all components snugly [6]
        this.setVisible(true); // Makes the game window visible [6]
        this.setLocationRelativeTo(null); // Centers the window on the computer screen [6]
    }
}
