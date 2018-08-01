// @SOURCE:D:/MyWebside2/conf/routes
// @HASH:66b30761c5b1e92ce9a211f9addd6118ebb010ba
// @DATE:Tue Jul 31 15:43:30 ICT 2018


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_article1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("art"))))
        

// @LINE:8
private[this] lazy val controllers_Application_promotion2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("pro"))))
        

// @LINE:9
private[this] lazy val controllers_Application_show3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("show"))))
        

// @LINE:11
private[this] lazy val controllers_Application_products_form4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products_form"))))
        

// @LINE:12
private[this] lazy val controllers_Application_product_post5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product_post"))))
        

// @LINE:15
private[this] lazy val controllers_Assets_at6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """art""","""controllers.Application.article()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """pro""","""controllers.Application.promotion()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """show""","""controllers.Application.show()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products_form""","""controllers.Application.products_form()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product_post""","""controllers.Application.product_post()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_article1(params) => {
   call { 
        invokeHandler(controllers.Application.article(), HandlerDef(this, "controllers.Application", "article", Nil,"GET", """""", Routes.prefix + """art"""))
   }
}
        

// @LINE:8
case controllers_Application_promotion2(params) => {
   call { 
        invokeHandler(controllers.Application.promotion(), HandlerDef(this, "controllers.Application", "promotion", Nil,"GET", """""", Routes.prefix + """pro"""))
   }
}
        

// @LINE:9
case controllers_Application_show3(params) => {
   call { 
        invokeHandler(controllers.Application.show(), HandlerDef(this, "controllers.Application", "show", Nil,"GET", """""", Routes.prefix + """show"""))
   }
}
        

// @LINE:11
case controllers_Application_products_form4(params) => {
   call { 
        invokeHandler(controllers.Application.products_form(), HandlerDef(this, "controllers.Application", "products_form", Nil,"GET", """""", Routes.prefix + """products_form"""))
   }
}
        

// @LINE:12
case controllers_Application_product_post5(params) => {
   call { 
        invokeHandler(controllers.Application.product_post(), HandlerDef(this, "controllers.Application", "product_post", Nil,"POST", """""", Routes.prefix + """product_post"""))
   }
}
        

// @LINE:15
case controllers_Assets_at6(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     