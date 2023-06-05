import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class InvitacionCumpleaños {

    public static void main(String[] args) {
        String nombre = "[Nombre del Niño]";
        String fecha = "[Fecha del Cumpleaños]";
        String hora = "[Hora del Cumpleaños]";
        String direccion = "[Dirección del Lugar]";

        String contenido = "<html><head><style>"
                + "body {"
                + "  font-family: Arial, sans-serif;"
                + "  text-align: center;"
                + "  background-color: #F3F3F3;"
                + "}"
                + ".container {"
                + "  width: 300px;"
                + "  margin: 0 auto;"
                + "  padding: 20px;"
                + "  background-color: #FFF;"
                + "  border-radius: 10px;"
                + "  box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);"
                + "}"
                + "h1 {"
                + "  color: #FF6666;"
                + "}"
                + "p {"
                + "  margin-bottom: 20px;"
                + "}"
                + ".dinosaur-img {"
                + "  width: 150px;"
                + "  margin-bottom: 20px;"
                + "}"
                + ".button {"
                + "  display: inline-block;"
                + "  padding: 10px 20px;"
                + "  background-color: #FF6666;"
                + "  color: #FFF;"
                + "  text-decoration: none;"
                + "  border-radius: 5px;"
                + "}"
                + "</style></head><body>"
                + "<div class=\"container\">"
                + "  <img class=\"dinosaur-img\" src=\"dinosaur.png\" alt=\"Dinosaurio\">"
                + "  <h1>¡Cumpleaños de " + nombre + "!</h1>"
                + "  <p>¡Te invitamos a celebrar el cumpleaños de " + nombre + " en una fiesta temática de dinosaurios!</p>"
                + "  <p>Fecha: " + fecha + "</p>"
                + "  <p>Hora: " + hora + "</p>"
                + "  <p>Lugar: " + direccion + "</p>"
                + "  <p>¡Ven a disfrutar de juegos, comida y mucha diversión!</p>"
                + "  <a class=\"button\" href=\"confirmacion.html\">Confirmar Asistencia</a>"
                + "</div></body></html>";

        try {
            // Guardar el contenido en un archivo HTML
            FileWriter fileWriter = new FileWriter("invitacion.html");
            fileWriter.write(contenido);
            fileWriter.close();

            // Abrir el archivo con el navegador predeterminado
            File file = new File("invitacion.html");
            Desktop.getDesktop().browse(file.toURI());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
