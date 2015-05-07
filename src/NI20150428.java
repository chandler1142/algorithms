
/**
 * 
 *   	ni 字符串问题
 *   
 *    假定在传输过程中为了让字符串压缩空间。我们记 aa = 2a , 2(ab) = abab
 *    对于更长的字符串我们记 2a(1a2b3(ab)) = aaabbababab
 *    编写算法来实现解压过程。整个字符串中值会出现1~9,a~z,(,)
 *    数字的大小不会超过1000，字符串的长度不会超过256，注意括号匹配。
 *    
 */
public class NI20150428 {

	
	public static void decompress(String str) {
		
		if(str.length() == 0) return;
		int count = 0;
		
		for(int i=0;i<str.length();i++) {
			
			char ch = str.charAt(i);
		
			if(ch >= '1' && ch<= '9') {
				count = 10*count + ch - '0';
				continue;
			}  else if(ch >='a' && ch <= 'z') {
				if(count == 0) count = 1;
				while(count > 0){
					System.out.print(ch);
					count --;
				}
			}  else if(ch == '(') {
				if(count == 0) count = 1;
				while(count > 0) {
					decompress(str.substring(i+1));
					count --;
				}
				while(i<str.length()) {
					char temp = str.charAt(i);
					if(temp == ')') break;
					i++;
				}
			} 
		}
	}
	
	
	
	public static void main(String[] args) {
		decompress("a3d2(ab2(ce1(po)))");
	}

}
