package kr.co.agramar;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test {

    public static void main(String[] args) throws IOException {

        String input = "asdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdfasdf \n asdf";
        System.out.println(input);

        InputStream inputStream =  new ByteArrayInputStream(input.getBytes());

        byte[] buffer = new byte[100];
        inputStream.read(buffer); // A will contain "Hello" + rest of bytes.
        String inputString = new String(buffer);

        String target = "Hello"; // Same string but with no buffer

        System.out.println(new String(buffer));
    }
}
