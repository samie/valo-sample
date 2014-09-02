/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vaadin.demo.valosample;

/**
 *
 * @author se
 */
public class CodeSamples {

    public static final String VALOSAMPLE = "// Use white background color for embedding\n"
            + "$v-app-background-color: hsl(210, 0%, 100%);\n"
            + "\n"
            + "@import \"../valo/valo\";\n"
            + "\n"
            + ".valosample {\n"
            + "    // Include Valo styles in your theme\n"
            + "    @include valo;\n"
            + "}";

    public static final String WINDOWS8 = "// Font style\n"
            + "$v-font-family: \"Source Sans Pro\", sans-serif;\n"
            + "\n"
            + "// Size and margins\n"
            + "\n"
            + "// Background, border color and gradients\n"
            + "$v-background-color: #981aa0;\n"
            + "$v-border: 1px solid rgba(#fff,0.2);\n"
            + "$v-border-radius: 0;\n"
            + "$v-bevel: false;\n"
            + "$v-shadow: false;\n"
            + "\n"
            + "// Focus style\n"
            + "$v-focus-style: 0 0 0 1px #aaa;\n"
            + "\n"
            + "@import \"../valo/valo\";\n"
            + "\n"
            + ".windows8 {\n"
            + "\n"
            + "  @include valo;\n"
            + "  \n"
            + "  .v-button {   \n"
            + "      // Left to right gradient in button\n"
            + "      @include linear-gradient(to right, #981aa0 0%, #a700ae 100%);\n"
            + "      color: #fff;\n"
            + "  }\n"
            + "}\n";

    public static final String FACEBOOK = "// Font style\n"
            + "$v-font-family: Helvetica, Arial, 'lucida grande', tahoma, verdana, arial, sans-serif;\n"
            + "$v-font-size: 14px;\n"
            + "$v-font-color: #37404E;\n"
            + "$v-font-weight: 400;\n"
            + "\n"
            + "// Size and margins\n"
            + "$v-unit-size: 30px;\n"
            + "\n"
            + "// Background, border color and gradients\n"
            + "$v-background-color: #506cbb;\n"
            + "$v-border-radius: 3px;\n"
            + "$v-gradient: v-linear 12%;\n"
            + "$v-bevel: inset 0 1px 0 v-tint;\n"
            + "\n"
            + "// Focus styles\n"
            + "$v-focus-color: #3b5998;\n"
            + "$v-focus-style: 0 0 1px 1px rgba($v-focus-color, .5);\n"
            + "$v-shadow: 0 1px 0 (v-shade 0.2);\n"
            + "\n"
            + "@import \"../valo/valo\";\n"
            + "\n"
            + ".facebook {\n"
            + "  @include valo;  \n"
            + "}";

    public static final String IOS = "// Font style\n"
            + "$v-font-family: \"Source Sans Pro\", sans-serif;\n"
            + "\n"
            + "// Focus styles\n"
            + "$v-focus-style: 0 0 1px 1px #aae;\n"
            + "\n"
            + "@import \"../valo/valo\";\n"
            + "\n"
            + ".ios {\n"
            + "\n"
            + "    @include valo;\n"
            + "\n"
            + "    .v-button {\n"
            + "        width: 90px;\n"
            + "        height: 90px;\n"
            + "        border: none;\n"
            + "        border-radius: 18px;\n"
            + "        padding: 0;\n"
            + "        margin-bottom: 1.5em;\n"
            + "        @include linear-gradient(to bottom, #0b5596 0%, #27e3cb 100%);\n"
            + "\n"
            + "        .v-button-wrap {\n"
            + "            display: inline-block;\n"
            + "        }\n"
            + "        .v-icon {\n"
            + "            font-size: 3.7em;\n"
            + "            color: #fff;\n"
            + "        }\n"
            + "\n"
            + "        .v-button-caption {\n"
            + "            color: #555;\n"
            + "            display: block;\n"
            + "            margin: 0;\n"
            + "            font-weight: 100;\n"
            + "        }\n"
            + "    }\n"
            + "}";

    public static final String[] ALL = new String[]{VALOSAMPLE, WINDOWS8, FACEBOOK, IOS};

}
