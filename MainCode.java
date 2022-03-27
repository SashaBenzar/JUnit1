package Lab1_1;
import java.util.Random;
public class MainCode {
	public static int minNum(int arr[]) {
        int min = arr[0];
        int minInx = 0;
        for (int i = 0; i < arr.length; i++) {
          if (Math.abs(arr[i]) < Math.abs(min)) {
            min = arr[i];
            minInx = i;
          }
        }
    return minInx;
    }
	public static int plusNum(int arr[]) {
        int min = 0;
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
          if (arr[i] >= 0) {
            min = i;
            break;
          }
        }
        for (int j = arr.length-1; j > -1; j--) {
            if (arr[j] >= 0) {
              max = j;
              break;
            }
          }
        for (int f = min+1; f < max; f++) {
            sum += arr[f];
          }
    return sum;
    }
	public static void main(String[] args) 
	{
		Random random = new Random();
		int[] array = new int[5];
		int min = -100;
        int max = 100;
        
        System.out.print ("Масив:");
		for (int i = 0; i < array.length; i++) {
		    array[i] = random.nextInt(max + 1 - min) + min;
		    System.out.print(" " + array[i]);
		}
		
		System.out.println("\nномер мінімального за модулем елемента масиву: "+minNum(array));
		int t = 0;
		for (int j = 0; j < array.length; j++) 
		{
			if(array[j]>0)
				t+=1;
		}
		if(t>1)
		{
			System.out.println("сума елементів масиву, розташованих між першим й останнім додатними елементами: "+plusNum(array));
		}
		else if(t==1) 
		{
			System.out.println("В масиві всього один додатній елемент");
		}
		else 
		{
			System.out.println("в масиві немає додатніх елементів");
		}
	}
}

