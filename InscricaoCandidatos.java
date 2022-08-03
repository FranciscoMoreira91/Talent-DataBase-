
/**
 * Escreva a descrição da classe InscricaoCandidatos aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
   import java.util.*;
   public class InscricaoCandidatos
   {
     public static void main()
     {
        Scanner input = new Scanner(System.in);
        
        candidato talento[] = new candidato[2];
        
        int opcao;
        int extensaofila=0;
        String opcao1;
        
        candidato p1;
       
        p1=new candidato();
        
        Scanner sc;
	sc = new Scanner(System.in);
        
        
        for(int i=0;i<talento.length;i++){
            talento[i] = new candidato();
            System.out.println("*****REGISTO*****");
            System.out.println();
            System.out.println("Nome:");
            talento[i].nome=input.nextLine();
            System.out.println("Idade:");
            talento[i].idade=input.nextInt();
            System.out.println("Sexo:");
            talento[i].sexo=input.next().charAt(0);
            System.out.println("Cidade:");
            talento[i].Cidade=input.nextLine();
            input.nextLine();
            System.out.println("Talento: ");
            talento[i].Talento=input.nextLine();
            
        }
        
        
        do{
        System.out.println();
        System.out.println("****** FACTOR TALENTO ********");
        System.out.println();
        System.out.println("1.Ver Candidato");
        System.out.println();
        System.out.println("2.Ver Todos os Candidatos");
        System.out.println();
        System.out.println("0.Sair");
        
        opcao = sc.nextInt();
        }while(opcao<0||opcao>2);
        switch(opcao){
           
            case 1:{
               if (extensaofila == 8)
               System.out.println("Fila Cheia");

              else {
                 

               System.out.println("****** TALENTOS ********");
               System.out.println();
               System.out.print("*****VER CANDIDATO****: ");
               System.out.println();
               
               for(int i=0;i< talento.length;i++){
             System.out.println("Candidato:");
             opcao1=input.nextLine();
             System.out.println("Nome: "+ talento[i].nome);
             System.out.println("Idade: "+talento[i].idade);
             System.out.println("Sexo: "+talento[i].sexo);
             System.out.println("Cidade: "+talento[i].Cidade);
             System.out.println("Talento:"+talento[i].Talento);
             System.out.println();
            
        }
               
              }
             
                break;
            }
        
          
            case 2:{
                
                System.out.println("****** TALENTOS ********");
                System.out.println();
                System.out.println("*****VER TODOS OS CANDIDATOS*****");
                System.out.println();
                for(int i=0;i< talento.length;i++){
             System.out.println("Nome: "+ talento[i].nome);
             System.out.println("Idade: "+talento[i].idade);
             System.out.println("Sexo: "+talento[i].sexo);
             System.out.println("Cidade: "+talento[i].Cidade);
             System.out.println("Talento:"+talento[i].Talento);
             System.out.println();
            
        }
              
            break;
        }
           
            default:
            System.exit(0); 
            
       }
        //}while(opcao<0||opcao>2);
     }
   }

