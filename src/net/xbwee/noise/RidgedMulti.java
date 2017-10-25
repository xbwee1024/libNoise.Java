/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class RidgedMulti extends Module {
  private transient long swigCPtr;

  protected RidgedMulti(long cPtr, boolean cMemoryOwn) {
    super(NoiseModuleJNI.RidgedMulti_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RidgedMulti obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        NoiseModuleJNI.delete_RidgedMulti(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RidgedMulti() {
    this(NoiseModuleJNI.new_RidgedMulti(), true);
  }

  public double GetFrequency() {
    return NoiseModuleJNI.RidgedMulti_GetFrequency(swigCPtr, this);
  }

  public double GetLacunarity() {
    return NoiseModuleJNI.RidgedMulti_GetLacunarity(swigCPtr, this);
  }

  public SWIGTYPE_p_noise__NoiseQuality GetNoiseQuality() {
    return new SWIGTYPE_p_noise__NoiseQuality(NoiseModuleJNI.RidgedMulti_GetNoiseQuality(swigCPtr, this), true);
  }

  public int GetOctaveCount() {
    return NoiseModuleJNI.RidgedMulti_GetOctaveCount(swigCPtr, this);
  }

  public int GetSeed() {
    return NoiseModuleJNI.RidgedMulti_GetSeed(swigCPtr, this);
  }

  public int GetSourceModuleCount() {
    return NoiseModuleJNI.RidgedMulti_GetSourceModuleCount(swigCPtr, this);
  }

  public double GetValue(double x, double y, double z) {
    return NoiseModuleJNI.RidgedMulti_GetValue(swigCPtr, this, x, y, z);
  }

  public void SetFrequency(double frequency) {
    NoiseModuleJNI.RidgedMulti_SetFrequency(swigCPtr, this, frequency);
  }

  public void SetLacunarity(double lacunarity) {
    NoiseModuleJNI.RidgedMulti_SetLacunarity(swigCPtr, this, lacunarity);
  }

  public void SetNoiseQuality(SWIGTYPE_p_noise__NoiseQuality noiseQuality) {
    NoiseModuleJNI.RidgedMulti_SetNoiseQuality(swigCPtr, this, SWIGTYPE_p_noise__NoiseQuality.getCPtr(noiseQuality));
  }

  public void SetOctaveCount(int octaveCount) {
    NoiseModuleJNI.RidgedMulti_SetOctaveCount(swigCPtr, this, octaveCount);
  }

  public void SetSeed(int seed) {
    NoiseModuleJNI.RidgedMulti_SetSeed(swigCPtr, this, seed);
  }

}
