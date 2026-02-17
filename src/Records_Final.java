record Records_Final(int a, int b) {
}

class Use_Record {

    public static void main(String[] args) {

        Records_Final recordsFinal = new Records_Final(4, 5);
        System.out.println(recordsFinal.a());
        System.out.println(recordsFinal.b());

        System.out.println(recordsFinal);
        System.out.println(recordsFinal.hashCode());

         Records_Final recordsFinal2 = new Records_Final(4, 5);
         System.out.println(recordsFinal.equals(recordsFinal2));
    }
}