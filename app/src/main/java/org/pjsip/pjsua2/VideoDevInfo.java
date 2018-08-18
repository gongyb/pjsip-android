/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class VideoDevInfo {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected VideoDevInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(VideoDevInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_VideoDevInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setId(int value) {
    pjsua2JNI.VideoDevInfo_id_set(swigCPtr, this, value);
  }

  public int getId() {
    return pjsua2JNI.VideoDevInfo_id_get(swigCPtr, this);
  }

  public void setName(String value) {
    pjsua2JNI.VideoDevInfo_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return pjsua2JNI.VideoDevInfo_name_get(swigCPtr, this);
  }

  public void setDriver(String value) {
    pjsua2JNI.VideoDevInfo_driver_set(swigCPtr, this, value);
  }

  public String getDriver() {
    return pjsua2JNI.VideoDevInfo_driver_get(swigCPtr, this);
  }

  public void setDir(pjmedia_dir value) {
    pjsua2JNI.VideoDevInfo_dir_set(swigCPtr, this, value.swigValue());
  }

  public pjmedia_dir getDir() {
    return pjmedia_dir.swigToEnum(pjsua2JNI.VideoDevInfo_dir_get(swigCPtr, this));
  }

  public void setCaps(long value) {
    pjsua2JNI.VideoDevInfo_caps_set(swigCPtr, this, value);
  }

  public long getCaps() {
    return pjsua2JNI.VideoDevInfo_caps_get(swigCPtr, this);
  }

  public void setFmt(SWIGTYPE_p_std__vectorT_pj__MediaFormat_t value) {
    pjsua2JNI.VideoDevInfo_fmt_set(swigCPtr, this, SWIGTYPE_p_std__vectorT_pj__MediaFormat_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__vectorT_pj__MediaFormat_t getFmt() {
    long cPtr = pjsua2JNI.VideoDevInfo_fmt_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_pj__MediaFormat_t(cPtr, false);
  }

  public VideoDevInfo() {
    this(pjsua2JNI.new_VideoDevInfo(), true);
  }

}
