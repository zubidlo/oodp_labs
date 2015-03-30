package lab_7.part_3;

import utilities.FrameSkeleton;

import javax.swing.*;
import java.awt.*;

/**
 * gui
 * Created by martin on 29/03/2015.
 */
public class DrawShapeGUI extends FrameSkeleton {

    private final DrawShape drawShape;
    private final Command drawCircleCommand, drawSquareCommand, drawTriangleCommand;
    private JPanel canvas;

    DrawShapeGUI() {
        super("Draw Shapes using Command Pattern with Undo");
        drawCircleCommand = new DrawCircleCommand();
        drawSquareCommand = new DrawSquareCommand();
        drawTriangleCommand = new DrawTriangleCommand();
        canvas = new JPanel();
        canvas.setBackground(Color.white);
        JPanel jPanelSouth = new JPanel();
        jPanelSouth.setBackground(Color.white);
        getContentPane().add(canvas, BorderLayout.CENTER);
        getContentPane().add(jPanelSouth, BorderLayout.SOUTH);
        drawShape = new DrawShape(this);

        JButton jButtonCircle = new JButton("Circle");
        jButtonCircle.addActionListener(event -> drawShape.storeAndExecute(drawCircleCommand));

        JButton jButtonSquare = new JButton("Square");
        jButtonSquare.addActionListener(event -> drawShape.storeAndExecute(drawSquareCommand));

        JButton jButtonTriangle = new JButton("Triangle");
        jButtonTriangle.addActionListener(event -> drawShape.storeAndExecute(drawTriangleCommand));

        JButton jButtonUndo = new JButton("Undo");
        jButtonUndo.addActionListener(event -> drawShape.undo());

        jPanelSouth.add(jButtonCircle);
        jPanelSouth.add(jButtonSquare);
        jPanelSouth.add(jButtonTriangle);
        jPanelSouth.add(jButtonUndo);
        setResizable(false);
        revalidate();
    }

    public JPanel getCanvas() {
        return canvas;
    }

    public void setCanvas(JPanel canvas) {
        this.canvas = canvas;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DrawShapeGUI::new);
    }
}
