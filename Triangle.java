public class Triangle {
    public static void main(String[] args) {
        printTriangle(6);
    }

    public static String getLine(String ch, int len) {
        String line = "";

        for (int i = 1; i <= len; i++) {
            line = line + ch;
        }
        return line;
    }

    public static void printTriangle(int lineCount) {
        int spaceCount = lineCount - 1;
        int starCount = 1;
        for (int j = 0; j < lineCount; j++) {
            String space = " ";
            String star = "*";
            System.out.println(getLine(space, spaceCount) + getLine(star, starCount) + getLine(space, spaceCount));
            spaceCount = spaceCount - 1;
            starCount = starCount + 2;
        }
    }
}
