package tetris;

public class Tetrimino {
	static final byte TETRIMINO_MAX_HEIGHT = 4;
	static final byte TETRIMINO_MAX_WIDTH = 4;
	static final byte NUM_TETRIMINO_TYPES = 7;

	private char color;
	private boolean tetriminoShape[][];
	private byte posX; // for future use, to decide where to start the tetrimino
	private int posY; // for future use, to decide where to start the tetrimino

	Tetrimino(byte tetriminoID) {
		switch (tetriminoID) {
		case 0: { // Tetrimino I
			boolean tetriminoShapeArray[][] = { { false, false, false, false }, { true, true, true, true },
					{ false, false, false, false }, { false, false, false, false } };
			this.tetriminoShape = tetriminoShapeArray;
			this.color = 'M'; // Magenta
			break;
		}
		case 1: { // Tetrimino T
			boolean tetriminoShapeArray[][] = { { false, false, false, false }, { true, true, true, false },
					{ false, true, false, false }, { false, false, false, false } };
			this.tetriminoShape = tetriminoShapeArray;
			this.color = 'R'; // Red
			break;
		}
		case 2: { // Tetrimino Square
			boolean tetriminoShapeArray[][] = { { false, false, false, false }, { false, true, true, false },
					{ false, true, true, false }, { false, false, false, false } };
			this.tetriminoShape = tetriminoShapeArray;
			this.color = 'S'; // Seafoam green
			break;
		}
		case 3: { // Tetrimino Z
			boolean tetriminoShapeArray[][] = { { false, false, false, false }, { false, true, true, false },
					{ false, false, true, true }, { false, false, false, false } };
			this.tetriminoShape = tetriminoShapeArray;
			this.color = 'G'; // Green
			break;
		}
		case 4: { // Tetrimino S
			boolean tetriminoShapeArray[][] = { { false, false, false, false }, { false, true, true, false },
					{ true, true, false, false }, { false, false, false, false } };
			this.tetriminoShape = tetriminoShapeArray;
			this.color = 'L'; // Light Blue
			break;
		}
		case 5: { // Tetrimino L
			boolean tetriminoShapeArray[][] = { { false, false, false, false }, { true, true, true, false },
					{ false, false, true, false }, { false, false, false, false } };
			this.tetriminoShape = tetriminoShapeArray;
			this.color = 'D'; // Dark Blue
			break;
		}
		case 6: { // Tetrimino J
			boolean tetriminoShapeArray[][] = { { false, false, false, false }, { false, true, true, true },
					{ false, true, false, false }, { false, false, false, false } };
			this.tetriminoShape = tetriminoShapeArray;
			this.color = 'Y'; // Yellow
			break;
		}
		}// END SWITCH
	}// END CONSTRUCTOR

	public void printTetrimino() {
		int index;
		int index2;
		for (index = 0; index < TETRIMINO_MAX_HEIGHT; index++) {
			for (index2 = 0; index2 < TETRIMINO_MAX_WIDTH; index2++) {
				if (tetriminoShape[index][index2] == true)
					System.out.print(1);
				else
					System.out.print(0);
			}
			System.out.println("");
			;
		}
	}

	public void rotateRight() {
		byte indexCol;
		byte indexRow;
		byte normX = 0;
		byte normY = 0;
		boolean tempArray[][] = new boolean[TETRIMINO_MAX_HEIGHT][TETRIMINO_MAX_WIDTH];
		copyArray(tempArray);
		this.zeroArray();
		for (indexRow = TETRIMINO_MAX_WIDTH - 1; indexRow >= 0; indexRow--) {
			for (indexCol = 0; indexCol < TETRIMINO_MAX_HEIGHT; indexCol++) {
				tetriminoShape[indexCol][indexRow] = tempArray[normY][normX];
				normX++;
			}
			normX = 0;
			normY++;
		}

	}

	public void rotateLeft() {
		byte indexCol;
		byte indexRow;
		byte normX = 0;
		byte normY = 0;
		boolean tempArray[][] = new boolean[TETRIMINO_MAX_HEIGHT][TETRIMINO_MAX_WIDTH];
		copyArray(tempArray);
		this.zeroArray();
		for (indexRow = 0; indexRow < TETRIMINO_MAX_WIDTH; indexRow++) {
			for (indexCol = TETRIMINO_MAX_HEIGHT - 1; indexCol >= 0; indexCol--) {
				tetriminoShape[indexCol][indexRow] = tempArray[normY][normX];
				normX++;
			}
			normX = 0;
			normY++;
		}

	}

	private void zeroArray() {
		byte index1 = 0;
		byte index2 = 0;
		for (index1 = 0; index1 < TETRIMINO_MAX_WIDTH; index1++) {
			for (index2 = 0; index2 < TETRIMINO_MAX_HEIGHT; index2++) {
				this.tetriminoShape[index1][index2] = false;
			}
		}
	}

	private void copyArray(boolean array[][]) {
		byte index1 = 0;
		byte index2 = 0;
		for (index1 = 0; index1 < TETRIMINO_MAX_WIDTH; index1++) {
			for (index2 = 0; index2 < TETRIMINO_MAX_HEIGHT; index2++) {
				array[index1][index2] = this.tetriminoShape[index1][index2];
			}
		}
	}
}
