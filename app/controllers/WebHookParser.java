package controllers;

import play.*;
import play.mvc.*;
import play.mvc.Http.RequestBody;
import play.libs.Json;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * Created by sinaikashipazha on 7/30/15.
 */

public class WebHookParser extends Controller {

    @BodyParser.Of(BodyParser.Json.class)
    public Result parser (){
        JsonNode json = request().body().asJson();
        String name = json.findPath( "name").textValue();

        return ok( "Hello" + name );
    }
}
