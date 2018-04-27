package TutorialsPointPackage;

public class FreshJuice {
	enum FreshJuiceFlavour{Mango, CustardApple}
    FreshJuiceFlavour flavour;

public static void main(String args[]) {
		FreshJuice juice = new FreshJuice();
		juice.flavour = FreshJuice.FreshJuiceFlavour.CustardApple;
		System.out.println("Flavour :" + juice.flavour); 
   	
 }

}
