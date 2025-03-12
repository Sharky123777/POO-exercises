package Taller12.Ejercicio3;



class UsuarioAutenticacion {
    public boolean autenticar(Usuario usuario, String correo, String contrasena) {
        return usuario.getCorreo().equals(correo) && usuario.getContrasena().equals(contrasena);
    }
}