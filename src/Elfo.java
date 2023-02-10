public class Elfo implements CreaturaMagica{
    public Elfo(String comida, String nombre) {
        this.comida = comida;
        this.nombre = nombre;
    }
    private String nombre;
    private String comida;
    public String decirNombre(){

        return nombre;
    }



    public String decitComida(){
        return comida;
    }
}
