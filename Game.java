
public class Game {
	public static void main(String[] args) {
		
		String[][] field = setField(3, 3);
		field = setMine(0, 3);
	}

	public static String[][] setField(int rows, int collums) {

		String[][] myField = new String[rows][collums];
		return myField;
	}
	public static String[][] setMine(int rows, int collums) {
		
		String[][] mine = new String[rows][collums];
		return mine;		
	}
}
