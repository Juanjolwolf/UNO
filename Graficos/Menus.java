package Graficos;
import Funcional.*;
import java.util.Scanner;

public class Menus
{
    public void menu_inicial()
    {
        
        String r="";
        Scanner s= new Scanner(System.in);
        System.out.println
        ("-----------UNO-----------"+'\n'
        +"|1| Jugar"+'\n'
        +"|0| Salir"+'\n');
        System.out.print("Respuesta: ");
        r= s.nextLine();
        Preparar_juego b = new Preparar_juego();
        switch(r)
        {
            case "1":
            b.Preparacion_estandar();
            break;
            case "0":
            System.exit(0);
            break;
            default:
            System.out.println("Respuesta invalida, intente denuevo.");
            menu_inicial();
            break;
        }
        s.close();
    }
}
