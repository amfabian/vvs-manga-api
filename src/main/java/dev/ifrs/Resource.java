package dev.ifrs;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.faulttolerance.Retry;
import org.eclipse.microprofile.faulttolerance.Timeout;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import dev.ifrs.restclient.*;
import dev.ifrs.restclient.model.Response;;

@Path("/manga")
public class Resource {
    

    @Inject
    @RestClient
    MangaRestClient mangaRestClient;
    

  
    @GET
    @Path("/search/{query}")
    @Produces(MediaType.APPLICATION_JSON)
    @Retry(maxRetries = 3, delay = 2000)
    @Timeout(7000)
    public Response hello(@PathParam("query") String query){
        System.out.println("RESOURCE.java");
        Response resp = mangaRestClient.search(query);
        System.out.println("search on resource");
        return resp;
        
    }


}
