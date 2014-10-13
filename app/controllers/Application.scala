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

}