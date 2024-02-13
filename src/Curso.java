// Classe de curso
public class Curso {
    public static void main(String[] args) {

    }
    // Atributos
    private String nome;
    private String descricao;
    private Professor[] professores;
    private int cargaHoraria;

    // Construtor
    public Curso(String nome, String descricao, Professor[] professores, int cargaHoraria) {
        this.nome = nome;
        this.descricao = descricao;
        this.professores = professores;
        this.cargaHoraria = cargaHoraria;
    }

    // Métodos
    public void progresso() {
        // Imprime no console o progresso do curso
        System.out.println("O progresso do curso " + nome + " é de X%.");
    }

    public void notas() {
        // Imprime no console as notas do curso
        System.out.println("As notas do curso " + nome + " são: A, B, C.");
    }

    public void participacao() {
        // Imprime no console a participação do curso
        System.out.println("A participação do curso " + nome + " é de Y%.");
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}

