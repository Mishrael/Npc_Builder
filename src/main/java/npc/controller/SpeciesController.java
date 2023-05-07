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
import npc.entity.Species;

@Validated
@RequestMapping("/species")
public interface SpeciesController {

  // @formatter:off
  
  // GETs list of all species
  @Operation(
      summary = "Returns a list of all species", 
      description = "Returns the list of species",
      responses = {
          @ApiResponse(
              responseCode= "200", 
              description= "A list of species gets returned", 
              content = @Content(
                  mediaType = "application/json", 
                  schema = @Schema(implementation = Species.class))), 
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
      @GetMapping("/getsAllSpecies")
      @ResponseStatus(code= HttpStatus.OK)
      List<Species> fetchAllSpecies();
}
