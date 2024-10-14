import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Funcionario {
    
    // atributos 
    int matricula;  
    String nome;
    String cpf;
    String turno;


    // construtor 
    public Funcionario(int matricula, String nome, String cpf, String turno) {
        
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.turno = turno;
    }


    //sobrecarga de cosntrutor
    public Funcionario(){}



    // métodos acessores e modificadores
    public int getMatricula() {
        return matricula;
    }


    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getTurno() {
        return turno;
    }


    public void setTurno(String turno) {
        this.turno = turno;
    }



    // método para cadastrar
    public void cadastrar(String path) throws IOException {

        try{
             
            // Scanner para string
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


            // string vazia para guardar os dados  
            String linha = " ";


            // passando os dados para a string linha 
            linha = matricula + "/" + nome + "/" + cpf + "/" + turno;


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

    
