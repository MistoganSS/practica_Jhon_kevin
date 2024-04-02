import java.util.ArrayList;

public class Desarrollador extends Empleado implements EvaluacionDesempeno{
    private ArrayList<String> lenguajes;

    public Desarrollador(int id, String nombre, String departamento, double salario) {
        super(id, nombre, departamento, salario);
        this.lenguajes = new ArrayList<>();
    }

    @Override
    public String mostrarDetalles() {
        return super.mostrarDetalles()
                +", lenguajes= '"+String.join(", ",lenguajes)+'\'';
    }

    public void addLenaguaje(String lenguaje){
        lenguajes.add(lenguaje);
    }
    public void removeLenguaje(String lenguaje){
        lenguajes.remove(lenguaje);
    }

    @Override
    public double calcularBono() {
        // 10% del salario por cada lenguaje
        // dependiendo del desempeno obtendra 100% o 50% o nada
        return getDesempenoBono()*(getSalario()*(lenguajes.size()*0.1));
    }

    @Override
    public String evaluarDesempeno(String desempeno) {
        switch (desempeno){
            case "Bueno"->{
                setDesempenoBono(1);//obtendra el 100% del bono
                return Desempeno.BUENO.getNombre();
            }
            case "Regular"->{
                setDesempenoBono(0.5);//obtendra el 50% dle bono
                return Desempeno.REGULAR.getNombre();
            }
            case "Malo"->{
                setDesempenoBono(0);// no obtendra bono
                return Desempeno.MALO.getNombre();
            }
        }
        return null;
    }
}
