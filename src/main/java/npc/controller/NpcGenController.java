package npc.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;
import npc.controller.model.NpcDto;
import npc.entity.Name;
import npc.entity.Npc;

@Validated
@RequestMapping("/npc")
@OpenAPIDefinition(info = @Info(title = "NPC Builder"),
servers = {@Server(url = "http://localhost:8080", description = "Local server.")})
public interface NpcGenController {

  @Operation(
      summary = "Returns a list of all npcs", 
      description = "Returns the list of npcs",
      responses = {
          @ApiResponse(
              responseCode= "200", 
              description= "A list of npcs gets returned", 
              content = @Content(
                  mediaType = "application/json", 
                  schema = @Schema(implementation = Npc.class))), 
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
  @GetMapping("/getsAllNpcs")
  @ResponseStatus(code= HttpStatus.OK)
  List<Npc> fetchAllNpcs();
  
  
// GETs an NPC by Id
  @Operation(
      summary = "Returns an NPC",
      description = "Returns an NPC from the list by Id",
      responses = {
          @ApiResponse(
              responseCode = "200",
              description = "An npc has been returned",
              content = @Content(
                  mediaType = "application/json",
                  schema = @Schema(implementation = Npc.class))),
          @ApiResponse(
              responseCode = "400", 
              description = "The parameters requested are not valid", 
              content = @Content(mediaType = "application/json")), 
          @ApiResponse(
              responseCode = "404", 
              description = "No customers were found", 
              content = @Content(mediaType = "application/json")), 
          @ApiResponse(
              responseCode = "500", 
              description = "An unplanned error occurred", 
              content = @Content(mediaType = "application/json"))
      },
      parameters = {
          @Parameter(
              name = "npcId",
              allowEmptyValue = false,
              required = false,
              description = "The Npc Id to find")
      }
      )
  @GetMapping("/getsNpcById")
  @ResponseStatus(code = HttpStatus.OK)
  List<Npc> fetchNpcById(int npcId);
  

// end of GET
  
// POSTs a random generated Npc
  @Operation(
      summary = "Creates a random NPC",
      description = "Creates a random NPC",
      responses = {
          @ApiResponse(
              responseCode = "201",
              description = "A random NPC has been created",
              content = @Content(
                  mediaType = "application/json",
                  schema = @Schema(implementation = Npc.class))),
          @ApiResponse(
              responseCode = "400", 
              description = "The parameters requested are not valid", 
              content = @Content(mediaType = "application/json")), 
          @ApiResponse(
              responseCode = "404", 
              description = "No customers were found", 
              content = @Content(mediaType = "application/json")), 
          @ApiResponse(
              responseCode = "500", 
              description = "An unplanned error occurred", 
              content = @Content(mediaType = "application/json"))
      },
      parameters = {
//          @Parameter(
//              name = "npcId",
//              allowEmptyValue = false,
//              required = false,
//              description = "Npc ID"),
          @Parameter(
              name = "name",
              allowEmptyValue = false,
              required = false,
              description = "Npc name"),
          @Parameter(
              name = "species",
              allowEmptyValue = false,
              required = false,
              description = "Npc species"),
          @Parameter(
              name = "background",
              allowEmptyValue = false,
              required = false,
              description = "Npc background"),
          @Parameter(
              name = "profession",
              allowEmptyValue = false,
              required = false,
              description = "Npc profession"),
          @Parameter(
              name = "personality",
              allowEmptyValue = false,
              required = false,
              description = "Npc personality")
        }
        )
  @PostMapping("/createNpc")
  @ResponseStatus(code = HttpStatus.CREATED)
  Npc createNpc(
//      @RequestParam(required = false) Long npcId,
//      @RequestParam(required = false) Long name,
//      @RequestParam(required = false) Long species,
//      @RequestParam(required = false) Long background,
//      @RequestParam(required = false) Long profession,
//      @RequestParam(required = false) Long personality);
      // Testing whether the KeyHolder will generate the npcId for me.
//      @RequestParam(required = false) Integer npcId,
      @RequestParam(required = false) Integer name,
      @RequestParam(required = false) Integer species,
      @RequestParam(required = false) Integer background,
      @RequestParam(required = false) Integer profession,
      @RequestParam(required = false) Integer personality);
//  Npc createNpc(@Valid @RequestBody NpcDto npcDto);
// end of POST

// PUTs an NPC by ID
  @Operation(
      summary = "Updates an NPC",
      description = "Updates an NPC",
      responses = {
          @ApiResponse(
              responseCode = "200",
              description = "An NPC has been updated",
              content = @Content(
                  mediaType = "application/json",
                  schema = @Schema(implementation = Npc.class))),
          @ApiResponse(
              responseCode = "400", 
              description = "The parameters requested are not valid", 
              content = @Content(mediaType = "application/json")), 
          @ApiResponse(
              responseCode = "404", 
              description = "No customers were found", 
              content = @Content(mediaType = "application/json")), 
          @ApiResponse(
              responseCode = "500", 
              description = "An unplanned error occurred", 
              content = @Content(mediaType = "application/json"))
      },
      parameters = {
        @Parameter(
            name = "npcId",
            allowEmptyValue = false,
            required = false,
            description = "Npc ID"),
        @Parameter(
            name = "name",
            allowEmptyValue = false,
            required = false,
            description = "Npc name"),
        @Parameter(
            name = "species",
            allowEmptyValue = false,
            required = false,
            description = "Npc species"),
        @Parameter(
            name = "background",
            allowEmptyValue = false,
            required = false,
            description = "Npc background"),
        @Parameter(
            name = "profession",
            allowEmptyValue = false,
            required = false,
            description = "Npc profession"),
        @Parameter(
            name = "personality",
            allowEmptyValue = false,
            required = false,
            description = "Npc personality")
      }
      )
@PutMapping("/updateNpc")
@ResponseStatus(code = HttpStatus.OK)
Npc updateNpc(
    @RequestParam(required = false) Integer npcId,
    @RequestParam(required = false) Integer name,
    @RequestParam(required = false) Integer species,
    @RequestParam(required = false) Integer background,
    @RequestParam(required = false) Integer profession,
    @RequestParam(required = false) Integer personality);
        
//  @PutMapping("/updateNpc")
//  @ResponseStatus(code = HttpStatus.OK)
//  Npc updateNpc(@Valid @RequestBody NpcDto npcDto);
// end of PUT
  
//DELETEs an NPC
 @Operation(
     summary = "Deletes an NPC",
     description = "Deletes an NPC",
     responses = {
         @ApiResponse(
             responseCode = "200",
             description = "An NPC has been deleted",
             content = @Content(
                 mediaType = "application/json",
                 schema = @Schema(implementation = Npc.class))),
         @ApiResponse(
             responseCode = "400", 
             description = "The parameters requested are not valid", 
             content = @Content(mediaType = "application/json")), 
         @ApiResponse(
             responseCode = "404", 
             description = "No customers were found", 
             content = @Content(mediaType = "application/json")), 
         @ApiResponse(
             responseCode = "500", 
             description = "An unplanned error occurred", 
             content = @Content(mediaType = "application/json"))
     },
         parameters = {
             @Parameter(
                 name = "npcId",
                 allowEmptyValue = false,
                 required = false,
                 description = "Npc ID")
     }
     
       )
   @DeleteMapping("/deleteNpc")
   @ResponseStatus(code = HttpStatus.OK)
   Npc deleteNpc(@RequestParam(required = false) Integer npcId);
//   void deleteNpc(@Valid @RequestBody NpcDto npcDto);
// end of DELETE


}
