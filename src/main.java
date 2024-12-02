import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.net.URL;
//нужно взять любые 2 из них на выбор, написать программу которая делает запросы, распарсить и вывести полученные ответы

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            URL u = new URL("https://fake-json-api.mock.beeceptor.com/users");
            InputStream in = u.openStream();
            InputStreamReader isr = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(isr);
            String output;
            System.out.println("Parsing 10 random people:");
            int count = 1;
            while ((output = br.readLine()) != null){
                if (output.equals("  {")){
                    System.out.println("Person "+count);
                    count++;
                }
                else{
                System.out.println(output.replaceAll("[]\"\\[},]", ""));
                }
            }

            URL u2 = new URL("https://fake-json-api.mock.beeceptor.com/companies");

            InputStream in2 = u2.openStream();
            InputStreamReader isr2 = new InputStreamReader(in2);
            BufferedReader br2 = new BufferedReader(isr2);
            String output2;
            System.out.println("\nParsing 11 random companies:");
            int count2 = 1;
            while ((output2 = br2.readLine()) != null){
                if (output2.equals("  {")){
                    System.out.println("Company "+count2);
                    count2++;
                }
                else{
                    System.out.println(output2.replaceAll("[]\"\\[},]", ""));
                }
            }

        } catch (IOException e) {
            System.err.println(e);
        }

    }
}
