class IndexOf {
	public static void main(String args[]) {
		String str = "Java ������ �缺�� ���� ����������!!";
		int idx = str.indexOf(" ");
		System.out.println(idx); // 4

		idx = str.indexOf(" ",4 + 1);
		System.out.println(idx); // 8
		
		idx = str.indexOf(" ",8 + 1);
		System.out.println(idx); // 12
		
		idx = str.indexOf(" ",12 + 1);
		System.out.println(idx); // 15
		
		idx = str.indexOf(" ");
		System.out.println(idx); // 4


}