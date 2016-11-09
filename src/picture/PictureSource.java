package picture;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public abstract class PictureSource {
	private String source;
	
	private Map<String, String> map;  //kl��(nap�. hr��) a odkud si ho m� vz�t = v�znam string�
	
	public PictureSource() {
		map = new HashMap<>();
	}
	
	public abstract void fillMap();
	
	public abstract BufferedImage getPicture() throws IOException;
	
	
	public Map<String, String> getMap() {
		return map;
	}
	
	public void setSource(String key) {
		this.source = map.get(key);
	}
	
	public String getSource() {
		return source;
	}
	
	
}
