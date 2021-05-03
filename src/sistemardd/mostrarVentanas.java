
package sistemardd;

//Hecho por Burboa Astorga Ricardo 5IS-01V
//Instituto Tecnológico de Estudios Superiores de Los Cabos
//Ingeniería en Sistemas Computacionales

import java.awt.Toolkit;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JOptionPane;

public class mostrarVentanas {
    
    public String copyright = "PROGRAMA HECHO POR:\nBURBOA ASTORGA RICARDO";
    
    public void printCR() {
        System.out.println(copyright);
    }
    
    //Cómo obtener el tamaño de la ventana de manera automática.
    /*
    Toolkit tk = Toolkit.getDefaultToolkit();
    int x = (int) tk.getScreenSize().getWidth();
    int y = (int) tk.getScreenSize().getHeight();
    */
    
    //Ventana de Inicio (1).
    public void showVentanaInicio() {
        ventanaInicio inicio = new ventanaInicio();

        inicio.setUndecorated(true);
        inicio.setResizable(false);
        inicio.setVisible(true);

        int x = 1280;
        int y = 1024;
        inicio.setSize(x, y);
    }
    
    
    
    //Ventanas de ingreso (2).
    public void showVentanaIngresarAlumno() {
        ventanaIngresarAlumno ventanaAlumnoIngreso = new ventanaIngresarAlumno();
        
        ventanaAlumnoIngreso.setUndecorated(true);
        ventanaAlumnoIngreso.setResizable(false);
        ventanaAlumnoIngreso.setVisible(true);

        int x = 1280;
        int y = 1024;
        ventanaAlumnoIngreso.setSize(x, y);
    }
    
    public void showVentanaIngresarAdmin() {
        ventanaIngresarAdmin ventanaAdminIngreso = new ventanaIngresarAdmin();
        
        ventanaAdminIngreso.setUndecorated(true);
        ventanaAdminIngreso.setResizable(false);
        ventanaAdminIngreso.setVisible(true);

        int x = 1280;
        int y = 1024;
        ventanaAdminIngreso.setSize(x, y);
    }
    
    
    
    //Ventanas principales (mains) de los módulos (2).
    public void showVentanaAlumnoMain() {
        ventanaAlumnoMain alumnoMain = new ventanaAlumnoMain();
        
        alumnoMain.setUndecorated(true);
        alumnoMain.setResizable(false);
        alumnoMain.setVisible(true);

        int x = 1280;
        int y = 1024;
        alumnoMain.setSize(x, y);
    }
    
    public void showVentanaAdminMain() {
        ventanaAdminMain adminMain = new ventanaAdminMain();
        
        adminMain.setUndecorated(true);
        adminMain.setResizable(false);
        adminMain.setVisible(true);

        int x = 1280;
        int y = 1024;
        adminMain.setSize(x, y);
    }
    
    
    
    //Ventanas del módulo del Alumno (2).
    public void showVentanaEncuesta() {
        ventanaAlumnoEncuesta ventanaEncuesta = new ventanaAlumnoEncuesta();
        
        ventanaEncuesta.setUndecorated(true);
        ventanaEncuesta.setResizable(false);
        ventanaEncuesta.setVisible(true);

        int x = 1280;
        int y = 1024;
        ventanaEncuesta.setSize(x, y);
    }
    
    public void showVentanaCambiarPass() {
        ventanaAlumnoCambiarPass ventanaCambiarPass = new ventanaAlumnoCambiarPass();
        
        ventanaCambiarPass.setUndecorated(true);
        ventanaCambiarPass.setResizable(false);
        ventanaCambiarPass.setVisible(true);

        int x = 1280;
        int y = 1024;
        ventanaCambiarPass.setSize(x, y);
    }
    
    

    //Ventanas del módulo del Administrador (4).
    public void showVentanaBajas() {
        ventanaAdminBajas adminBajas = new ventanaAdminBajas();
        
        adminBajas.setUndecorated(true);
        adminBajas.setResizable(false);
        adminBajas.setVisible(true);
        
        int x = 1280;
        int y = 1024;
        adminBajas.setSize(x, y);
    }
    
    public void showVentanaMonitoreo() {
        ventanaAdminMonitoreo adminMonitoreo = new ventanaAdminMonitoreo();
        
        adminMonitoreo.setUndecorated(true);
        adminMonitoreo.setResizable(false);
        adminMonitoreo.setVisible(true);
        
        int x = 1280;
        int y = 1024;
        adminMonitoreo.setSize(x, y);
    }
    
    public void showVentanaConsultaInfoEncuestas() {
        ventanaAdminConsultarInfoEncuestas adminInfoEncuestas = new ventanaAdminConsultarInfoEncuestas();
        
        adminInfoEncuestas.setUndecorated(true);
        adminInfoEncuestas.setResizable(false);
        adminInfoEncuestas.setVisible(true);

        int x = 1280;
        int y = 1024;
        adminInfoEncuestas.setSize(x, y);
    }
    
    public void showVentanaDocentes() {
        ventanaAdminDocentes adminDocentes = new ventanaAdminDocentes();
        
        adminDocentes.setUndecorated(true);
        adminDocentes.setResizable(false);
        adminDocentes.setVisible(true);
        
        int x = 1280;
        int y = 1024;
        adminDocentes.setSize(x, y);
    }
    
    //Método para validar si se desea salir del programa.
    public static void validarSalir() {
        System.out.println("No sale del programa.");
    }
    
}
