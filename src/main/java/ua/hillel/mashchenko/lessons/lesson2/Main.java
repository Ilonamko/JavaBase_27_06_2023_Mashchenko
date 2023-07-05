package ua.hillel.mashchenko.lessons.lesson2;

public class Main {
    public static void main(String[] args) {

       // byte age;
       // age=35;

      //  byte age = 35;
       // short shortVariable = 32000;
      //  int intVariable = 2147000000;
      //  long longVariable = 2147000000000000L;

       // System.out.println(age);



       // float floatVariable = 1.123456789123456789F;
       // double doubleVariable = 1.123456789123456789D;
        // System.out.println(floatVariable);
        //  System.out.println(doubleVariable);


        // char charA1 = 'A';
         // char charA2 = 65;
        // char charA3 = '\u0041';
       //  char charZ = '\u0051';
        // char charASpecial = '\u2323';


       //  System.out.println(charA1);
        // System.out.println(charA2);
      //   System.out.println(charA3);
      //  System.out.println(charZ);
      //  System.out.println(charASpecial);


      //  boolean isOK = true;
     //   boolean isOK2 = false;


        // System.out.println(isOK);
        // System.out.println(isOK2);

        // final double PI_VALUE = 3.14;


       // byte byteVariable = 55;
       // double doubleTest = byteVariable;


       // System.out.println(byteVariable);
      //  System.out.println(doubleTest);

       // char chA = 'A';
      //  int intA = chA;

      //  System.out.println(chA);
      //  System.out.println(intA);

      //  int intAge = 128;
      //  byte byteAge = (byte) intAge;

      //  System.out.println(intAge);
      //  System.out.println(byteAge);

        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Java";
        String str4 = "Best";

      //  int number = 555;


      //  String str = str1 + " " + str2 + " " + number + " " + str3 + " " + str4;
      //  System.out.println(str);


        double longitude = 2.338629;
        double latitude = 48.860294;
        char specSymbol = '\u00B0';
        char specSymbol2 = '\'';
        char specSymbol3 = 'W';
        byte lat = 48;
        byte lat2 = 51;
        byte longit = 2;
        byte longit2 = 20;
        double dmsLat = 38.2356;
        double dmsLong = 15.6372;
        char specSymbol4 = 'N';


        System.out.println("longitude: - " + longitude + " Latitude: " + latitude);
        System.out.println("DMS Lat: 48" + specSymbol + " 51' 38.2356'' N  DMS Long: 2" + specSymbol + " 20' 15.6372'' W");
        System.out.println("DMS Lat:" + lat + specSymbol + lat2 + specSymbol2 + dmsLat + specSymbol2 + specSymbol2 + specSymbol4 + "  DMS Long: " + longit + specSymbol + longit2 + specSymbol2 + dmsLong + specSymbol2 + specSymbol2 + specSymbol3);



    }

}
