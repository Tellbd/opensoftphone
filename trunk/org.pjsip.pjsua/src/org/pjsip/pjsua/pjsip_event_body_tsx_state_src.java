/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.36
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public class pjsip_event_body_tsx_state_src {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected pjsip_event_body_tsx_state_src(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(pjsip_event_body_tsx_state_src obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      pjsuaJNI.delete_pjsip_event_body_tsx_state_src(swigCPtr);
    }
    swigCPtr = 0;
  }

  public void setRdata(SWIGTYPE_p_pjsip_rx_data value) {
    pjsuaJNI.pjsip_event_body_tsx_state_src_rdata_set(swigCPtr, this, SWIGTYPE_p_pjsip_rx_data.getCPtr(value));
  }

  public SWIGTYPE_p_pjsip_rx_data getRdata() {
    long cPtr = pjsuaJNI.pjsip_event_body_tsx_state_src_rdata_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_pjsip_rx_data(cPtr, false);
  }

  public void setTdata(SWIGTYPE_p_pjsip_tx_data value) {
    pjsuaJNI.pjsip_event_body_tsx_state_src_tdata_set(swigCPtr, this, SWIGTYPE_p_pjsip_tx_data.getCPtr(value));
  }

  public SWIGTYPE_p_pjsip_tx_data getTdata() {
    long cPtr = pjsuaJNI.pjsip_event_body_tsx_state_src_tdata_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_pjsip_tx_data(cPtr, false);
  }

  public void setTimer(SWIGTYPE_p_pj_timer_entry value) {
    pjsuaJNI.pjsip_event_body_tsx_state_src_timer_set(swigCPtr, this, SWIGTYPE_p_pj_timer_entry.getCPtr(value));
  }

  public SWIGTYPE_p_pj_timer_entry getTimer() {
    long cPtr = pjsuaJNI.pjsip_event_body_tsx_state_src_timer_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_pj_timer_entry(cPtr, false);
  }

  public void setStatus(int value) {
    pjsuaJNI.pjsip_event_body_tsx_state_src_status_set(swigCPtr, this, value);
  }

  public int getStatus() {
    return pjsuaJNI.pjsip_event_body_tsx_state_src_status_get(swigCPtr, this);
  }

  public void setData(byte[] value) {
    pjsuaJNI.pjsip_event_body_tsx_state_src_data_set(swigCPtr, this, value);
  }

  public byte[] getData() {
	return pjsuaJNI.pjsip_event_body_tsx_state_src_data_get(swigCPtr, this);
}

  public pjsip_event_body_tsx_state_src() {
    this(pjsuaJNI.new_pjsip_event_body_tsx_state_src(), true);
  }

}