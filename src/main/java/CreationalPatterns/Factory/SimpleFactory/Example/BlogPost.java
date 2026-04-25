package CreationalPatterns.Factory.SimpleFactory.Example;

public class BlogPost extends Post{
    private String Author;
    private String[] tags;

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
}
