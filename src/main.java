import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import com.google.gson.Gson;

//нужно взять любые 2 из них на выбор, написать программу, которая делает запросы, распарсить и вывести полученные ответы

public class main {
    public static void main(String[] args){
        try {
            URL u = new URL("https://fake-json-api.mock.beeceptor.com/users");

            InputStream in = u.openStream();
            InputStreamReader isr = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(isr);
            String output;

            StringBuilder builder = new StringBuilder();

            while ((output = br.readLine()) != null) {
                builder.append(output);
            }

            String jsonString = builder.toString();
            Gson gson = new Gson();
            Person[] people = gson.fromJson(jsonString, Person[].class);

            System.out.println("Parsing random people:");
            for (int i = 0;i< people.length;i++){
                System.out.println("Person #" + (i+1));
                people[i].print();
                System.out.println();
            }


            URL u2 = new URL("https://fake-json-api.mock.beeceptor.com/companies");

            InputStream in2 = u2.openStream();
            InputStreamReader isr2 = new InputStreamReader(in2);
            BufferedReader br2 = new BufferedReader(isr2);
            String output2;

            StringBuilder builder2 = new StringBuilder();

            while ((output2 = br2.readLine()) != null) {
                builder2.append(output2);
            }

            String jsonString2 = builder2.toString();
            Gson gson2 = new Gson();
            Company[] companies = gson2.fromJson(jsonString2, Company[].class);

            System.out.println("\nParsing random companies:");

            for (int i = 0;i< companies.length;i++){
                System.out.println("Company #" + (i+1));
                companies[i].print();
                System.out.println();
            }


        } catch (IOException e) {
            System.err.println(e);
        }

    }
}
