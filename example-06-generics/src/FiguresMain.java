import draw.FigureDrawer;
import draw.FigureDrawerFactory;
import draw.MyGraphics;
import math.Circle;
import math.Figure;
import math.Rectangle;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class FiguresMain {
	public static void main(String[] args) {
		List<Figure> figures = List.of(
			new Circle(100, 100, 90),
			new Rectangle(250, 360, 200, 300),
			new Circle(350, 210, 50)
		);
		Graphics g = new MyGraphics();
		for(Figure figure : figures) {
			@SuppressWarnings("unchecked")
			FigureDrawer<Figure> drawer = FigureDrawerFactory.getInstance((Class<Figure>)figure.getClass());
			drawer.draw(g, figure);
		}
		JFrame frame = new JFrame("Drawing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.add(new Drawing(figures), BorderLayout.CENTER);
	}

	public static class Drawing extends Canvas {
		private final List<Figure> figures;

		public Drawing(List<Figure> figures) {
			this.figures = figures;
		}

		@Override
		public void paint(Graphics g) {
			Graphics2D g2d = (Graphics2D) g;
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			FontMetrics fm = g2d.getFontMetrics();
			for(Figure figure : figures) {
				@SuppressWarnings("unchecked")
				FigureDrawer<Figure> drawer = FigureDrawerFactory.getInstance((Class<Figure>)figure.getClass());
				drawer.draw(g, figure);
				String area = String.format("S = %.2f", figure.area());
				java.awt.Rectangle rect = fm.getStringBounds(area, g2d).getBounds();
				g2d.drawString(area, figure.getX() - rect.width / 2, figure.getY() + rect.height / 2);
			}
		}
	}
}
