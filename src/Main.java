import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                Conta conta = new Conta();
                Scanner cc = new Scanner(System.in);
                System.out.println("Digite numero da conta: ");
                conta.setConta(String.valueOf(Integer.parseInt(cc.nextLine())));
                System.out.println("Digite a nova conta: ");
                conta.setNovaConta(Integer.parseInt(cc.nextLine()));
                System.out.println("Digite o valor do deposito: ");
                conta.setDepositar(cc.nextLine());
                System.out.println("Digite o valor a ser sacado: ");
                conta.setSacar(Double.parseDouble(cc.nextLine()));
                System.out.println("Mostrar todas as contas: ");
                conta.setTodasContas(Integer.parseInt(cc.nextLine()));
                System.out.println("Mostrar uma conta: ");
                conta.setUmaConta(Integer.parseInt(cc.nextLine()));
                System.out.println("Mostrar patrimonio: ");
                conta.setPatrimonioBanco(Integer.parseInt(cc.nextLine()));

                System.out.println(conta);
            }

    }
