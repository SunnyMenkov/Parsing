import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.net.URL;
//нужно взять любые 2 из них на выбор, написать программу, которая делает запросы, распарсить и вывести полученные ответы

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try {
            URL u = new URL("https://fake-json-api.mock.beeceptor.com/users");
            InputStream in = u.openStream();
            InputStreamReader isr = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(isr);
            String output;
            System.out.println("Parsing 10 random people:");
            int count = 0;

            Person people[] = new Person[11];

            while ((output = br.readLine()) != null) {
                if (output.equals("  {")) {
                    people[count] = new Person();

                } else {
                    output = output.replaceAll("[]\"\\[,]", "");
                }

                if (output.startsWith("    id")) {
                    int index = output.indexOf(':');
                    people[count].id = output.substring(index + 2);
                }
                if (output.startsWith("    name")) {
                    int index = output.indexOf(':');
                    people[count].name = (output.substring(index + 2));

                }
                if (output.startsWith("    company")) {
                    int index = output.indexOf(':');
                    people[count].company = output.substring(index + 2);
                }
                if (output.startsWith("    username")) {
                    int index = output.indexOf(':');
                    people[count].username = output.substring(index + 2);
                }
                if (output.startsWith("    email")) {
                    int index = output.indexOf(':');
                    people[count].email = output.substring(index + 2);
                }
                if (output.startsWith("    address")) {
                    int index = output.indexOf(':');
                    people[count].address = output.substring(index + 2);
                }
                if (output.startsWith("    zip")) {
                    int index = output.indexOf(':');
                    people[count].zip = output.substring(index + 2);
                }
                if (output.startsWith("    state")) {
                    int index = output.indexOf(':');
                    people[count].state = output.substring(index + 2);
                }
                if (output.startsWith("    country")) {
                    int index = output.indexOf(':');
                    people[count].country = output.substring(index + 2);
                }
                if (output.startsWith("    phone")) {
                    int index = output.indexOf(':');
                    people[count].phone = output.substring(index + 2);
                }
                if (output.startsWith("    photo")) {
                    int index = output.indexOf(':');
                    people[count].photo = output.substring(index + 2);
                }

                if ((output.startsWith("  }")) && count < 11 && people[count] != null) {
                    System.out.println("Person #" + (count+1));
                    people[count].print();
                    count++;
                }
            }
            URL u2 = new URL("https://fake-json-api.mock.beeceptor.com/companies");

            InputStream in2 = u2.openStream();
            InputStreamReader isr2 = new InputStreamReader(in2);
            BufferedReader br2 = new BufferedReader(isr2);
            String output2;
            System.out.println("\nParsing 11 random companies:");

            int count2 = 0;
            Company companies[] = new Company[11];

            while ((output2 = br2.readLine()) != null) {
                if (output2.equals("  {")) {
                    companies[count2] = new Company();
                } else {
                    output2 = output2.replaceAll("[]\"\\[,]", "");
                }

                if (output2.startsWith("    id")) {
                    int index = output2.indexOf(':');
                    companies[count2].id = output2.substring(index + 2);
                }
                if (output2.startsWith("    name")) {
                    int index = output2.indexOf(':');
                    companies[count2].name = output2.substring(index + 2);

                }
                if (output2.startsWith("    address")) {
                    int index = output2.indexOf(':');
                    companies[count2].address = output2.substring(index + 2);

                }
                if (output2.startsWith("    zip")) {
                    int index = output2.indexOf(':');
                    companies[count2].zip = output2.substring(index + 2);

                }
                if (output2.startsWith("    country")) {
                    int index = output2.indexOf(':');
                    companies[count2].country = output2.substring(index + 2);
                }
                if (output2.startsWith("    employee")) {
                    int index = output2.indexOf(':');
                    companies[count2].employeeCount = output2.substring(index + 2);

                }

                if (output2.startsWith("    industry")) {
                    int index = output2.indexOf(':');
                    companies[count2].industry = output2.substring(index + 2);

                }
                if (output2.startsWith("    marketCap")) {
                    int index = output2.indexOf(':');
                    companies[count2].marketCap = output2.substring(index + 2);
                }
                if (output2.startsWith("    domain")) {
                    int index = output2.indexOf(':');
                    companies[count2].domain = output2.substring(index + 2);
                }
                if (output2.startsWith("    logo")) {
                    int index = output2.indexOf(':');
                    companies[count2].logo = output2.substring(index + 2);
                }
                if (output2.startsWith("    ceoName")) {
                    int index = output2.indexOf(':');
                    companies[count2].ceoName = output2.substring(index + 2);
                }


            if ((output2.startsWith("  }")) && count2 < 11 && companies[count2] != null) {
                System.out.println("Company #" + (count2+1));
                companies[count2].print();
                count2++;
            }


            }

        } catch (IOException e) {
            System.err.println(e);
        }

    }
}
