package sistemadecoordenadas2d;


public class Esferica 
{
    private double radio, ang1, ang2;
    //Getter y Setter
    public double getRadio() 
    {
        return radio;
    }
    public void setRadio(double radio) 
    {
        this.radio = radio;
    }
    public double getAng1() 
    {
        return ang1;
    }
    public void setAng1(double ang1) 
    {
        this.ang1 = ang1;
    }
    public double getAng2() 
    {
        return ang2;
    }
    public void setAng2(double ang2) 
    {
        this.ang2 = ang2;
    }
    
    //Constructores
    public Esferica(Cilindrica c)
    {
        //Return new Esferica(c.getAngulo(),c.getRadio(),c.getZ())  
    }
    public Esferica (double radio, double ang1, double ang2)
    {
        this.radio=radio;
        this.ang1= ang1;
        this.ang2=ang2;
    }
    //Metodos
    
    
}
