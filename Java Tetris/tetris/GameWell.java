package tetris;

public class GameWell {
	static final int MAX_WELL_WIDTH = 50;
	static final int MAX_WELL_HEIGHT = 200;
	
	private boolean wellArray[][];
	private int width;
	private int height;
	
	GameWell(int width, int height){
		
	}
	
	//Mutators
	private void setHeight(int heightArg) {
		this.height = heightArg;
	}
	private void setWidth(int widthArg) {
		this.width = widthArg;
	}
	public void initializeWell(int height, int width) {
		byte indexRow=0;
		byte indexCol=0;
		
		for (indexRow=0; indexRow<height; indexRow++) {
			for (indexCol=0; indexCol<width; indexCol++) {
				wellArray[indexRow][indexCol] = false;
			}
		}
	}
	
	//Accessors
	public void printWell() {
		byte indexRow=0;
		byte indexCol=0;
		
		for (indexRow=0; indexRow<height; indexRow++) {
			for (indexCol=0; indexCol<width; indexCol++) {
				System.out.print(wellArray[indexRow][indexCol]);
			}
			System.out.println("");
		}
	}
	
	
}
