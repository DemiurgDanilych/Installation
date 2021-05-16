import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	private static StringBuilder log = new StringBuilder();

	public static void main(String[] args) {

		createOfMainCatalogs();
		creatingSubdirectories();
		fileCreation();
		writeToTheTemp();
	}

	private static void createOfMainCatalogs(){
		createDir("\\Games\\","src");
		createDir("\\Games\\","res");
		createDir("\\Games\\","savegames");
		createDir("\\Games\\","temp");
	}

	private static void creatingSubdirectories(){
		createDir("\\Games\\src\\","main");
		createDir("\\Games\\src\\","test");

		createDir("\\Games\\res\\","drawabels");
		createDir("\\Games\\res\\","vectors");
		createDir("\\Games\\res\\","icons");
	}

	private static void fileCreation(){
		createFile("\\Games\\src\\main\\","Main.java");
		createFile("\\Games\\src\\main\\","Utils.java");
		createFile("\\Games\\temp\\","temp.txt");
	}



	private static void createDir(String path,String name){
		File dir = new File(path + name);
		if (dir.mkdir())
			log.append("Каталог " + path + name + " - создан.").append("\n");
	}


	private static void  createFile(String path, String name){
		File file = new File(path, name);
		try {
			if (file.createNewFile())
				log.append("Файл " + path + name + " - создан.").append("\n");
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

	private static void writeToTheTemp (){
		try (FileWriter writer = new FileWriter("\\Games\\temp\\temp.txt", false)){
			writer.write(log.toString());
		}catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}