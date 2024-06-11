import dominio.Atividade;
import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("Curso programação em Java");
        curso1.setTitulo("Desenvolvimento em Java no Backend");
        curso1.setCargaHoraria(30);
        curso1.setInstrutor("Camila");

        curso2.setTitulo("Curso programação em Kotlin");
        curso2.setTitulo("Desenvolvimento mobile com Kotlin");
        curso2.setCargaHoraria(22);
        curso2.setInstrutor("Camila");

        Atividade mentoria1 = new Mentoria();
        Atividade mentoria2 = new Mentoria();

        mentoria1.setTitulo("Road map de estudos Java");
        mentoria1.setTitulo("Guia de estudos na linguagem Java");
        mentoria1.setInstrutor("Camila");

        mentoria2.setTitulo("Road map de estudos Kotlin");
        mentoria2.setTitulo("Guia de estudos na linguagem Kotlin");
        mentoria2.setInstrutor("Camila");

        Dev dev1 = new Dev();
        dev1.setNome("Italo");

        Dev dev2 = new Dev();
        dev2.setNome("Luiz");

        Bootcamp bootcamp1 = new Bootcamp();

        bootcamp1.setNome("Desenvolvimento Backend");
        bootcamp1.setDescricao("Programação em Java");
        bootcamp1.getConteudoBootcamp().add(curso1);
        bootcamp1.getConteudoBootcamp().add(mentoria1);

        Bootcamp bootcamp2 = new Bootcamp();

        bootcamp2.setNome("Desenvolvimento mobile");
        bootcamp2.setDescricao("Programação em Kotlin");
        bootcamp2.getConteudoBootcamp().add(curso2);
        bootcamp2.getConteudoBootcamp().add(mentoria2);

        dev1.matricularBootcamp(bootcamp1);
        dev2.matricularBootcamp(bootcamp2);

        System.out.println("Dev 1");
        System.out.println(dev1.calcularXpTotal());
        System.out.println(dev1.getAtividadesMatriculadas());
        System.out.println(dev1.getAtividadesFinalizadas());
        dev1.progredir();
        dev1.progredir();
        System.out.println("---");
        System.out.println(dev1.getAtividadesMatriculadas());
        System.out.println(dev1.getAtividadesFinalizadas());
        System.out.println(dev1.calcularXpTotal());
        System.out.println("-----------------");

        System.out.println("Dev 2");
        System.out.println(dev2.calcularXpTotal());
        System.out.println(dev2.getAtividadesMatriculadas());
        System.out.println(dev2.getAtividadesFinalizadas());
        dev2.progredir();
        System.out.println("---");
        System.out.println(dev2.getAtividadesMatriculadas());
        System.out.println(dev2.getAtividadesFinalizadas());
        System.out.println(dev2.calcularXpTotal());
        System.out.println("-----------------");

    }
}
