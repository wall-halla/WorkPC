package tetris;

public class Logic {

	public static void main(String[] args) {
		byte tetID;
		
		GameWell well = new GameWell(50, 100);
		for (tetID = 0; tetID <= 6; tetID++) {
			Tetrimino tet = new Tetrimino(tetID);
			tet.printTetrimino();
			System.out.println("");
		}
		
	}

}
