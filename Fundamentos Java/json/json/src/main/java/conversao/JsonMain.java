package conversao;

import org.json.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class JsonMain{

    public static void main(String[] args) {

        MetodosJSONArray metodosJSONArray = new MetodosJSONArray();
        MetodosJSONStringer metodosString = new MetodosJSONStringer();
        MetodosJSONObject metodosJSONObject1 = new MetodosJSONObject();
        MetodosJSONObject metodosJSONObject2 = new MetodosJSONObject();
        MetodosJSONObject metodosJSONObject3 = new MetodosJSONObject();
        MetodosJSONWriter metodosJSONWriter = new MetodosJSONWriter();
        MetodosJSONTokener metodosJSONTokener = new MetodosJSONTokener();
        MetodosXML metodosXML = new MetodosXML();
        MetodosCookies metodosCookies = new MetodosCookies();
        MetodosHTTP metodosHTTP = new MetodosHTTP();
        MetodosCDL metodosCDL = new MetodosCDL();
        MetodosProperties metodosProperties = new MetodosProperties();

        MetodosJSONArray.JSONObjectToArray();
        metodosJSONArray.JSONExampleArray1();
        metodosJSONArray.JSONExampleArray2();
        metodosString.JSONExampleStringer();
        metodosJSONObject1.JSONExampleObject1();
        metodosJSONObject2.JSONExampleObject2();
        metodosJSONObject3.JSONExampleObject3();
        metodosJSONWriter.JSONExampleWriter();
        metodosJSONTokener.JSONExampleTokener();
        metodosXML.XMLToExampleConversion();
        metodosXML.XMLFromExampleConversion();
        metodosCookies.CookieToExampleConversion();
        metodosCookies.CookieFromExampleConversion();
        metodosHTTP.HTTPToExampleConversion();
        metodosHTTP.HTTPFromExampleConversion();
        metodosCDL.CDLToExampleConversion();
        metodosCDL.CDLFromExampleConversion();
        metodosProperties.PropertyToExampleConversion();
        metodosProperties.PropertyFromExampleConversion();
    }
}

class MetodosJSONArray {


    public static void JSONObjectToArray() {

        System.out.println("---------JSONExampleArray----------");

        String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";

        JSONObject example = new JSONObject(string);

        JSONArray keyStrings = listNumberArray(example.length());
        JSONArray array = example.toJSONArray(keyStrings);

        //Primeira Alteração
        JSONObject object = array.toJSONObject(keyStrings);
        System.out.println("JSONArray FINAL (Array [valores]): " + array);

        //Segunda Alteração
        System.out.println("JSONArray FINAL (Array [Chaves e Valores]): " + object);
        System.out.println();
    }


    public static void JSONExampleArray1() {

        System.out.println("---------JSONExampleArray1----------");

        String arrayStr =
                "["+"true,"+"false,"+ "\"true\","+ "\"false\","+"\"hello\","+"23.45e-4,"+
                        "\"23.45\","+"42,"+"\"43\","+"["+"\"world\""+"],"+
                        "{"+
                        "\"key1\":\"value1\","+
                        "\"key2\":\"value2\","+
                        "\"key3\":\"value3\","+
                        "\"key4\":\"value4\""+
                        "},"+
                        "0,"+"\"-1\""+
                        "]";

        JSONArray array = new JSONArray();
        array.put(arrayStr);
        System.out.println("Valores do Array: "+ array);

        JSONArray list = listNumberArray(array.length());
        System.out.println("Chaves do Array: "+ list.toString());
        JSONObject object = array.toJSONObject(list);
        System.out.println("JSONOBject FINAL: " + object);

        System.out.println();

    }

    public static void JSONExampleArray2() {

        System.out.println("---------JSONExampleArray2----------");

        JSONArray array = new JSONArray();
        array.put("value");
        array.put(5);
        array.put(-23.45e67);
        array.put(true);

        JSONArray list = listNumberArray(array.length());

        JSONObject object = array.toJSONObject(list);
        System.out.println("JSONOBject FINAL: " + object);
        System.out.println();
    }

    private static JSONArray listNumberArray(int max){
        JSONArray res = new JSONArray();
        for (int i=0; i<max;i++) {
            res.put(String.valueOf(i));
        }
        return res;
    }

}

class MetodosJSONStringer {

    public static void JSONExampleStringer() {

        System.out.println("---------JSONExampleStringer----------");

        JSONStringer jsonStringer = new JSONStringer();

        jsonStringer.object();

        jsonStringer.key("trueValue").value(true);
        jsonStringer.key("falseValue").value(false);
        jsonStringer.key("nullValue").value(null);
        jsonStringer.key("stringValue").value("hello world!");
        jsonStringer.key("complexStringValue").value("h\be\tllo w\u1234orld!");
        jsonStringer.key("intValue").value(42);
        jsonStringer.key("doubleValue").value(-23.45e67);

        jsonStringer.endObject();

        String str = jsonStringer.toString();
        JSONObject jsonObject = new JSONObject(str);

        System.out.println("JSONOBject FINAL: " + jsonObject);
        System.out.println();
    }
}

class MetodosJSONObject {

    public static void JSONExampleObject1() {

        System.out.println("---------JSONExampleObject1----------");

        String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
        JSONObject example = new JSONObject(string);
        System.out.println("JSONObject FINAL: " + example);
        System.out.println();

    }

    public static void JSONExampleObject2() {

        System.out.println("---------JSONExampleObject2----------");

        JSONObject example = new JSONObject();

        example.put("key", "value");
        example.put("key2", 5);
        example.put("key3", -23.45e67);
        example.put("trueValue", true);

        System.out.println("JSONOBject FINAL: " + example);
        System.out.println();
    }

    public static void JSONExampleObject3() {

        System.out.println("---------JSONExampleObject3----------");

        Map<String, Double> map = new HashMap<String, Double>();

        map.put("key1", 1.0);
        map.put("key2", -23.45e67);

        JSONObject example = new JSONObject(map);
        System.out.println("JSONOBject FINAL: " + example);
        System.out.println();
    }
}

class MetodosJSONWriter{

    public static void JSONExampleWriter() {

        System.out.println("---------JSONExampleWriter----------");

        StringBuilder write = new StringBuilder();
        JSONWriter jsonWriter = new JSONWriter(write);

        jsonWriter.object();

        jsonWriter.key("trueValue").value(true);
        jsonWriter.key("falseValue").value(false);
        jsonWriter.key("nullValue").value(null);
        jsonWriter.key("stringValue").value("hello world!");
        jsonWriter.key("complexStringValue").value("h\be\tllo w\u1234orld!");
        jsonWriter.key("intValue").value(42);
        jsonWriter.key("doubleValue").value(-23.45e67);

        jsonWriter.endObject();

        System.out.println("JSON: " + write.toString());
        System.out.println();
    }
}

class MetodosJSONTokener{

    public static void JSONExampleTokener(){

        System.out.println("---------JSONExampleTokener----------");

        String string= "Esta não é uma string JSON válida";

        JSONTokener token= new JSONTokener(string);
        //JSONObject object= new JSONObject(token);
        //JSONArray array= new JSONArray(token);
        System.out.println();
    }
}

class MetodosXML{

    public static void XMLToExampleConversion() {

        System.out.println("---------XMLToExampleConversion----------");

        String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
        JSONObject example = new JSONObject(string);

        String output = XML.toString(example);
        System.out.println("XML FINAL: " + output);
        System.out.println();
    }

    public static void XMLFromExampleConversion() {

        System.out.println("---------XMLFromExampleConversion----------");

        String string = "<0>value</0><1>5</1><2>-2.345E+68</2><3>true</3>";
        JSONObject output = XML.toJSONObject(string);
        System.out.println("JSONObject FINAL: " + output);
        System.out.println();
    }
}

class MetodosCookies{

    public static void CookieToExampleConversion() {

        System.out.println("---------CookieToExampleConversion----------");

        String string = "{\"name\":\"Cookie-Name\",\"value\":\"name\",\"1\":5,\"2\":-2.345E68,\"3\":'true'}";
        JSONObject example = new JSONObject(string);

        String output = Cookie.toString(example);
        System.out.println("Cookie FINAL: " + output);
        System.out.println();
    }

    public static void CookieFromExampleConversion() {

        System.out.println("---------CookieFromExampleConversion----------");

        String string = "Cookie-Name=name;1=5;2=-2.345E%2b68;3=true";
        JSONObject output = Cookie.toJSONObject(string);
        System.out.println("JSONObject FINAl: " + output);
        System.out.println();
    }
}

class MetodosHTTP{

    public static void HTTPToExampleConversion() {

        System.out.println("---------HTTPToExampleConversion----------");

        String string = "{\"Method\":\"POST\",\"Request-URI\":'/',\"HTTP-Version\":'HTTP/1.1',\"Value1\":true,\"Value2\":2,\"Value3\":-2.345E68}";

        JSONObject example = new JSONObject(string);
        String output = HTTP.toString(example);
        System.out.println("HTTP FINAL: " + output);
    }

    public static void HTTPFromExampleConversion() {

        System.out.println("---------HTTPFromExampleConversion----------");

        String string = "Final HTTP: POST '/' HTTP/1.1 Value3: -2.345E+68 Value1: true Value2: 2";

        JSONObject output = HTTP.toJSONObject(string);
        System.out.println("JSONObject FINAL: " + output);
        System.out.println();
    }
}

class MetodosCDL{

    public static void CDLToExampleConversion() {

        System.out.println("---------CDLToExampleConversion----------");


        String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
        JSONObject example = new JSONObject(string);

        String string2 = "{\"0\":\"value2\",\"1\":6,\"2\":-8.345E68,\"3\":false}";
        JSONObject example2 = new JSONObject(string2);

        JSONArray array = new JSONArray();
        array.put(example);
        array.put(example2);

        String output = CDL.toString(array);
        System.out.println("CDL FINAL: \r\n" + output);
        System.out.println();
    }

    public static void CDLFromExampleConversion() {

        System.out.println("---------CDLFromExampleConversion----------");

        String string = "0,1,2,3\n"
        + "value,5,-2.345E+68,true\n"
        + "value2,6,-8.345E+68,false";

        JSONArray output = CDL.toJSONArray(string);
        System.out.println("JSONArray FINAL: " + output);
        System.out.println();
    }
}

class MetodosProperties{

    public static Properties PropertyToExampleConversion() {

        String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
        JSONObject example = new JSONObject(string);

        Properties output = Property.toProperties(example);
        //System.out.println("Properties FINAL: " + output);;
        return output;
    }

    public static void PropertyFromExampleConversion() {

        System.out.println("---------PropertyToExampleConversion E PropertyFromExampleConversion----------");

        Properties input = PropertyToExampleConversion();

        System.out.println("Properties FINAL: " + input);
        System.out.println();

        JSONObject output = Property.toJSONObject(input);
        System.out.println("JSONObject FINAL: " + output);
    }
}