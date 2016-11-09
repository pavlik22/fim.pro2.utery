package picture;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PictureFileSource extends PictureSource{
	private static final String WAY = "img/";
	
	
	@Override
	public void fillMap() {
		getMap().put(Picture.BACKGROUND.getKey(), "background.png");
		//TODO
	}

	@Override
	public BufferedImage getPicture() throws IOException {
		return ImageIO.read(new File(WAY + getSource()));
		
	}

}
