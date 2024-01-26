//(4)=> Write a program that accept a string from command line and perform following operations:
//1.Display each character on seperate line in reverse order.
//2.Count total number of characters & disply each character's position too.
//3.Identify the whether the String is palindrome or not.
//4.Count total number of UpperCase & LowerCase character in it.
class U34
{
    public static void main(String []args)
    {
        char c[]=args[0].toCharArray();

        //toCharArray() method converts the given string into sequence of character.

        System.out.println("\nDisplay Each Character on seperate line in reverse order");

        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i]);
        }

        System.out.println("\nCount Total Number Of Character & Display each Character's Position");

        System.out.println("\nTotal Number Of Character Are=> "+c.length);

        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i]+ " Character On => "+i+ " Position");
        }

        System.out.println("\nIndentify the String is palindrome or not ");

        String orgStr,revStr="";

        orgStr=args[0];

        int len=orgStr.length();

        for(int i=len-1;i>=0;i--)
        {
            revStr=revStr+orgStr.charAt(i);
            System.out.println("\nReverse String => "+revStr);
        }

        //CharAt() return a character at a specific index position in a string

    // The First Character in a string has the index position 0 and it returns a single character 

    if(orgStr.equals(revStr))
        System.out.println("\nString is palindrome");
    else
    System.out.println("\nString is not palindrome");

    System.out.println("\nTotal Number Of UpperCase & LowerCase Characters");

    int up=0,lw=0;

    for(int i=0;i<c.length;i++)
    {
        if(Character.isUpperCase(c[i]))
            up++;
        else
            lw++;
    }


    System.out.println("\nUpperCase Character Are=> "+up);
    System.out.println("\nLowerCase Character Are=> "+lw);

    }

}

//javac U34.java
//java U34 yoy