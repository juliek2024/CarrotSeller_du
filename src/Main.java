public class Main {
    public static void main (String[] args) {
        CarrotSeller carrotSeller1 = new CarrotSeller();
            carrotSeller1.setName("Petr Janeček");
            carrotSeller1.setAddress("Gruzinská 8, Praha, 10202");
        CarrotSeller carrotSeller2 = new CarrotSeller();
            carrotSeller2.setName("Eva Nováková");
            carrotSeller2.setAddress("Topolová 2345/8, Česká Lípa, 40502");
        System.out.println(carrotSeller1.getName());
        System.out.println(carrotSeller1.getAddress());
        System.out.println(carrotSeller2.getName());
        System.out.println(carrotSeller2.getAddress());

           }
}