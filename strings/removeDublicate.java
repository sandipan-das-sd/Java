//google microsoft
public static void removeDuplicates(String str,int idx,StringBuilder sb newStr,boolean map[]){
  if(idx==str.length())
  {
    System.out.println(newStr);
    return;
  }


  char currChar=str.charAt(idx);;
  if(map[currChar-'a'])
}