/**
 * 
 */
package items;

/**
 * @author jacob.wall
 *
 */

public class Item {
	static int MAX_ITEM_QUALITY = 9;
			
	private String itemName;
	private byte itemLevel;
	private byte itemSizeX;
	private byte itemSizeY;
	private byte itemQuality;
		
	public Item() {
		
	}
	
	public Item(String itemNameString, byte itemLevelByte, byte itemSizeXByte, byte itemSizeYByte, byte itemQualityByte){
		
	}
	
	private void setItemName(String nameString) {
		itemName = nameString;
	}
	
	private void setItemLevel(byte levelByte) {
		itemLevel = levelByte;
	}
	
	private void setItemSizeX(byte itemSizeXByte) {
		itemSizeX = itemSizeXByte;
	}
	
	private void setItemSizeY(byte itemSizeYByte) {
		itemSizeY = itemSizeYByte;
	}
	
	private void setItemQuality(byte itemQualityByte) {
		itemQuality = itemQualityByte;
	}
}
