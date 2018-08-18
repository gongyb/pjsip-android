/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class Endpoint {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Endpoint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Endpoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_Endpoint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    pjsua2JNI.Endpoint_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    pjsua2JNI.Endpoint_change_ownership(this, swigCPtr, true);
  }

  public void libDestroy(long prmFlags) throws java.lang.Exception {
	Runtime.getRuntime().gc();
	libDestroy_(prmFlags);
  }

  public void libDestroy() throws java.lang.Exception {
	Runtime.getRuntime().gc();
	libDestroy_();
  }

  public static Endpoint instance() throws java.lang.Exception {
    return new Endpoint(pjsua2JNI.Endpoint_instance(), false);
  }

  public Endpoint() {
    this(pjsua2JNI.new_Endpoint(), true);
    pjsua2JNI.Endpoint_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public Version libVersion() {
    return new Version(pjsua2JNI.Endpoint_libVersion(swigCPtr, this), true);
  }

  public void libCreate() throws java.lang.Exception {
    pjsua2JNI.Endpoint_libCreate(swigCPtr, this);
  }

  public pjsua_state libGetState() {
    return pjsua_state.swigToEnum(pjsua2JNI.Endpoint_libGetState(swigCPtr, this));
  }

  public void libInit(EpConfig prmEpConfig) throws java.lang.Exception {
    pjsua2JNI.Endpoint_libInit(swigCPtr, this, EpConfig.getCPtr(prmEpConfig), prmEpConfig);
  }

  public void libStart() throws java.lang.Exception {
    pjsua2JNI.Endpoint_libStart(swigCPtr, this);
  }

  public void libRegisterThread(String name) throws java.lang.Exception {
    pjsua2JNI.Endpoint_libRegisterThread(swigCPtr, this, name);
  }

  public boolean libIsThreadRegistered() {
    return pjsua2JNI.Endpoint_libIsThreadRegistered(swigCPtr, this);
  }

  public void libStopWorkerThreads() {
    pjsua2JNI.Endpoint_libStopWorkerThreads(swigCPtr, this);
  }

  public int libHandleEvents(long msec_timeout) {
    return pjsua2JNI.Endpoint_libHandleEvents(swigCPtr, this, msec_timeout);
  }

  public void libDestroy_(long prmFlags) throws java.lang.Exception {
    pjsua2JNI.Endpoint_libDestroy___SWIG_0(swigCPtr, this, prmFlags);
  }

  public void libDestroy_() throws java.lang.Exception {
    pjsua2JNI.Endpoint_libDestroy___SWIG_1(swigCPtr, this);
  }

  public String utilStrError(int prmErr) {
    return pjsua2JNI.Endpoint_utilStrError(swigCPtr, this, prmErr);
  }

  public void utilLogWrite(int prmLevel, String prmSender, String prmMsg) {
    pjsua2JNI.Endpoint_utilLogWrite__SWIG_0(swigCPtr, this, prmLevel, prmSender, prmMsg);
  }

  public void utilLogWrite(LogEntry e) {
    pjsua2JNI.Endpoint_utilLogWrite__SWIG_1(swigCPtr, this, LogEntry.getCPtr(e), e);
  }

  public int utilVerifySipUri(String prmUri) {
    return pjsua2JNI.Endpoint_utilVerifySipUri(swigCPtr, this, prmUri);
  }

  public int utilVerifyUri(String prmUri) {
    return pjsua2JNI.Endpoint_utilVerifyUri(swigCPtr, this, prmUri);
  }

  public SWIGTYPE_p_void utilTimerSchedule(long prmMsecDelay, SWIGTYPE_p_void prmUserData) throws java.lang.Exception {
    long cPtr = pjsua2JNI.Endpoint_utilTimerSchedule(swigCPtr, this, prmMsecDelay, SWIGTYPE_p_void.getCPtr(prmUserData));
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void utilTimerCancel(SWIGTYPE_p_void prmToken) {
    pjsua2JNI.Endpoint_utilTimerCancel(swigCPtr, this, SWIGTYPE_p_void.getCPtr(prmToken));
  }

  public void utilAddPendingJob(PendingJob job) {
    pjsua2JNI.Endpoint_utilAddPendingJob(swigCPtr, this, PendingJob.getCPtr(job), job);
  }

  public IntVector utilSslGetAvailableCiphers() throws java.lang.Exception {
    return new IntVector(pjsua2JNI.Endpoint_utilSslGetAvailableCiphers(swigCPtr, this), true);
  }

  public void natDetectType() throws java.lang.Exception {
    pjsua2JNI.Endpoint_natDetectType(swigCPtr, this);
  }

  public pj_stun_nat_type natGetType() throws java.lang.Exception {
    return pj_stun_nat_type.swigToEnum(pjsua2JNI.Endpoint_natGetType(swigCPtr, this));
  }

  public void natUpdateStunServers(StringVector prmServers, boolean prmWait) throws java.lang.Exception {
    pjsua2JNI.Endpoint_natUpdateStunServers(swigCPtr, this, StringVector.getCPtr(prmServers), prmServers, prmWait);
  }

  public void natCheckStunServers(StringVector prmServers, boolean prmWait, SWIGTYPE_p_void prmUserData) throws java.lang.Exception {
    pjsua2JNI.Endpoint_natCheckStunServers(swigCPtr, this, StringVector.getCPtr(prmServers), prmServers, prmWait, SWIGTYPE_p_void.getCPtr(prmUserData));
  }

  public void natCancelCheckStunServers(SWIGTYPE_p_void token, boolean notify_cb) throws java.lang.Exception {
    pjsua2JNI.Endpoint_natCancelCheckStunServers__SWIG_0(swigCPtr, this, SWIGTYPE_p_void.getCPtr(token), notify_cb);
  }

  public void natCancelCheckStunServers(SWIGTYPE_p_void token) throws java.lang.Exception {
    pjsua2JNI.Endpoint_natCancelCheckStunServers__SWIG_1(swigCPtr, this, SWIGTYPE_p_void.getCPtr(token));
  }

  public int transportCreate(pjsip_transport_type_e type, TransportConfig cfg) throws java.lang.Exception {
    return pjsua2JNI.Endpoint_transportCreate(swigCPtr, this, type.swigValue(), TransportConfig.getCPtr(cfg), cfg);
  }

  public IntVector transportEnum() throws java.lang.Exception {
    return new IntVector(pjsua2JNI.Endpoint_transportEnum(swigCPtr, this), true);
  }

  public TransportInfo transportGetInfo(int id) throws java.lang.Exception {
    return new TransportInfo(pjsua2JNI.Endpoint_transportGetInfo(swigCPtr, this, id), true);
  }

  public void transportSetEnable(int id, boolean enabled) throws java.lang.Exception {
    pjsua2JNI.Endpoint_transportSetEnable(swigCPtr, this, id, enabled);
  }

  public void transportClose(int id) throws java.lang.Exception {
    pjsua2JNI.Endpoint_transportClose(swigCPtr, this, id);
  }

  public void transportShutdown(SWIGTYPE_p_void tp) throws java.lang.Exception {
    pjsua2JNI.Endpoint_transportShutdown(swigCPtr, this, SWIGTYPE_p_void.getCPtr(tp));
  }

  public void hangupAllCalls() {
    pjsua2JNI.Endpoint_hangupAllCalls(swigCPtr, this);
  }

  public void mediaAdd(AudioMedia media) {
    pjsua2JNI.Endpoint_mediaAdd(swigCPtr, this, AudioMedia.getCPtr(media), media);
  }

  public void mediaRemove(AudioMedia media) {
    pjsua2JNI.Endpoint_mediaRemove(swigCPtr, this, AudioMedia.getCPtr(media), media);
  }

  public boolean mediaExists(AudioMedia media) {
    return pjsua2JNI.Endpoint_mediaExists(swigCPtr, this, AudioMedia.getCPtr(media), media);
  }

  public long mediaMaxPorts() {
    return pjsua2JNI.Endpoint_mediaMaxPorts(swigCPtr, this);
  }

  public long mediaActivePorts() {
    return pjsua2JNI.Endpoint_mediaActivePorts(swigCPtr, this);
  }

  public AudioMediaVector mediaEnumPorts() throws java.lang.Exception {
    return new AudioMediaVector(pjsua2JNI.Endpoint_mediaEnumPorts(swigCPtr, this), false);
  }

  public AudDevManager audDevManager() {
    return new AudDevManager(pjsua2JNI.Endpoint_audDevManager(swigCPtr, this), false);
  }

  public VidDevManager vidDevManager() {
    return new VidDevManager(pjsua2JNI.Endpoint_vidDevManager(swigCPtr, this), false);
  }

  public CodecInfoVector codecEnum() throws java.lang.Exception {
    return new CodecInfoVector(pjsua2JNI.Endpoint_codecEnum(swigCPtr, this), false);
  }

  public void codecSetPriority(String codec_id, short priority) throws java.lang.Exception {
    pjsua2JNI.Endpoint_codecSetPriority(swigCPtr, this, codec_id, priority);
  }

  public CodecParam codecGetParam(String codec_id) throws java.lang.Exception {
    return new CodecParam(pjsua2JNI.Endpoint_codecGetParam(swigCPtr, this, codec_id), true);
  }

  public void codecSetParam(String codec_id, CodecParam param) throws java.lang.Exception {
    pjsua2JNI.Endpoint_codecSetParam(swigCPtr, this, codec_id, CodecParam.getCPtr(param), param);
  }

  public CodecInfoVector videoCodecEnum() throws java.lang.Exception {
    return new CodecInfoVector(pjsua2JNI.Endpoint_videoCodecEnum(swigCPtr, this), false);
  }

  public void videoCodecSetPriority(String codec_id, short priority) throws java.lang.Exception {
    pjsua2JNI.Endpoint_videoCodecSetPriority(swigCPtr, this, codec_id, priority);
  }

  public VidCodecParam getVideoCodecParam(String codec_id) throws java.lang.Exception {
    return new VidCodecParam(pjsua2JNI.Endpoint_getVideoCodecParam(swigCPtr, this, codec_id), true);
  }

  public void setVideoCodecParam(String codec_id, VidCodecParam param) throws java.lang.Exception {
    pjsua2JNI.Endpoint_setVideoCodecParam(swigCPtr, this, codec_id, VidCodecParam.getCPtr(param), param);
  }

  public void resetVideoCodecParam(String codec_id) throws java.lang.Exception {
    pjsua2JNI.Endpoint_resetVideoCodecParam(swigCPtr, this, codec_id);
  }

  public void handleIpChange(IpChangeParam param) throws java.lang.Exception {
    pjsua2JNI.Endpoint_handleIpChange(swigCPtr, this, IpChangeParam.getCPtr(param), param);
  }

  public void onNatDetectionComplete(OnNatDetectionCompleteParam prm) {
    if (getClass() == Endpoint.class) pjsua2JNI.Endpoint_onNatDetectionComplete(swigCPtr, this, OnNatDetectionCompleteParam.getCPtr(prm), prm); else pjsua2JNI.Endpoint_onNatDetectionCompleteSwigExplicitEndpoint(swigCPtr, this, OnNatDetectionCompleteParam.getCPtr(prm), prm);
  }

  public void onNatCheckStunServersComplete(OnNatCheckStunServersCompleteParam prm) {
    if (getClass() == Endpoint.class) pjsua2JNI.Endpoint_onNatCheckStunServersComplete(swigCPtr, this, OnNatCheckStunServersCompleteParam.getCPtr(prm), prm); else pjsua2JNI.Endpoint_onNatCheckStunServersCompleteSwigExplicitEndpoint(swigCPtr, this, OnNatCheckStunServersCompleteParam.getCPtr(prm), prm);
  }

  public void onTransportState(OnTransportStateParam prm) {
    if (getClass() == Endpoint.class) pjsua2JNI.Endpoint_onTransportState(swigCPtr, this, OnTransportStateParam.getCPtr(prm), prm); else pjsua2JNI.Endpoint_onTransportStateSwigExplicitEndpoint(swigCPtr, this, OnTransportStateParam.getCPtr(prm), prm);
  }

  public void onTimer(OnTimerParam prm) {
    if (getClass() == Endpoint.class) pjsua2JNI.Endpoint_onTimer(swigCPtr, this, OnTimerParam.getCPtr(prm), prm); else pjsua2JNI.Endpoint_onTimerSwigExplicitEndpoint(swigCPtr, this, OnTimerParam.getCPtr(prm), prm);
  }

  public void onSelectAccount(OnSelectAccountParam prm) {
    if (getClass() == Endpoint.class) pjsua2JNI.Endpoint_onSelectAccount(swigCPtr, this, OnSelectAccountParam.getCPtr(prm), prm); else pjsua2JNI.Endpoint_onSelectAccountSwigExplicitEndpoint(swigCPtr, this, OnSelectAccountParam.getCPtr(prm), prm);
  }

  public void onIpChangeProgress(OnIpChangeProgressParam prm) {
    if (getClass() == Endpoint.class) pjsua2JNI.Endpoint_onIpChangeProgress(swigCPtr, this, OnIpChangeProgressParam.getCPtr(prm), prm); else pjsua2JNI.Endpoint_onIpChangeProgressSwigExplicitEndpoint(swigCPtr, this, OnIpChangeProgressParam.getCPtr(prm), prm);
  }

}
