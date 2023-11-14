package zsgs;
import java.io.FileReader;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;
public class ChatBot1  {
	Stack<String> pathStack=new Stack<>();
	public static void main(String[] args) throws Exception
	{
		ChatBot1 chatBot=new ChatBot1();
		chatBot.start();
	}
	private void start() throws Exception {
		int choise;
		print();
		System.out.println("===============================");
		pathStack.push("Press");
		display(parse("Press"));
	do{
		Scanner sc= new Scanner(System.in);
		System.out.println();
		System.out.print("Enter your Option :");
		choise=sc.nextInt();
		if (choise==9) 
		{
			pathStack.pop();
			if (pathStack.isEmpty()) 
			{
				break;
			}
		}
		else if (choise== 0) {
			break;
		}
		else 
		{
			pathStack.push(pathStack.peek()+"_"+choise);
		}
		String path = pathStack.peek();
		try {
			System.out.println("===============================");
		display(parse(path));
		backPath();
		}
		catch(Exception e) 
		{
			System.out.println("Invalid Input !!");
		}
	} while (choise!= 0);
	}

	private void display(JSONArray jsonArray) {
		for (int i = 0; i<jsonArray.size(); i++)
		{
			JSONObject jsonObjct = (JSONObject) jsonArray.get(i);
			System.out.println(jsonObjct.get(Integer.toString(i)));
			System.out.println();
		}
	}

	private JSONArray parse(String path) throws Exception {
		JSONParser jobj= new JSONParser();
		JSONObject obj= (JSONObject)jobj.parse(new FileReader(
				"C:\\Users\\USER\\eclipse-workspace\\LEVEL2\\src\\zsgs\\chatbotinfo.json"));
		JSONArray arr=(JSONArray) obj.get(path);
		return arr;
	}

	private static void print() {
		System.out.println("==============================");
		System.out.println("---WELCOME TO MUTHU's Quotes---");
		
	}

	private static void backPath() {
		System.out.println("9===Back");
		System.out.println();
		System.out.println("0===Exit ");
		System.out.println("==============================");
	}

	

}
