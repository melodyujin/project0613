class Star5{
	public static void main(String[] args){
		char star="";

		for(int i=1;i<=10;i++){
			star=(i<=5)? "¡Ù":"¡Ú";
			System.out.print(star);
		}

		/*
		for(int i=1;i<=10;i++){
			if(i<=5){
				System.out.print("¡Ù");
			}else{
				System.out.print("¡Ú");
			}
		}
		*/
	}
}
