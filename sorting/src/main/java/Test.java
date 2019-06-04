public class Test {

    public static void main(String [] args){

        String name = "Scala"; //1st String object
        String name_1 = "Scala"; //same object referenced by name variable
        String name_2 = new String("Scala") ;//different String object

//this will return true
        if(name==name_1){
            System.out.println("both name and name_1 is pointing to same string object");
        }

//this will return false
        if(name==name_2){
            System.out.println("both name and name_2 is pointing to same string object");
        }


//        Read more: https://javarevisited.blogspot.com/2013/07/java-string-tutorial-and-examples-beginners-programming.html#ixzz5j8ItKkEV

    }

}
