/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public final class pjsua_snd_dev_id {
  public final static pjsua_snd_dev_id PJSUA_SND_DEFAULT_CAPTURE_DEV = new pjsua_snd_dev_id("PJSUA_SND_DEFAULT_CAPTURE_DEV", pjsua2JNI.PJSUA_SND_DEFAULT_CAPTURE_DEV_get());
  public final static pjsua_snd_dev_id PJSUA_SND_DEFAULT_PLAYBACK_DEV = new pjsua_snd_dev_id("PJSUA_SND_DEFAULT_PLAYBACK_DEV", pjsua2JNI.PJSUA_SND_DEFAULT_PLAYBACK_DEV_get());
  public final static pjsua_snd_dev_id PJSUA_SND_NO_DEV = new pjsua_snd_dev_id("PJSUA_SND_NO_DEV", pjsua2JNI.PJSUA_SND_NO_DEV_get());
  public final static pjsua_snd_dev_id PJSUA_SND_NULL_DEV = new pjsua_snd_dev_id("PJSUA_SND_NULL_DEV", pjsua2JNI.PJSUA_SND_NULL_DEV_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static pjsua_snd_dev_id swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + pjsua_snd_dev_id.class + " with value " + swigValue);
  }

  private pjsua_snd_dev_id(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private pjsua_snd_dev_id(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private pjsua_snd_dev_id(String swigName, pjsua_snd_dev_id swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static pjsua_snd_dev_id[] swigValues = { PJSUA_SND_DEFAULT_CAPTURE_DEV, PJSUA_SND_DEFAULT_PLAYBACK_DEV, PJSUA_SND_NO_DEV, PJSUA_SND_NULL_DEV };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

