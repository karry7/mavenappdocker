package com.mycompany.app;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class App extends SpringBootServletInitializer
{


@Override
5
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
6
        return application.sources(App.class);
7
    }
    public static void main( String[] args )
    {
     SpringApplication.run(App.class, args);
        System.out.println( "Hello World!" );
    }
}
