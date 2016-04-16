Class IMC{
	float peso, altura;

		public IMC(float p, float a){
			this.peso = p;
			this.altura = a;
}

	public float CalculaImc(float p, float a){
		return p / (a*a);		
		
	}
	
}
