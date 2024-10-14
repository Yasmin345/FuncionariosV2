import java.io.IOException;
import java.util.Scanner;

public class Escrever{

   public void gravar(){

        try{
            // atributo de controle 
            int opcao = 0;

            // inicializando scanner
            Scanner scan = new Scanner (System.in);


            //area de cadastro 
            System.out.println("\nDigite a Área de função para iniciar o cadastro ↓ \n [1] Áreas Gerais \n [2] Área administrativa \n [3] Área de Vendas \n [4] Outras Áreas\n");
            opcao = scan.nextInt();


            // validação de opção
            while (opcao < 1 || opcao > 4) {
                
                System.out.print("Entrada invalida! Por favor, digite apenas 1, 2, 3 ou 4 e tente novamente: ");
                opcao = scan.nextInt();
            }  


            // condiçoes
            if (opcao == 1){
                
                //retorno para usuario
                System.out.println("======CADASTRO DE FUNCIONÁRIO GERAL======");

                
                // instanciando para utilizar o médodo de cadastro 
                Funcionario funcionario = new Funcionario();


                // passando caminho no txt 
                String path = "C:\\Users\\yasmi\\OneDrive\\Área de Trabalho\\exercicio jones\\sem erro\\Funcionarios\\src\\geral.txt";


                // chamando método de cadastro
                funcionario.cadastrar(path);     


            }else if (opcao == 2){

                //retorno para usuario
                System.out.println("======CADASTRO DE FUNCIONÁRIO ADMINISTRATIVO======");
                
                // instanciando para utilizar o médodo de cadastro 
                FuncionarioAdm funcionarioAdm = new FuncionarioAdm();


                // passando caminho no txt 
                String path = "C:\\Users\\yasmi\\OneDrive\\Área de Trabalho\\exercicio jones\\sem erro\\Funcionarios\\src\\adm.txt";


                // chamando método de cadastro
                funcionarioAdm.cadastrar(path);


            }else if (opcao == 3){

                //retorno para usuario
                System.out.println("======CADASTRO DE FUNCIONÁRIO DE VENDAS======");

                // instanciando para utilizar o médodo de cadastro 
                FuncionarioVendas funcionarioVendas = new FuncionarioVendas();


                // passando caminho no txt 
                String path = "C:\\Users\\yasmi\\OneDrive\\Área de Trabalho\\exercicio jones\\sem erro\\Funcionarios\\src\\vendas.txt";


                // chamando método de cadastro
                funcionarioVendas.cadastrar(path);
                

            }else {

                //retorno para usuario
                System.out.println("======CADASTRO DE OUTROS FUNCIONÁRIO ======");
                
                // instanciando para utilizar o médodo de cadastro 
                OutrosFuncionarios outrosFuncionarios = new OutrosFuncionarios();


                // passando caminho no txt 
                String path = "C:\\Users\\yasmi\\OneDrive\\Área de Trabalho\\exercicio jones\\sem erro\\Funcionarios\\src\\outros.txt";


                // chamando método de cadastro
                outrosFuncionarios.cadastrar(path);

            }


            // fechando scanner 
            scan.close();
           

        }catch (IOException e){ //trata execoes de entradas e saidas

            System.out.println("Algo deu errado, por favor tente novamente.");
        }



    }
}


