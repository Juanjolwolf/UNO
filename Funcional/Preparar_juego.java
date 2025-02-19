package Funcional;
import java.util.Random;
import java.util.Arrays;
import Objetos.*;

/*Posibles colores:
-Azul
-Amarillo
-Verde
-Rojo
-Negro
Posibles numeros:
0-9
10(Para las cartas especiales)
Posibles efectos:
-2 (+2)
-4 (+4)
-P (Pierde turno)
-R (Reverso)
-C (Comodin)
-N (Ninguno)
*/
public class Preparar_juego
{
    //Se tendran diferentes preparaciones dependiendo de la respuesta que se de en el menu anterior
    /*Preparacion estandar
     *Preparacion especial
     *Preparacion personalizada
     */
    public void Preparacion_estandar()
    {
        Carta_estandar x[]= new Carta_estandar[108];
        Carta_estandar y= new Carta_estandar("Azul", (byte) 0, false, 'N');
        //Arrays.fill(x, y);
        byte i=0,j=0;
        //0 Azul
        y.set_estado("Azul", (byte)0, false, 'N');
        x[i]=y;
        i++;
        //0 Amarillo
        y.set_estado("Amarillo", (byte)0, false, 'N');
        x[i]=y;
        i++;
        //0 Verde
        y.set_estado("Verde", (byte)0, false, 'N');
        x[i]=y;
        i++;
        //0 Rojo
        y.set_estado("Rojo", (byte)0, false, 'N');
        x[i]=y;
        i++;//4

        //1 Azul
        for(j=0;j<2;j++)
        {
            y.set_estado("Azul", (byte)1, false, 'N');
            x[i]=y;
            i++;
        }
        //1 Amarillo
        for(j=0;j<2;j++)
        {
            y.set_estado("Amarillo", (byte)1, false, 'N');
            x[i]=y;
            i++;
        }
        //1 Verde
        for(j=0;j<2;j++)
        {
            y.set_estado("Verde", (byte)1, false, 'N');
            x[i]=y;
            i++;
        }
        //1 Rojo
        for(j=0;j<2;j++)
        {
            y.set_estado("Rojo", (byte)1, false, 'N');
            x[i]=y;
            i++;
        }//12

        //2 Azul
        for(j=0;j<2;j++)
        {
            y.set_estado("Azul", (byte)2, false, 'N');
            x[i]=y;
            i++;
        }
        //2 Amarillo
        for(j=0;j<2;j++)
        {
            y.set_estado("Amarillo", (byte)2, false, 'N');
            x[i]=y;
            i++;
        }
        //2 Verde
        for(j=0;j<2;j++)
        {
            y.set_estado("Verde", (byte)2, false, 'N');
            x[i]=y;
            i++;
        }
        //2 Rojo
        for(j=0;j<2;j++)
        {
            y.set_estado("Rojo", (byte)2, false, 'N');
            x[i]=y;
            i++;
        }//20

        //3 Azul
        for(j=0;j<2;j++)
        {
            y.set_estado("Azul", (byte)3, false, 'N');
            x[i]=y;
            i++;
        }
        //3 Amarillo
        for(j=0;j<2;j++)
        {
            y.set_estado("Amarillo", (byte)3, false, 'N');
            x[i]=y;
            i++;
        }
        //3 Verde
        for(j=0;j<2;j++)
        {
            y.set_estado("Verde", (byte)3, false, 'N');
            x[i]=y;
            i++;
        }
        //3 Rojo
        for(j=0;j<2;j++)
        {
            y.set_estado("Rojo", (byte)3, false, 'N');
            x[i]=y;
            i++;
        }//28

        //4 Azul
        for(j=0;j<2;j++)
        {
            y.set_estado("Azul", (byte)4, false, 'N');
            x[i]=y;
            i++;
        }
        //4 Amarillo
        for(j=0;j<2;j++)
        {
            y.set_estado("Amarillo", (byte)4, false, 'N');
            x[i]=y;
            i++;
        }
        //4 Verde
        for(j=0;j<2;j++)
        {
            y.set_estado("Verde", (byte)4, false, 'N');
            x[i]=y;
            i++;
        }
        //4 Rojo
        for(j=0;j<2;j++)
        {
            y.set_estado("Rojo", (byte)4, false, 'N');
            x[i]=y;
            i++;
        }//36

        //5 Azul
        for(j=0;j<2;j++)
        {
            y.set_estado("Azul", (byte)5, false, 'N');
            x[i]=y;
            i++;
        }
        //5 Amarillo
        for(j=0;j<2;j++)
        {
            y.set_estado("Amarillo", (byte)5, false, 'N');
            x[i]=y;
            i++;
        }
        //5 Verde
        for(j=0;j<2;j++)
        {
            y.set_estado("Verde", (byte)5, false, 'N');
            x[i]=y;
            i++;
        }
        //5 Rojo
        for(j=0;j<2;j++)
        {
            y.set_estado("Rojo", (byte)5, false, 'N');
            x[i]=y;
            i++;
        }//44

        //6 Azul
        for(j=0;j<2;j++)
        {
            y.set_estado("Azul", (byte)6, false, 'N');
            x[i]=y;
            i++;
        }
        //6 Amarillo
        for(j=0;j<2;j++)
        {
            y.set_estado("Amarillo", (byte)6, false, 'N');
            x[i]=y;
            i++;
        }
        //6 Verde
        for(j=0;j<2;j++)
        {
            y.set_estado("Verde", (byte)6, false, 'N');
            x[i]=y;
            i++;
        }
        //6 Rojo
        for(j=0;j<2;j++)
        {
            y.set_estado("Rojo", (byte)6, false, 'N');
            x[i]=y;
            i++;
        }//52

        //7 Azul
        for(j=0;j<2;j++)
        {
            y.set_estado("Azul", (byte)7, false, 'N');
            x[i]=y;
            i++;
        }
        //7 Amarillo
        for(j=0;j<2;j++)
        {
            y.set_estado("Amarillo", (byte)7, false, 'N');
            x[i]=y;
            i++;
        }
        //7 Verde
        for(j=0;j<2;j++)
        {
            y.set_estado("Verde", (byte)7, false, 'N');
            x[i]=y;
            i++;
        }
        //7 Rojo
        for(j=0;j<2;j++)
        {
            y.set_estado("Rojo", (byte)7, false, 'N');
            x[i]=y;
            i++;
        }//60

        //8 Azul
        for(j=0;j<2;j++)
        {
            y.set_estado("Azul", (byte)8, false, 'N');
            x[i]=y;
            i++;
        }
        //8 Amarillo
        for(j=0;j<2;j++)
        {
            y.set_estado("Amarillo", (byte)8, false, 'N');
            x[i]=y;
            i++;
        }
        //8 Verde
        for(j=0;j<2;j++)
        {
            y.set_estado("Verde", (byte)8, false, 'N');
            x[i]=y;
            i++;
        }
        //8 Rojo
        for(j=0;j<2;j++)
        {
            y.set_estado("Rojo", (byte)8, false, 'N');
            x[i]=y;
            i++;
        }//68

        //9 Azul
        for(j=0;j<2;j++)
        {
            y.set_estado("Azul", (byte)9, false, 'N');
            x[i]=y;
            i++;
        }
        //9 Amarillo
        for(j=0;j<2;j++)
        {
            y.set_estado("Amarillo", (byte)9, false, 'N');
            x[i]=y;
            i++;
        }
        //9 Verde
        for(j=0;j<2;j++)
        {
            y.set_estado("Verde", (byte)9, false, 'N');
            x[i]=y;
            i++;
        }
        //9 Rojo
        for(j=0;j<2;j++)
        {
            y.set_estado("Rojo", (byte)9, false, 'N');
            x[i]=y;
            i++;
        }//76

        //+2 Azul
        for(j=0;j<2;j++)
        {
            y.set_estado("Azul", (byte)10, true, '2');
            x[i]=y;
            i++;
        }
        //+2 Amarillo
        for(j=0;j<2;j++)
        {
            y.set_estado("Amarillo", (byte)10, true, '2');
            x[i]=y;
            i++;
        }
        //+2 Verde
        for(j=0;j<2;j++)
        {
            y.set_estado("Verde", (byte)10, true, '2');
            x[i]=y;
            i++;
        }
        //+2 Rojo
        for(j=0;j<2;j++)
        {
            y.set_estado("Rojo", (byte)10, true, '2');
            x[i]=y;
            i++;
        }//84

        //Reversa Azul
        for(j=0;j<2;j++)
        {
            y.set_estado("Azul", (byte)10, true, 'R');
            x[i]=y;
            i++;
        }
        //Reversa Amarillo
        for(j=0;j<2;j++)
        {
            y.set_estado("Amarillo", (byte)10, true, 'R');
            x[i]=y;
            i++;
        }
        //Reversa Verde
        for(j=0;j<2;j++)
        {
            y.set_estado("Verde", (byte)10, true, 'R');
            x[i]=y;
            i++;
        }
        //Reversa Rojo
        for(j=0;j<2;j++)
        {
            y.set_estado("Rojo", (byte)10, true, 'R');
            x[i]=y;
            i++;
        }//92

        //Pierde Azul
        for(j=0;j<2;j++)
        {
            y.set_estado("Azul", (byte)10, true, 'P');
            x[i]=y;
            i++;
        }
        //Pierde Amarillo
        for(j=0;j<2;j++)
        {
            y.set_estado("Amarillo", (byte)10, true, 'P');
            x[i]=y;
            i++;
        }
        //Pierde Verde
        for(j=0;j<2;j++)
        {
            y.set_estado("Verde", (byte)10, true, 'P');
            x[i]=y;
            i++;
        }
        //Pierde Rojo
        for(j=0;j<2;j++)
        {
            y.set_estado("Rojo", (byte)10, true, 'P');
            x[i]=y;
            i++;
        }//100
        
        //Comodin
        for(j=0;j<4;j++)
        {
            y.set_estado("Negro", (byte)10, true, 'C');
            x[i]=y;
            i++;
        }
        //+4
        for(j=0;j<4;j++)
        {
            y.set_estado("Negro", (byte)10, true, '4');
            x[i]=y;
            i++;
        }//108

        Baraja a = new Baraja(x,(short)108);
        System.out.println(a.Contenido_baraja()+'\n'+'\n'+'\n'+'\n');
        a.Barajar();
        System.out.println(a.Contenido_baraja()+'\n'+'\n'+'\n'+'\n');
        System.out.println("Ejecutado.");
    }
}
