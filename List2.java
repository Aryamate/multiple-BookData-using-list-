package Array_short;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class List2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc;){
			try {
				System.out.println("Enter the nuber of book");
				int n = Integer.parseInt(sc.nextLine());
				Integer a[] = new Integer[n];
				ArrayList<BookData> al = new ArrayList<BookData>();
				System.out.println("Enter the "+n+ " Book Details");
				for(int i=0;i<a.length;i++) {
					System.out.println("Enter book code");
					int code = Integer.parseInt(sc.nextLine());
					System.out.println("Enter book name");
					String name = sc.nextLine();

					al.add(new BookData(code,name));
				}
                 System.out.println("===Before Sorting===");
                 al.forEach((k)->{
                	 System.out.println(k.toString()+" ");
                 });
                  Collections.sort(al);
                  
                  System.out.println("===After Sorting===");
                  al.forEach((k)->{
                	  System.out.println(k.toString()+" ");
                  });





			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
