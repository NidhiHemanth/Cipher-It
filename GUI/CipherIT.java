public class CipherIT {

        static int Algorithm = -7;
        static int Cryption = -7;
        static int Input = -7;
        static String key;
        static String filepath;
        static void getAlgorithm(int a)
        {
            Algorithm = a;
        }
        static void getCryption(int a)
        {
            Cryption = a;
        }
        static void getInput(int a)
        {
            Input = a;
        }
        static void getKey(String a)
        {
            key = a;
        }
        static void getFile(String a)
        {
            filepath = a;
           
        }
        static void infoDisplay()
        {
            System.out.println("Algorithm:"+Algorithm);
            System.out.println("Cryption:"+Cryption);
            System.out.println("Input:"+Input);
            System.out.println("Key:"+key);
            System.out.println("FilePAth/String:"+filepath);
        }
    
    
}
