// Classe de professor
public class Professor {
    // Atributos
    private String nome;
    private String especialidade;

    // Construtor
    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    // Métodos
    public void ensinar() {
        // Imprime no console que o professor está ensinando
        System.out.println("O professor " + nome + " está ensinando " + especialidade + ".");
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
