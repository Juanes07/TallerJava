package Exercise17.Methods;

public class Metodos {
    char[] listaLetras = {'A','B','C','D','E','F'};
    protected boolean letraEncontrada = false;
    public boolean comprobarConsumoEnergetico(char letra){
        if(listaLetras.equals(letra)){
            letraEncontrada = true;
        } else {
            letraEncontrada = false;
        }
        return letraEncontrada;
    }



}
