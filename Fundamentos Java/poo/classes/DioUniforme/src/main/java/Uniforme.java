import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;


public class Uniforme {

    public static void main(String[] args) throws IOException {
        Tshirt[] tshirts;
        Tshirt tshirt;
        int N;
        boolean firstCase = true;
        String l;

        while (!(l = Leitura.read()).equals("0")) {

            if (l.equals("0")) {
                break;
            }

            N = Leitura.toInt(l);
            tshirts = new Tshirt[N];
            for (int i = 0; i < N; i++) {
                String owner = Leitura.read();
                String colorSize = Leitura.read();
                String detalhes[] = colorSize.split("//s+");
                String color = "";
                String size = "";
                for (int j = 0; j < detalhes.length; j++) {
                    if (j == 0) {
                        color = detalhes[0];
                    } else {
                        size = detalhes[1];
                    }
                }
                Tshirt uniforme = new Tshirt(size, color, owner);
                tshirts[i] = uniforme;
            }

            Arrays.sort(tshirts, new Comparator<Tshirt>() {
                        @Override
                        public int compare(Tshirt t1, Tshirt t2) {
                            String color1 = t1.getColor();
                            String color2 = t2.getColor();
                            int diff = color1.compareTo(color2);
                            if (diff != 0) {
                                return diff;
                            } else {
                                return 0;
                            }
                            if ((diff !=0) && (t1.getSize().equals("P") && t2.getSize().equals("M"))) {
                                return -1;
                            } else {
                                return 1;
                            }
                        });
            for()

                        {
                        }

                    }
                    Leitura.close();
        }
    }
}

interface Leitura {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    static void close() {
        out.close();
    }

    static String read() throws IOException {
        return in.readLine();
    }

    static int toInt(String s) {
        int i = Integer.parseInt(s);
        return i;
    }

}


class Tshirt {

    private String size;
    private String color;
    private String owner;

    public Tshirt(String size, String color, String owner) {
        this.size = size;
        this.color = color;
        this.owner = owner;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return this.getColor() + " " + this.getSize() + " " + this.getOwner();
    }
}

