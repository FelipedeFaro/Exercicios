import java.util.Scanner;

public class Numero {

    public Float maior(){

        Scanner in = new Scanner(System.in);
        Float n1= in.nextFloat();
        Float n2= in.nextFloat();
        Float n3= in.nextFloat();
        Float maior = null;

        if (n1>n2 && n1>n3) {
           maior = n1;
        }
        else {
            if (n2>n3 && n2>n1){
                maior = n2;
            }
            else {
                if (n3>n1 && n3>n2){
                    maior = n3;
                }
            }

        }
        return maior;
    }
}
