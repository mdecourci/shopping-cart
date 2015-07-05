package com.company.shopping

/**
 * Created by michaeldecourci on 05/07/15.
 */
class Checkout {
  private var _items : List[Item] =  Nil

  def total() : String = {
    var s : String = ""
    var _total = 0.0d
    for (i <- _items) {
      if (!s.isEmpty)  s = s + ", "
      s = s + i.name
      _total = _total + i.price
    }
    s = "[%s] => £%#.2f".format(s, _total)
    return s;
  }

  def items : List[Item] = _items.reverse

  def scan(scannedList: List[String]) = {
    for (s<-scannedList) s match {
      case "Apple" => _items = new Item("Apple", 0.60)  :: _items
    }
  }

}

case class Item(name: String, price: Double)
