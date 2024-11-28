package draw;

import math.Circle;
import math.Figure;
import math.Rectangle;

import java.util.HashMap;
import java.util.Map;

public class FigureDrawerFactory {
	private static final Map<Class<? extends Figure>, FigureDrawer<?>> drawers = new HashMap<>();
	static {
		registerDrawer(Circle.class, new CircleDrawer());
		registerDrawer(Rectangle.class, new RectangleDrawer());
	}

	@SuppressWarnings("unchecked")
	public static <F extends Figure> FigureDrawer<F> getInstance(Class<F> clazz) {
		return (FigureDrawer<F>) drawers.get(clazz);
	}

	private static <F extends Figure> void registerDrawer(Class<F> clazz, FigureDrawer<F> drawer) {
		drawers.put(clazz, drawer);
	}
}
