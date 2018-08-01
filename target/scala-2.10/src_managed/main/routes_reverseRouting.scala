// @SOURCE:D:/MyWebside2/conf/routes
// @HASH:66b30761c5b1e92ce9a211f9addd6118ebb010ba
// @DATE:Tue Jul 31 15:43:30 ICT 2018

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def promotion(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "pro")
}
                                                

// @LINE:12
def product_post(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "product_post")
}
                                                

// @LINE:9
def show(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "show")
}
                                                

// @LINE:11
def products_form(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "products_form")
}
                                                

// @LINE:7
def article(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "art")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def promotion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.promotion",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pro"})
      }
   """
)
                        

// @LINE:12
def product_post : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.product_post",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "product_post"})
      }
   """
)
                        

// @LINE:9
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.show",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "show"})
      }
   """
)
                        

// @LINE:11
def products_form : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.products_form",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products_form"})
      }
   """
)
                        

// @LINE:7
def article : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.article",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "art"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def promotion(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.promotion(), HandlerDef(this, "controllers.Application", "promotion", Seq(), "GET", """""", _prefix + """pro""")
)
                      

// @LINE:12
def product_post(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.product_post(), HandlerDef(this, "controllers.Application", "product_post", Seq(), "POST", """""", _prefix + """product_post""")
)
                      

// @LINE:9
def show(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.show(), HandlerDef(this, "controllers.Application", "show", Seq(), "GET", """""", _prefix + """show""")
)
                      

// @LINE:11
def products_form(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.products_form(), HandlerDef(this, "controllers.Application", "products_form", Seq(), "GET", """""", _prefix + """products_form""")
)
                      

// @LINE:7
def article(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.article(), HandlerDef(this, "controllers.Application", "article", Seq(), "GET", """""", _prefix + """art""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    