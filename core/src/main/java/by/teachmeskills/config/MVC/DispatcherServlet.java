package by.teachmeskills.config.MVC;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//Обязательно надо зарегистрировать сервлет
public class DispatcherServlet extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                WebMvcConfig.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }


}

