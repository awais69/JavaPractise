public class StringFunction {
    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println("\n");

        System.out.println(str);

        System.out.println("Length of string : "+str.length());

        System.out.println("CharAt 4 : " + str.charAt(4));

        String str2 = "Nice";
        System.out.println("Concat function : "+str.concat(str2));

        System.out.println("replace char : "+str.replace('l','g'));

        System.out.println("sub string from 2 to 8 : "+str.substring(2,8));

        String str3 = "     Hello Testing       ";
        System.out.println("Trim function is : "+str3.trim());

    }
}
