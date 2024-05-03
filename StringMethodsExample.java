public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "Fauzi Jezo";
        int length = str.length();
        System.out.println("Panjang: " + length);

        String substring = str.substring(0, 5);
        System.out.println("Substring: " + substring);

        char karakter = str.charAt(1);
        System.out.println("Karakter pada indeks 1: " + karakter);

        String lowerCaseStr = str.toLowerCase();
        System.out.println("Huruf kecil: " + lowerCaseStr);

        String upperCaseStr = str.toUpperCase();
        System.out.println("Huruf besar: " + upperCaseStr);

        String namaReplace = str.replace('z', 'm');  
        System.out.println(namaReplace);

        String namaLengkap = "apa yang kamu tahu tentang Fauzi Jezo";  
        System.out.println(namaLengkap.contains("apa yang kamu tahu"));
        System.out.println(namaLengkap.contains("tentang"));
        System.out.println(namaLengkap.contains("halo"));

        boolean status = str.equals("Fauzi Jezo");    
        System.out.println(status);

        boolean statusIgnoreCase = str.equalsIgnoreCase("fauzi jezo");    
        System.out.println(statusIgnoreCase);

        String kalimat = "apa yang kamu tahu tentang Fauzi Jezo";
        System.out.println(kalimat.endsWith("Fauzi Jezo"));
    }
}