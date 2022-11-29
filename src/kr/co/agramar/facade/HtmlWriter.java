package kr.co.agramar.facade;

import java.io.IOException;
import java.io.Writer;

public class HtmlWriter {
    private final Writer writer;

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    public void title(String title) throws IOException {
        String titleTemplate = """
                <html>
                    <head>
                        <title>%s</title>
                    </head>
                    <body>
                        <h1>%s</h1>
                """;
        writer.write(titleTemplate.formatted(title, title));
    }

    public void paragraph(String message) throws IOException {
        String paragraphTemplate = """
                        <p>%s</p>
                """;
        writer.write(paragraphTemplate.formatted(message));
    }

    public void link(String href, String caption) throws IOException {
        String linkTemplate = """
                <a href="%s">%s</a>""";
        paragraph(linkTemplate.formatted(href, caption));
    }

    public void mailTo(String mailAddress, String userName) throws IOException {
        link("mailto: " + mailAddress, userName);
    }

    public void close() throws IOException {
        writer.write("""
                    </body>
                </html>
                """);
        writer.close();
    }
}
