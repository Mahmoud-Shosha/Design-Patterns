package facade2;

import java.io.File;

import facade2.facade.VideoConversionFacade;

public class Client {

	public static void main(String[] args) {
		VideoConversionFacade converter = new VideoConversionFacade();
		File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
		System.out.println(mp4Video);
	}

}
