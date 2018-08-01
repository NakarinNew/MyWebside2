
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(content:Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.16*/("""
<html>
    <head>
        <link type="text/css" rel="stylesheet"
        href="/assets/stylesheets/bootstrap/css/bootstrap.css">
        <style>
        body """),format.raw/*7.14*/("""{"""),format.raw/*7.15*/("""
                background-image: url("assets/images/backg.jpg");
                background-size: cover;
                background-attachment: fixed;
            """),format.raw/*11.13*/("""}"""),format.raw/*11.14*/("""
        h1 """),format.raw/*12.12*/("""{"""),format.raw/*12.13*/("""
            text-shadow: 2px 2px 5px blue;
        """),format.raw/*14.9*/("""}"""),format.raw/*14.10*/("""
        </style>
    </head>
<body>
    <nav class="navbar navbar-inverse" style="background-color: #d1ecf1">
            <div style="color:grey">
                <h1>NXWX STEAM KEYS.</h1>
                <p style="color:black" >จำหน่ายเกม Steam. ในรูปแบบ Digital Download</p>
            </div>
        <div class="navbar-header">
            <a class="navbar-brand" href="https://store.steampowered.com/?l=thai" target="_blank">
                <span class="glyphicon glyphicon-globe"></span> STEAM. Web site</a>
        </div>
    </nav>
    <nav>
        <center>"""),_display_(Seq[Any](/*29.18*/menu())),format.raw/*29.24*/("""</center>
    </nav>

    <div class="container" style="margin-top:30px">
        <div class="row">
            <div class="col-sm-3" style="background-color: #d1ecf1">
               <div class="panel panel-success"style="background-color: white">
                <h2>About Me</h2>
                <div class="fakeimg"><center><img src="assets/images/icon.png"width="100"></center></div>
                   Name : Nakarin Wadkhian <br>
                   Nickname : New <br>
                   Age : 21 year old<br>
                   Birthday : August , 23 , 1997 <br>
                   Student ID : 59342110142-1
                <h3>Some Links</h3>
                <p>Lorem ipsum dolor sit ame.</p>
                <ul class="nav nav-pills flex-column">
                    <li class="nav-item">
                        <a class="nav-link active" href="#">Active</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Link</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Link</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#">Disabled</a>
                    </li>
                </ul>
                   <hr class="d-sm-none">
               </div>
            </div>
            <div class="col-sm-9">
            """),_display_(Seq[Any](/*63.14*/content)),format.raw/*63.21*/("""
            </div>
        </div>
    </div>

   <br> <div class="jumbotron text-center" style="margin-bottom:0">
        <div class="row">
            <div class="col-sm-4">
                <h1>เกี่ยวกับเรา</h1>
                จำหน่ายเกม Steam ในรูปแบบ <br>
                Digital Download ลูกค้าสามารถสั่งซื้อได้ตลอด 24 ชม. <br>
                เพียงเติมเงินเข้าบัญชีและสั่งซื้อ
                (เพื่อการศึกษา)
            </div>
            <div class="col-sm-4">
                <h1>LOCATION</h1>
                ที่อยู่ : 222/1 หมู่15 หมู่บ้าน สุรินดา ถ.เจนจบทิศ <br>
                ต.เมืองเก่า อ.เมือง จ.ขอนแก่น 40000
            </div>
            <div class="col-sm-4">
                <h1>ติดต่อเรา</h1>
                <div class="navbar-header">
                    <a class="navbar-brand" href="https://www.facebook.com/nakarin.new" target="_blank">
                        <span class="glyphicon glyphicon-globe"></span> FACEBOOK.</a>
                </div>
            </div>

        </div>
        </div>
</body>
</html>"""))}
    }
    
    def render(content:Html): play.api.templates.HtmlFormat.Appendable = apply(content)
    
    def f:((Html) => play.api.templates.HtmlFormat.Appendable) = (content) => apply(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jul 31 15:43:31 ICT 2018
                    SOURCE: D:/MyWebside2/app/views/main.scala.html
                    HASH: 553411021d0b8101ccbd8a137e200f633bf7e520
                    MATRIX: 771->1|879->15|1065->174|1093->175|1286->340|1315->341|1355->353|1384->354|1463->406|1492->407|2097->976|2125->982|3614->2435|3643->2442
                    LINES: 26->1|29->1|35->7|35->7|39->11|39->11|40->12|40->12|42->14|42->14|57->29|57->29|91->63|91->63
                    -- GENERATED --
                */
            