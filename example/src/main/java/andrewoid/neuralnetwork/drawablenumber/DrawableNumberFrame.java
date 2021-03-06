package andrewoid.neuralnetwork.drawablenumber;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;

public class DrawableNumberFrame extends JFrame {

    private DrawingComponent drawingComponent = new DrawingComponent();

    public DrawableNumberFrame() {
        setTitle("Draw a Number");
        setSize(600, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel root = new JPanel();
        root.setLayout(new BorderLayout());
        JButton clearButton = new JButton("Clear");
        root.add(clearButton, BorderLayout.SOUTH);

        JPanel drawablePanel = new JPanel();
        drawablePanel.setLayout(new BorderLayout());
        drawablePanel.setBackground(Color.PINK);
        JLabel drawableLabel = new JLabel("Draw Your Number Here");
        drawableLabel.setFont(new Font("Sans Serif", Font.BOLD, 16));
        drawablePanel.add(drawableLabel, BorderLayout.NORTH);
        drawablePanel.add(drawingComponent, BorderLayout.CENTER);

        JPanel outputPanel = new JPanel();
        outputPanel.setBackground(Color.YELLOW);
        JLabel outputLabel = new JLabel("Here is Your Number");
        outputLabel.setFont(new Font("Sans Serif", Font.BOLD, 16));
        outputPanel.add(outputLabel);

        root.add(drawablePanel, BorderLayout.CENTER);
        root.add(outputPanel, BorderLayout.EAST);

        clearButton.addActionListener(e -> drawingComponent.clearImage());

        setContentPane(root);
        root.setVisible(true);
    }
}
