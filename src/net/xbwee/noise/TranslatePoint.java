/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class TranslatePoint extends Module {
  private transient long swigCPtr;

  protected TranslatePoint(long cPtr, boolean cMemoryOwn) {
    super(NoiseModuleJNI.TranslatePoint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TranslatePoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        NoiseModuleJNI.delete_TranslatePoint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public TranslatePoint() {
    this(NoiseModuleJNI.new_TranslatePoint(), true);
  }

  public int GetSourceModuleCount() {
    return NoiseModuleJNI.TranslatePoint_GetSourceModuleCount(swigCPtr, this);
  }

  public double GetValue(double x, double y, double z) {
    return NoiseModuleJNI.TranslatePoint_GetValue(swigCPtr, this, x, y, z);
  }

  public double GetXTranslation() {
    return NoiseModuleJNI.TranslatePoint_GetXTranslation(swigCPtr, this);
  }

  public double GetYTranslation() {
    return NoiseModuleJNI.TranslatePoint_GetYTranslation(swigCPtr, this);
  }

  public double GetZTranslation() {
    return NoiseModuleJNI.TranslatePoint_GetZTranslation(swigCPtr, this);
  }

  public void SetTranslation(double translation) {
    NoiseModuleJNI.TranslatePoint_SetTranslation__SWIG_0(swigCPtr, this, translation);
  }

  public void SetTranslation(double xTranslation, double yTranslation, double zTranslation) {
    NoiseModuleJNI.TranslatePoint_SetTranslation__SWIG_1(swigCPtr, this, xTranslation, yTranslation, zTranslation);
  }

  public void SetXTranslation(double xTranslation) {
    NoiseModuleJNI.TranslatePoint_SetXTranslation(swigCPtr, this, xTranslation);
  }

  public void SetYTranslation(double yTranslation) {
    NoiseModuleJNI.TranslatePoint_SetYTranslation(swigCPtr, this, yTranslation);
  }

  public void SetZTranslation(double zTranslation) {
    NoiseModuleJNI.TranslatePoint_SetZTranslation(swigCPtr, this, zTranslation);
  }

}
