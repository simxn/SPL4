
public class Game {
	public static void main(String[] args) {
		
		String[][] field = setField(3, 3);
		//field = setMine(0, 3);
		showField(field);
	}

	public static String[][] setField(int rows, int collums) {
		String[][] mineField = new String[rows][collums];
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j < collums; j++) {
				mineField[i][j] = "[ ]";
			}
		}
		
		return mineField;
	}
	public static 
}
