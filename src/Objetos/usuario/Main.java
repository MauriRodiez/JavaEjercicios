package Objetos.usuario;

public class Main {
    public static void main(String[] args) {

        UsuarioJuego nuevoUsuario = new UsuarioJuego("Jose", "aba");
        System.out.println("El usuario se llama " + nuevoUsuario.getNombre() + " y su clave: " + nuevoUsuario.getClave());
        System.out.println("El puntaje de " + nuevoUsuario.getNombre() + " es " + nuevoUsuario.aumentarPuntaje());
        System.out.println("El usuario " + nuevoUsuario.getNombre() + " esta en el nivel " + nuevoUsuario.subirNivel());
        System.out.println("El usuario se lleva un bonus y su puntaje ahora es " + nuevoUsuario.bonus(5) );
    }
}
