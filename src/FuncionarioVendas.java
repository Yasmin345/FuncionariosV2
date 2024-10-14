import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FuncionarioVendas extends Funcionario{
    
    // declarando atributos 
    String comissao;
    String campo_venda;
    String categoria_venda;
   
   
    // construtor
    public FuncionarioVendas(int matricula, String nome, String cpf, String turno, String comissao, String campo_venda, String categoria_venda) {
        
        super(matricula, nome, cpf, turno);
        this.comissao = comissao;
        this.campo_venda = campo_venda;
        this.categoria_venda = categoria_venda;
    }


    //sobrecarga de construtor 
    public FuncionarioVendas(){}



    //métodos acessores e modificadores 
    public String getComissao() {
        return comissao;
    }


    public void setComissao(String comissao) {
        this.comissao = comissao;
    }


    public String getCampo_venda() {
        return campo_venda;
    }


    public void setCampo_venda(String campo_venda) {
        this.campo_venda = campo_venda;
    }


    public String getCategoria_venda() {
        return categoria_venda;
    }


    public void setCategoria_venda(String categoria_venda) {
        this.categoria_venda = categoria_venda;
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
            BufferedWriter escritorBuffer = new BufferedWriter(new FileWriter(path,true)); //true acrescenta novos dados no final do arquivo


            
            // pedindo os dados ao usuario
            System.out.print("\nMatricula do Funcionario a ser cadastrado (Digite somente números inteiros)\n");
            matricula = scan2.nextInt(); 

            System.out.print("\nNome do Funcionario a ser cadastrado (Digite somente palavras)\n");
            nome = scan.nextLine().strip(); // método strip utilizado para remover espaços

            System.out.print("\nCPF do Funcionario a ser cadastrado (Digite somente números inteiros)\n");
            cpf = scan.nextLine().strip();

            System.out.print("\nTurno do Funcionario a ser cadastrado (Manhã, Tarde ou Noite)\n");
            turno = scan.nextLine().strip();

            System.out.print("\nComissão do Funcionario a ser cadastrad0 (Em porcentagem ex: 0.5% )\n");
            comissao = scan.nextLine().strip();

            System.out.print("\n Campo de venda do Funcionario a ser cadastrado (Zona norte, Sul, Leste ou Oeste\n");
            campo_venda = scan.nextLine().strip();

            System.out.print("\nCategoria de venda do Funcionario a ser cadastrado (Venda presencial ou Venda on-line) \n");
            categoria_venda = scan.nextLine().strip();

            
            


            // string vazia para guardar os dados  
            String linha = " ";


            // passando os dados para a string linha 
            linha = matricula + "/" + nome + "/" + cpf + "/" + turno + "/" +  comissao + "/" +  campo_venda + "/" + categoria_venda;

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


    
    
    


    


    

