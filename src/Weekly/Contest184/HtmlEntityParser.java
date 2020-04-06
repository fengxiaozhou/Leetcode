package Weekly.Contest184;

public class HtmlEntityParser {

    public static String entityParser(String text) {
        StringBuilder builder = new StringBuilder(text);






        String res = text.replace("&amp;", "&")
                .replace("&quot;", "\"")
                .replace("&apos;", "\'")
                .replace("&gt;", ">")
                .replace("&lt;", "<")
                .replace("&frasl;", "/");

        return res;
    }



    public static void main(String[] args) {
        System.out.println(entityParser("and I quote: &quot;...&quot;"));
    }

}
