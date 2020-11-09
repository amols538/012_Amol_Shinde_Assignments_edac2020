class Question3{
    public static void main(String args[]){
        String str ="###aabc";
        str = str.replaceAll("(.)\\1+","$1");
        System.out.println(str);
    }
}
/*
#abc
*/