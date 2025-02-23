package Taller4v2;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Carlos", 2500.0);
        Empleado emp2 = new Empleado("Ana", -1500.0);

        System.out.println("Empleado 1: " + emp1.nombre + ", Salario: " + emp1.getSalario());
        System.out.println("Empleado 2: " + emp2.nombre + ", Salario: " + emp2.getSalario());

        emp1.setSalario(3000.0);
        emp2.setSalario(-500.0);

        System.out.println("Después de cambios:");
        System.out.println("Empleado 1: " + emp1.nombre + ", Salario: " + emp1.getSalario());
        System.out.println("Empleado 2: " + emp2.nombre + ", Salario: " + emp2.getSalario());
    }
}
