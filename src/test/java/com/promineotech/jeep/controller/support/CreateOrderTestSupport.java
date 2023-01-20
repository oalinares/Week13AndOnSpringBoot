package com.promineotech.jeep.controller.support;

public class CreateOrderTestSupport extends BaseTest {
  protected String createOrderBody() {
    // @formatter:off
    return "{\n"
        + " \"customer\":\"MORISON_LINA\",\n"
        + " \"model\":\"WRANGLER\",\n"
        + " \"trim\":\"Sport Altitude\",\n"
        + " \"doors\":4,\n"
        + " \"color\":\"EXT_NACHO\",\n"
        + " \"engine\":\"2_0_TURBO\",\n"
        + " \"tire\":\"35_TOYO\",\n"
        + " \"options\":[\n"
        + "       \"DOOR_QUAD_4\", \n"
        + "       \"EXT_AEV_LIFT\", \n"
        + "       \"EXT_WARN_WINCH\", \n"
        + "       \"EXT_WARN_BUMPER_FRONT\", \n"
        + "       \"EXT_WARN_BUMPER_REAR\", \n"
        + "       \"EXT_ARB_COMPRESSOR\"\n"
        + " ]\n"
        + "}";
      // @formatter:on 
  }
 
  protected String createOrderBodyForVideo() {
    //@formatter:off
    return "{\n"
    + " \"customer\":\"STERN_TORO\",\n"
    + " \"model\":\"GLADIATOR\",\n"
    + " \"trim\":\"Freedom\",\n"
    + " \"doors\":4,\n"
    + " \"color\":\"EXT_LASER_BLUE\",\n"
    + " \"engine\":\"2_0_TURBO\",\n"
    + " \"tire\":\"33_FALKEN_MT\",\n"
    + " \"options\":[\n"
    + "       \"DOOR_QUAD_4\", \n"
    + "       \"EXT_AEV_LIFT\", \n"
    + "       \"EXT_MOPAR_STEP_CHROME\", \n"
    + "       \"EXT_WARN_BUMPER_FRONT\", \n"
    + "       \"EXT_WARN_BUMPER_REAR\", \n"
    + "       \"EXT_ARB_COMPRESSOR\", \n"
    + "       \"EXT_ROUGN_CLASSIC\"\n"
    + " ]\n"
    + "}";
    //@formatter:on
  }
}
