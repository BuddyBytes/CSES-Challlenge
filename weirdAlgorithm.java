// im using resucrsion to solve this problem

public class csesChallenge {
    public static void main(String[] args) {
        int number = 3;
        weirdAlgorithms(number);
    }

    public static void weirdAlgorithms(int startNumber){

        // base condition
        if(startNumber==1){
            System.out.println(startNumber);
            return;
        }

        // check the even and odd of number

        if(startNumber%2==0){
            System.out.println(startNumber);
            startNumber=startNumber/2;
            weirdAlgorithms(startNumber);
        }
        else{
            System.out.println(startNumber);
            startNumber = (startNumber*3)+1;
            weirdAlgorithms(startNumber);
        }
    }
}
