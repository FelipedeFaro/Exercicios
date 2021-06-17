public class Main {

    public static void main(String[] args) {
        new Main().numeros();
    }

    void triangulos(){

        Triangulo triangulo1 = new Triangulo(5,5,10);
        Triangulo triangulo2 = new Triangulo(6,6,6);
        Triangulo triangulo3 = new Triangulo(5,8,10);
        System.out.println(triangulo1.tipo());
        System.out.println(triangulo2.tipo());
        System.out.println(triangulo3.tipo());
    }
    void numeros (){
        new Numero().calculos();
    }
}


