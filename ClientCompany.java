package substitutiva;

public class ClientCompany {
    String name;
    String cnpj;
    String owner;


    // constructor
    public ClientCompany (String name, String cnpj, String owner) {
        this.name = name;
        this.cnpj = cnpj;
        this.owner = owner;
    }

    // getters & setters
    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}
