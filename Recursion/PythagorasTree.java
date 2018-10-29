import java.awt.*;
import javax.swing.*;

public class PythagorasTree extends JPanel
{

    static final int width = 1100;
    static final int height = 800;
    static final double factor = 0.71;

    void drawPythagoras(Graphics g, int x1, int y1, int x2, int y2)
    {
        g.drawLine(x1 + width/2, height/2 - y1,x2 + width/2, height/2 - y2);

        // if line is reduced to a single pixle or smaller, stop
        if(Math.abs(x1-x2)<=1 && Math.abs(y1-y2) <= 1)
            return;

        if(x1 == x2)
        {
            // Vertical
            if(y1 < y2)
            {
                // North
                int distance = (int)(factor * (y2-y1));
                drawPythagoras(g,x2,y2,x2-distance,y2+distance);
                drawPythagoras(g,x2,y2,x2+distance,y2+distance);
            }
            else
            {
                // South
                int distance = (int)(factor * (y1-y2));
                drawPythagoras(g,x2,y2,x2-distance,y2-distance);
                drawPythagoras(g,x2,y2,x2+distance,y2-distance);
            }

        }
        else if (y1 == y2)
        {
            // Horizontal
            if(x1 < x2)
            {
                // East
                int distance = (int)(factor * (x2-x1));
                drawPythagoras(g,x2,y2,x2+distance,y2+distance);
                drawPythagoras(g,x2,y2,x2+distance,y2-distance);
            }
            else
            {
                // West
                int distance = (int)(factor * (x1-x2));
                drawPythagoras(g,x2,y2,x2-distance,y2+distance);
                drawPythagoras(g,x2,y2,x2-distance,y2-distance);
            }
        }
        else if(x1 < x2)
        {
            // East
            int distance = (int)(factor * (x2-x1));
            if(y1 < y2)
            {
                // Northeast
                drawPythagoras(g,x2,y2,x2,y2+distance);
                drawPythagoras(g,x2,y2,x2+distance,y2);
            }
            else
            {
                // Southeast
                drawPythagoras(g,x2,y2,x2+distance,y2);
                drawPythagoras(g,x2,y2,x2,y2-distance);
            }
        }
        else
        {
            // West
            int distance = (int)(factor * (x1-x2));
            if(y1 < y2)
            {
                // Northwest
                drawPythagoras(g,x2,y2,x2-distance,y2);
                drawPythagoras(g,x2,y2,x2,y2+distance);
            }
            else
            {
                // Southwest
                drawPythagoras(g,x2,y2,x2-distance,y2);
                drawPythagoras(g,x2,y2,x2,y2-distance);
            }
        }
    }

    public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		setBackground(Color.white);
		g.setColor(getForeground());
        		drawPythagoras(g,0,-300,0,-100);
	}

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("AD Boom van Pythagoras");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PythagorasTree panel = new PythagorasTree();
        frame.setContentPane(panel);
        frame.setSize(width, height);
        frame.setVisible(true);
    }
    
}
