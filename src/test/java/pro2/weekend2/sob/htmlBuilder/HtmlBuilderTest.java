package pro2.weekend2.sob.htmlBuilder;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class HtmlBuilderTest {
    HtmlBuiler htmlBuiler;
    @Before
    public void setUp() throws Exception {
        htmlBuiler = new HtmlBuiler();
    }

    @Test
    public void build_should_generate_empty_html_when_no_input_given() {

        //given
        String expected = "<!DOCTYPE html>\n" +
        "<html lang=\"EN\">\n" +
                "<head>\n" +
                "<title></title>\n" +
                "</head>\n" +
                "<body>\n" +
                "</body>\n" +
                "</html>";

        //when
        String result = htmlBuiler
                .withLanguage("PL")
                .build();

        //then
        assertEquals(expected, result);
    }

    @Test
    public void build_should_generate_html_with_given_language() {

        //given
        String expected = "<!DOCTYPE html>\n" +
                "<html lang=\"PL\">\n" +
                "<head>\n" +
                "<title></title>\n" +
                "</head>\n" +
                "<body>\n" +
                "</body>\n" +
                "</html>";

        //when
        String result = htmlBuiler.build();

        //then
        assertEquals(expected, result);

    }

    @Test
    public void build_should_generate_html_with_given_title() {

        //given
        String expected = "<!DOCTYPE html>\n" +
                "<html lang=\"EN\">\n" +
                "<head>\n" +
                "<title>Dobry tytuł</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "</body>\n" +
                "</html>";

        //when
        String result = htmlBuiler
                .withTitle("Dobry tytuł")
                .build();

        //then
        assertEquals(expected, result);

    }

    @Test
    public void build_should_generate_html_with_given_paragraph() {

        //given
        String expected = "<!DOCTYPE html>\n" +
                "<html lang=\"EN\">\n" +
                "<head>\n" +
                "<title></title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<p>First paragraph</p>\n" +
                "</body>\n" +
                "</html>";

        //when
        String result = htmlBuiler
                .withParagraph("First paragraph")
                .build();

        //then
        assertEquals(expected, result);

    }

    @Test
    public void build_should_generate_html_with_given_paragraphs() {

        //given
        String expected = "<!DOCTYPE html>\n" +
                "<html lang=\"EN\">\n" +
                "<head>\n" +
                "<title></title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<p>First paragraph</p>\n" +
                "<p>Second paragraph</p>\n" +
                "</body>\n" +
                "</html>";

        //when
        String result = htmlBuiler
                .withParagraph("First paragraph")
                .withParagraph("Second paragraph")
                .build();

        //then
        assertEquals(expected, result);

    }

}