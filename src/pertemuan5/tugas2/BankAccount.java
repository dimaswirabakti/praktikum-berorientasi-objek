package pertemuan5.tugas2;

public class BankAccount {
    private double saldo;
    private String pemilik;

    public BankAccount(String pemilik, double saldoAwal) {
        this.pemilik = pemilik;
        this.saldo = saldoAwal;
        System.out.println("Pemilik Rekening: " + this.pemilik);
        System.out.println("Saldo Awal: Rp" + this.saldo);
    }

    public String getPemilik() {
        return this.pemilik;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("Saldo tidak boleh negatif!");
        } else {
            this.saldo = saldo;
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Jumlah deposit harus lebih dari 0.");
            return;
        }
        this.saldo += amount;
        System.out.println("Deposit berhasil: Rp" + amount);
        System.out.println("Saldo Setelah Deposit: Rp" + this.saldo);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Jumlah penarikan harus lebih dari 0.");
            return;
        }
        if (amount > this.saldo) {
            System.out.println("Saldo tidak cukup untuk menarik Rp" + amount);
            return;
        }
        this.saldo -= amount;
        System.out.println("Penarikan berhasil: Rp" + amount);
        System.out.println("Saldo Setelah Withdraw: Rp" + this.saldo);
    }
}