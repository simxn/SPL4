import javax.swing.JOptionPane;

public class Game {
	public static void main(String[] args) {

		String[][] field = setField(3, 3);
		// field = setMine(0, 3);
		boolean end = false;
		while (end == false) {
			showField(field, 3, 3);
			int posRow = input("Please select a row.");
			int posCollum = input("Now, please choose a collum.");
		}
	}

	public static String[][] setField(int rows, int collums) {
		String[][] mineField = new String[rows][collums];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < collums; j++) {
				mineField[i][j] = "[ ]";
			}
		}
		mineField[2][0] = "[X]";
		return mineField;
	}

	public static void showField(String[][] field, int rows, int collums) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < collums; j++) {
				System.out.print(field[i][j]);
			}
			System.out.println();
		}
		System.out.println("---------------");
		System.out.println();
	}

	public static int input(String text) {
		String input = JOptionPane.showInputDialog(text);
		return Integer.parseInt(input);
	}
}
