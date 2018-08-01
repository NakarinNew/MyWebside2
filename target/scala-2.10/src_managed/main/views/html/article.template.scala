
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object article extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<html>
    <head>
        <title>
            ARTICLE.
        </title>
    </head>
    <body>
        <div class="col-sm-8">
            <h2 style="color:snow;">TITLE HEADING</h2>
            <h4 style="background-color:#ff6347;">nxwx steam keys</h4>
            <div class="fakeimg"><img src="assets/images/backg3.jpg" class="img-thumbnail" alt="Cinque Terre" width="500" height="350"></div>
            <p>Some text..</p>
            <h5 style="color:MediumSeaGreen;">Sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.</h5>
            <br>
        </div>
    </body>
</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jul 31 15:43:31 ICT 2018
                    SOURCE: D:/MyWebside2/app/views/article.scala.html
                    HASH: 8d45b88d72034e6ee0268d5e507354deb2bc9038
                    MATRIX: 857->0
                    LINES: 29->1
                    -- GENERATED --
                */
            