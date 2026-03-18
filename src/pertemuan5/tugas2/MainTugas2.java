package pertemuan5.tugas2;

public class MainTugas2 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Tegar", 100000.0);
        acc.deposit(50000.0);
        acc.withdraw(30000.0);
        acc.withdraw(200000.0);
        acc.deposit(-10.0);
        acc.withdraw(-10.0);
        acc.setSaldo(-50000.0);
        System.out.println("Saldo Akhir: Rp" + acc.getSaldo());
    }
}