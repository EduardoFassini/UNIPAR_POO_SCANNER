import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
          
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe seus dados:  ");

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Idade: ");
        int idade = scanner.nextInt();

        System.out.println("Peso: ");
        double peso = scanner.nextDouble();

        //Antes, o método nextLine, da leitura do nome, estava lendo uma linha em branco pendente porque estava depois das leituras de idade e peso. 
        scanner.close();

        System.out.println("Nome: "+ nome);
        System.out.println("idade: "+ idade);
        System.out.println("peso: "+ peso); 
    }
}
