class RightShift
{
	public static void main(String[] args)
	{
		char hex[] = { '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		byte b = (byte) 0x0f;

		System.out.println("b = 0x" + hex[b >> 4] + hex[b]);
	}
}
