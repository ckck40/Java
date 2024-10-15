public class Example1  {
     public static void main  (String[]  args) {
        char ch1 = 'A';
        char ch2  ='B';
         System.out.println(ch1);
         System.out.println(ch2);
         System.out.println( ch1 + ch2); // 산술연산자 + 때문에  숫자로 변환하여 덧셈을 수행함
         System.out.println(""  +ch1 + ch2); //빈 문자열이 포함되면서 숫자가 아닌 문자로 더함
         System.out.println(+ch1); // 유니코드 65 출력, +기호는 숫자로 변환하라는 뜻
         System.out.println( ch1 + ch2);// 131
         //문자가 여러개 모인 것은 문자열이라고 함
         String str = "최창영";
         System.out.println(str);

         // Boolean 타입예제
         Boolean bool = true; // true는 참의 뜻, false는 거짓의 뜻
         System.out.println(bool);

     }

}






