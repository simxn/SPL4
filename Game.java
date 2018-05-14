import javax.swing.JOptionPane;

public class Game {
	
	static int _rows = 3;
	static int _collums = 3;
	static String[][] field = setField(_rows, _collums);
	
	public static void main(String[] args) {

		boolean end = false;
		while (end == false) {
			showField();
			int posRow = input("Please select a row.");
			int posCollum = input("Now, please choose a collum.");
			end = hitButton(posRow, posCollum);
			
		}
	}

	public static String[][] setField(int rows, int collums) {
		String[][] mineField = new String[rows][collums];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < collums; j++) {
				mineField[i][j] = "[ ]";
			}
		}
		mineField[(rows - 1)][0] = "[X]";
		mineField[(rows - 1)][collums - 1] = "[X]";
		mineField[0][(collums - 1)] = "[X]";
		
		return mineField;
	}

	public static void showField() {
		for (int i = 0; i < _rows; i++) {
			for (int j = 0; j < _collums; j++) {
				System.out.print(field[i][j]);
			}
			System.out.println();
		}
		System.out.println("---------");
		System.out.println();
	}

	public static int input(String text) {
		String input = JOptionPane.showInputDialog(text);
		return Integer.parseInt(input);
	}
	public static boolean hitButton(int rows, int collums) {
		if(field[rows][collums] == "[X]") {
			System.out.println("Bang! - you've hit a mine!");
			System.out.println("Game over...");
			return true;
		}
		return false;
	}

}
