package PermutationNCombination;

public class MySolution {

    public static void main(String[] args) {
        System.out.println("--------------Permutation -------------");
        permutation("abc", "");
        System.out.println("--------------Combination -------------");
        combination("abc", "");
        System.out.println("---------------------------------------");
    }

    private static void permutation(String val, String prefix)
    {
        int len = val.length();
        if(len==0)
            System.out.println(""+prefix);
        for (int i=0; i < len; i++)
        {
            permutation(val.substring(0, i) + val.substring(i+1), prefix+val.charAt(i));
        }
    }


    private static void combination(String val, String prefix)
    {
        int len = val.length();
        System.out.println(""+prefix);

        for (int i=0 ; i < len; i++)
        {
            combination( val.substring(i+1), prefix+val.charAt(i));
        }
    }
}
