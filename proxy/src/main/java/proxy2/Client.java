package proxy2;

import proxy2.medialibrary.ThirdPartyYouTubeClass;
import proxy2.medialibrary.ThirdPartyYouTubeLib;
import proxy2.proxy.YouTubeCacheProxy;

public class Client {

	public static void main(String[] args) {
		ThirdPartyYouTubeClass naiveDownloader = new ThirdPartyYouTubeClass();
		YouTubeCacheProxy smartDownloader = new YouTubeCacheProxy();

		System.out.println("==================================================================> Naive Downloader ");
		long naive = test(naiveDownloader);
		System.out.println("==================================================================> Smart Downloader ");
		long smart = test(smartDownloader);
		System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

	}

	private static long test(ThirdPartyYouTubeLib downloader) {
		long startTime = System.currentTimeMillis();

		// User behavior in our app
		downloader.popularVideos();
		downloader.getVideo("catzzzzzzzzz");
		downloader.popularVideos();
		downloader.getVideo("dancesvideoo");
		downloader.getVideo("catzzzzzzzzz");

		long estimatedTime = System.currentTimeMillis() - startTime;
		System.out.print("Time elapsed: " + estimatedTime + "ms\n");
		return estimatedTime;
	}

}
