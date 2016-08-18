package pe.edu.upc.entity;

public class Frutae {

		//atributo de instancia
		private String color;
		private String sabor;
		
		//atrib de clase
		public static String LugarOrigen="upc";

		//constructores SOURCE generate constructor using fields
		public Frutae(String color, String sabor) {
			super();//permite jalar o referenciar un metodo en la clase padre "objeto"
			this.color = color;
			this.sabor = sabor;
		}

		//get y set sourcer getters and setters

		// EL STATIC HACE GLOBAL CUALQUIER METODO
		public static void soyunmetodoglobal(){}
		
		public void soyunmetodoOBJETO(){}
		
		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getSabor() {
			return sabor;
		}

		public void setSabor(String sabor) {
			this.sabor = sabor;
		}
		
		// escribe to PLUS ctrl+space
		@Override  //anotacion que permite sobreescritura
		public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"-"+this.getColor()+"-"+this.getSabor();
		
		}
}
