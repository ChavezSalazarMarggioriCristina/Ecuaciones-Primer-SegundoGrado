package ECUACIONSEGUNDOGRADODIFERENTE;

public class Main
{
    public static void main(String args[])
    {
        EcuacionSegundoGradoDiferente.establecerA(1);
        System.out.println(EcuacionSegundoGradoDiferente.obtenerA());

        EcuacionSegundoGradoDiferente.establecerB(2);
        System.out.println(EcuacionSegundoGradoDiferente.obtenerB());

        EcuacionSegundoGradoDiferente.establecerC(-8);
        System.out.println(EcuacionSegundoGradoDiferente.obtenerC());

        EcuacionSegundoGradoDiferente.discriminante();
        EcuacionSegundoGradoDiferente.raiz();
    }
}
