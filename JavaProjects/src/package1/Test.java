package package1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World");
		//System.out.println("Test1");
		
		String x = "abc,abc bca ddfdfdfdfdfdfdf ( hello world worldworldworldworldworld ),mapp";
		String[] y = {"abc","abc bca ddfdfdfdfdfdfdf ( hello world worldworldworldworldworld )","mapp","sdsfaf"};
		
		for(int a=0;a<y.length;a++) {
			if(x.contains(y[a])) {
				System.out.println("Found: "+y[a]);
			}else {
				System.out.println("nooooo");
			}
		}
	}

}
