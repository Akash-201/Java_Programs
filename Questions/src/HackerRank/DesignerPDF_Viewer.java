package HackerRank;

import java.util.Arrays;
import java.util.List;

public class DesignerPDF_Viewer 
{
	public static int designerPdfViewer(List<Integer> h, String word) 
	{
		int maxHeight = 0;

		for (int i = 0; i < word.length(); i++) 
		{
			char ch = word.charAt(i);

			int index = ch - 'a';
			int height = h.get(index);
			if (height > maxHeight)
			{
				maxHeight = height;
			}
		}
		return maxHeight * word.length();
	}
	public static void main(String[] args)
	{
		List<Integer> h=Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
		List<Integer> h2=Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7);
		
		String word="abc";
		String word2="zaba";
		System.out.println(designerPdfViewer(h, word));   // 9
		System.out.println(designerPdfViewer(h2, word2)); // 28
		
	}

}
