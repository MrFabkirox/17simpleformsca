package controllers

import play.api._
import play.api.mvc._
import scala.util.Random
import play.api.data.Form
import models.User

object Application extends Controller {

  val rand = new Random()
  var num1 : Int = 0
  
  def index = Action {
    
    var numSup : String = ""
    num1 = rand.nextInt(9)
    //num2 = rand.toString()
    
    if (num1 > 4) numSup= "number > 4 "
    else numSup = "num < 4 !!"
    println("someprintln");
    Ok(views.html.index(numSup, num1))
  }
  
  
  def form = Action {
    println("println");
    Ok(views.html.view2("17simpleformsca"))
  }
  
  def p3 = Action {
    
    var name1 : String = "Some use of the _ in the console"
      
    List(1, 2, 3) foreach println _
    List(1, 2, 3) map (_ +2) foreach println _
    List("a", "b") foreach { _ => println("print")}
    List(5,6) foreach(a => println(a))
    
    List("foo", "bar", "baz").map(n => n.toUpperCase()) foreach (a => println(a))
    List("foo", "bar").map(_.toUpperCase()) foreach (a => println(a))
      
    Ok(views.html.view3(name1))
  }

}