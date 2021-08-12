package sistemadecoordenadas2d;
import java.util.Scanner;
/* Bajo el sistema de coordenadas cartesianas referir un punto
con sus respectivas propiedades y valores.
dichos valores deben asignarse como una entrada por teclado
de parte del usuario.
*/
public class SistemaDeCoordenadas2D 
{
    
    public static void main(String[] args) 
    {
        System.out.println("Bienvenido\n Este porgrama le permite escribir puntos dentro de un sistema de coordenadas ");
        Polar punto2 = new Polar();
        Cartesiana2D punto = new Cartesiana2D();
        Cartesiana2D punto3= new Cartesiana2D();
        Scanner lectura = new Scanner(System.in); //Escritura de los datos que ongresa el usuario
        System.out.println("Ingrese la coordenada x del punto: ");
        int x = lectura.nextInt();
        punto.setX(x);
        System.out.println("Ingrese la coordenada y del punto: ");
        int y = lectura.nextInt();
        punto.setY(y);
        System.out.println("Punto x: " + punto.getX());
        System.out.println("Punto y: "+ punto.getY());
        /* Agregar las instrucciones necesarias para que se presente 
        en pantalla la solicitud de los datos y posteriormente el
        usuario los ingrese desde el teclado*/
    }
    
}
 class Cartesiana2D
{
     private double x,y;
     //Getter y setters
     public void setX (double x)
     {
         this.x=x;
     }
     public void setY (double y)
     {
         this.y=y;
     }
    public double getX() 
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    //Metodo
    public Cartesiana2D polar_cartesiana2D(double r, double angulo)
    {
        Cartesiana2D obj = new Cartesiana2D();
        x = r*Math.cos(angulo);
        y = r*Math.sin(angulo);
        return obj;
    }
    //Constructor
        public Cartesiana2D polar_cartesiana2D(Polar p)
    {
        return polar_cartesiana2D(p.getR(), p.getAng());
    }
}
class Polar
{
    private double r, ang;
    //Constructores
    public Polar()
    {
    
    }
    public Polar(double radio, double angulo)
    {
        this.r=radio;
        this.ang=angulo;
    }
    //Getter y Setters
    public void setR(float r) 
    {
        this.r = r;
    }
    public void setAng(float ang) 
    {
        this.ang = ang;
    }
    public double getR() {
        return r;
    }

    public double getAng() 
    {
        return ang;
    }
    //Metodos
    public Polar cartesiana2D_polar (double x, double y)
    {
        double r=Math.sqrt(x*x + y*y);
        double ang=Math.atan(y/x);
        return new Polar(r, ang); 
    }
    
    public Polar cartesiana2D_polar (Cartesiana2D c)
    {
        return new Polar(c.getX(),c.getY());
    }
}
