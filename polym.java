 class  animal
{
    void draw()
    {
        System.out.println(" cant say shape");
    }
}
class rect extends animal
{
    @Override
    void draw()
    {
        System.out.println("shape is squre");
    }
}
public class polym
{
    public static void main(String args[])
    {
        rect r=new rect();
        r.draw();
    }
}



    

