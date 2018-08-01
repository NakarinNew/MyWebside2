
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
object products_form extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<html>
    <head>
<title>PRODUCT FORM</title>
        <link type="text/css" rel="stylesheet"
        href="/assets/stylesheets/bootstrap/css/bootstrap.css">
    </head>
   <center><body>
        <h2 class="bg-warning text-dark">PRODUCT ID.</h2>
        <form action="/product_post" method="post">
            <table class="table-primary">
                <tr>
                    <th>ID :</th>
                    <td><input type="text" name="id" size="30" maxlength="30" required></td>
                </tr>
                <tr>
                    <th>Game Name :</th>
                    <td><input type="text" name="name" size="30" maxlength="20" required></td>
                </tr>
                <tr>
                    <th>Price :</th>
                    <td><input type="text" name="price" size="30" maxlength="20" required></td>
                </tr>
                <tr>
                    <th>Amount :</th>
                    <td><input type="radio" name="amount" value="1">1
                        <input type="radio" name="amount" value="2">2
                        <input type="radio" name="amount" value="3">3
                        <input type="radio" name="amount" value="4">4
                        <input type="radio" name="amount" value="5">5
                        <input type="radio" name="amount" value="6">6
                        <input type="radio" name="amount" value="7">7
                        <input type="radio" name="amount" value="8">8
                        <input type="radio" name="amount" value="9">9
                        <input type="radio" name="amount" value="10">10
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <br><center><input type="submit" value="OK" class="btn btn-success">
                        <input type="reset" value="Cancel" class="btn btn-danger"></center>
                    </td>
                </tr>
            </table>
        </form>
    </body></center>
</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jul 31 15:43:31 ICT 2018
                    SOURCE: D:/MyWebside2/app/views/products_form.scala.html
                    HASH: 96164cb79c7e85d1be69f616eca5efeafce7c294
                    MATRIX: 863->0
                    LINES: 29->1
                    -- GENERATED --
                */
            