package com.vaadin.demo.valosample;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.FontIcon;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Layout;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ValoSampleUI extends UI {

    private static final String[] TITLES = new String[]{"Valo", "Windows 8", "Facebook", "iOS"};
    private static final String[] THEMENAMES = new String[]{"valosample", "windows8", "facebook", "ios"};
    private static final FontIcon[] ICONS = new FontAwesome[]{FontAwesome.LIGHTBULB_O, FontAwesome.WINDOWS, FontAwesome.FACEBOOK, FontAwesome.APPLE};
    private Layout buttons;

    @WebServlet(value = "/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = ValoSampleUI.class, widgetset = "com.vaadin.demo.valosample.ValoSampleWidgetSet")
    public static class MyCORSServlet extends VaadinServlet {

        /**
         * Override to handle the CORS requests.
         */
        @Override
        protected void service(HttpServletRequest request,
                HttpServletResponse response) throws ServletException,
                IOException {

            // Origin is needed for all CORS requests
            String origin = request.getHeader("Origin");
            if (origin != null && isAllowedRequestOrigin(origin)) {

                // Handle a preflight "option" requests
                if ("options".equalsIgnoreCase(request.getMethod())) {
                    response.addHeader("Access-Control-Allow-Origin", origin);
                    response.setHeader("Allow",
                            "GET, HEAD, POST, PUT, DELETE, TRACE, OPTIONS");

                    // allow the requested method
                    String method = request
                            .getHeader("Access-Control-Request-Method");
                    response.addHeader("Access-Control-Allow-Methods", method);

                    // allow the requested headers
                    String headers = request
                            .getHeader("Access-Control-Request-Headers");
                    response.addHeader("Access-Control-Allow-Headers", headers);

                    response.addHeader("Access-Control-Allow-Credentials",
                            "true");
                    response.setContentType("text/plain");
                    response.setCharacterEncoding("utf-8");
                    response.getWriter().flush();
                    return;
                } // Handle UIDL post requests
                else if ("post".equalsIgnoreCase(request.getMethod())) {
                    response.addHeader("Access-Control-Allow-Origin", origin);
                    response.addHeader("Access-Control-Allow-Credentials",
                            "true");
                    super.service(request, response);
                    return;
                }
            }

            // All the other requests nothing to do with CORS
            super.service(request, response);

        }

        /**
         * Check that the page Origin header is allowed.
         */
        private boolean isAllowedRequestOrigin(String origin) {
            return origin.startsWith("https://vaadin.com") || origin.startsWith("https://demo.vaadin.com");
        }
    }

    @Override
    protected void init(VaadinRequest request) {
        final VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        layout.setSpacing(true);
        setContent(layout);

        buttons = new GridLayout(TITLES.length, 1);
        ((GridLayout) buttons).setSpacing(true);
        buttons.setWidth("550px");
        layout.addComponent(buttons);
        final Label code = new Label("", ContentMode.HTML);
        layout.addComponent(code);

        for (int i = 0; i < TITLES.length; i++) {
            final String title = TITLES[i];
            final FontIcon icon = ICONS[i];
            final String theme = THEMENAMES[i];
            final String codeSample = CodeSamples.ALL[i];
            final Button button = new Button(title, icon);
            button.addClickListener(new Button.ClickListener() {

                @Override
                public void buttonClick(Button.ClickEvent event) {
                    setTheme(theme);
                    code.setValue("<pre class=\"programlisting\">"+codeSample+"</pre>");
                }

            });
            buttons.addComponent(button);

        }
        setTheme(THEMENAMES[0]);
        code.setValue("<pre class=\"programlisting\">"+CodeSamples.VALOSAMPLE+"</pre>");
    }

}
