class LengthofLastWord{
    public int lengthOfLastWord(String args[]) {
        Scanner s=new Scanner(System.in);
        String s1=new String("Hello World");
         s1=s.split(" ");
        int d=s1.length;
        String h=s1[d-1];
        return h.length();
    }
}