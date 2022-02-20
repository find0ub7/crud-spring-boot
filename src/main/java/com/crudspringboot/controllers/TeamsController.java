package com.crudspringboot.controllers;

import com.crudspringboot.controllers.resources.SwapMembersRequest;
import com.crudspringboot.controllers.resources.SwappedTeamsResponse;
import com.crudspringboot.controllers.resources.TeamRequest;
import com.crudspringboot.controllers.resources.TeamResponse;
import com.crudspringboot.usecases.SaveTeam;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/teams")
@RequiredArgsConstructor
@Validated
public class TeamsController {

  private final SaveTeam saveTeam;

  @PostMapping(
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<TeamResponse> createTeam(@RequestBody @Valid TeamRequest teamRequest) {
    val team = teamRequest.toDomain();
    val teamSaved = saveTeam.execute(team);
    return new ResponseEntity<>(new TeamResponse(teamSaved), HttpStatus.CREATED);
  }

  /// teams/{id}
  @PutMapping(
      value = "/{id}",
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<TeamResponse> updateTeam(
      @PathVariable("id") String id, @RequestBody TeamRequest teamRequest) {
    // TODO
    return new ResponseEntity<TeamResponse>((TeamResponse) null, HttpStatus.OK);
  }
  /// teams/{id}
  @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<TeamResponse> getTeamById(@PathVariable("id") String id) {
    // TODO
    return new ResponseEntity<TeamResponse>((TeamResponse) null, HttpStatus.OK);
  }

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<TeamResponse> getTeams() {
    // TODO
    return new ResponseEntity<TeamResponse>((TeamResponse) null, HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void deleteTeam(@PathVariable("id") String id) {
    // TODO
  }

  @PatchMapping("/swap-members")
  public ResponseEntity<SwappedTeamsResponse> swap(@RequestBody SwapMembersRequest swapMembersRequest) {
    //TODO
    return null;
  }
}
