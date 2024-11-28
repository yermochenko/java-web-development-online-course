package draw;

import math.Rectangle;

import java.awt.*;

public class RectangleDrawer implements FigureDrawer<Rectangle> {
	@Override
	public void draw(Graphics g, Rectangle rectangle) {
		int x = rectangle.getX() - rectangle.getWidth() / 2;
		int y = rectangle.getY() - rectangle.getHeight() / 2;
		int width = rectangle.getWidth();
		int height = rectangle.getHeight();
		g.setColor(Color.WHITE);
		g.fillRect(x, y, width, height);
		g.setColor(Color.BLACK);
		g.drawRect(x, y, width, height);
	}
}
