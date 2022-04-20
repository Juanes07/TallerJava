package Exercise16;

public class Metodos extends Persona {
    int negativo = -1;
    int bajoIdeal = 0;
    int sobreIdeal = 1;
    boolean esMayor = false;

    public void calcularIMC(double peso, double altura){
        double pesoIdeal = peso / (altura * altura);
        System.out.println(pesoIdeal);
        if(pesoIdeal < 20){
            System.out.println(negativo);
        } if (pesoIdeal >=20 && pesoIdeal<=25){
            System.out.println(bajoIdeal);
        } if (pesoIdeal > 25) {
            System.out.println(sobreIdeal);
        }
    }

    public boolean esMayorDeEdad(int edad){
        if(edad>= 18){
            esMayor = true;
            System.out.println(esMayor);
        } else {
            esMayor = false;
            System.out.println(esMayor);
        }
        return esMayor;
    }
}
