package kosa.video;

public class SpecialMember extends GeneralMember {

	private int bonusPoint;

	public SpecialMember() {

	}

	public SpecialMember(String id, String name, String address, int bonusPoint) {
		super(id, name, address);
		this.bonusPoint = bonusPoint;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int point) {
		this.bonusPoint = point;
	}

	@Override
	public void rental(Video video) {
		super.rental(video);
		this.bonusPoint += 100;
	}

	public void show() {
		super.show();
		System.out.println("보너스 포인트: "+bonusPoint);
	}
	
	public void specialPrint() {
		System.out.println("스페셜 멤버");
	}

}
