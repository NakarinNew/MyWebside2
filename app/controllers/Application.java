package controllers;

import com.sun.org.apache.regexp.internal.RE;
import models.Products;
import play.api.templates.Html;
import play.*;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;
import views.html.*;

import javax.persistence.criteria.From;

public class Application extends Controller {

        public static Products pro1 = new Products("G001", "PLAYERUNKNOWN'S BATTLEGROUNDS", 550.00, 100);
        public static Products pro2 = new Products("G002", "Grand Theft Auto V", 400.00, 100);
        public static Products pro3 = new Products("G003", "Counter-Strike: Global Offensive", 220.00, 100);
        public static Products pro4 = new Products("G004", "Far Cry® 5", 1500.00, 100);
        public static Products pro5 = new Products("G005", "Arma 3", 1500.00, 100);
        public static Products pro6 = new Products("G006", "Call of Duty®: Black Ops II", 520.00, 100);
        public static Products pro7 = new Products("G007", "Dying Light", 850.00, 100);
        public static Products pro8 = new Products("G008", "The Evil Within 2", 990.00, 100);
        public static Products pro9 = new Products("G009", "FINAL FANTASY XV WINDOWS EDITION", 1490.00, 100);

    public static Products products;

    public static Result main(Html content) {
        return ok(main.render(content));
    }

    public static Result index() {
        return main(home.render());
    }

    public static Result article() {
        return main(article.render());
    }

    public static Result promotion() {
        return main(promotion.render());
    }


    public static Result show() { return main(show.render(pro1,pro2,pro3,pro4,pro5,pro6,pro7,pro8,pro9));}

    public static Result products_form (){
        return main(products_form.render());
    }

    public static Result product_post() {
        DynamicForm myForm = Form.form().bindFromRequest();
        String id,name;
        Double price;
        int amount;

        id=myForm.get("id");
        name=myForm.get("name");
        price=Double.parseDouble(myForm.get("price"));
        amount=Integer.parseInt(myForm.get("amount"));

        products=new Products(id,name,price,amount);

        return main(products_show.render(products));
    }

}
