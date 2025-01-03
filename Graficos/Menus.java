package Graficos;
import Funcional.Preparar_juego;
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
        switch(r)
        {
            case "1":
            //Mandar a el inicio de juego
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
