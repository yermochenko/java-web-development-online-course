import java.util.ArrayList;
import java.util.List;

public class UnorderedList extends Text {
//	private final char marker;
	private final MarkerType markerType;
	private final List<Text> items;

	public UnorderedList(List<Text> items) {
		this(items, MarkerType.ASTERISK);
	}

	public UnorderedList(List<Text> items, MarkerType markerType) {
		this.items = items;
		this.markerType = markerType;
	}

//	public UnorderedList(List<Text> items) {
//		this(items, '*');
//	}
//	public UnorderedList(List<Text> items, char marker) {
//		this.items = items;
//		this.marker = marker;
//	}

	@Override
	public List<String> build() {
		List<String> result = new ArrayList<>();
		for(Text item : items) {
			item.setWidth(getWidth() - 2);
			List<String> rows = item.build();
//			rows.set(0, marker + " " + rows.getFirst());
			rows.set(0, markerType.getMarker() + " " + rows.getFirst());
			for(int i = 1; i < rows.size(); i++) {
				rows.set(i, "  " + rows.get(i));
			}
			result.addAll(rows);
		}
		return result;
	}

	public enum MarkerType {
		ASTERISK('*'), MINUS('-'), SHARP('#');

		private final char marker;

		MarkerType(char marker) {
			this.marker = marker;
		}

		public char getMarker() {
			return marker;
		}
	}
}
