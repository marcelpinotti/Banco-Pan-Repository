import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ClassMain {

    public static void main(String[] args) throws IOException, ParseException {

        JSONObject criandoJson = new JSONObject();

        criandoJson.put( "Julio", 25);
        criandoJson.put("Pedro", 33);
        criandoJson.put("Maria", 25);
        criandoJson.put("Rose", 44);
        criandoJson.put("Mario", 35);
        criandoJson.put("João", 28);

        PrintWriter salvar = new PrintWriter("./src/main/java/teste.json");

        salvar.write(criandoJson.toJSONString());
        salvar.flush();
        salvar.close();

        Object criandoObj = new JSONParser().parse(new FileReader("./src/main/java/teste.json"));

        JSONObject criandoJsonOBJ = (JSONObject) criandoObj;

        Iterator<JSONObject> iterator1 = criandoJsonOBJ.keySet().iterator();
        Iterator<JSONObject> iterator2 = criandoJsonOBJ.values().iterator();
        while (iterator1.hasNext()){
            System.out.println("Nome: " + iterator1.next() + " / idade: " + iterator2.next());
        }

    }
}
