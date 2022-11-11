package dev.ifrs.restclient;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import dev.ifrs.restclient.model.Response;

@RegisterRestClient(configKey = "restclient-api")
@Produces(MediaType.APPLICATION_JSON)
public interface MangaRestClient {
    @GET
    @Path("/search/manga")
    Response search(@HeaderParam("x-rapidapi-key") String xRapidapiKey,
    @HeaderParam("x-rapidapi-host") String xRapidapiHost,
    @QueryParam("q") String query);
}
