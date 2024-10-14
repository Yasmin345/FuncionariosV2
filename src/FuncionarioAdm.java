import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FuncionarioAdm extends Funcionario{

    // atributos de adm 
    String departamento;
    String nivel_acesso;
    String modalidade;
    
    

     // construtor 
    public FuncionarioAdm(int matricula, String nome, String cpf, String turno, String departamento, String nivel_acesso, String modalidade) {
       
        super(matricula, nome, cpf, turno);
        this.departamento = departamento;
        this.nivel_acesso = nivel_acesso;
        this.modalidade = modalidade;
    }

    // sobrecarga de construtor 
    public FuncionarioAdm(){}



    // métodos acesoores e modificadores 
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNivel_acesso() {
        return nivel_acesso;
    }

    public void setNivel_acesso(String nivel_acesso) {
        this.nivel_acesso = nivel_acesso;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }



    // método para cadastrar
    @Override
    public void cadastrar(String path) throws IOException {

        try{

            
            // Scanner para String  
            Scanner scan = new Scanner(System.in);


            // Scanner para int 
            Scanner scan2 = new Scanner(System.in);

            
            // instancia um objeto da classe BufferedWriter ( que se trata escritor eficiente)
            BufferedWriter escritorBuffer = new BufferedWriter(new FileWriter(path, true)); //true acrescenta novos dados no final do arquivo


            
            // pedindo os dados ao usuario
            System.out.print("\nMatricula do Funcionario a ser cadastrado (Digite somente números inteiros)\n");
            matricula = scan2.nextInt(); 

            System.out.print("\nNome do Funcionario a ser cadastrado (Digite somente palavras)\n");
            nome = scan.nextLine().strip(); // método strip utilizado para remover espaços

            System.out.print("\nCPF do Funcionario a ser cadastrado (Digite somente números inteiros)\n");
            cpf = scan.nextLine().strip();

            System.out.print("\nTurno do Funcionario a ser cadastrado (Manhã, Tarde ou Noite)\n");
            turno = scan.nextLine().strip();

            System.out.print("\nDepartamento do Funcionario a ser cadastrado (Adm Vendas ou Adm Geral \n");
            departamento = scan.nextLine().strip();

            System.out.print("\nNivel de acesso do Funcionario a ser cadastrado ( Nivel baixo ou Nivel alto \n");
            nivel_acesso = scan.nextLine().strip();

            System.out.print("\nModalidade do Funcionario a ser cadastrado (Presencical ou Home office\n");
            modalidade = scan.nextLine().strip();


            


            // string vazia para guardar os dados  
            String linha = " ";


            // passando os dados para a string linha 
            linha = matricula + "/" + nome + "/" + cpf + "/" + turno + "/" + departamento + "/" + nivel_acesso + "/" + modalidade;


           // escreve no arquivo e da quebra de linha 
           escritorBuffer.append(linha + "\n");


            // fecha o leitor e os scanners 
            escritorBuffer.close();
            scan.close();
            scan2.close();


           // print de retorno 
            System.out.println("\n********** CADASTRO REALIZADO COM SUCESSO **********");


            // tratamento de exeçoes
        } catch (InputMismatchException e){ // trata de erro de entrada invalida 
            
            System.out.println("Entrada invalida, por favor tente novamente.");


        } catch  (IOException e ) { // trata de erros com entradas e saidas

            System.out.println("Algo deu errado, por favor tente novamente.");

        }
    }



    // método para consultar
    @Override
    public void leitor(String path) throws Exception{ 

        // instancia um objeto da classe bufferedReader (que se trata de um leitor eficiente )               
        BufferedReader leitorBuffer = new BufferedReader(new FileReader(path));


        // string vazia para leitura de linha 
        String linha = "";


        //loop para leitura de linhas validas
        while (true){

            if (linha != null){
               
                // divide a linha em partes 
                String listDados[] = linha.split("/");

                // printa cada parte da linha    
                for(String item : listDados) {
                System.out.print(item + " " );}

                // Adiciona uma quebra de linha após a impressão dos itens
                System.out.println();

                //le a linha 
                linha = leitorBuffer.readLine();

                
            } else {

                break;
            }

        }  

           


            // fechando leitor 
            leitorBuffer.close();



                
        
    }

 }



 
    

        
    
   
    

