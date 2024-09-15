public class Runner {
	public static void main(String[] args) {
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

//		Text t = new Text();
//		t.setText(s);
//		t.setWidth(7);

		Paragraph t = new Paragraph();
		t.setText(s);
		t.setWidth(7);
		t.setIndentation(2);

		Border text = new Border(t);
		text.setWidth(8);

		for(String row : text.build()) {
			System.out.println(row);
		}

//		for(String row : text.build()) {
//			System.out.println(row);
//		}
	}
}
