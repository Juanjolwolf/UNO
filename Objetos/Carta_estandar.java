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
-P (Pierde turno)
-R (Reverso)
-C (Comodin)
-N (Ninguno)

*/
public class Carta_estandar
{
    private String color;
    private byte numero;
    private boolean especial;
    private char efecto;

    //El constructor debe ser publico para que se pueda utilizar desde otros paquetes, de otro modo saldra 'error constructor no visible'
    //Para que sea tomado como un constrcutor, el metodo debe tener el mismo nombre que el objeto Y no debe tener ninguna expresion para devolver nada, ni siquiera void
    public Carta_estandar(String c, byte n, boolean es, char ef)
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
        return this.color;
    }

    public void set_numero(byte nu)
    {
        this.numero= nu;
    }
    public byte get_numero()
    {
        return this.numero;
    }

    public void set_especial(boolean esp)
    {
        this.especial= esp;
    }
    public boolean get_especial()
    {
        return this.especial;
    }

    public void set_efecto(char efe)
    {
        this.efecto= efe;
    }
    public char get_efecto()
    {
        return this.efecto;
    }

    public void set_estado(String o, byte l, boolean k, char v)
    {
        this.color= o;
        this.numero= l;
        this.especial= k;
        this.efecto= v;
    }
    public String get_estado()
    {
        String Estado;
        Estado= "Color: "+get_color()+", Efecto: "+get_efecto()+", Numero: "+get_numero()+", Especial: "+get_especial();
        return Estado;
    }
}
