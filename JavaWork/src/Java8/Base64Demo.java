package Java8;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Base64.Encoder;

public class Base64Demo {

	public static void main(String[] args) {
		Encoder encode =Base64.getEncoder();
		String normalString ="usrename:password";
		String encodedString = encode.encodeToString(normalString.getBytes(StandardCharsets.UTF_8));
		System.out.println(encodedString);
		System.out.println("*************************");
		
		Base64.Decoder decode = Base64.getDecoder();
		byte[] decodedByteArray = decode.decode(encodedString);
		//verify the decoded string
		System.out.println(new String(decodedByteArray));

	}

}
