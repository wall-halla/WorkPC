/**
 * 
 */
package items.armor;

import items.Item;

/**
 * @author jacob.wall
 *
 */
public class Armor extends Item {
//	static int MAX_ITEM_QUALITY = 9;
//	private String itemName;
//	private byte itemLevel;
//	private byte itemSizeX;
//	private byte itemSizeY;
//	private byte itemQuality;
	
	private byte armorDurability;
	private boolean sockets;
	private byte numSockets;
	
	public Armor(byte armorDurabilityByte, boolean socketsBoolean, byte numSocketsByte) {
	 super();
	}
}
