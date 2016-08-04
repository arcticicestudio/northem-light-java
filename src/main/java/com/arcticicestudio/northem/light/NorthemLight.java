/*
+++++++++++++++++++++++++++++++++++++++++++
title     NorthemLight                    +
project   northem-light-java              +
file      NorthemLight.java               +
version   0.2.0                           +
author    Arctic Ice Studio               +
email     development@arcticicestudio.com +
website   http://arcticicestudio.com      +
copyright Copyright (C) 2016              +
created   2016-01-24 19:46 UTC+0100       +
modified  2016-04-09 10:47 UTC+0200       +
+++++++++++++++++++++++++++++++++++++++++++

[Description]
"Northem Light" color palette as enumeration for the "Northem Light - Java" project.

[Copyright]
Copyright (C) 2016 Arctic Ice Studio <development@arcticicestudio.com>

[References]
Northem Light
  (https://github.com/arcticicestudio/northem-light)
Java 8 API Documentation
  (https://docs.oracle.com/javase/8/docs/api/)
JavaFX 2.2 API Documentation
  (https://docs.oracle.com/javafx/2/api/)
JavaFX 2.2 Oracle Project Website
  (http://docs.oracle.com/javase/8/javase-clienttechnologies.htm)
Arctic Versioning Specification
  (http://specs.arcticicestudio.com/arcver) (ArcVer)
*/
package com.arcticicestudio.northem.light;

import javafx.scene.paint.Color;
import java.util.regex.Pattern;

/**
 * <a href="https://github.com/arcticicestudio/northem-light">Northem Light</a> color palette
  * as enumeration of the <a href="https://github.com/arcticicestudio/northem-light-java">Northem Light - Java</a> project.
 * <div>
 *   <table style="display:inline-block">
 *     <thead>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(69,69,70);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(109,109,111);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(198,198,200);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(242,242,247);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(249,249,252);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(255,255,255);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(122,202,194);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(111,186,208);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(113,167,202);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(87,129,179);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(223,92,90);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(255,197,104);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(241,144,84);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(197,201,97);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(186,142,196);margin: 0"></th>
 *     </thead>
 *   </table>
 * </div>
 *
 * @author Arctic Ice Studio &lt;development@arcticicestudio.com&gt;
 * @see <a href="https://github.com/arcticicestudio/northem-light">"Northem Light" GitHub Repository</a>
 * @see <a href="https://github.com/arcticicestudio/northem-light-java">"Northem Light - Java" GitHub Repository</a>
 * @since 0.1.0
 */
public enum NorthemLight {
  /**
   * The color {@code dark-gray} with an RGB value of {@code rgb(69,69,70)} and HEX value of {@code #454546}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(69,69,70);margin: 0"></div>
   */
  DARK_GRAY(69,69,70),
  /**
   * The color {@code gray} with an RGB value of {@code rgb(109,109,111)} and HEX value of {@code #6D6D6F}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(109,109,111);margin: 0"></div>
   */
  GRAY(109,109,111),
  /**
   * The color {@code light-gray} with an RGB value of {@code rgb(198,198,200)} and HEX value of {@code #C6C6C8}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(198,198,200);margin: 0"></div>
   */
  LIGHT_GRAY(198,198,200),
  /**
   * The color {@code dark-snow} with an RGB value of {@code rgb(242,242,247)} and HEX value of {@code #F2F2F7}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(242,242,247);margin: 0"></div>
   */
  DARK_SNOW(242,242,247),
  /**
   * The color {@code dirty-snow} with an RGB value of {@code rgb(249,249,252)} and HEX value of {@code #F9F9FC}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(249,249,252);margin: 0"></div>
   */
  DIRTY_SNOW(249,249,252),
  /**
   * The color {@code snow} with an RGB value of {@code rgb(255,255,255)} and HEX value of {@code #FFFFFF}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(255,255,255);margin: 0"></div>
   */
  SNOW(255,255,255),
  /**
   * The color {@code aqua} with an RGB value of {@code rgb(122,202,194)} and HEX value of {@code #7ACAC2}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(122,202,194);margin: 0"></div>
   */
  AQUA(122,202,194),
  /**
   * The color {@code light-blue} with an RGB value of {@code rgb(111,186,208)} and HEX value of {@code #6FBAD0}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(111,186,208);margin: 0"></div>
   */
  LIGHT_BLUE(111,186,208),
  /**
   * The color {@code blue} with an RGB value of {@code rgb(113,167,202)} and HEX value of {@code #71A7CA}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(113,167,202);margin: 0"></div>
   */
  BLUE(113,167,202),
  /**
   * The color {@code dark-blue} with an RGB value of {@code rgb(87,129,179)} and HEX value of {@code #5781B3}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(87,129,179);margin: 0"></div>
   */
  DARK_BLUE(87,129,179),
  /**
   * The color {@code red} with an RGB value of {@code rgb(223,92,90)} and HEX value of {@code #DF5C5A}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(223,92,90);margin: 0"></div>
   */
  RED(223,92,90),
  /**
   * The color {@code yellow} with an RGB value of {@code rgb(255,197,104)} and HEX value of {@code #FFC568}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(255,197,104);margin: 0"></div>
   */
  YELLOW(255,197,104),
  /**
   * The color {@code orange} with an RGB value of {@code rgb(241,144,84)} and HEX value of {@code #F19054}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(241,144,84);margin: 0"></div>
   */
  ORANGE(241,144,84),
  /**
   * The color {@code lime} with an RGB value of {@code rgb(197,201,97)} and HEX value of {@code #C5C961}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(197,201,97);margin: 0"></div>
   */
  LIME(197,201,97),
  /**
   * The color {@code purple} with an RGB value of {@code rgb(186,142,196)} and HEX value of {@code #BA8EC4}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(186,142,196);margin: 0"></div>
   */
  PURPLE(186,142,196);

  /**
   * Compiled pattern to convert the RGB and HEX color values.
   */
  private static final Pattern COLOR_PREFIX = Pattern.compile("0x", Pattern.LITERAL);

  /**
   * Contains the RGB color code.
   */
  private final Color COLOR;

  /**
   * Constructs a new color object.
   *
   * @param RED The value for the additive primary color {@code red}
   * @param GREEN The value for the additive primary color {@code green}
   * @param BLUE The value for the additive primary color {@code blue}
   */
  NorthemLight(final int RED, final int GREEN, final int BLUE) {
    COLOR = Color.rgb(RED, GREEN, BLUE);
  }

  /**
   * Converts the color to the {@code RGB} identifier.
   *
   * @param COLOR The color object
   * @return a string representation of the {@code RGB} identifier
   */
  public static String rgb(final Color COLOR) {
    String hex = COLOR_PREFIX.matcher(COLOR.toString()).replaceAll("");
    String hexRed = hex.substring(0, 2).toUpperCase();
    String hexGreen = hex.substring(2, 4).toUpperCase();
    String hexBlue = hex.substring(4, 6).toUpperCase();

    String intRed = Integer.toString(Integer.parseInt(hexRed, 16));
    String intGreen = Integer.toString(Integer.parseInt(hexGreen, 16));
    String intBlue = Integer.toString(Integer.parseInt(hexBlue, 16));

    return String.join("", "rgb(", intRed, ", ", intGreen, ", ", intBlue, ")");
  }

  /**
   * Converts the color to the {@code HEX} identifier.
   *
   * @param COLOR The color object
   * @return a string representation of the {@code HEX} identifier
   */
  public static String hex(final Color COLOR) {
    return COLOR_PREFIX.matcher(COLOR.toString()).replaceAll("#").substring(0, 7).toUpperCase();
  }

  /**
   * Returns the color object.
   *
   * @return the color object
   */
  public Color get() {
    return COLOR;
  }
}
