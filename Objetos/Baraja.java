package Objetos;
import java.util.Random;
import java.util.Arrays;
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
TODAS las barajas tienen un metodo para que todas las cartas contenidas en la baraja sean revueltas aleatoriamente*/

public class Baraja
{
    private Carta_estandar baraja[];
    private short n_cartas;

    public Baraja(Carta_estandar v[], short x)
    {
        this.n_cartas= x;
        //El vector recibido se pasa a el vector de baraja
        //El vector recibido SIEMPRE debe tener el mismo numero de espacios que baraja y todos sus espacios deben estar llenos
        baraja= new Carta_estandar[x];
        for(short y=0; y<this.n_cartas; y++)
        {
            this.baraja[y]=v[y];
        }
    }


    public void Barajar()
    {
        //Se pasan las cartas en un orden aleatorio a la baraja B
        //La posicion en la que se va a guardar la carta en la baraja B se guarda en r
        Carta_estandar B[]= new Carta_estandar[this.n_cartas];
        short r[]= new short[this.n_cartas];
        Random rnd = new Random();
        for(short i=0; i<this.n_cartas;i++)
        {
            //(int) (rnd.nextDouble() * cantidad_números_rango + término_inicial_rango)
            short num= (short)(rnd.nextDouble() * (this.n_cartas-1) + 0);
            r[i]=num;
            B[num]= baraja[i];
        }
    }

    public String Contenido_baraja()
    {
        byte cartas[]= new byte[54];
        Arrays.fill(cartas, (byte)0);
        String contenido="";
        for(short j=0; j<this.n_cartas;j++)
        {
            //Cartas no especiales
            if (baraja[j].get_especial()==false)
            {
                switch(baraja[j].get_color())
                {
                    //Carta de numero azul
                    case "Azul":
                    cartas[baraja[j].get_numero()]++;
                    break;
                    //Carta de numero amarillo
                    case "Amarillo":
                    cartas[baraja[j].get_numero()+10]++;
                    break;
                    //Carta de numero verde
                    case "Verde":
                    cartas[baraja[j].get_numero()+20]++;
                    break;
                    //Carta de numero rojo
                    case "Rojo":
                    cartas[baraja[j].get_numero()+30]++;
                    break;
                }
            }
            else
            //Cartas especiales
            {
                if(baraja[j].get_color().equals("Negro"))
                {
                    switch(baraja[j].get_efecto())
                    {
                        //Comodin
                        case 'C':
                        cartas[52]++;
                        break;
                        // +4
                        case '4':
                        cartas[53]++;
                        break;
                    }
                }
                else
                {
                    switch(baraja[j].get_color())
                    {
                        //Carta de numero azul
                        case "Azul":
                        if(baraja[j].get_efecto()=='P')
                        {
                            cartas[40]++;
                        }
                        else
                        {
                            if(baraja[j].get_efecto()=='R')
                            {
                                cartas[44]++;
                            }
                            else
                            {
                                cartas[48]++;
                            }
                        }
                        break;
                        //Carta de numero amarillo
                        case "Amarillo":
                        if(baraja[j].get_efecto()=='P')
                        {
                            cartas[41]++;
                        }
                        else
                        {
                            if(baraja[j].get_efecto()=='R')
                            {
                                cartas[45]++;
                            }
                            else
                            {
                                cartas[49]++;
                            }
                        }
                        break;
                        //Carta de numero verde
                        case "Verde":
                        if(baraja[j].get_efecto()=='P')
                        {
                            cartas[42]++;
                        }
                        else
                        {
                            if(baraja[j].get_efecto()=='R')
                            {
                                cartas[46]++;
                            }
                            else
                            {
                                cartas[50]++;
                            }
                        }
                        break;
                        //Carta de numero rojo
                        case "Rojo":
                        if(baraja[j].get_efecto()=='P')
                        {
                            cartas[43]++;
                        }
                        else
                        {
                            if(baraja[j].get_efecto()=='R')
                            {
                                cartas[47]++;
                            }
                            else
                            {
                                cartas[51]++;
                            }
                        }
                        break;
                }
            }
        }
        }
        contenido=
        "0 Azul: "+cartas[0]+"          "+"1 Azul: "+cartas[1]+"          "+"2 Azul: "+cartas[2]+'\n'+
        "3 Azul: "+cartas[3]+"          "+"4 Azul: "+cartas[4]+"          "+"5 Azul: "+cartas[5]+'\n'+
        "6 Azul: "+cartas[6]+"          "+"7 Azul: "+cartas[7]+"          "+"8 Azul: "+cartas[8]+'\n'+
        "9 Azul: "+cartas[9]+'\n'+'\n'+

        "0 Amarillo: "+cartas[10]+"          "+"1 Amarillo: "+cartas[11]+"          "+"2 Amarillo: "+cartas[12]+'\n'+
        "3 Amarillo: "+cartas[13]+"          "+"4 Amarillo: "+cartas[14]+"          "+"5 Amarillo: "+cartas[15]+'\n'+
        "6 Amarillo: "+cartas[16]+"          "+"7 Amarillo: "+cartas[17]+"          "+"8 Amarillo: "+cartas[18]+'\n'+
        "9 Amarillo: "+cartas[19]+'\n'+'\n'+

        "0 Verde: "+cartas[20]+"          "+"1 Verde: "+cartas[21]+"          "+"2 Verde: "+cartas[22]+'\n'+
        "3 Verde: "+cartas[23]+"          "+"4 Verde: "+cartas[24]+"          "+"5 Verde: "+cartas[25]+'\n'+
        "6 Verde: "+cartas[26]+"          "+"7 Verde: "+cartas[27]+"          "+"8 Verde: "+cartas[28]+'\n'+
        "9 Verde: "+cartas[29]+'\n'+'\n'+

        "0 Rojo: "+cartas[30]+"          "+"1 Rojo: "+cartas[31]+"          "+"2 Rojo: "+cartas[32]+'\n'+
        "3 Rojo: "+cartas[33]+"          "+"4 Rojo: "+cartas[34]+"          "+"5 Rojo: "+cartas[35]+'\n'+
        "6 Rojo: "+cartas[36]+"          "+"7 Rojo: "+cartas[37]+"          "+"8 Rojo: "+cartas[38]+'\n'+
        "9 Rojo: "+cartas[39]+'\n'+'\n'+

        "Pierde turno azul: "+cartas[40]+"      "+"Pierde turno amarillo: "+cartas[41]+"      "+"Pierde turno verde: "+cartas[42]+"      "+"Pierde turno rojo: "+cartas[43]+"      "+'\n'+
        "Revolver azul: "+cartas[44]+"      "+"Revolver amarillo: "+cartas[45]+"      "+"Revolver verde: "+cartas[46]+"      "+"Revolver rojo: "+cartas[47]+"      "+'\n'+
        "+2 azul: "+cartas[48]+"      "+"+2 amarillo: "+cartas[49]+"      "+"+2 verde: "+cartas[50]+"      "+"+2 rojo: "+cartas[51]+"      "+'\n'+'\n'+
        "Comodin: "+cartas[52]+"      "+"+4: "+cartas[53];
        return contenido;
    }

    public void get_n_cartas(short n)
    {
        this.n_cartas= n;
    }
    public short get_n_cartas()
    {
        return this.n_cartas;
    }

    public void set_baraja(Carta_estandar h[])
    {
        for(short k=0; k<this.n_cartas; k++)
        {
            this.baraja[k]=h[k];
        }
    }
    public Carta_estandar[] get_baraja()
    {
        return this.baraja;
    }
}
