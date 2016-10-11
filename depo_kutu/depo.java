class depo{
	public static void main(String args[]){
		kutu k1 = new kutu();
		kutu k2 = new kutu();
		
		k1.x = 5.0;k1.y = 4.0;k1.z =8.0;
		k2.x = 4.5;k2.y = 4.5;k2.z =4.5;
		k2.kirilir=true;k2.taban_kodu=1;
		
		System.out.println("1. Kutunun hacmi:"+(k1.x*k1.y*k1.z)+" santimetrekup.");
		System.out.println("2. Kutunun hacmi:"+(k2.x*k2.y*k2.z)+" santimetrekup.");
	}
}
