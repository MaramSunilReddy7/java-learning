package arrays;

public class BasicsOfArray {

	public static void main(String[] args) {
        int Iarr[] = new int[10];  //array of integer type, by default all the values are 0.
        Iarr[0] = 12;
        Iarr[4] = 18;
        System.out.println(Iarr[0]);
        System.out.println(Iarr[4]);
        System.out.println(Iarr[7]);
        char cArray[] = new char[10];  // array of integer type , by default all the values are 'null'
        cArray[0] = 'a';
        cArray[1] = 'b';
        System.out.println(cArray[0]);
        System.out.println(cArray[7]);
        System.out.println(cArray[1]);
	}

}
