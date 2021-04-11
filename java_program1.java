class car {
          int wheel;
         String colour;
         float price;

         void start(){
         System.out.println("Car Started....");
        }
       void appliedGear() {
        System.out.println("Applied Gear....");
        }
        void moving () {
         System.out.println("Car is moving....");
           }
}   
class app{
            public static void main (String args[]){
           car bmw =new car();
            bmw.start();
             bmw.moving();
}
}

