package controllers;

import play.api.templates.Html;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class Application extends Controller {

    public static Result home() {
    	Html html = Html.apply(
    			"<a href='/about'>about</a></br>"+
    			"<a href='/cafe'>cafe</a></br>"+
    			"<a href='/contacts'>contacts</a></br>"+
    			"<a href='/giftShop'>giftShop</a></br>"+
    			"<a href='/salon'>salon</a></br>"+
    			"<a href='/spa'>spa</a></br>"+
    			"<a href='/specialEvents'>specialEvents</a></br>");
        return ok(main.render("Super", html));
    }

    public static Result about(){
		return TODO;
    }

    public static Result cafe(){
		return TODO;
    }

    public static Result contacts(){
		return TODO;
    }

    public static Result giftShop(){
		return TODO;
    }

    public static Result salon(){
		return TODO;
    }

    public static Result spa(){
		return TODO;
    }

    public static Result specialEvents(){
		return TODO;
    }

    public static Result teaRoom(){
		return TODO;
    }

    public static Result viewCart(){
		return TODO;
    }


}
