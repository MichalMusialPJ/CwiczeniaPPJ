package ppj4;

public class Task10 {
    public static void main(String[] args) {

        boolean czyPada = true;
        boolean czySwieciSlonce = true;

        if(czyPada&&czySwieciSlonce) {
            System.out.println("tęcza");
        } else if (czyPada==true && czySwieciSlonce==false) {
            System.out.println("plucha");
        } else if (czyPada==false && czySwieciSlonce==false) {
            System.out.println("pochmurno");
        }else{
            System.out.println("słonecznie");
        }


    }
}
