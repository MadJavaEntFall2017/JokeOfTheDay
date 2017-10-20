package edu.matc.decisionMaker;

    import javax.ws.rs.GET;
    import javax.ws.rs.Path;
    import javax.ws.rs.PathParam;
    import javax.ws.rs.Produces;
    import javax.ws.rs.core.Response;


@Path("/decision")
public class DecisionMaker {
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    public Response getMessage() {
        // Return a test message
        String output = "Just do it. Ya, that is the decision";
        return Response.status(200).entity(output).build();
    }

}