package Mmoneymanagementsystem;

public class Hunter {
	private int power;
	
	Hunter(int power){
		this.power = power;
	}
	
	public int getPower() {
		return this.power;
	}
	
	public void attack() {
		int difference;
		Monster Hp = new Monster(1000);
		Hunter Power = new Hunter(100);
		difference = Hp.getHp() - Power.getPower();
		
		System.out.println("Hunter �� Monster ��" + Power.getPower() + "�� �Ŀ��� ���� �߽��ϴ�.");
		System.out.println("Monster�� ü����" + difference + "��ŭ ���ҽ��ϴ�.");
	}
	
}
