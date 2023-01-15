public class ExemploUm {
    public static void main(String[] args) throws Exception {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;
        int i1 = 0;
        int i2 = 2;
        float f1 = 1.1f;
        float f2 = 3.2f;


        System.out.println("b1&&b2 = " + (b1&&b2) + " ----------- b1&&b3 = " + (b1&&b3));

        System.out.println("b2||b3 = " + (b2||b3) + " ----------- b2||b4 = " + (b2||b4));

        System.out.println("b1^b3 = " + (b1^b3) + " ----------- b4^b1 = " + (b4^b1));

        System.out.println("!b1 = " + !b1 + " ----------- !b2 = " + !b2);

        boolean calculo1 =  (f2 < f1);
        boolean calculo2 = (i1 > i2);
        System.out.println("(i1 > i2) || (f2 < f1) = " + (calculo1 || calculo2));

        //boolean resultado = ((i1 + i2)<(f2 - f1)) && true;
        System.out.println("b1((i1 + i2)<(f2 - f1)) && true = " + (((i1 + i2)<(f2 - f1)) && true));
    }
}
