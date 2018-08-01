
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
object products_show extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Products,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(products: Products):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.22*/("""
<html>
    <head>
        <title>
            PRODUCT ORDER.
        </title>
    </head>
    <body>
        <h2 class="bg-warning text-dark">PRODUCT ORDER.</h2>
        <table class="table table-dark">
            <tr>
                <th>ID :</th>
                <td>"""),_display_(Seq[Any](/*13.22*/products/*13.30*/.getId)),format.raw/*13.36*/("""</td>
            </tr>
            <tr>
                <th>Game Name :</th>
                <td>"""),_display_(Seq[Any](/*17.22*/products/*17.30*/.getName)),format.raw/*17.38*/("""</td>
            </tr>
            <tr>
                <th>Price :</th>
                <td>"""),_display_(Seq[Any](/*21.22*/products/*21.30*/.getPrice)),format.raw/*21.39*/("""</td>
            </tr>
            <tr>
                <th>Amount :</th>
                <td>"""),_display_(Seq[Any](/*25.22*/products/*25.30*/.getAmount)),format.raw/*25.40*/("""</td>
            </tr>
        </table>
    </body>
</html>"""))}
    }
    
    def render(products:Products): play.api.templates.HtmlFormat.Appendable = apply(products)
    
    def f:((Products) => play.api.templates.HtmlFormat.Appendable) = (products) => apply(products)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jul 31 15:43:31 ICT 2018
                    SOURCE: D:/MyWebside2/app/views/products_show.scala.html
                    HASH: 4b0954252061af29bbf7b225c29ac682b1679c31
                    MATRIX: 784->1|898->21|1206->293|1223->301|1251->307|1386->406|1403->414|1433->422|1564->517|1581->525|1612->534|1744->630|1761->638|1793->648
                    LINES: 26->1|29->1|41->13|41->13|41->13|45->17|45->17|45->17|49->21|49->21|49->21|53->25|53->25|53->25
                    -- GENERATED --
                */
            