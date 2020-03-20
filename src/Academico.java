public class Academico extends Persona{
    private String paper;

    public Academico(String nombre, String ocupacion, int edad, String paper) {
        super(nombre, ocupacion, edad);
        this.paper = paper;
    }

    @Override
    public void comer(){
        System.out.println("Ñom ñom comida casera");
    }

    @Override
    public void dormir(){
        System.out.println("ZzzZzZz");
    }

    @Override
    public String hacerLoSuyo(){
        return "Aprendiendo a usar Zoom";
    }

    public String publicarPaper(){
        String paper = this.paper;
        return paper;
    }

    @Override
    public void hacerCuarentena(){
        System.out.println("Soy un academico en cuarentena");
    }
}
