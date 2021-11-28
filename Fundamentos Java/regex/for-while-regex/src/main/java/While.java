import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class While {

    public static void main(String[] args) {

        String regex = "\\b(\\d{2})(\\d{5})(\\d{4})\\b";
        String replacementText = "($1) $2-$3";
        String source = "11992887722, 1234567, and 1234567890";


        String formattedSource = source.replaceAll(regex, replacementText);
        System.out.println(formattedSource);

        Pattern tel = Pattern.compile("\\b(\\d{2})[.](\\d{5})(\\d{4})\\b");
        Matcher mTel = tel.matcher("11.992887722 1199288772 ");
        while (mTel.find()) {
            System.out.println(mTel.group());
        }

        System.out.println("-----------------------");

        Pattern p = Pattern.compile("(\\d{4})[.](\\d{2})[.](\\d{2})");
        Matcher m = p.matcher("luiza 2021.01.10jjjj 2021.01.10");

        while ((m.find())){
            System.out.println(m.group());
        }
    }
}
