package draw;

import math.Circle;

import java.awt.*;

public class CircleDrawer implements FigureDrawer<Circle> {
	@Override
	public void draw(Graphics g, Circle circle) {
		int x = circle.getX() - circle.getRadius();
		int y = circle.getY() - circle.getRadius();
		int width = 2 * circle.getRadius();
		int height = 2 * circle.getRadius();
		g.setColor(Color.WHITE);
		g.fillOval(x, y, width, height);
		g.setColor(Color.BLACK);
		g.drawOval(x, y, width, height);
	}
}
