import java.util.ArrayList;
import java.util.List;

public class LongText extends Text {
	private final List<Text> longText;

	public LongText(List<Text> longText) {
		this.longText = longText;
	}

	@Override
	public List<String> build() {
		List<String> result = new ArrayList<>();
		for(Text text : longText) {
			text.setWidth(getWidth());
			result.addAll(text.build());
		}
		return result;
	}
}
