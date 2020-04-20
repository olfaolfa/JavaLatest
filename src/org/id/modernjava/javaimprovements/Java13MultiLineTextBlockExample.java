package org.id.modernjava.javaimprovements;

public class Java13MultiLineTextBlockExample {
    public static void main(String[] args) {
        String st1 = """
                Hello World
                Using
                text blocks !""";
        System.out.println("st1 = " + st1);
        String phrase = """
                                    {
                                     name : olfa
                                     id:10
                                     type:FB
                                    }

                """;
        System.out.println("phrase = " + phrase);
        String html = """
                            <html>
                                <body>
                                    <p> "JAVA" </p>
                                </body>
                            </html>
                """;
        System.out.println("html = " + html);
        String st2 = st1.concat("This is my first text " + "block");
    }
}
