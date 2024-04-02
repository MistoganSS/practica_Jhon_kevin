public interface EvaluacionDesempeno {
    String evaluarDesempeno(String desempeno);
}
enum Desempeno{
    BUENO("Bueno"),MALO("Malo"),REGULAR("Regular");
    private final String nombre;
    Desempeno(String nombre) {
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
