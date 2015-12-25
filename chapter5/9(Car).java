public class Car {
	private String maker;
	private String model;
	private int makeYear;
	public String regisataryNumber;

	public Car(String maker, String model, int makeYear, String regisataryNumber) {
		this.maker = maker;
		this.model = model;
		this.makeYear = makeYear;
		this.regisataryNumber = regisataryNumber;
	}

	public Car(String maker, String model) {
		this(maker, model, -1, "");
	}

	public Car(String maker, String model, int makeYear) {
		this(maker, model, makeYear, "");
	}

	public Car(String maker, String model, String registaryNumber) {
		this(maker, model, -1, registaryNumber);
	}

	public String getMaker() {
		return maker;
	}

	public String getModel() {
		return model;
	}

	public int getMakeYear() {
		return makeYear;
	}
}