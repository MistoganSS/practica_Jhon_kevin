import java.util.ArrayList;

public class Gerente extends Empleado{
    private ArrayList<Empleado> equipo;

    public Gerente(int id, String nombre, String departamento, double salario) {
        super(id, nombre, departamento, salario);
        this.equipo = new ArrayList<>();
    }

    @Override
    public String mostrarDetalles() {
        return super.mostrarDetalles()
                +", total equipo= '"+equipo.size()+'\'';
    }

    @Override
    public double calcularBono() {
        // 15% del salario por cada mienbro del equipo
        // dependiendo del desempeno obtendra 100% o 50% o nada
        return getDesempenoBono()*(getSalario()*(equipo.size()*0.15));
    }

    public void addEquipo(Empleado empleado){
        equipo.add(empleado);
    }

    public void removeEquipo(Empleado empleado){
        equipo.remove(empleado);
    }

}
