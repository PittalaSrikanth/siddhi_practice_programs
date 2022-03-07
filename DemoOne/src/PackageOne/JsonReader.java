package PackageOne;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class JsonReader
{

		public static void main(String[] args) throws IOException, ParseException
		{
			JSONParser json=new JSONParser();

			FileReader file=new FileReader(".\\jsonfiles\\employee.json");

			Object obj=json.parse(file);

			JSONObject empjsonobj=(JSONObject)obj;

			String fname=(String) empjsonobj.get("firstName");

			String name=(String) empjsonobj.get("lastName");

			System.out.println("First name: "+fname);

			System.out.println("Last name: "+name);

			JSONArray array=(JSONArray)empjsonobj.get("address");

			for(int i=0;i<array.size(); i++)

			{
				JSONObject address=(JSONObject) array.get(i);
//				String street(String) address.get("street");
			}
		

	}

}