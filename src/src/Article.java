public class Article{
    private String paperid, name, publisherName, publisherYear;
    public Article(String paperid, String name, String publisherName, String publisherYear) {
        this.paperid = paperid;
        this.name = name;
        this.publisherName = publisherName;
        this.publisherYear = publisherYear;

    }
    public String  article_use(){
        return String.format("%s\t%s\t%s\t%s",paperid,name,publisherName,publisherYear);
    }
    public String getPaperid() {
        return paperid;
    }

}
