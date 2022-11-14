public class csesChallenge {
    public static void main(String[] args) {
        int[] mainUnsortedArray = {2,5,4,1,3,7};
        System.out.println(missingNumber(mainUnsortedArray));// in this case return 6
    }

    public static int missingNumber(int[] BunchOfUnsortedValues){
        int indexOfValue = 0;
        while(indexOfValue < BunchOfUnsortedValues.length){
            int rightPosition = BunchOfUnsortedValues[indexOfValue] - 1;

            if(indexOfValue != rightPosition){
                if(rightPosition>BunchOfUnsortedValues.length-1){
                    indexOfValue++;
                }
                else{
                    swapToRightPosition(BunchOfUnsortedValues,indexOfValue,rightPosition);
                }
            }
            else{
                indexOfValue++;
            }

        }
        indexOfValue=0;

        for (int elements:BunchOfUnsortedValues) {
            int rightPosition = elements - 1;
            if(indexOfValue!=rightPosition){
                return indexOfValue+1;
            }
            else{
                indexOfValue++;
            }
        }
        return Integer.MAX_VALUE;// means no missing number
    }

    private static void swapToRightPosition(int[] bunchOfUnsortedValues, int indexOfValue, int rightPosition) {
        int temp = bunchOfUnsortedValues[indexOfValue];
        bunchOfUnsortedValues[indexOfValue] = bunchOfUnsortedValues[rightPosition];
        bunchOfUnsortedValues[rightPosition] = temp;
    }

}
