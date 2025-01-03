package Objetos;
import java.util.Random;
/*
Una baraja estandar contiene:
76 Cartas de numero en total(19 de cada color):
4 Cartas 0:
-1 azul
-1 verde
-1 amarilla 
-1 roja
8 Cartas 1-9(De las cartas de la 1 a la 9 se repite este patron. 72 en total):
-2 azules
-2 verdes
-2 amarillas
-2 rojas

32 Cartas especiales (8 comodines y 6 de cada color):
4 Cartas de comodin
4 Cartas de +4
8 Cartas de +2 (2 de cada color)
8 Cartas de reversa (2 de cada color)
8 Cartas de pierde turno (2 de cada color)

La baraja estandar contiene 108 cartas en total
 
Una baraja estandar debe contener todas esas cartas con esas especificaciones
TODAS las barajas tienen un metodo para que todas las cartas contenidas en la baraja sean revueltas aleatoriamente

*/

public class Baraja
{
    private Carta_estandar baraja[]= new Carta_estandar[108];

    public void Baraja(Carta_estandar v[])
    {
        byte x;
        //El vector recibido se pasa a el vector de baraja
        //El vector recibido SIEMPRE debe tener el mismo numero de espacios que baraja y todos sus espacios deben estar llenos
        for(x=1; x<=108; x++)
        {
            this.baraja[x]=v[x];
        }
    }


    public void Barajar()
    {
        Carta_estandar B[]= new Carta_estandar[108];
        byte r[]= new byte[108];
        Random rnd = new Random();
        byte i;
        i=1;
        while (i<=108)
        {
            byte num= (byte)(rnd.nextDouble() * 108 + 1);
            r[i]=num;
            B[num]= baraja[i];
            i++;
        }
    }
}
