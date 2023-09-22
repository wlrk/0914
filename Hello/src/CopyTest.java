import java.util.Arrays;

public class CopyTest {
	public static void main(String args[]) {
		int a[] = {1,2,3};
		int b[] = a.clone();		
		System.out.println("array a : "+ System.identityHashCode(a));
		System.out.println("array b : "+ System.identityHashCode(b));
		System.out.println();
		
		int aa[]= {1,2,3};
		int bb[]= Arrays.copyOf(aa,  aa.length);
		System.out.println("Array aa : "+ System.identityHashCode(aa));
		System.out.println("Array bb : "+ System.identityHashCode(bb));
		System.out.println();
		
		int aaa[]= {1,2,3};
		int bbb[]= new int[aaa.length];
		System.arraycopy(aaa, 0, bbb, 0 ,aaa.length);
		System.out.println("Array aaa : "+ System.identityHashCode(aaa));
		System.out.println("Array bbb : "+ System.identityHashCode(bbb));
		System.out.println();
		//deep copy 예시들
		
		//밑에는 shallow copy
		int aaaa[]= {1,2,3};
		int bbbb[]= aaaa;
		System.out.println("Array aaaa : "+ System.identityHashCode(aaaa));
		System.out.println("Array bbbb : "+ System.identityHashCode(bbbb));
		
	}

}
