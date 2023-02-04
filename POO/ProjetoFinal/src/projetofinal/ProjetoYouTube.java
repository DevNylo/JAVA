package projetofinal;

public class ProjetoYouTube {

	public static void main(String[] args) {
		
		Video v[] = new Video[3];

		v[0] = new Video("Aula 1 de POO", 0, 0, 0, false);
		v[1] = new Video("Aula 12 de PHP", 0, 0, 0, false);
		v[2] = new Video("Aula 3 de Java", 0, 0, 0, false);
		
		System.out.println(v[0].toString());
		
		Gafanhoto gafa[] = new Gafanhoto[2];
		
		gafa[0] = new Gafanhoto("Danilo", 24,"M", "Dan");
		gafa[1] = new Gafanhoto("Julia", 18, "F","Juja");
		
		System.out.println(gafa[0].toString());
		
		Visualizacao visu = new Visualizacao(gafa[0], v[2]);
		
		System.out.println(visu.toString());
		
	}

}
