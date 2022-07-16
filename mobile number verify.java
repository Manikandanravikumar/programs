import java.util.*;
public class Main
{
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int c = sc.nextInt();
   int code = c;
   switch (code) {
       case 1:
          System.out.println("India");
          int[] arr = new int[10];
          int i1 = 6, i17 = 7, i18 = 8, i19 = 9;
          for(int i=0; i<10; i++)  
          {  
              arr[i]=sc.nextInt();
          }
          if(arr[0]==i1 || arr[0]==i17 || arr[0]==i18 || arr[0]==i19)
          {
              System.out.println("+91"+" "+Arrays.toString(arr).replace("[","").replace("]","").replace(",","").replace(" ",""));
          }
          else
          {
              System.out.println("Invalid Number");
          }
          break;
       case 2:
           System.out.println("Australia");
           int[] arr1 = new int[9];  
           int i2 = 4,i3=5;
           for(int i=0; i<9; i++)  
           {  
               arr1[i]=sc.nextInt();
           }
           if(arr1[0]==i2 || arr1[0]==i3)
           {
               System.out.println("+61"+" "+Arrays.toString(arr1).replace("[","").replace("]","").replace(",","").replace(" ",""));
           }
           else
           {
               System.out.println("Invalid Number");
           }
           break;
            case 3:
                System.out.println("Brazil");
           int[] arr2 = new int[8];  
           int i4=9;
           for(int i=0; i<8; i++)  
           {  
               arr2[i]=sc.nextInt();
           }
           if(arr2[0]==i4)
           {
               System.out.println("+55"+" "+Arrays.toString(arr2).replace("[","").replace("]","").replace(",","").replace(" ",""));
           }
           else
           {
               System.out.println("Invalid Number");
           }
           break;
            case 4:
                System.out.println("Canada");
           int[] arr3 = new int[11];  
           int i5 = 4, i6 = 1, i7 = 6, i8 = 4, i9 = 0, i10 =3;
           for(int i=0; i<11; i++)  
           {  
               arr3[i]=sc.nextInt();
           }
           if(arr3[0]==i5 && arr3[1]==i6 && arr3[2]==i7 || arr3[0]==i8 && arr3[1]==i9 && arr3[2]== i10)
           {
               System.out.println("+1"+" "+Arrays.toString(arr3).replace("[","").replace("]","").replace(",","").replace(" ",""));
           }
           else
           {
               System.out.println("Invalid Number");
           }
           break;
            case 5:
                System.out.println("Japan");
           int[] arr4 = new int[11];  
           int i11=0, i12 = 9, i13=0, i14=0, i15=8, i16 = 0;
           for(int i=0; i<11; i++)  
           {  
               arr4[i]=sc.nextInt();
           }
           if(arr4[0]==i11 && arr4[1]==i12 && arr4[2]==i13 || arr4[0]==i14 && arr4[1]==i15 && arr4[2]==i16)
           {
               System.out.println("+81"+" "+Arrays.toString(arr4).replace("[","").replace("]","").replace(",","").replace(" ",""));
           }
           else
           {
               System.out.println("Invalid Number");
           }
           break;
            default :
                System.out.println("Invalid input");
   }
}
}



/***
OUTPUT:

1
India
6 1 2 3 4 5 6 7 8 9
+91 6123456789

1
India
7 6 8 9 0 2 3 4 5 1
+91 7689023451

1
India
4 5 6 7 8 9 0 2 3 2
Invalid Number
