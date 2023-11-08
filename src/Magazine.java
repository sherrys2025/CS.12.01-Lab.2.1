public class Magazine extends ReadingItem{
    private String coverStoryTitle;
    private String printDate;

    public String getCoverStoryTitle() {
        return coverStoryTitle;
    }

    public String getPrintDate() {
        return printDate;
    }

    public void setCoverStoryTitle(String coverStoryTitle) {
        this.coverStoryTitle = coverStoryTitle;
    }

    public void setPrintDate(String printDate) {
        this.printDate = printDate;
    }

    @Override
    public String toString() {
        return "Magazine{" + super.toString() +
                "coverStoryTitle='" + coverStoryTitle + '\'' +
                ", printDate='" + printDate + '\'' +
                '}';
    }
}
