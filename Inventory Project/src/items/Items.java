/**
 * 
 */
package items;

/**
 * @author jacob.wall
 *
 */
public class Items {
//	private int itemID;
	private String itemName;
	private enum itemQuality {RUSTY, }
	private int itemLevel;
	private int itemValue;
	private int itemSize;

	Items() { // default constructor
//		itemID = 0;
		itemName = "default";
		itemQuality = 0;
		itemLevel = 1;
		itemValue = 10;
	}
	
	Items(String itemNameString, int itemQualityInt, int itemLevelInt, int itemValueInt){
		itemName = itemNameString;
		itemQuality = itemQualityInt;
		itemLevel = itemLevelInt;
		itemValue = itemValueInt;
	}
	
//	public int getItemID() {
//		return itemID;
//	}
	
	public String getItemName() {
		return itemName;
	}
	
	public int getItemQuality() {
		return itemQuality;
	}
	
	public int getItemLevel() {
		return itemLevel;
	}
	
	public int getItemValue() {
		return itemValue;
	}
	
	private void setItemName(String itemNameString) {
		itemName = itemNameString;
	}
	
	private void setItemQuality(int itemQualityInt) {
		itemQuality = itemQualityInt;
	}
	
	private void setItemLevel(int itemLevelInt) {
		itemLevel = itemLevelInt;
	}
	
	private void setItemValue(int itemValueInt) {
		itemValue = itemValueInt;
	}
	
	
} // END OF ITEMS CLASS
