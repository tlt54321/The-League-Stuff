package Oncogene;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.Test;

public class OncogeneTest {
	@Test
	public void testOncogeneDetector() {
		OncogeneDetector oncogeneDetector = new OncogeneDetector();

		ArrayList<String> healthySequences = new ArrayList<String>();
		for (char c : "TGCATCC AAATTTGGGCCC ATGCGCTA GGGTACGGAG TTAATTGGG"
				.toCharArray())
			healthySequences.add("" + c);

		ArrayList<String> cancerSequences = new ArrayList<String>();
		for (char c : "ATTTGCAGG TGCAAATTA AAAGGGCCCTTT TGCGATACGTAGGACCA ACTCATTAGTGC AAACGCTAGACACACAAG"
				.toCharArray())
			cancerSequences.add("" + c);

		assertTrue(oncogeneDetector.isOncogene(healthySequences,
				cancerSequences, "TGC"));
		assertFalse(oncogeneDetector.isOncogene(healthySequences,
				cancerSequences, "GGG"));
	}

}

class OncogeneDetector {
	OncogeneDetector() {

	}
	public boolean isOncogene(ArrayList<String> healthySequences,
			ArrayList<String> cancerSequences, String candidate) {
		String healthStr = "";
		String cancerStr = "";
		int healthCounter = 0;
		int cancerCounter = 0;
		for (String s : healthySequences) {
			healthStr += s;
		}
		for (String r : cancerSequences) {
			cancerStr += r;
		}
		for (int i = 0; i < healthStr.length(); i++) {
			if (healthStr.charAt(i) == candidate.charAt(0)) {
				if (healthStr.charAt(i + 1) == candidate.charAt(1)) {
					if (healthStr.charAt(i + 2) == candidate.charAt(2)) {
						healthCounter++;
					}
				}
			}
		}
		for (int i = 0; i < cancerStr.length(); i++) {
			if (cancerStr.charAt(i) == candidate.charAt(0)) {
				if (cancerStr.charAt(i + 1) == candidate.charAt(1)) {
					if (cancerStr.charAt(i + 2) == candidate.charAt(2)) {
						cancerCounter++;
					}
				}
			}
		}
		if (healthCounter < cancerCounter) {
			return true;
		} else
			return false;
	}
}
