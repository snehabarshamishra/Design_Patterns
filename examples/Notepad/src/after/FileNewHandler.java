package after;

public class FileNewHandler implements IMenuHandler{

	static{
		NotepadApp.handlers.put("new", new FileNewHandler());
	}
	@Override
	public void handleMenuClick() {
		//logic of creating new document
		
	}

}
