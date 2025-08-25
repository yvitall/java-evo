import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //cadastro

        System.out.print("\n--SEJA BEM-VINDO AO BANCO XYZ--\nVamos realizar seu cadastro?\n");
        System.out.print("\nDigite seu Nome: ");
        String nomeUsu = sc.nextLine();
        System.out.print("Digite seu Sobrenome: ");
        String sobrenomeUsu = sc.nextLine();
        String usuario = nomeUsu+sobrenomeUsu;
        System.out.print("Seu usuário é: " + usuario);

        System.out.print("\nAgora vamos criar sua senha: ");
        String senha = sc.nextLine();

        //login

        System.out.println("--BANCO XYZ--\nOnde suas possibilidades são iguais seu saldo.\n");
        System.out.print("Realize login\n");
        System.out.print("Digite seu usuário: ");
        String usuarioLogin = sc.nextLine();
        System.out.print("Digite sua senha: ");
        String senhaLogin = sc.nextLine();

        //validacao [DEBUGANDO / CORREÇÃO DE ERROS]

        if (usuario.equalsIgnoreCase(usuarioLogin) && senha.equals(senhaLogin)){
            System.out.println("✔ LOGIN REALIZADO COM SUCESSO!");
        } else {
            System.err.println("❌ ALGO DE ERRADO NÃO ESTÁ CERTO! TENTE NOVAMENTE OU REDEFINA A SENHA.\n1. Tente novamente\n2. Redefinir Senha");
            int menuErroSenha = sc.nextInt();
                if (menuErroSenha == 1){
                    System.out.println("Digite sua senha: ");
                    senhaLogin = sc.nextLine();
                        while (!senhaLogin.equals(senha)) {
                            System.out.println("1. Tente novamente\n2. Redefinir senha.\n");
                            if (menuErroSenha == 2){
                                System.out.println("Digite sua nova senha");
                                String novasenha;
                                senha = novasenha; }
                        }
                } else if (menuErroSenha == 2){
                            System.out.println("Digite sua nova senha: ");
                            String novasenha = sc.nextLine();
                            novasenha = senha;
                } else {
                    System.err.println("Essa opção não existe, digite outro valor.");
                }
    }
}
}
