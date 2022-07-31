package firstVersion;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//declare input variables and arrays
		
	double Nlaptop = Double.parseDouble(args[0]);
	double Nmouse = Double.parseDouble(args[0]);
	double Ndesktop = Double.parseDouble(args[0]);
	double Nlcd = Double.parseDouble(args[0]);
	
	double [] lt = new double [3];
	double [] m = new double [3];
	double [] dt = new double [3];
	double [] lcd = new double [3];	
	
	//declare output and working variables
	
	int Nsmallcontainer = 0;
	int Nbigcontainer = 0;
	double costs = 0;
		
	//fill array according to input variables
	
	lt[0] = Nlaptop;
	lt[1] = 6.5 * Nlaptop;
	lt[2] = Nlaptop * (0.6 * 0.5 * 0.5);
	m[0] = Nmouse;
	m[1] = 0.2 * Nmouse;
	m[2] = Nmouse * (0.3 * 0.3 * 0.2);
	dt[0] = Ndesktop;
	dt[1] = 20 * Ndesktop;
	dt[2] = Ndesktop * (1 * 1.5 * 0.5);
	lcd[0] = Nlcd;
	lcd[1] = 2.6 * Nlcd;
	lcd[2] = Nlcd * (1.2 * 1.4 * 0.8);
	
	//declare volume and weight variables
	
	double totalWeight = lt[1] + m[1] + dt[1] + lcd[1];
	double totalVolume = lt[2] + m[2] + dt[2] + lcd[2];
	double smallVolume = (2.59 * 2.43 * 6.06);
	double bigVolume = (2.59 * 2.43 * 12.01);
	
	//calculate optimal shipping option and price
	
	while (totalVolume > 0) {
		if (totalVolume <= smallVolume && totalWeight <= 500) {
				Nsmallcontainer = Nsmallcontainer +1;
				costs = costs + 1000;
				System.out.println ("Recommended shipping option: " + Nsmallcontainer + " small container, " + Nbigcontainer + " big container, " + "costs: " + costs);
				System.exit(1);
			} else {
				if (totalVolume <= smallVolume && totalWeight > 500) {
					Nsmallcontainer = Nsmallcontainer +1;
					costs = costs + 1200;
					System.out.println ("Recommended shipping option: " + Nsmallcontainer + " small container, " + Nbigcontainer + " big container, " + "costs: " + costs);
					System.exit(1);
				} else {
					if (totalVolume <= bigVolume) {
						Nbigcontainer = Nbigcontainer +1;
						costs = costs + 1800;
						System.out.println ("Recommended shipping option: " + Nsmallcontainer + " small container, " + Nbigcontainer + " big container, " + "costs: " + costs);
						System.exit(1);
					} else {
						if (totalVolume > bigVolume) {
							Nbigcontainer = Nbigcontainer +1;
							costs = costs + 1800;
							totalVolume = totalVolume - bigVolume;
						} else {
							System.out.println("Exit, reconsider your options");
					}
				}
			}
		}
	}
	
	System.out.println ("Recommended shipping option: " + Nsmallcontainer + " small container, " + Nbigcontainer + " big container, " + "costs: " + costs);
	
	
	
	
	
	

		}
	}

