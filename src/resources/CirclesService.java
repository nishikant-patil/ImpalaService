package resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Dummy;

@Path("/circles")
public class CirclesService {
	static int i = 0;

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Dummy> getData() {
		List<Dummy> dl = new ArrayList<>();
		for (int cnt = 0; cnt <= i; ++cnt) {
			dl.add(new Dummy());
		}
		++i;
		if (i == 5) {
			i = 0;
		}
		return dl;
	}
}
