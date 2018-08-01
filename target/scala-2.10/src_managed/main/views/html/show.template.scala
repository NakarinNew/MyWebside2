
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
object show extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template9[Products,Products,Products,Products,Products,Products,Products,Products,Products,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(pro1:Products,pro2:Products,pro3:Products,pro4:Products,pro5:Products,pro6:Products,pro7:Products,pro8:Products,pro9:Products):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.129*/("""
<head>
    <title>
        PRODUCTS SHOW.
    </title>
    <style>
    div.outset """),format.raw/*7.16*/("""{"""),format.raw/*7.17*/("""border-style: outset;"""),format.raw/*7.38*/("""}"""),format.raw/*7.39*/("""
    </style>
</head>

<div>
    <br><div class="alert alert-info">
    <strong>STEAM.</strong><span><img src="assets/images/steam.png"width="50"></span>
</div>
    <div><center><img src="assets/images/pubg.jpg"width="250"><br>
        <br><div class="col-sm-4" style="background-color: snow">
            <h3 style="border: 5px solid Tomato;">GAME ID : """),_display_(Seq[Any](/*17.62*/pro1/*17.66*/.getId)),format.raw/*17.72*/("""</h3>
            <div class="bg-warning text-dark">NAME : """),_display_(Seq[Any](/*18.55*/pro1/*18.59*/.getName)),format.raw/*18.67*/("""</div>
            <div class="outset">PRICE :"""),_display_(Seq[Any](/*19.41*/pro1/*19.45*/.getPrice)),format.raw/*19.54*/("""</div>
        AMOUNT :"""),_display_(Seq[Any](/*20.18*/pro1/*20.22*/.getAmount)),format.raw/*20.32*/("""
        </div></center>
    </div>
    <br><div><center><img src="assets/images/gta5.jpg"width="250"><br>
    <br><div class="col-sm-4" style="background-color: snow">
        <h3 style="border: 5px solid Tomato;">GAME ID : """),_display_(Seq[Any](/*25.58*/pro2/*25.62*/.getId)),format.raw/*25.68*/("""</h3>
        <div class="bg-warning text-dark">NAME : """),_display_(Seq[Any](/*26.51*/pro2/*26.55*/.getName)),format.raw/*26.63*/("""</div>
        <div class="outset">PRICE :"""),_display_(Seq[Any](/*27.37*/pro2/*27.41*/.getPrice)),format.raw/*27.50*/("""</div>
        AMOUNT :"""),_display_(Seq[Any](/*28.18*/pro2/*28.22*/.getAmount)),format.raw/*28.32*/("""
    </div></center>
</div>
    <br><div><center><img src="assets/images/csgo.jpg"width="250"><br>
    <br><div class="col-sm-4" style="background-color: snow">
        <h3 style="border: 5px solid Tomato;">GAME ID : """),_display_(Seq[Any](/*33.58*/pro3/*33.62*/.getId)),format.raw/*33.68*/("""</h3>
        <div class="bg-warning text-dark">NAME : """),_display_(Seq[Any](/*34.51*/pro3/*34.55*/.getName)),format.raw/*34.63*/("""</div>
        <div class="outset">PRICE :"""),_display_(Seq[Any](/*35.37*/pro3/*35.41*/.getPrice)),format.raw/*35.50*/("""</div>
        AMOUNT :"""),_display_(Seq[Any](/*36.18*/pro3/*36.22*/.getAmount)),format.raw/*36.32*/("""
    </div></center>
</div>
    <br><div><center><img src="assets/images/farcry5.jpg"width="250"><br>
    <br><div class="col-sm-4" style="background-color: snow">
        <h3 style="border: 5px solid Tomato;">GAME ID : """),_display_(Seq[Any](/*41.58*/pro4/*41.62*/.getId)),format.raw/*41.68*/("""</h3>
        <div class="bg-warning text-dark">NAME : """),_display_(Seq[Any](/*42.51*/pro4/*42.55*/.getName)),format.raw/*42.63*/("""</div>
        <div class="outset">PRICE :"""),_display_(Seq[Any](/*43.37*/pro4/*43.41*/.getPrice)),format.raw/*43.50*/("""</div>
        AMOUNT :"""),_display_(Seq[Any](/*44.18*/pro4/*44.22*/.getAmount)),format.raw/*44.32*/("""
    </div></center>
</div>
    <br><div><center><img src="assets/images/arma3.jpg"width="250"><br>
    <br><div class="col-sm-4" style="background-color: snow">
        <h3 style="border: 5px solid Tomato;">GAME ID : """),_display_(Seq[Any](/*49.58*/pro5/*49.62*/.getId)),format.raw/*49.68*/("""</h3>
        <div class="bg-warning text-dark">NAME : """),_display_(Seq[Any](/*50.51*/pro5/*50.55*/.getName)),format.raw/*50.63*/("""</div>
        <div class="outset">PRICE :"""),_display_(Seq[Any](/*51.37*/pro5/*51.41*/.getPrice)),format.raw/*51.50*/("""</div>
        AMOUNT :"""),_display_(Seq[Any](/*52.18*/pro5/*52.22*/.getAmount)),format.raw/*52.32*/("""
    </div></center>
</div>
    <br><div><center><img src="assets/images/callofdutybo2.jpg"width="250"><br>
    <br><div class="col-sm-4" style="background-color: snow">
        <h3 style="border: 5px solid Tomato;">GAME ID : """),_display_(Seq[Any](/*57.58*/pro6/*57.62*/.getId)),format.raw/*57.68*/("""</h3>
        <div class="bg-warning text-dark">NAME : """),_display_(Seq[Any](/*58.51*/pro6/*58.55*/.getName)),format.raw/*58.63*/("""</div>
        <div class="outset">PRICE :"""),_display_(Seq[Any](/*59.37*/pro6/*59.41*/.getPrice)),format.raw/*59.50*/("""</div>
        AMOUNT :"""),_display_(Seq[Any](/*60.18*/pro6/*60.22*/.getAmount)),format.raw/*60.32*/("""
    </div></center>
</div>
    <br><div><center><img src="assets/images/dying.jpg"width="250"><br>
    <br><div class="col-sm-4" style="background-color: snow">
        <h3 style="border: 5px solid Tomato;">GAME ID : """),_display_(Seq[Any](/*65.58*/pro7/*65.62*/.getId)),format.raw/*65.68*/("""</h3>
        <div class="bg-warning text-dark">NAME : """),_display_(Seq[Any](/*66.51*/pro7/*66.55*/.getName)),format.raw/*66.63*/("""</div>
        <div class="outset">PRICE :"""),_display_(Seq[Any](/*67.37*/pro7/*67.41*/.getPrice)),format.raw/*67.50*/("""</div>
        AMOUNT :"""),_display_(Seq[Any](/*68.18*/pro7/*68.22*/.getAmount)),format.raw/*68.32*/("""
    </div></center>
</div>
    <br><div><center><img src="assets/images/evil2.jpg"width="250"><br>
    <br><div class="col-sm-4" style="background-color: snow">
        <h3 style="border: 5px solid Tomato;">GAME ID : """),_display_(Seq[Any](/*73.58*/pro8/*73.62*/.getId)),format.raw/*73.68*/("""</h3>
        <div class="bg-warning text-dark">NAME : """),_display_(Seq[Any](/*74.51*/pro8/*74.55*/.getName)),format.raw/*74.63*/("""</div>
        <div class="outset">PRICE :"""),_display_(Seq[Any](/*75.37*/pro8/*75.41*/.getPrice)),format.raw/*75.50*/("""</div>
        AMOUNT :"""),_display_(Seq[Any](/*76.18*/pro8/*76.22*/.getAmount)),format.raw/*76.32*/("""
    </div></center>
</div>
    <br><div><center><img src="assets/images/final.jpg"width="250"><br>
    <br><div class="col-sm-4" style="background-color: snow">
        <h3 style="border: 5px solid Tomato;">GAME ID : """),_display_(Seq[Any](/*81.58*/pro9/*81.62*/.getId)),format.raw/*81.68*/("""</h3>
        <div class="bg-warning text-dark">NAME : """),_display_(Seq[Any](/*82.51*/pro9/*82.55*/.getName)),format.raw/*82.63*/("""</div>
        <div class="outset">PRICE :"""),_display_(Seq[Any](/*83.37*/pro9/*83.41*/.getPrice)),format.raw/*83.50*/("""</div>
        AMOUNT :"""),_display_(Seq[Any](/*84.18*/pro9/*84.22*/.getAmount)),format.raw/*84.32*/("""
    </div></center><br>
</div>

</div>"""))}
    }
    
    def render(pro1:Products,pro2:Products,pro3:Products,pro4:Products,pro5:Products,pro6:Products,pro7:Products,pro8:Products,pro9:Products): play.api.templates.HtmlFormat.Appendable = apply(pro1,pro2,pro3,pro4,pro5,pro6,pro7,pro8,pro9)
    
    def f:((Products,Products,Products,Products,Products,Products,Products,Products,Products) => play.api.templates.HtmlFormat.Appendable) = (pro1,pro2,pro3,pro4,pro5,pro6,pro7,pro8,pro9) => apply(pro1,pro2,pro3,pro4,pro5,pro6,pro7,pro8,pro9)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jul 31 15:43:31 ICT 2018
                    SOURCE: D:/MyWebside2/app/views/show.scala.html
                    HASH: 97c0d8a795e4d1d01b220b9345749b3a91eeac28
                    MATRIX: 847->1|1069->128|1179->211|1207->212|1255->233|1283->234|1674->589|1687->593|1715->599|1811->659|1824->663|1854->671|1937->718|1950->722|1981->731|2041->755|2054->759|2086->769|2348->995|2361->999|2389->1005|2481->1061|2494->1065|2524->1073|2603->1116|2616->1120|2647->1129|2707->1153|2720->1157|2752->1167|3006->1385|3019->1389|3047->1395|3139->1451|3152->1455|3182->1463|3261->1506|3274->1510|3305->1519|3365->1543|3378->1547|3410->1557|3667->1778|3680->1782|3708->1788|3800->1844|3813->1848|3843->1856|3922->1899|3935->1903|3966->1912|4026->1936|4039->1940|4071->1950|4326->2169|4339->2173|4367->2179|4459->2235|4472->2239|4502->2247|4581->2290|4594->2294|4625->2303|4685->2327|4698->2331|4730->2341|4993->2568|5006->2572|5034->2578|5126->2634|5139->2638|5169->2646|5248->2689|5261->2693|5292->2702|5352->2726|5365->2730|5397->2740|5652->2959|5665->2963|5693->2969|5785->3025|5798->3029|5828->3037|5907->3080|5920->3084|5951->3093|6011->3117|6024->3121|6056->3131|6311->3350|6324->3354|6352->3360|6444->3416|6457->3420|6487->3428|6566->3471|6579->3475|6610->3484|6670->3508|6683->3512|6715->3522|6970->3741|6983->3745|7011->3751|7103->3807|7116->3811|7146->3819|7225->3862|7238->3866|7269->3875|7329->3899|7342->3903|7374->3913
                    LINES: 26->1|29->1|35->7|35->7|35->7|35->7|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|56->28|56->28|56->28|61->33|61->33|61->33|62->34|62->34|62->34|63->35|63->35|63->35|64->36|64->36|64->36|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|77->49|77->49|77->49|78->50|78->50|78->50|79->51|79->51|79->51|80->52|80->52|80->52|85->57|85->57|85->57|86->58|86->58|86->58|87->59|87->59|87->59|88->60|88->60|88->60|93->65|93->65|93->65|94->66|94->66|94->66|95->67|95->67|95->67|96->68|96->68|96->68|101->73|101->73|101->73|102->74|102->74|102->74|103->75|103->75|103->75|104->76|104->76|104->76|109->81|109->81|109->81|110->82|110->82|110->82|111->83|111->83|111->83|112->84|112->84|112->84
                    -- GENERATED --
                */
            