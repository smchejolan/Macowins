package base;

public enum Constantes {
	CoefRecargo{
		 @Override
		public double valor() {
			return 0.1;
		}
	};
	public abstract double valor();
}
