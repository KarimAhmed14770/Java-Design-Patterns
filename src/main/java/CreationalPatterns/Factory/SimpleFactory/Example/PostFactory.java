package CreationalPatterns.Factory.SimpleFactory.Example;

public class PostFactory {
    static public Post createPost(String type){
        switch (type){
            case "news":
                return new NewsPost();

            case "blog":
                return new BlogPost();

            case "product":
                return new ProductPost();
            default: throw new IllegalArgumentException();
        }
    }
}
