package resthulp.annelore.testje1.input;

//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;

import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONArray;
import org.json.JSONObject;
import resthulp.annelore.testje1.model.VragenPOJO;

import java.io.FileReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainGET {

   public static List<VragenPOJO> vragen = new ArrayList<>();

   public static void main(String[] args) {
      try {

         URL url = new URL("https://opentdb.com/api.php?amount=5");

         HttpURLConnection conn = (HttpURLConnection) url.openConnection();
         conn.setRequestMethod("GET");
         conn.connect();

         //Getting the response code
         int responsecode = conn.getResponseCode();

         if (responsecode != 200) {
            throw new RuntimeException("HttpResponseCode: " + responsecode);
         } else {

            String inline = "";
            Scanner scanner = new Scanner(url.openStream());

            //Write all the JSON data into a string using a scanner
            while (scanner.hasNext()) {
               inline += scanner.nextLine();
            }

            //Close the scanner
            scanner.close();

            JSONObject obj = new JSONObject(inline);

            JSONArray results = obj.getJSONArray("results");
            System.out.println(results);

            for (int i = 0; i < results.length(); i++) {
               VragenPOJO vraag = new VragenPOJO();
               JSONObject question = results.getJSONObject(i);

               vraag.setDifficulty(question.getString("difficulty"));

               vragen.add(vraag);
            }
            System.out.println(vragen);

         }

      } catch (Exception e) {
         e.printStackTrace();
      }
   }

}
