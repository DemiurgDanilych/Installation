import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		
		StringBuilder log = new StringBuilder();
		
		
		File src = new File("C:\\Games\\src");
		if (src.mkdir()) log.append("Каталог src - создан.").append("\n");
		
		File res = new File("C:\\Games\\res");
		if (res.mkdir()) log.append("Каталог res - создан.").append("\n");
		
		File savegames = new File("C:\\Games\\savegames");
		if (savegames.mkdir()) log.append("Каталог savegames - создан.").append("\n");
		
		File temp = new File("C:\\Games\\temp");
		if (temp.mkdir()) log.append("Каталог temp - создан.").append("\n");
		
		
		
		File main = new File(src,"main");
		if (main.mkdir()) log.append("Файл src\\main - создан.").append("\n");
		
		File test = new File(src,"test");
		if (test.mkdir()) log.append("Файл src\\test - создан.").append("\n");
		
		
		
		File mainJava = new File(main,"Main.java");
		try{
			if (mainJava.createNewFile())
				log.append("Файл main\\Main.Java - создан.").append("\n");
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		File utilsJava = new File(main,"Utils.java");
		try {
			if (utilsJava.createNewFile())
				log.append("Файл main\\Utils.java - создан.").append("\n");
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		
		
		File drawabels = new File(res,"drawabels");
		if (drawabels.mkdir()) log.append("Каталог res\\drawabels - создан.").append("\n");
		
		File vectors = new File(res,"vectors");
		if (vectors.mkdir()) log.append("Каталог res\\vectors - создан.").append("\n");
		
		File icons = new File(res,"icons");
		if (icons.mkdir()) log.append("Каталог res\\icons - создан.").append("\n");
		
		
		File tempTXT = new File(temp, "temp.txt");
		try {
			if (tempTXT.createNewFile())
				log.append("Файл temp\\temp.txt - создан.").append("\n");
		}catch (IOException ex){
			System.out.println(ex.getMessage());
		}
		
		
		try (FileWriter writer = new FileWriter(tempTXT, false)){
			writer.write(log.toString());
		}catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
