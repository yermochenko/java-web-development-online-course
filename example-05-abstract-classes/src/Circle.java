import java.awt.*;

public class Circle extends Figure {
	private final double radius;

	public Circle(Point center, double radius) {
		super(center);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double calcArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(Color.WHITE);
		g.fillOval((int)(getCenter().getX() - radius), (int)(getCenter().getY() - radius), (int)(2 * radius), (int)(2 * radius));
		g.setColor(Color.BLACK);
		g.drawOval((int)(getCenter().getX() - radius), (int)(getCenter().getY() - radius), (int)(2 * radius), (int)(2 * radius));
	}

	@Override
	public String toString() {
		return "Circle{" +
				"center=" + getCenter() +
				", radius=" + getRadius() +
				'}';
	}
}
