import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
    
        String usuario, autLogin, senha, autSenha, novaSenha;
        int escolha1;

        //cadastro
        System.out.print("SEJA BEM-VIND@ AO BankSystemMENU\n");
        System.out.print("----CADASTRO----\n");

        System.out.print("Digite seu usuário: ");
        usuario = sc.nextLine();
        System.out.print("Cadastre uma senha: ");
        senha = sc.nextLine();

        //login
        System.out.print("\n----LOGIN----\n");
        System.out.print("Digite seu usuário: ");
        autLogin = sc.nextLine();
        while (!usuario.equalsIgnoreCase(autLogin)) { //validacao
            System.out.print("Usuário incorreto. Tente novamente!\nDigite seu usuário: ");
            autLogin = sc.nextLine();
        } 
        System.out.print("Digite sua senha: "); 
        autSenha = sc.nextLine();
        while (!senha.equals(autSenha)) { //validacao
            System.out.print("Senha incorreta.\n1. Tentar novamente\n2. Redefinir senha\n");
            escolha1 = sc.nextInt();
            sc.nextLine(); //bug do buffer
            
            if (escolha1 == 1){
                System.out.print("Digite sua senha: ");
                autSenha = sc.nextLine();
            } 
            else if (escolha1 == 2) {
                System.out.print("Digite uma nova senha: ");
                novaSenha = sc.nextLine();
                senha = novaSenha;

                System.out.print("Digite novamente: ");
                autSenha = sc.nextLine();
            }
        } 
        System.out.println("[🔓] LOGIN REALIZADO COM SUCESSO [🔓]");
        sc.close(); 
}
}
