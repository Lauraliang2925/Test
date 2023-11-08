package com.hitrust.security.e2ee;

public class E2EEJNI {
//	static {
//		System.loadLibrary("JniE2ee");
//	}

	public native String setPassWord(String arg0, String arg1);

	public native Integer verifyPassWord(String arg0, String arg1, String arg2);

	public static void main(String[] args) {
		String AES_Encrypt_PWD_HEX = "5ABE56A943A4C26983718B12AFDED28BF782FC1697BCD9532740D69ED68B6536901968EFBF14431F315240899AA4C198B45FCA0DB3E6DF15AA415088881EBE3CB798B9903B6C70C0D3FA23D708E9448FBB29A02EEBD7FF7C006D863373E8729BD8806ACCCC33682921185C063A55491C280A8184CD9BBDF7591CBF05DE0A4FEB27D15EA67FF4A8AB2DB19DD0C384CDB65CE8335B24BDFF6FC4AACB5557FF529CEADF207A7A26BA923A895818597040E5FB5BF505DF8E39EBF997FF93B1AC2C5E9682809D933DED974F66FF2E5006E20DD623DCDF475EBC3A584DD3DE0DDC97420B9F55427E7D75658BEF0DA8ADE739B20E955D05C5E32B2D33714A3E7835094809F88945AE3C18C41E96D85379E35E287F4762FF6E30E41B80E575BBC3EE3312CFDB2937ABF647B3A3E4F947DAA205C0E46677E772CD2AB44075F4464505A1DF24112AC3BE2BA498F5199A5999A2862D3F8593C9DE2EB552E0A330339C709344A0E7E4AAB161099F23C2979D9A351BF82BAA04EB5C2E695F3027E701D640208886B368ED0BB75EF863F66E575C7E20786AE15A2F3C89348B63129CD519DD6AA61674F190044DD9D1387CE07624F605F5030D089BBC3E3D9E5AEBF080FF43594C277009A11469B08793B0E41A7EF6A010DA09DD34EED750F1737F47DE7BE705C43443B69ABFE8507D475EA7BCF3B23F9F";
		String RSA_Encrypt_AES_HEX = "171ad79ebeb98f290285716580140168dff090facddfbc595f2cb6a6bf6168dcea083e629accb617a87d4b6c3d124e1fc749f11a1346c98bb5a9a3bc3b0d2ccbcfc99e10ba8ec0ab7a812ef281ad27c31d3f53df1fa470189b0e7ab9b60afcdda1545b62b0dced4b9b0d7147da8ed96fee05ec5424324f938a60021e7397545b213da1b220af9a093e891d4aa9877f9b8997e14ace29805ee9ff410b5b105e686ed394b428d322f59816965e87b84fff2fc24cb6b08f4f9b2dc8ed1e31d1ff150da06a419dd1d8f028f39a3d00a1dee7842864ca2488f121feee3710e07eda8d1e2f10047eabb6eba1ade2aa1bda35e1e5fb948278c184fdbf70f46d763d9e0a";

		for (int i = 0; i < 100; ++i) {
			String dbHex = (new E2EEJNI()).setPassWord(AES_Encrypt_PWD_HEX, RSA_Encrypt_AES_HEX);
			System.out.println(i + ":" + dbHex);
			System.out.println((new E2EEJNI()).verifyPassWord(AES_Encrypt_PWD_HEX, RSA_Encrypt_AES_HEX, dbHex));
		}

	}
}