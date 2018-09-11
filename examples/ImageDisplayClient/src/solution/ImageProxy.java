package solution;

import java.awt.Canvas;

public class ImageProxy implements Image {
	
	private String url;
	GraphicImage realObject;

	public ImageProxy(String url){
		this.url = url;
	}

	@Override
	public void displayImage(Canvas c) {
		if(realObject == null){
			realObject = new GraphicImage(url);
		}
		realObject.displayImage(c);
	}

}
