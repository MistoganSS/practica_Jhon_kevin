public abstract class Empleado {
    private int id;
    private String nombre;
    private String departamento;
    private double salario;
    private double desempenoBono; //empieza el desempeño de forma regular(50%)

    public Empleado(int id, String nombre, String departamento, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
        this.desempenoBono=0.5;//Empieza el desempeño REGULAR, obtendra el 50% del bono
    }

    public String mostrarDetalles() {
        return "nombre='" + nombre + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario+'\'';
    }
    public abstract double calcularBono();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getDesempenoBono() {
        return desempenoBono;
    }

    public void setDesempenoBono(double desempenoBono) {
        this.desempenoBono = desempenoBono;
    }
}
