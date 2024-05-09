import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o número da Conta: ");
        int numero = scanner.nextInt();

        // Consumir a quebra de linha (o ENTER)
        scanner.nextLine();

        System.out.print("Agora Digite seu Saldo: ");
        String saldoStr = scanner.next();
        double saldo = Double.parseDouble(saldoStr);

        System.out.print("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close(); 
    }
}
