public class App {
    public static void main(String[] args) throws Exception {
        Racional castillo;
        castillo = new Racional(3,5);
        castillo.res(new Racional(1,4));
        castillo.sum(new Racional (1,10));
        castillo.mul(new Racional(3,2));
        castillo.res(new Racional (1,5));
        
        Racional divisor;
        divisor = new Racional(2,6);
        divisor.sum(new Racional(1,3));
        divisor.res(new Racional (6,4));
        divisor.div(new Racional (2,3));
        divisor.sum(new Racional(1,6));
        castillo.div(divisor);
        castillo.simp();
        System.out.println(castillo);
        System.out.println("--------");
        Racional castillo2= new Racional(1,2);
        castillo2.sum(new Racional(1,2),new Racional(1,2));
        System.out.println(castillo2);


        System.out.println("--------");
        Racional porSimp = new Racional(6,12);
        porSimp.simp();
        System.out.println(porSimp);


    }
}
