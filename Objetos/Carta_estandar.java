package Objetos;
/* 
Cartas que son del juego normal
Cada carta tendra el color, un numero y tendra el booleano especial
Si una carta es normal entonces el booleano sera 'false', el numero importara en todos los casos y el efecto no sera leido
Si una carta es especial el booleano sera 'true', el numero no sera leido y el efecto pasara a ser leido

Posibles colores:
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
-S (Pierde turno)
-R (Reverso)
-C (Comodin)

*/
public class Carta_estandar
{
    private String color;
    private byte numero;
    private boolean especial;
    private char efecto;

    Carta_estandar(String c, byte n, boolean es, char ef)
    {
        this.color= c;
        this.numero= n;
        this.especial= es;
        this.efecto= ef;
    }

    public void set_color(String co)
    {
        this.color= co;
    }
    public String get_color()
    {
        return color;
    }

    public void set_numero(byte nu)
    {
        this.numero= nu;
    }
    public byte get_numero()
    {
        return numero;
    }

    public void set_especial(boolean esp)
    {
        this.especial= esp;
    }
    public boolean get_especial()
    {
        return especial;
    }

    public void set_efecto(char efe)
    {
        this.efecto= efe;
    }
    public char get_efecto()
    {
        return efecto;
    }
}
