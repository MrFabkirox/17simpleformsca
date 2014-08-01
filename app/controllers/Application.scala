package controllers

import play.api._
import play.api.mvc._
import scala.util.Random
import play.api.data.Form
import models.User

object Application extends Controller {

  def index = Action {
    val rand = new Random()
    var num1 : Int = 0
    var num2 : String = ""
    var numSup : String = ""
    rand.nextInt(2)
    num2 = rand.toString()
    
    if (num1 > 1) numSup= "number > 1 "
    else numSup = "num pas sup !!"
    
    Ok(views.html.index(numSup + num2))
  }
  
  
  def form = Action {
    println("println");
    Ok(views.html.view2("17simpleformsca"))
  }

}