package npc.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import npc.entity.Background;

@Validated
@RequestMapping("/background")
public interface BackgroundController {

    //@formatter:off
    
   /*
    * GETs list of all backgrounds
    */
   @Operation(
       summary = "Returns a list of all backgrounds", 
       description = "Returns the list of backgrounds",
       responses = {
           @ApiResponse(
               responseCode= "200", 
               description= "A list of backgrounds gets returned", 
               content = @Content(
                   mediaType = "application/json", 
                   schema = @Schema(implementation = Background.class))), 
           @ApiResponse(
               responseCode= "400", 
               description = "The parameters requested are not valid", 
               content= @Content(mediaType = "application/json")), 
           @ApiResponse(
               responseCode= "404", 
               description = "No customers were found", 
               content= @Content(mediaType = "application/json")), 
           @ApiResponse(
               responseCode= "500", 
               description = "An unplanned error occurred", 
               content= @Content(mediaType = "application/json"))
           }
       )
       @GetMapping("/getsAllBackgrounds")
       @ResponseStatus(code= HttpStatus.OK)
       List<Background> fetchAllBackgrounds();
  

}
