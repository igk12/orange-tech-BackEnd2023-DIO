public class ExemploUm {
    public static void main(String[] args) throws Exception {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;
        int i1 = 3;
        int i2 = 2;
        float f1 = 1.1f;
        float f2 = 1.2f;

        boolean resultado = b1&&b2;
        boolean resultado2 = b1&&b3;
        System.out.println("b1&&b2 = " + resultado + " b1&&b3 = " + resultado2);

        boolean resultado3 = b2||b3;
        boolean resultado4 = b2||b4;
        System.out.println("b2||b3 = " + resultado3 + " b2||b4 = " + resultado4);

        boolean resultado5 = b1^b3;
        boolean resultado6 = b4^b1;
        System.out.println("b1^b3 = " + resultado5 + " b4^b1 = " + resultado6);

        boolean resultado7 = !b1;
        boolean resultado8 = !b2;
        System.out.println("!b1 = " + resultado7 + " !b2 = " + resultado8);

        boolean calculo1 =  (f2 < f1);
        boolean calculo2 = (i1 > i2);
        boolean resultado10 = calculo1 || calculo2;
        System.out.println("(i1 > i2) || (f2 < f1) = " + resultado10);

        //boolean resultado = ((i1 + i2)<(f2 - f1)) && true;
        //System.out.println("b1((i1 + i2)<(f2 - f1)) && true = " + resultado);
    }
}
