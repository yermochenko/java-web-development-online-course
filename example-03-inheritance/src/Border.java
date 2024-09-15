import java.util.ArrayList;
import java.util.List;

public class Border extends Text {
	private final Text text;

	public Border(Text text) {
		this.text = text;
	}

	@Override
	public List<String> build() {
		text.setWidth(getWidth() - 2);
		List<String> list = text.build();
		List<String> result = new ArrayList<>(list.size() + 2);
		String hLine = "─".repeat(text.getWidth());
		result.add("┌" + hLine + "┐");
		for(String s : list) {
			result.add("│" + s + " ".repeat(text.getWidth() - s.length()) + "│");
		}
		result.add("└" + hLine + "┘");
		return result;
	}
}
