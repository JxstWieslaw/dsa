//package arrays;
//
//public class TempClass {
//String num = obj.next();
//    int countOfDigits=0;
//    //create copy/tempNum for counting Digits
//    int tempNum=num;
//        while(tempNum>0){
//        tempNum/=10;
//        countOfDigits++;
//    }
//
//    //create array with size == countOfDigits
//    int [] arr = new int[countOfDigits];
//
//    //Make an array of each digit separately
//    //Make copy/tempNumDigits for positioning each digit into array
//    int tempNumDigits = num;
//    int position=countOfDigits-1;
//        while(tempNumDigits>0){
//        //last digit is r. Traversing happens from first to last hence position--
//        int r=tempNumDigits%10;
//        tempNumDigits/=10;
//        arr[position--]=r;
//    }
//
//    //Maintain variable max
//    int max=num;
//    int currentValue=0;
//        for(int i=0;i<countOfDigits-2;i++) {
//        if(sameParityCheck(arr[i],arr[i+1])){
//            int temp=arr[i];
//            arr[i]=arr[i+1];
//            arr[i+1]=temp;
//        }
//
//        //handle case when first digit becomes zero
//        int a = countOfDigits-1;
//        int start=0;
//        if(arr[0]==0){
//            start=1;
//        }
//
//        //Create full number from single digits in array
//        for(int n=start;n<countOfDigits;n++){
//            currentValue=currentValue+arr[n]*(int)Math.pow(10,a--);
//        }
//
//        if(currentValue>max)
//            max=currentValue;
//    }
//        System.out.println("Max value is: "+max);
//}
