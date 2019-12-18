
fun main(args: Array<String>){

    print("Choisi un chiffre: ")
    var value = readLine()!!

    var guess = ""

     while(guess != value){

         print("Player: ")
         var guess = readLine()!!

        if(guess > value){
            println("c'est moins")
        }
         if(guess < value){
            println("c'est plus")

        }
           else if(guess == value){
             println("trouvé!")
             break
         }
    }

}

