interface Animal{
    fun parler()
    fun quiSuisJe()

}


class Chien : Animal{

    override fun parler(){
        println("Wouaf Wouaf")
    }

    override fun quiSuisJe(){
        println("Je suis un Chien")
    }
}

class Chat : Animal{

    override fun parler(){
        println("Miaaaoouuuu")
    }

    override fun quiSuisJe(){
        println("Je suis un Chat")
    }
}

class Perroquet : Animal{

    override fun parler(){
        println("Kawkaw")
    }

    override fun quiSuisJe(){
        println("Je suis un Perroquet")
    }
}


class Animalerie {

   var AnimalList = mutableListOf<String>()
   var ScreamList = mutableListOf<String>()

    fun add (x: String , y: String){
        AnimalList.add(x)
        ScreamList.add(y)
    }

    fun ShowAnimal (){
       AnimalList.forEach {print(it)}
    }
    fun ShowScream (){
        ScreamList.forEach {print(it)}
    }
}