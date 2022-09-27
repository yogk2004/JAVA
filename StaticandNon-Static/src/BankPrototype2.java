public class BankPrototype2 {
    static int TotalBankBalance;
    String Name;
    int Balance;
    int ContactNumber;

    public static void main(String[] args) {
        BankPrototype2 Data1 = new BankPrototype2();
        BankPrototype2 Data2 = new BankPrototype2();

        Data1.Name = "Rohit Sharma";
        Data1.Balance=100;
        Data1.ContactNumber=85790808;
        Data1.TotalBankBalance=2000;
        System.out.println(Data1.Name);
        System.out.println(Data1.Balance);
        System.out.println(Data1.ContactNumber);

        System.out.println("---------------------");

        Data2.Name="Ayush Sinha";
        Data2.Balance=3000;
        Data2.ContactNumber=9786789;
        Data2.TotalBankBalance=5000;
        System.out.println(Data2.Name);
        System.out.println(Data2.Balance);
        System.out.println(Data2.ContactNumber);
        System.out.println("---------------------");

        System.out.println(Data1.TotalBankBalance);
        System.out.println("---------------------");
        System.out.println(Data2.TotalBankBalance);//both show same value as it is static.
        System.out.println("---------------------");

    }
}
