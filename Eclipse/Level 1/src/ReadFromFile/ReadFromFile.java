package ReadFromFile;

import java.io.FileReader;

public class ReadFromFile
{
	public static void main(String[] args)
	{
		ReadFromFile a = new ReadFromFile();
	}

	public ReadFromFile()
	{
		try
		{
			FileReader fr = new FileReader("text.txt");

			int temp = 0;

			while (temp != -1)
			{
				temp = fr.read();
				char charTemp = (char) temp;
				if (temp == -1)
					return;

				System.out.print(charTemp);
			}

		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}
}