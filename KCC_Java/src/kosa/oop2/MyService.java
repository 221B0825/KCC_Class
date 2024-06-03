package kosa.oop2;

public class MyService {

	private Dao dao;

	public MyService(Dao dao) {
		super();
		this.dao = dao;
	}

	public void insertService() {
		dao.insert();
	}

}
