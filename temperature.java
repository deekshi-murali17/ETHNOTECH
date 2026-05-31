public class temperature {
    public static void main(String[] args) {
        int arr[]={30,35,26,19,46,37,28,13,14,16,67,77,45,37,5,78,35,89,7,4,55,32,21,11,23,22,52,13,14,4};
        int max=arr[0];
        int min=arr[0];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>30){
                count++;
            }
        }
System.out.println("Highest Value:"+max);
System.out.println("Lowest Value:"+min);
int sum=0;
for(int i=0;i<arr.length;i++){
    sum+=arr[i];
}
System.out.println("The average of all values:"+sum/arr.length);
System.out.println("Number of hot days greater than 30.C:"+count);
        }
    }

