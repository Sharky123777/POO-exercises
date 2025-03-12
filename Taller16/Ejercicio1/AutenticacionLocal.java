package Taller16.Ejercicio1;


public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar (String usuario, String contraseña){
        return "Administrador".equals(usuario) && "0011".equals(contraseña);
    }
}
