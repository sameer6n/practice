public class Permutation {

    public static void main(String [] args){

        System.out.println("Permutation to Print by n * n * n! abc");
        printPermutation("abc");
        System.out.println("Permutation to Print by n * n * n! lmno");

        String toPermute = "lmno";

        printPermutaionAlilBetter(toPermute);


        System.out.println("Permutation to Print by n * n * n! "+toPermute);
    }

    private static void printPermutaionAlilBetter(String str) {
        int strLeng = str.length();
        permute(str,0,strLeng-1);

    }

    private static void permute(String str, int l, int r) {
        if(l == r){
            System.out.println(" "+str);
        }else{
            for(int i= l; i<=r;i++){
                str = swap(str,l,i);
                System.out.println("_____________"+str+" val of l "+l+" val of r "+r);
                permute(str,l+1,r);
                str = swap(str,l,i);
            }
        }

    }

    private  static String swap(String str, int l, int i) {
        char [] charArray = str.toCharArray();
        char temp = charArray[l];
        charArray[l] = charArray[i];
        charArray[i] = temp;
        return String.valueOf(charArray);

    }


    /**
     * n * n * n! algorithm cause of the concatenation inside the for loop.
     * @param str
     */
    private static void printPermutation(String str) {
        permutation(str,"");
    }

    private static void permutation(String str, String prefix) {
        if(str.length() == 0){
            System.out.println(prefix);
        }else{
            for(int i = 0; i< str.length();i++){
                String rem = str.substring(0,i)  +str.substring(i+1);
                permutation(rem , prefix+str.charAt(i));
            }
        }

    }
}
