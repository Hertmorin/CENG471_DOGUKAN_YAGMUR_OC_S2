import java.math.BigInteger;
import java.util.List;

public class Node extends RSA {
	
	//private static final String IV = "AAACCCDDDYYUURRS";

	public BigInteger privateKey;
	public BigInteger publicKey;
	public BigInteger commonSecret;
	
	
	public BigInteger getPrivateKey() {
		return privateKey;
	}
	public void setPrivateKey(BigInteger privateKey) {
		this.privateKey = privateKey;
	}
	public BigInteger getPublicKey() {
		return publicKey;
	}
	public void setPublicKey(BigInteger publicKey) {
		this.publicKey = publicKey;
	}
	public BigInteger getCommonSecret() {
		return commonSecret;
	}
	public void setCommonSecret(BigInteger commonSecret) {
		this.commonSecret = commonSecret;
	}
	
	/*
	 * public String encrypt(String text) throws Exception { return
	 * super.encrypt(commonSecret.toString(), IV, text); }
	 * 
	 * public String decrypt(String text) throws Exception { return
	 * super.decrypt(commonSecret.toString(), IV, text); }
	 */
	
	Node(int N) {
		super(N);
	}
	
	public String toString() {
		return super.toString();
	}
	
	public List<BigInteger> encrypt(String message) {
		return super.encrypt(message);
	}
	
	public String decrypt(List<BigInteger> message) {
		return super.decrypt(message);
	}

}