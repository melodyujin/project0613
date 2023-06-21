class Star6{
	public static void main(String[] args){
		for(int a=1;a<=6;a++){ //6층
			for(int i=1;i<=6;i++){ //6호수
				if(i>=a){
					System.out.print("★"); //안쪽이 바깥쪽보다 이상일 때..
				}else{
					System.out.print("☆");
				}
			}
			System.out.println("");
		}
	}
}
