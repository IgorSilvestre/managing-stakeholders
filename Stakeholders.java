package substitutiva;
import java.util.ArrayList;
import java.util.Scanner;

public class Stakeholders {
    static ArrayList<Object> companyList = new ArrayList<>();
    ArrayList<Object> individualList = new ArrayList<>();
    ArrayList<Object> employeeList = new ArrayList<>();

    public static void addToRegistry (Object person) {
        System.out.println(person.getClass());
        companyList.add(person);
    }

    public static void main (String[] args) {
        Scanner read = new Scanner(System.in);
        
        // select action
        String selectedAction = "";
        while (selectedAction != "1" && selectedAction != "2") {
            System.out.println("Selecione uma ação:");
            System.out.println("1. Cadastrar");
            System.out.println("2. Listar registros");
            selectedAction = read.nextLine();
            
            if (selectedAction != "1" && selectedAction != "2") {
                System.out.println("Opção indisponível! \n");
            }
        }

        // select person
        String selectedOption = "";
        while (selectedOption != "1" && selectedOption != "2" && selectedOption != "3") {
            System.out.println("Qual tipo de pessoa deseja acessar?");
            System.out.println("1. Funcionário");
            System.out.println("2. Cliente PF");
            System.out.println("3. Cliente PJ");
            selectedOption = read.nextLine();
            
            if (selectedOption != "1" && selectedOption != "2" && selectedOption != "3") {
                System.out.println("Opção indisponível! \n");
            }
        }

        // register
        if (selectedAction == "1") {
            switch (selectedOption) {
                case "1":
                    
                    break;
                case "2":
                    ClientIndividual personObject = new ClientIndividual();
                    addToRegistry(personObject);
                    break;
                case "3":
                
                    break;

                default:
                    break;
            }
        }

        // list
        else if (selectedAction == "2") {
            switch (selectedOption) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                
                default:
                    break;
            }
        }
        

        read.close();
    }

}
