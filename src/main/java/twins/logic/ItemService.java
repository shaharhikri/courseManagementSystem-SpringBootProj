package twins.logic;

import java.util.List;

import twins.item.ItemBoundary;

public interface ItemService {
	public ItemBoundary createItem(String userSpace, String userEmail, ItemBoundary item);
	
	public ItemBoundary updateItem(String userSpace, String userEmail, String itemSpace, String itemId, ItemBoundary update);
	
	public List<ItemBoundary> getAllItems(String userSpace, String userEmail);
	
	public ItemBoundary getSpecificItem(String userSpace, String userEmail, String itemSpace, String itemId);
	
	public void deleteAllItems(String adminSpace, String adminEmail);
}
