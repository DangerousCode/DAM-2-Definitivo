package temaUno;
import java.io.*;
import java.util.StringTokenizer;
public class TokenEjemplo1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Desktop\\clientes.txt"));
		String linea=null;
		while((linea=br.readLine())!=null){
			StringTokenizer st=new StringTokenizer(linea,"#");
			while(st.hasMoreTokens()){
				String codigo=st.nextToken();
				String nombre=st.nextToken();
				String sueldo=st.nextToken();
				System.out.println(codigo+" "+nombre+" "+sueldo);
			}
		}
	}
}
