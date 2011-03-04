package controllers;

import play.mvc.Controller;

public class UnSecuredController extends Controller {
	public static void noCheck(){
		renderText("OK");
	}

	public static void permissionDenied(){
		if(!Secure.checkPermission("foo", "bar"))
			forbidden();
		renderText("OK");
	}

}
