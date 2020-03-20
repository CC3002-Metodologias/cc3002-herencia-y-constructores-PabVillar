public class Main {

    public static void main(String[] args) {

        Persona estudiante = new Estudiante("Jonathan", "best JoJo",20);
        estudiante.comer();
        estudiante.dormir();
        String loQueHaceEstudiante = estudiante.hacerLoSuyo();
        System.out.println(estudiante.hacerLoSuyo());
        estudiante.hacerCuarentena();

        Academico academico = new Academico("Speedwagon", "best waifu", 25, "Why Jonathan is the best JoJo");
        academico.comer();
        academico.dormir();
        String loQueHaceAcademico = academico.hacerLoSuyo();
        System.out.println(loQueHaceAcademico);
        String paperAcademico = academico.publicarPaper();
        System.out.println(paperAcademico);
        academico.hacerCuarentena();

    }
}
