fun main() {
  val arrayOfOption: MutableList<MutableList<Int>> = ArrayList()
  var courses: Array<Int> = arrayOf(0,0,0)
  var money: Array<Int> = arrayOf(0,0,0)
  for(i in 0..2){
    println("Введите курс валюты под номером ${i+1}")
    courses[i] = readLine()!!.toInt()
    println("Введите количество валюты под номером ${i+1}")
    money[i] = readLine()!!.toInt()
  }
  var min: Int = courses[0]
  var indexOfMin: Int = 0
  for(i in 1..2){
    if(courses[i] < min){
      min = courses[i]
      indexOfMin = i
    }
  }
  var sumOfMoney:Int = money[indexOfMin]
  for(i in 0..2){
    if(i != indexOfMin){
      sumOfMoney= sumOfMoney + (courses[i] * money[i])
    }
  }
  var tempArr =ArrayList<Int>() 
    for(i in 0..2){
      if(indexOfMin == i){
        tempArr.add(i, sumOfMoney/courses[indexOfMin])
      }else{
        tempArr.add(i,0)
      }
  }
    var countOfOperation : Int = 0 
  arrayOfOption.add(0,tempArr)
  println("${arrayOfOption[0][0]} ${arrayOfOption[0][1]} ${arrayOfOption[0][2]}")
  println("(arrayOfOption[0][indexOfMin]/courses[(indexOfMin+2)%3]).toInt()")
   println("${arrayOfOption[0][indexOfMin]} ${courses[(indexOfMin+2)%3]} ${(arrayOfOption[0][indexOfMin]/courses[(indexOfMin+2)%3]).toInt()}\n\n")
  for(j in 0..(arrayOfOption[0][indexOfMin]/courses[(indexOfMin+2)%3]).toInt()){
  for(i in 0 ..((arrayOfOption[0][indexOfMin] - j*courses[(indexOfMin+2)%3]  )/courses[(indexOfMin+1)%3]).toInt()){
    countOfOperation++;
    print("${arrayOfOption[0][indexOfMin] - (i*courses[(indexOfMin+1)%3] + j*courses[(indexOfMin+2)%3])}\t$i\t$j\n")
  }
  }
  println("Итого ${countOfOperation}")
  
}