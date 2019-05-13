package generics_Java;

public class generic<T> {
	
	T sample;

	public generic(T sample) {
		this.sample = sample;
	}

	public T getSample() {
		return sample;
	}

	public void setSample(T sample) {
		this.sample = sample;
	}
	
	
	
}
