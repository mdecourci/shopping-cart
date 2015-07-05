package com.company.shopping

/**
 * Created by michaeldecourci on 05/07/15.
 */
class Checkout {
  private var _items : List[Item] =  Nil

  private val priceOfApple: Double = 0.60

  private val priceOfOrange: Double = 0.25

  def total() : String = {
    var s : String = ""
    var _total = 0.0d
    var numberOfApples = 0
    var numberOfOranges = 0

    for (i <- items) {
      if (!s.isEmpty)  s = s + ", "
      s = s + i.name
      if ("Apple" == i.name) {
         numberOfApples = numberOfApples + 1;
      }

      if ("Orange" == i.name) {
        numberOfOranges = numberOfOranges + 1;
      }

    }
    var priceOfApples = (numberOfApples/2)*priceOfApple + (numberOfApples%2)*priceOfApple
    var priceOfOranges = (numberOfOranges/3)*2*priceOfOrange + (numberOfOranges%3)*priceOfOrange

    _total = priceOfApples + priceOfOranges

    s = "[%s] => £%#.2f".format(s, _total)
    return s;
  }

  def items : List[Item] = _items.reverse

  def scan(scannedList: List[String]) = {
    for (s<-scannedList) s match {
      case "Apple" => _items = new Item("Apple", priceOfApple)  :: _items
      case "Orange" => _items = new Item("Orange", priceOfOrange)  :: _items
    }
  }

}

case class Item(name: String, price: Double)
