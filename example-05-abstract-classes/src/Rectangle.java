import java.awt.*;

public class Rectangle extends Figure {
	private final double width;
	private final double height;

	public Rectangle(Point center, double width, double height) {
		super(center);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public double calcArea() {
		return width * height;
	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(Color.WHITE);
		g.fillRect((int) (getCenter().getX() - width / 2), (int) (getCenter().getY() - height / 2), (int)width, (int)height);
		g.setColor(Color.BLACK);
		g.drawRect((int) (getCenter().getX() - width / 2), (int) (getCenter().getY() - height / 2), (int)width, (int)height);
	}

	@Override
	public String toString() {
		return "Rectangle{" +
				"topLeft=" + getCenter() +
				", width=" + getWidth() +
				", height=" + getHeight() +
				'}';
	}
}
