package dominio;

public class Curso extends Atividade {

    private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP * this.cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso [carga horaria: " + cargaHoraria + ", titulo: " + getTitulo() + ", descricao: "
                + getDescricao() + ", instrutor: " + getInstrutor() + "]";
    }

}
