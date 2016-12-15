package boletin_9_2;

public class SumProd {

    public void calcular() {

        for (int i = 10; i <= 90; i++) {
            for (int num = 10; num <= 90; num++) {
                System.out.println(" La suma de " + i + " y " + num + " da: " + (i + num) + " y " + "la multiplicación da " + (i * num));
            }
        }
    }
}
