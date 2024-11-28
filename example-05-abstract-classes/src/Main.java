import javax.swing.*;
import java.awt.*;

public class Main {
	public static void main(String[] args) {
		Figure[] figures = {
			new Circle(new Point(100, 100), 90),
			new Rectangle(new Point(250, 360), 200, 300),
			new Circle(new Point(350, 210), 50),
		};
		for(Figure figure : figures) {
			System.out.println(figure + ", area=" + figure.calcArea());
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
		private final Figure[] figures;

		public Drawing(Figure[] figures) {
			this.figures = figures;
		}

		@Override
		public void paint(Graphics g) {
			Graphics2D g2d = (Graphics2D) g;
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			FontMetrics fm = g2d.getFontMetrics();
			for(Figure figure : figures) {
				figure.draw(g2d);
				String area = String.format("S = %.2f", figure.calcArea());
				java.awt.Rectangle rect = fm.getStringBounds(area, g2d).getBounds();
				g2d.drawString(area, (int)(figure.getCenter().getX() - rect.width / 2), (int)(figure.getCenter().getY() + rect.height / 2));
			}
		}
	}
}
