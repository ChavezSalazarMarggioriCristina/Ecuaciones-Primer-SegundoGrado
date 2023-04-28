package ECUACIONESPRIMERGRADO;

public class EcuacionesPrimerGrado
{
    public int a;
    public int b;

    public int obtenerA()
    {
        return a;
    }

    public void establecerA(int datoA)
    {
        a=datoA;
    }

    public int obtenerB()
    {
        return b;
    }

    public void establecerB(int datoB)
    {
        b=datoB;
    }

    public int solucion()
    {
        int x;

        x = -obtenerB()/obtenerA();

        return x;
    }

    public void mostarDatos()
    {
        System.out.println(obtenerA());
        System.out.println(obtenerB());
        System.out.println(solucion());
    }
}
