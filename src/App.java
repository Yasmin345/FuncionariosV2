import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        
        // atributos de controle
        int opcao = 0;
        int deseja = 0;

        
        // inicializando scanner
        Scanner readingKeyboard = new Scanner(System.in);
        

        // print inicial 
        System.out.print("******** CADASTRO E CONSULTA DE FUNCIONARIOS ********");

        // loop de continuação do programa 
        while (true){
            
            try{

                // menu de funçoes 
                System.out.println("\n\n ----------------ESCOLHA UMA OPÇÃO---------------- \n");
                System.out.println("[1] - Cadastrar funcionario.\n[2] - Consutar funcionario.");


                // entrada de opção 
                opcao = readingKeyboard.nextInt();
               
               

                // validação de opção
                while (opcao !=1 && opcao != 2) {
                    
                    System.out.print("Entrada invalida! Por favor, digite apenas 1 ou 2 e tente novamente: ");
                   
                    opcao = readingKeyboard.nextInt();
                   
                }

                
                if (opcao == 1){

                    
                    // instanciando classe de cadastro 
                    Escrever escrever = new Escrever();

                    // chamando método 
                    escrever.gravar();
                
                
                 } else {

                    // instanciando classe de consulta
                    Ler ler = new Ler(); 

                    // chamando método de consulta
                    ler.consultar();
                }



                //entrada de continuação do programa 
                System.out.println("\nDeseja realizar uma nova consulta ou cadastro? digite 1 para continuar ou 2 para finalizar");
                
                deseja = readingKeyboard.nextInt();
               


                // validação de continuação
                while (deseja < 1 || deseja > 2) {
                    
                    System.out.print("Entrada invalida! Por favor, digite apenas 1 ou 2 e tente novamente: ");
                    deseja = readingKeyboard.nextInt();
                }   

                
                
                // condição de continuação e quebra de loop
                if (deseja == 2){
                break;
                }
                

                // fechando scanner 
                readingKeyboard.close();
            
            } catch (InputMismatchException e){

                System.out.println("Algo deu errado, por favor tente novamente.");
                
                readingKeyboard.next(); // limpa a entrada anterior


            }catch (NoSuchElementException e){

                System.out.println("Elemento não encontrado, tente novamente");

                readingKeyboard.next(); 
              
            }


               


        }

        
       
     
        

    }      
}       
