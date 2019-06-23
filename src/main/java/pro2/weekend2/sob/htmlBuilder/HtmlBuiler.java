package pro2.weekend2.sob.htmlBuilder;

import java.util.ArrayList;

public class HtmlBuiler {
    private String language;
    private String title;
    private ArrayList<String> paragraph;

    public String build() {
        String temp = createParagraph();
        return "<!DOCTYPE html>\n" +
                "<html lang=\"" + language + "\">\n" +
                "<head>\n" +
                "<title>" + title + "</title>\n" +
                "</head>\n" +
                "<body>\n" +
                createParagraph() +                "</body>\n" +
                "</html>";
    }

    private String createParagraph() {
        return paragraph.stream()
                .map(paragraph -> "<p>" + paragraph + "</p>\n")
                .reduce((result,current) -> result + current)
                .orElse("");
    }

    public HtmlBuiler withLanguage(String pl) {
        this.language = language;
        return this;
    }

    public HtmlBuiler withTitle(String title) {
        this.title = title;
        return this;
    }

    public HtmlBuiler withParagraph(String paragraph) {
        this.paragraph.add(paragraph);
        return null;
    }
}
