import java.io.IOException;
import java.util.Scanner;

public class Ler{

    public void consultar() throws Exception{
 
         try{   
             // atributo de controle 
             int opcao = 0;
 
             // inicializando scanner
             Scanner scan = new Scanner (System.in);
 
 
             //area de cadastro 
             System.out.println("\nDigite a Área de função para realizar a consulta ↓ \n [1] Áreas Gerais \n [2] Área administrativa \n [3] Área de Vendas \n [4] Outras Áreas\n");
             opcao = scan.nextInt();
 
 
             // validação de opção
             while (opcao < 1 || opcao > 4) {
                 
                 System.out.print("Entrada invalida! Por favor, digite apenas 1, 2, 3 ou 4 e tente novamente: ");
                 opcao = scan.nextInt();
             }  
 
 
             // condiçoes
             if (opcao == 1){
                
                //retorno para usuario
                System.out.println("======CONSULTA DE FUNCIONÁRIOS GERAIS======");


                // instanciando para utilizar o médodo de consulta
                Funcionario funcionario = new Funcionario();
 
 
                // passando caminho no txt 
                String path = "C:\\Users\\yasmi\\OneDrive\\Área de Trabalho\\exercicio jones\\sem erro\\Funcionarios\\src\\geral.txt";
 
 
                // chamando método de consulta
                funcionario.leitor(path);    
 
 
             }else if (opcao == 2){

                //retorno para usuario
                System.out.println("======CONSULTA DE FUNCIONÁRIOS ADMINISTRATIVOS======");
                 
                // instanciando para utilizar o médodo de  consulta 
                FuncionarioAdm funcionarioAdm = new FuncionarioAdm();
 
 
                // passando caminho no txt 
                String path = "C:\\Users\\yasmi\\OneDrive\\Área de Trabalho\\exercicio jones\\sem erro\\Funcionarios\\src\\adm.txt";
 
 
                // chamando método de  consulta
                funcionarioAdm.leitor(path);
 
 
             }else if (opcao == 3){

                //retorno para usuario
                System.out.println("======CONSULTA DE FUNCIONÁRIOS DE VENDAS======");

 
                // instanciando para utilizar o médodo de  consulta
                FuncionarioVendas funcionarioVendas = new FuncionarioVendas();
 
 
                // passando caminho no txt 
                String path = "C:\\Users\\yasmi\\OneDrive\\Área de Trabalho\\exercicio jones\\sem erro\\Funcionarios\\src\\vendas.txt";
 
 
                // chamando método de  consulta
                funcionarioVendas.leitor(path);
                 
 
             }else {

                //retorno para usuario
                System.out.println("======CONSULTA DE OUTROS FUNCIONÁRIOS ======");
                 
                // instanciando para utilizar o médodo de  consulta
                OutrosFuncionarios outrosFuncionarios = new OutrosFuncionarios();
 
 
                // passando caminho no txt 
                String path = "C:\\Users\\yasmi\\OneDrive\\Área de Trabalho\\exercicio jones\\sem erro\\Funcionarios\\src\\outros.txt";
 
 
                // chamando método de consulta
                outrosFuncionarios.leitor(path);;
 
             }
 
 
             // fechando scanner 
             scan.close();
            
 
         }catch (IOException e){ // rata execoes de entradas e saidas
 
             System.out.println("Algo deu errado, por favor tente novamente.");
         }
 
 
 
     }
 }
 
   

