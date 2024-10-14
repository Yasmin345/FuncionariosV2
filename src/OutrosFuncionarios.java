import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OutrosFuncionarios extends Funcionario {
    
    // declarando atributos 
    String especializacao;
    String tipo_contrato;
    String tempo_contrato;
    
    
    // construtor 
    public OutrosFuncionarios(int matricula, String nome, String cpf, String turno, String especialização, String tipo_contrato, String tempo_contrato) {
        super(matricula, nome, cpf, turno);
        this.especializacao = especialização;
        this.tipo_contrato = tipo_contrato;
        this.tempo_contrato = tempo_contrato;
    }


    // sobrecarga de construtor
    public OutrosFuncionarios(){}




    // métodos acessores e modificadores
    public String getEspecializacao() {
        return especializacao;
    }


    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }


    public String getTipo_contrato() {
        return tipo_contrato;
    }


    public void setTipo_contrato(String tipo_contrato) {
        this.tipo_contrato = tipo_contrato;
    }


    public String getTempo_contrato() {
        return tempo_contrato;
    }


    public void setTempo_contrato(String tempo_contrato) {
        this.tempo_contrato = tempo_contrato;
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
            BufferedWriter escritorBuffer = new BufferedWriter(new FileWriter(path,true));//true acrescenta novos dados no final do arquivo


            
            // pedindo os dados ao usuario
            System.out.print("\nMatricula do Funcionario a ser cadastrado (Digite somente números inteiros)\n");
            matricula = scan2.nextInt(); 

            System.out.print("\nNome do Funcionario a ser cadastrado (Digite somente palavras)\n");
            nome = scan.nextLine().strip(); // método strip utilizado para remover espaços

            System.out.print("\nCPF do Funcionario a ser cadastrado (Digite somente números inteiros)\n");
            cpf = scan.nextLine().strip();

            System.out.print("\nTurno do Funcionario a ser cadastrado (Manhã, Tarde ou Noite)\n");
            turno = scan.nextLine().strip();

            System.out.print("\n Especialização do Funcionario a ser cadastrado (Contratado ou tercerizado)\n");
            especializacao = scan.nextLine().strip();

            System.out.print("\n tipo de contrato do Funcionario a ser cadastrado (Efetivo ou temporario)\n");
            tipo_contrato = scan.nextLine().strip();

            System.out.print("\ntempo de contrato do Funcionario a ser cadastrado (Em meses) \n");
            tempo_contrato = scan.nextLine().strip();

            
            


            // string vazia para guardar os dados  
            String linha = " ";


            // passando os dados para a string linha 
            linha = matricula + "/" + nome + "/" + cpf + "/" + turno + "/" +  especializacao + "/" +  tipo_contrato + "/" + tempo_contrato;


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