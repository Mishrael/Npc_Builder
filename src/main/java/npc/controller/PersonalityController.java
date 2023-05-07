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
import npc.entity.Personality;

@Validated
@RequestMapping("/personality")
public interface PersonalityController {

//@formatter:off
  
 /*
  * GETs list of all personalities
  */
 @Operation(
     summary = "Returns a list of all personalities", 
     description = "Returns the list of personalities",
     responses = {
         @ApiResponse(
             responseCode= "200", 
             description= "A list of personalities gets returned", 
             content = @Content(
                 mediaType = "application/json", 
                 schema = @Schema(implementation = Personality.class))), 
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
     @GetMapping("/getsAllPersonalities")
     @ResponseStatus(code= HttpStatus.OK)
     List<Personality> fetchAllPersonalities();
}
