
public class Program1forArrayRotation {
    public static void main(String s[]){
        int[] x = {1,2,3,4,5,6,7};
        int i;
        
        System.out.println("Original Array:");
        for(i =0; i< x.length; i++){
            System.out.print(x[i]);
        }
        System.out.println();
        
        //logic for Array Rotation
        int [] reverseArray= rotateArray(x);
        
        System.out.println("reverseArray:");
        for( i =0; i< reverseArray.length; i++){
            System.out.print(reverseArray[i]);
        }
        System.out.println();
        
    }
    
    public static int[] rotateArray(int[] originalArray){
        int i,k;
        
        int[] temp = new int[2];
        for (i=0; i< 2; i++){
            temp[i] = originalArray[i];
        }
        
        int[] temp1 = new int[5];
        for (i=2; i< originalArray.length; i++){
            temp1[i-2] = originalArray[i];
        }
        
        int size= temp.length + temp1.length;
        int[] reverseArray = new int[7];
        for(i = 0; i< temp1.length; i++){
            reverseArray[i]=temp1[i];
        }
        for(i = 0, k = temp1.length; i< temp.length; i++, k++){
            reverseArray[k]=temp[i];
        }   

        return reverseArray;
    }
}
