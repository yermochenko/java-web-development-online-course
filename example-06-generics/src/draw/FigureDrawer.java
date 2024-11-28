package draw;

import math.Figure;

import java.awt.*;

public interface FigureDrawer<F extends Figure> {
	void draw(Graphics g, F figure);
}
