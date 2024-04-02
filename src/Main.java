import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Desarrollador desarrollador= new Desarrollador(1, "Miguel", "Desarrollo", 5000);
        desarrollador.addLenaguaje("Java");
        desarrollador.addLenaguaje("Javascript");

        Desarrollador desarrollador2 = new Desarrollador(2, "Jose", "Desarrollo", 5000);
        desarrollador2.addLenaguaje("Phyton");
        desarrollador2.addLenaguaje(".NET");

        Gerente gerente = new Gerente(2, "Martin", "Jefe de Equipo", 8000);
        gerente.addEquipo(desarrollador);
        gerente.addEquipo(desarrollador2);

        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(desarrollador);
        empleados.add(desarrollador2);
        empleados.add(gerente);

        for (Empleado emp : empleados) {
            System.out.println(emp.mostrarDetalles());
            // Se realiza un condicion para verificar si se implementa la interfaz EvaluacionDesempeno
            if (emp instanceof EvaluacionDesempeno) {
                // Si se implementa la interfaz se llama al metodo evaluarDesempeno
                //Para este caso solo la clase Desarrollador tiene tiene este metodo
                System.out.println("Evaluación del desempeño: " + ((EvaluacionDesempeno) emp).evaluarDesempeno(Desempeno.BUENO.getNombre()));
            }
            System.out.println("Bono de fin de año: " + emp.calcularBono());
            System.out.println();
        }
    }
}