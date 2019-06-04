package ctcichapter1;

public class UniqueString {
    public static boolean isUniqueWithBooleanArray(String str){

        boolean [] boolArray = new boolean[128];
        char [] aar =  str.toCharArray();

        for(int i=0;i<aar.length;i++){
            if(boolArray[aar[i]]){
                return false;
            }else{
                boolArray[aar[i]]=true;
            }
        }
        return true;
    }


}
