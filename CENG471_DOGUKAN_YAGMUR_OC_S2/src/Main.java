import java.math.BigInteger;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {

		int bitLength = 1024;
		Node Alice = new Node(bitLength);
		Node Bob = new Node(bitLength);
		System.out.println();
		System.out.println("Alice's\n" + Alice);
		System.out.println();
		System.out.println("Bob's\n" + Bob);
		String bobsText = "Alice, I love you <3";		//Hardcoded text is easy to operate on.
		String alicesText = "I love you too Bob <3";	//It supports long texts
		
		long startTime = System.currentTimeMillis();
		List<BigInteger> bobsCipherTextList = Alice.encrypt(bobsText);
		String bobsCipherText = "";
		for (int i = 0; i < bobsCipherTextList.size(); i++) {
			bobsCipherText += new String(bobsCipherTextList.get(i).toByteArray());
		}
		List<BigInteger> alicesCipherTextList = Bob.encrypt(alicesText);
		String alicesCipherText = "";
		for (int i = 0; i < alicesCipherTextList.size(); i++) {
			alicesCipherText += new String(alicesCipherTextList.get(i).toByteArray());
		}
		System.out.println("\n---------------------------------------------------------------------------\n\nBob sends a message:");
		System.out.println("\t" + bobsText + "\nis encrypted to \n\t" + bobsCipherText + "\nby Alice's public key.");
		System.out.println("\n---------------------------------------------------------------------------\n\nAlice reads the message:");
		System.out.println("\t" + bobsCipherText + "\nis decrypted to \n\t" + Alice.decrypt(bobsCipherTextList) + "\nby Alice's private key.");
		System.out.println("\n---------------------------------------------------------------------------\n\nAlice sends a message:");
		System.out.println("\t" + alicesText + "\nis encrypted to \n\t" + alicesCipherText + "\nby Bob's public key.");
		System.out.println("\n---------------------------------------------------------------------------\n\nBob reads the message:");
		System.out.println("\t" + alicesCipherText + "\nis decrypted to \n\t" + Bob.decrypt(alicesCipherTextList) + "\nby Bob's private key.");
		System.out.println("\n---------------------------------------------------------------------------\n");
		long endTime = System.currentTimeMillis();
		System.out.println("\nTook " + (endTime - startTime) + " milliseconds");

	}

}
