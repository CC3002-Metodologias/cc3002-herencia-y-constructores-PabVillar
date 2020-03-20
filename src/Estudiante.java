public class Estudiante extends Persona {

    public Estudiante(String nombre, String ocupacion, int edad) {
        super(nombre, ocupacion, edad);
    }

    @Override
    public void dormir(){
        System.out.println("ZzzZzZ");
    }

    @Override
    public void comer(){
        System.out.println("Ñom ñom que ricos completos sin el pan mojado de Talca");
    }

    @Override
    public String hacerLoSuyo(){
        return "Estoy viendo anime en Netflix porque no me gusta Crunchyroll";
    }

    @Override
    public void hacerCuarentena(){
        System.out.println("Soy un estudiante en cuarentena uwu");
    }

}
