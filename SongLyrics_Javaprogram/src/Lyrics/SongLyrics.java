package Lyrics;

public class SongLyrics {

	public static void main(String[] args) throws InterruptedException {
		
		String lyrics = "ore nil doriya\n "
				+ "amay de re de chariya \n "
				+ "ore neel doriya \n "
				+ "amay de re de chariya \n"
				+ " bondi hoiya monoa pakhi hayre \n "
				+ "kande roiya roiya \n"
				+ " bondi hoiya monoa pakhi hayre \n "
				+ "kande roiya roiya \n\n "
				+ "kacher manush dure thuiya \n "
				+ "mori ami dhor poraiya re \n "
				+ "kacher manush dure thuiya \n "
				+ "mori ami dhor poraiya re \n "
				+ "darun jala diba nishi \n "
				+ "darun jala diba nishi \n "
				+ "ontore ontore \n\n "
				+ "amar ato shadher mon bodhua hayre \n "
				+ "ki jani ki kore \n "
				+ "amar ato shadher mon bodhua hayre \n "
				+ "ki jani ki kore \n\n "
				+ "ore shampaner naiya \n\n "
				+ "amay de re de bhiraiya \n "
				+ "ore shampaner naiya \n "
				+ "amay de re de bhiraiya \n "
				+ "bondi hoiya monoa pakhi hayre\n\n"
				+ "kande roiya roiya \n "
				+ "bondi hoiya monoa pakhi hayre \n "
				+ "kande roiya roiya.....";
		
		
		char[] c = lyrics.toCharArray();
		for(char value : c) {
			Thread.sleep(200);
			System.out.print(value);
		}
		
		
	

	}

}
