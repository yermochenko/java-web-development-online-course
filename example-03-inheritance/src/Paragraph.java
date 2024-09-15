import java.util.List;

public class Paragraph extends Text {
	private int indentation;

	public int getIndentation() {
		return indentation;
	}

	public void setIndentation(int indentation) {
		this.indentation = indentation;
	}

	@Override
	public List<String> build() {
		Text text = new Text();
		text.setText(" ".repeat(indentation) + getText());
		text.setWidth(getWidth());
		return text.build();
	}
}
