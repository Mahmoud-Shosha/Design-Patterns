package simplefactory;

// It acts a simple factory for creation of different posts in our site
public class PostFactory {

	public static Post createPost(String type) {
		switch (type) {
		case "blog":
			return new BlogPost();
		case "news":
			return new NewsPost();
		case "product":
			return new ProductPost();
		default:
			throw new IllegalArgumentException("Invalid Post type");
		}
	}

}
