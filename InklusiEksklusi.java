package Latihan;

import java.util.Scanner;

public class InklusiEksklusi{

	private int batas1, batas2, bagi1, bagi2, bagiKpk;
	
	public void setAngka(int x,int y,int a,int b) {
		batas1 = x;
		batas2 = y;
		bagi1 = a;
		bagi2 = b;
		int i = 1;
		while((a*i)%b != 0) {
			i++;
		}
		bagiKpk = a*i;
	}
	
	public int getKpk() {
		return bagiKpk;
	}
	
	public int hitungHasil() {
		int kardinalJumlah = 0;
		while(batas1 <= batas2) {
			if(batas1 % bagi1 == 0 || batas1 % bagi2 == 0) {
				kardinalJumlah++;
			}
			batas1++;
		}
		int kardinalIrisan = 0;
		while(batas1 <= batas2) {
			if(batas1 % bagiKpk == 0) {
				kardinalIrisan++;
			}
			batas1++;
		}
		return kardinalJumlah-kardinalIrisan;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Input Batas Bawah : ");
		int x = s.nextInt();
		
		System.out.print("Input Batas Atas : ");
		int y = s.nextInt();
		
		System.out.print("Input Bilangan 1 : ");
		int a = s.nextInt();
		
		System.out.print("Input Bilangan 2 : ");
		int b = s.nextInt();
		
		InklusiEksklusi myIE = new InklusiEksklusi();
		
		myIE.setAngka(x, y, a, b);
		int banyakBil = myIE.hitungHasil();
		
		System.out.println("Banyak bilangan yang habis dibagi "+ a + " dan "+ b +" adalah : "+ banyakBil +" bilangan");
	}

}
