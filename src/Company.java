public class Company {
    int id;
    String name;
    String address;
    String zip;
    String country;
    int employeeCount;
    String industry;
    String marketCap;
    String domain;
    String logo;
    String ceoName;

    void print(){
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        System.out.println("address: "+address);
        System.out.println("zip: "+zip);
        System.out.println("country: "+country);
        System.out.println("employeeCount: "+employeeCount);
        System.out.println("industry: "+industry);
        System.out.println("marketCap: "+marketCap);
        System.out.println("domain: "+domain);
        System.out.println("logo: "+logo);
        System.out.println("ceoName: "+ceoName);
    }
}
