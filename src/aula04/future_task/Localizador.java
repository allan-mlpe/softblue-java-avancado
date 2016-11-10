package aula04.future_task;

import java.io.File;
import java.util.concurrent.Callable;

/**
 * Representa um localizador de arquivos que busca um arquivo específico a partir de um diretório inicial 
 * @author Allan
 *
 */
public class Localizador implements Callable<File> {
	/**
	 * Diretório inicial a partir do qual a busca será realizada
	 */
	private String startDir;
	
	/**
	 * Nome do arquivo que será buscado
	 */
	private String fileName;
	
	public Localizador(String startDir, String fileName) {
		this.startDir = startDir;
		this.fileName = fileName;
	}
	
	@Override
	public File call() throws Exception {
		return search(new File(startDir));
	}
	
	/**
	 * Realiza uma busca recursiva a partir do diretório inicial passado como parâmetro
	 * @param dir diretório inicial da busca
	 * @return arquivo encontrado ou null caso não exista arquivo com o nome {@link Localizador#fileName}
	 */
	private File search(File dir) {
		//lista os arquivos de um diretório
		File[] files = dir.listFiles();
		File result = null;
		
		if(files == null) {
			return result;
		}
		
		for(File f : files) {
			
			if(f.isDirectory()) {
				result = search(f);
				if(result != null) {
					break;
				}
			} else {
				if(f.getName().equalsIgnoreCase(fileName)) {
					result = f;
				}
			}
		}
		return result;
	}
	
	public String getStartDir() {
		return startDir;
	}
	
	public void setStartDir(String startDir) {
		this.startDir = startDir;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
