package Tema3_EstructurasNoLineales.Recursividad;

public class TestPotencia {

    public static void main(String[] args) {
        System.out.println("-----Bad power------");
        System.out.println("----5 ejemplos de potencias:-----");
        long start1 = System.nanoTime();
        System.out.println("--el resultado de la potencia es-- "+Potencias.power(2.00, 10));
        long end1 = System.nanoTime();
        System.out.println("el tiempo de ejecucion en milisegundos de n=10 = " + ((double) end1 - start1) / 1000000);

        long start2 = System.nanoTime();
        System.out.println("--el resultado de la potencia es-- "+Potencias.power(2.00, 50));
        long end2 = System.nanoTime();
        System.out.println("el tiempo de ejecucion en milisegundos de n=50 = " + ((double) end2 - start2) / 1000000);

        long start3 = System.nanoTime();
        System.out.println("--el resultado de la potencia es-- "+Potencias.power(2.00, 100));
        long end3 = System.nanoTime();
        System.out.println("el tiempo de ejecucion en milisegundos de n=100 = " + ((double) end3 - start3) / 1000000);

        long start4 = System.nanoTime();
        System.out.println("--el resultado de la potencia es-- "+Potencias.power(2.00, 1000));
        long end4 = System.nanoTime();
        System.out.println("el tiempo de ejecucion en milisegundos de n=1000 = " + ((double) end4 - start4) / 1000000);

        long start5 = System.nanoTime();
        System.out.println("--el resultado de la potencia es-- "+Potencias.power(2.00, 10000));
        long end5 = System.nanoTime();
        System.out.println("el tiempo de ejecucion en milisegundos de n=10000 = " + ((double) end5 - start5) / 1000000);

        System.out.println("-------Good Power------");
        System.out.println("----5 ejemplos de potencias:----");
        long start6 = System.nanoTime();
        System.out.println("--el resultado de la potencia es-- "+Potencias.badpower(2.00, 10));
        long end6 = System.nanoTime();
        System.out.println("el tiempo de ejecucion en milisegundos de n=10 = " + ((double) end6 - start6) / 1000000);

        long start7 = System.nanoTime();
        System.out.println("--el resultado de la potencia es-- "+Potencias.badpower(2.00, 50));
        long end7 = System.nanoTime();
        System.out.println("el tiempo de ejecucion en milisegundos de n=50 = " + ((double) end7 - start7) / 1000000);

        long start8 = System.nanoTime();
        System.out.println("--el resultado de la potencia es-- "+Potencias.badpower(2.00, 100));
        long end8 = System.nanoTime();
        System.out.println("el tiempo de ejecucion en milisegundos de n=100 = " + ((double) end8 - start8) / 1000000);

        long start9 = System.nanoTime();
        System.out.println("--el resultado de la potencia es-- "+Potencias.badpower(2.00, 1000));
        long end9 = System.nanoTime();
        System.out.println("el tiempo de ejecucion en milisegundos de n=1000 = " + ((double) end9 - start9) / 1000000);

        long start10 = System.nanoTime();
        System.out.println("--el resultado de la potencia es-- "+Potencias.badpower(2.00, 10000));
        long end10 = System.nanoTime();
        System.out.println("el tiempo de ejecucion en milisegundos de n=10000 = " + ((double) end10 - start10) / 1000000);
    }

}
