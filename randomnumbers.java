import java.util.Random;

public class randomnumbers{
  public static void main(String[]args){

      Random rand = new Random();

      rand.nextInt(10);
        System.out.println(rand.nextInt(10));
        System.out.println((int) (Math.random()*10));

        System.out.println(rand.nextInt(10) + 1);
        System.out.println((int) Math.random()*10 + 1);

        System.out.println(rand.nextInt(15)+ 20);

        System.out.println(rand.nextInt(20)- 10);

         System.out.println(rand.nextDouble());

         System.out.println(rand.nextDouble()*6);







}
  }
