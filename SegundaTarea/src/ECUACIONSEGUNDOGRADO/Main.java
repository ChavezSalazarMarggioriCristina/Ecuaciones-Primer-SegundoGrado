package ECUACIONSEGUNDOGRADO;

import ECUACIONESPRIMERGRADO.EcuacionesPrimerGrado;

public class Main
{
    public static void main(String args[])
    {
        EcuacionesSegundoGrado solucion = new EcuacionesSegundoGrado();

        solucion.establecerA(1);

        solucion.establecerB(2);

        solucion.establecerC(-8);

        solucion.mostarDatos();
    }
}
