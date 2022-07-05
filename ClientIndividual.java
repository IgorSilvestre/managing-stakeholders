package managingStakeholders;

import java.util.Scanner;

public class ClientIndividual implements Person {
    String name;
    String cpf;

    @Override
    public void registerPerson() {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Nome: ");
        this.name = read.nextLine();

        System.out.println("CPF: ");
        this.cpf = read.nextLine();

        read.close();
    }

    // constructor
    public ClientIndividual(){};

    // getters & setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
