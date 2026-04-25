package CreationalPatterns.Factory.SimpleFactory.Example;

import java.time.LocalDateTime;

public class NewsPost extends Post{
    private String headLine;
    private LocalDateTime newsTime;

    public String getHeadLine() {
        return headLine;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }

    public LocalDateTime getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(LocalDateTime newsTime) {
        this.newsTime = newsTime;
    }
}
