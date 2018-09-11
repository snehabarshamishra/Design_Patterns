package v1;

import java.util.ArrayList;
import java.util.List;

public class ImagesDAO {
	
	public List<Image> getImagesFromDB(){
		// connect to DB and get all image URLs
		String[] urls = queryTheDB();
		List<Image> images = new ArrayList<Image>();
		for(String url : urls){
			images.add(new GraphicImage(url));
		}
		return images;
	}
	
	private String[] queryTheDB(){
		String[] s = {"http://server.com/image1.jpg",
			"http://server.com/image2.jpg",
			"http://server.com/image3.jpg"};
		return s;
		}
	

}
