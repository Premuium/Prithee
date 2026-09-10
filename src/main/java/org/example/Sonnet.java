package org.example;

public class Sonnet {
    static String tempSonnet = """
                Shall I compare thee to a summer's day?
                Thou art more lovely and more temperate:
                Rough winds do shake the darling buds of May,
                And summer's lease hath all too short a date;
                Sometime too hot the eye of heaven shines,
                And often is his gold complexion dimm'd;
                And every fair from fair sometime declines,
                By chance or nature's changing course untrimm'd;
                But thy eternal summer shall not fade,
                Nor lose possession of that fair thou ow'st;
                Nor shall death brag thou wander'st in his shade,
                When in eternal lines to time thou grow'st:
                   So long as men can breathe or eyes can see,
                   So long lives this, and this gives life to thee.
                """;

    final static String[] sonnet = tempSonnet
            .replaceAll("(?<!\\w)'|'(?!\\w)|[^\\w\\s']", "")
            .toLowerCase()
            .split("\\s+");
    final static String[] punctuatedSonnet = tempSonnet
            .trim()
            .split("\\s+");

    public static void printSonnet(int wordPick) {
        int i = 0;
        for(i = 0; i < wordPick; i++) {
            System.out.print(punctuatedSonnet[i]);
            if (punctuatedSonnet[i].endsWith(";") || punctuatedSonnet[i].endsWith(":") || punctuatedSonnet[i].endsWith(".") || punctuatedSonnet[i].endsWith("?")) {
                System.out.println();
                continue;
            }
            System.out.print(" ");
        }
        for(i = 0; i < sonnet[wordPick].length(); i++){
            System.out.print("_");
        }
        System.out.println("?");
    }
}
