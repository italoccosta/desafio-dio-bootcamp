package dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Atividade> atividadesMatriculadas = new LinkedHashSet<>();
    private Set<Atividade> atividadesFinalizadas = new LinkedHashSet<>();

    public void matricularBootcamp(Bootcamp bootcamp) {
        this.atividadesMatriculadas.addAll(bootcamp.getConteudoBootcamp());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Atividade> progressao = this.atividadesMatriculadas.stream().findFirst();
        if (progressao.isPresent()) {
            atividadesFinalizadas.add(progressao.get());
            atividadesMatriculadas.remove(progressao.get());
        } else {
            System.err.println("Você não está matriculado em nenhuma atividade!");
        }
    }

    public double calcularXpTotal() {
        return this.atividadesFinalizadas.stream().mapToDouble(Atividade -> Atividade.calcularXp()).sum();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Atividade> getAtividadesMatriculadas() {
        return atividadesMatriculadas;
    }

    public void setAtividadesMatriculadas(Set<Atividade> atividadesMatriculadas) {
        this.atividadesMatriculadas = atividadesMatriculadas;
    }

    public Set<Atividade> getAtividadesFinalizadas() {
        return atividadesFinalizadas;
    }

    public void setAtividadesFinalizadas(Set<Atividade> atividadesFinalizadas) {
        this.atividadesFinalizadas = atividadesFinalizadas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((atividadesMatriculadas == null) ? 0 : atividadesMatriculadas.hashCode());
        result = prime * result + ((atividadesFinalizadas == null) ? 0 : atividadesFinalizadas.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (atividadesMatriculadas == null) {
            if (other.atividadesMatriculadas != null)
                return false;
        } else if (!atividadesMatriculadas.equals(other.atividadesMatriculadas))
            return false;
        if (atividadesFinalizadas == null) {
            if (other.atividadesFinalizadas != null)
                return false;
        } else if (!atividadesFinalizadas.equals(other.atividadesFinalizadas))
            return false;
        return true;
    }

}
