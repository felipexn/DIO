import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner entrada = new Scanner(System.in);

        System.out.println("por favor Digite o Numero da conta");
        numero = entrada.nextInt();
        System.out.println("por favor Digite a agencia da conta");
        agencia = entrada.next();
        System.out.println("por favor Digite o nome da conta");
        nomeCliente = entrada.next();
        System.out.println("por favor Digite o saldo da conta");
        saldo = entrada.nextDouble();
        entrada.close();
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo de: "+saldo+" já está disponível para saque");
    }
}
