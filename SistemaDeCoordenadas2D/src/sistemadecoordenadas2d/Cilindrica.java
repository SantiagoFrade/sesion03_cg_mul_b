package sistemadecoordenadas2d;

public class Cilindrica 
{
    private double radio, angulo, z;
    /*crear 2 constructores, 1 sin parametros y el otro con parametros*/
    /*Metodos sobrecargados para la conversión de esferica a cilindrica y al reves*/

    //Getters y Setters
    public double getRadio() 
    {
        return radio;
    }
    public void setRadio(double radio) 
    {
        this.radio = radio;
    }
    public double getAngulo() 
    {
        return angulo;
    }
    public void setAngulo(double angulo) 
    {
        this.angulo = angulo;
    }
    public double getZ() 
    {
        return z;
    }
    public void setZ(double z) 
    {
        this.z = z;
    }
    
    //Constructores
    public Cilindrica(Esferica e)
    {
        //return new Cilindrica(e.getAng1(),e.getAng2(),e.getRadio());
    }
    public Cilindrica(double radio, double angulo, double z)
    {
        this.angulo=angulo;
        this.radio=radio;
        this.z=z;
    }
    //Metodos
    public Cilindrica esferica_cilindrica(double radio, double ang1, double ang2)
    {
        
        //radio*radio=
        return new Cilindrica(radio, angulo, z);
    }
}
