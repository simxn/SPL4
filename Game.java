import javax.swing.JOptionPane;

public class Game {

	static int counter = 0;
	static int _rows = 3;
	static int _collums = 3;
	static int mines = 0;
	static String[][] field = setField(_rows, _collums, true);
	static String[][] playground = setField(_rows, _collums, false);

	public static void main(String[] args) {

		boolean end = false;
		while (end == false) {
			showField(false);
			int posRow = input("Please select a row.", _rows);
			int posCollum = input("Now, please choose a collum.", _collums);
			end = hitButton(posRow, posCollum);

		}
	}

	public static String[][] setField(int rows, int collums, boolean setMines) {
		String[][] mineField = new String[rows][collums];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < collums; j++) {
				mineField[i][j] = "[ ]";
			}
		}
		if (setMines == true) {

			mineField[(rows - 1)][0] = "[X]";
			mineField[(rows - 1)][(collums - 1)] = "[X]";
			mineField[0][(collums - 1)] = "[X]";
			mines = 3;
		}
		return mineField;
	}

	public static void showField(boolean showMines) {
		if (showMines == false) {
			for (int i = 0; i < _rows; i++) {
				for (int j = 0; j < _collums; j++) {
					System.out.print(playground[i][j]);
				}
				System.out.println();
			}
			System.out.println("---------");
			System.out.println();
		} else if (showMines == true) {
			for (int i = 0; i < _rows; i++) {
				for (int j = 0; j < _collums; j++) {
					if (field[i][j] == "[X]") {
						System.out.print(field[i][j]);
					} else {
						System.out.print(playground[i][j]);
					}
				}
				System.out.println();
			}
			System.out.println("---------");
			System.out.println();
		}
	}

	public static int input(String text, int max) {
		String input = JOptionPane.showInputDialog(text);
		if (Integer.parseInt(input) >= max) {
			System.out.println("Warning! Input's too large for this kind of size.");
		}
		return Integer.parseInt(input);
	}

	public static boolean hitButton(int rows, int collums) {
		if (field[rows][collums] == "[X]") {
			playground[rows][collums] = "[!]";
			System.out.println("Bang! - you've hit a mine!");
			System.out.println("Game over...");
			System.out.println("You had " + counter + " valid tries.");
			System.out.println();
			System.out.println("Solution:");
			showField(true);
			return true;
		} else {
			playground[rows][collums] = "[*]";
			counter++;
		}
		return false;
	}

}
