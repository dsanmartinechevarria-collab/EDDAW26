package pruebaPOO;

public class TestAlumnoCurso {
		
		public static void main(String[] args) {	
		
		Curso C1 = new Curso(348, "DAW3" , true);
		Alumno Al1 = new Alumno(123, "12345678K", "Ane", "Rodriguez", true, C1);
		
		Alumno Al2 = new Alumno(123, "83527638Ñ", "Anne", "Perez", true, new Curso(556, "ASI3", false));
			
		Curso C4 = Al2.getCursoMatriculado();
		
		System.out.println(C4);
		
		Al2 = null;
		
		System.out.println(Al1);	
		//Curso C1 = new Curso();
		//Curso C2 = new Curso(123);
		//Curso C3 = new Curso(348, "DAW3" , true);
		//Curso C4 = C3;//Aqui dara que son iguales
		
		
		//Curso C4 = new Curso(348, "DAW3" , true);
		//Esto dara que son distintos
		
		//System.out.println("C3 vale "+C3);
		//System.out.println("C4 vale "+C4);
		
		//if (C3.equals(C4)) System.out.println("C3 y C4 son iguales");
			//else System.out.println("C3 y C4 son distintos");
		
		
		//System.out.println(C3);
		//System.out.println(C1);
		//System.out.println(C2);
			
	}
	
}
