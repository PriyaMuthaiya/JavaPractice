package EX_string;

public class stringFunctions {
    public static void main(String[] args) {

        String name="john";
        System.out.println("no of chars in name is "+name.length());
//charAt ->gives char pf given index
        System.out.println(name.charAt(3));
        String last="maxe";
        System.out.println("concatinating two strings "+name.concat(last));
//index of->gives index og given char

 //replace
        System.out.println(name.replace('o','a'));
        System.out.println(name);
     //split

        String name2="john mase sfs";
        String split[]=name2.split(" ");
        System.out.println(split[1]);
   //Substring- take include first index and exlude last index mentioned
        System.out.println(name2.substring(2,5));

   //trim -will remove first and last space in the string
        System.out.println(name2.trim());





    }
}
