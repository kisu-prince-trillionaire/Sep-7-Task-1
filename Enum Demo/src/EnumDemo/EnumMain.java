package EnumDemo;

public class EnumMain {
	enum Names{
		RAM(5), KRISHNA(10), VISHAL(20);
		private int num;
		private Names(int num) {
			this.num = num;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Names name: Names.values()) {
			System.out.println(name);
			System.out.println(name.num);
		}
		System.out.println(Names.valueOf("RAM"));
		System.out.println(Names.valueOf("RAM").ordinal());

	}

}
