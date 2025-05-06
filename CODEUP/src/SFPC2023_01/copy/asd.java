package SFPC2023_01.copy;

public class asd {
	
	public class Codeup_2368 {
		public static void main(String[] args) {
			int max = 0;
			
			int kong = 21064 / 40;
			int go = 22054 / 50;
			int dor = 23063 / 30;
			
			if(kong < go && kong < dor) {
				max = kong;
			} else if(go < kong && go < dor) {
				max = go;
			} else if(dor < go && dor < kong) {
				max = dor;
			}
			
			System.out.println(max);
		}
	}

}
