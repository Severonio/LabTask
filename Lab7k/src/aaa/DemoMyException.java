package aaa;

public class DemoMyException {
    public static void main(String[] args) {
        mException mException = new mException();
        mException.DivideIntoZero(0);
    }
}

class mException
{
    public void DivideIntoZero(int i)
    {
        try{
            System.out.println(5/i);
        }
        catch (ArithmeticException j)
        {
            System.out.println("Found: " + j);
        }
    }
}
