import java.util.Scanner;


public class AndroidPhone {
	private int phonePrice = 9600, screenSize = 10;
	private double thickness = 5.2;
	private boolean isAudioJackPresent = true;
	private String phoneName = "Redmi Note5" , phoneBrand = "Xiaomi";

	
	public void myAwesomePhone() {
		System.out.println("My phone is " + phoneBrand+ " "+ phoneName+"."  );
		System.out.println("The price is "+ phonePrice + " and the size and thickness are "+ 
   screenSize+" "+thickness+".");
		System.out.println("Its " + isAudioJackPresent +" that AudioJack is present.");
		

	}
	
	
	public void buildPhone(int phonePrice, int screenSize, double thickness, boolean isAudioJackPresent, String phoneName
			,String phoneBrand) {
		this.phonePrice = phonePrice;
		this.screenSize = screenSize;
		this.thickness = thickness;
		this.isAudioJackPresent = isAudioJackPresent;
		this.phoneName = phoneName;
		this.phoneBrand = phoneBrand;
		
	}

	
	public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
			AndroidPhone ap = new AndroidPhone();
			
			ap.myAwesomePhone();
			
			int phonePrice = sc.nextInt();
			int screenSize = sc.nextInt();
			double thickness = sc.nextDouble();
			boolean isAudioJackPresent = sc.nextBoolean();
			String phoneName = sc.next();
			String phoneBrand =sc.nextLine();
			ap.buildPhone(phonePrice,screenSize,thickness,isAudioJackPresent,phoneName
						, phoneBrand);
			
			
			
			ap.myAwesomePhone();
			sc.close();
		
			
			
			
			
			
			
			
			
	}
}


	
	


