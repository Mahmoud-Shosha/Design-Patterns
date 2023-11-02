package simplefactory;

import java.time.LocalDate;

// It represents a news post
public class NewsPost extends Post {

	private String headLne;
	private LocalDate newsTime;

	public String getHeadLne() {
		return headLne;
	}

	public void setHeadLne(String headLne) {
		this.headLne = headLne;
	}

	public LocalDate getNewsTime() {
		return newsTime;
	}

	public void setNewsTime(LocalDate newsTime) {
		this.newsTime = newsTime;
	}

}
