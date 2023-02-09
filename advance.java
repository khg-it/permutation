public class advance {
    public static void main(String args[])
    {
        String str="abc";
        printper(str,"");
    }
    public static void printper(String str,String perm)
    {
        if(str.length()==0)
        {
            System.out.println(perm);
            return;
        }



        for(int i=0;i<str.length();i++)
        {
            char currchar=str.charAt(i);

            String newstr=str.substring(0,i)+str.substring(i+1);
            printper(newstr, perm+currchar);
        }
    }
}
