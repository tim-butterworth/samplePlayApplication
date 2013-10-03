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
	return ok("about");
	}
	public static Result cafe(){
	return ok("cafe");
	}
	public static Result contacts(){
	return ok("contacts");
	}
	public static Result giftShop(){
	return ok("giftShop");
	}
	public static Result salon(){
	return ok("salon");
	}
	public static Result spa(){
	return ok("spa");
	}
	public static Result specialEvents(){
	return ok("specialEvents");
	}
	public static Result teaRoom(){
	return ok("teaRoom");
	}
	public static Result viewCart(){
	return ok("viewCart");
	}
}
