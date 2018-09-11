package after;

import java.util.HashMap;
import java.util.Map;

public class NotepadApp {
	
	public static Map<String,IMenuHandler> handlers = new HashMap<>();
	
	
	public void handleEvent(MenuEvent e){
		String menuLabel = e.getMenuLabel();
		IMenuHandler handler = handlers.get(menuLabel);
		handler.handleMenuClick();
		
		
	}

}
