import java.awt.*;

abstract public class Figure {
	private final Point center;

	public Figure(Point center) {
		this.center = center;
	}

	public final Point getCenter() {
		return center;
	}

	abstract public void draw(Graphics2D g);

	abstract public double calcArea();
}
