package app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import resources.CirclesService;
import resources.HelloWorldService;


@ApplicationPath("impala")
public class ImpalaApp extends Application {
 @Override
public Set<Class<?>> getClasses() {
	 Set<Class<?>> s = new HashSet<Class<?>>();
     s.add(HelloWorldService.class);
     s.add(CirclesService.class);
     return s;
}
}