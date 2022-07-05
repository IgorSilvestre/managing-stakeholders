package substitutiva;

public class Employee {
    String name;
    String wage;
    String cpf;

    // construtor
    public Employee () {}
    
    public Employee (String name, String wage, String cpf) {
        this.name = name;
        this.wage = wage;
        this.cpf = cpf;
    }

    // getters & setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWage() {
        return this.wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
