/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MuscleList {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public MuscleList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(MuscleList obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_MuscleList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MuscleList(Component root, ComponentFilter f) {
    this(opensimSimulationJNI.new_MuscleList__SWIG_0(Component.getCPtr(root), root, ComponentFilter.getCPtr(f), f), true);
  }

  public MuscleList(Component root) {
    this(opensimSimulationJNI.new_MuscleList__SWIG_1(Component.getCPtr(root), root), true);
  }

  public MuscleIterator begin() {
    return new MuscleIterator(opensimSimulationJNI.MuscleList_begin__SWIG_0(swigCPtr, this), true);
  }

  public SWIGTYPE_p_OpenSim__ComponentListIteratorT_std__add_constT_OpenSim__Muscle_const_t__type_t cbegin() {
    return new SWIGTYPE_p_OpenSim__ComponentListIteratorT_std__add_constT_OpenSim__Muscle_const_t__type_t(opensimSimulationJNI.MuscleList_cbegin(swigCPtr, this), true);
  }

  public MuscleIterator end() {
    return new MuscleIterator(opensimSimulationJNI.MuscleList_end__SWIG_0(swigCPtr, this), true);
  }

  public SWIGTYPE_p_OpenSim__ComponentListIteratorT_std__add_constT_OpenSim__Muscle_const_t__type_t cend() {
    return new SWIGTYPE_p_OpenSim__ComponentListIteratorT_std__add_constT_OpenSim__Muscle_const_t__type_t(opensimSimulationJNI.MuscleList_cend(swigCPtr, this), true);
  }

  public void setFilter(ComponentFilter filter) {
    opensimSimulationJNI.MuscleList_setFilter(swigCPtr, this, ComponentFilter.getCPtr(filter), filter);
  }

}
