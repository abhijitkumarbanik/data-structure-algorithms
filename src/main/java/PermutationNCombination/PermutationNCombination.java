package PermutationNCombination;

public class PermutationNCombination {
    static void initiate(String s) {
        permute("", s);
        System.out.println("----------------------------------------- ");
        //combo("", s);
        //System.out.println("----------------------------------------- ");
    }

    static void combo(String prefix, String s) {
        //System.out.println("String :"+s);
        int len = s.length();
        System.out.println("Prefix :"+ prefix);
        for (int i = 0; i < len; i++)
            combo(prefix + s.charAt(i), s.substring(i + 1));
    }

    static void permute(String prefix, String s) {
        int len = s.length();
        //System.out.println("String :"+s);
        if (len == 0)
            System.out.println("Prefix :"+" " + prefix);

        for (int i = 0; i < len; i++)
        {
            //System.out.println( "Substring 1 :"+s.substring(0, i));
            //System.out.println("Substring 2 :"+s.substring(i + 1, len));
            permute(prefix + s.charAt(i), s.substring(0, i) + s.substring(i + 1, len));
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        initiate(s);
    }
}
