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
		
		System.out.println("Hunter 가 Monster 을" + Power.getPower() + "의 파워로 공격 했습니다.");
		System.out.println("Monster의 체력이" + difference + "만큼 남았습니다.");
	}
	
}
