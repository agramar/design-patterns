package io.github.agramar.facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {

    }

    public static void makeWelcomePage(String mailAddress, String fileName) {
        try (FileWriter fw = new FileWriter(fileName)) {
            Properties mailProp = Database.getProperties("maildata");
            String userName = (String) mailProp.get(mailAddress);
            HtmlWriter htmlWriter = new HtmlWriter(fw);
            htmlWriter.title("Welcome to " + userName + "'s page!");
            htmlWriter.paragraph(userName + "의 페이지에 오신 걸 환영합니다.");
            htmlWriter.paragraph("메일을 기다리고 있습니다.");
            htmlWriter.mailTo(mailAddress, userName);
            htmlWriter.close();
            System.out.println(fileName + " is created for " + mailAddress + " (" + userName + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
