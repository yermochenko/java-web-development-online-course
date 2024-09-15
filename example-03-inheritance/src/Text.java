import java.util.ArrayList;
import java.util.List;

public class Text {
	private String text;
	private int width;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public List<String> build() {
		List<String> result = new ArrayList<>();
		String s = text;
		while(s.length() > width) {
			result.add(s.substring(0, width));
			s = s.substring(width);
		}
		result.add(s);
		return result;
	}
}
