import java.util.Random;



public class phone{
  public static void main(String[]args){


Random rand = new Random();
int first = rand.nextInt(7) + 2;
System.out.println(first);
int second = rand.nextInt(9);
System.out.println(second);
int third = rand.nextInt(10);
System.out.println(third);
int fourth = rand.nextInt(7) + 2;
System.out.println(fourth);
int fifth = rand.nextInt(10);
System.out.println(fifth);
int sixth = rand.nextInt(10);
System.out.println(sixth);
int seventh = rand.nextInt(10);
System.out.println(seventh);
int eight = rand.nextInt(10);
System.out.println(eight);
int ninth = rand.nextInt(10);
System.out.println(ninth);
int tenth = rand.nextInt(10);
System.out.println(tenth);

System.out.print("The random phone number is: "+ first+""+second+""+third+"-");
System.out.println(fourth+""+fifth+""+sixth+"-"+seventh+""+eight+""+ninth+""+tenth);
}
}
