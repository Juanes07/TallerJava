package ExerciseExtra;

public class Example {
    public static void main(String[] args) {
        // Instancia de objeto Pagos
        Pagos pagos;
        pagos = new Pagos();
        boolean payExtra = true;
        if (payExtra == false) {
            pagos.basicPayment();
        }
        pagos.extraPayment();
    }
}
