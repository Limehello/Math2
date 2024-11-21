package com.limehello.math2;

import java.util.ArrayList;
import java.util.List;

public class Radical {
 private Radical() {}
 public static int sqrt(int a){
  return (int)Math.sqrt(a);
 }
 public static int sqrtInt(int a){
  return (int)Math.sqrt(a);
 }
 public static double sqrt(double a) {
  return Math.sqrt(a);
 }
 public static double sqrtDouble(double a) {
  return Math.sqrt(a);
 }
 public static float sqrt(float a) {
  return (float)Math.sqrt(a);
 }
 public static float sqrtFloat(float a) {
  return (float)Math.sqrt(a);
 }
 public static short sqrt(short a) {
  return (short)Math.sqrt(a);
 }
 public static short sqrtShort(short a) {
  return (short)Math.sqrt(a);
 }
 public static long sqrt(long a) {
  return (long)Math.sqrt(a);
 }
 public static long sqrtLong(long a) {
  return (long)Math.sqrt(a);
 }
 public static byte sqrt(byte a) {
  return (byte)Math.sqrt(a);
 }
 public static byte sqrtByte(byte a) {
  return (byte)Math.sqrt(a);
 }
 public static int cbrt(int a){
  return (int)Math.cbrt(a);
 }
 public static int cbrtInt(int a){
  return (int)Math.cbrt(a);
 }
 public static double cbrt(double a) {
  return Math.cbrt(a);
 }
 public static double cbrtDouble(double a) {
  return Math.cbrt(a);
 }
 public static float cbrt(float a) {
  return (float)Math.cbrt(a);
 }
 public static float cbrtFloat(float a) {
  return (float)Math.cbrt(a);
 }
 public static short cbrt(short a) {
  return (short)Math.cbrt(a);
 }
 public static short cbrtShort(short a) {
  return (short)Math.cbrt(a);
 }
 public static long cbrt(long a) {
  return (long)Math.cbrt(a);
 }
 public static long cbrtLong(long a) {
  return (long)Math.cbrt(a);
 }
 public static byte cbrt(byte a) {
  return (byte)Math.cbrt(a);
 }
 public static byte cbrtByte(byte a) {
  return (byte)Math.cbrt(a);
 }
 public static int qrt(int a){
  return (int)root(a, 4);
 }
 public static int qrtInt(int a){
  return (int)root(a, 4);
 }
 public static double qrt(double a) {
  return root(a, 4);
 }
 public static double qrtDouble(double a) {
  return root(a, 4);
 }
 public static float qrt(float a) {
  return (float)root(a, 4);
 }
 public static float qrtFloat(float a) {
  return (float)root(a, 4);
 }
 public static short qrt(short a) {
  return (short)root(a, 4);
 }
 public static short qrtShort(short a) {
  return (short)root(a, 4);
 }
 public static long qrt(long a) {
  return (long)root(a, 4);
 }
 public static long qrtLong(long a) {
  return (long)root(a, 4);
 }
 public static byte qrt(byte a) {
  return (byte)root(a, 4);
 }
 public static byte qrtByte(byte a) {
  return (byte)root(a, 4);
 }
 public static int root(int a, int b){
  return (int)Math.pow(a, 1.0 / b);
 }
 public static int rootInt(int a, int b){
  return (int)Math.pow(a, 1.0 / b);
 }
 public static double root(double a, double b) {
  return Math.pow(a, 1.0 / b);
 }
 public static double rootDouble(double a, double b) {
  return Math.pow(a, 1.0 / b);
 }
 public static float root(float a, float b) {
  return (float)Math.pow(a, 1.0 / b);
 }
 public static float rootFloat(float a, float b) {
  return (float)Math.pow(a, 1.0 / b);
 }
 public static short root(short a, short b) {
  return (short)Math.pow(a, 1.0 / b);
 }
 public static short rootShort(short a, short b) {
  return (short)Math.pow(a, 1.0 / b);
 }
 public static long root(long a, long b) {
  return (long)Math.pow(a, 1.0 / b);
 }
 public static long rootLong(long a, long b) {
  return (long)Math.pow(a, 1.0 / b);
 }
 public static byte root(byte a, byte b) {
  return (byte)Math.pow(a, 1.0 / b);
 }
 public static byte rootByte(byte a, byte b) {
  return (byte)Math.pow(a, 1.0 / b);
 }
 public static int[] rootInt(int[] a, int[] b) {
  List<Integer> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.length, b.length); i++) {
   result.add((int)Math.pow(((i < a.length) ? a[i] : 1), 1/((i < b.length) ? b[i] : 1)));
  }
  int[] resultArray = new int[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static double[] rootDouble(double[] a, double[] b) {
  List<Double> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.length, b.length); i++) {
   result.add(Math.pow(((i < a.length) ? a[i] : 1), 1/((i < b.length) ? b[i] : 1)));
  }
  double[] resultArray = new double[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static float[] rootFloat(float[] a, float[] b) {
  List<Float> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.length, b.length); i++) {
   result.add((float)Math.pow(((i < a.length) ? a[i] : 1), 1/((i < b.length) ? b[i] : 1)));
  }
  float[] resultArray = new float[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static short[] rootShort(short[] a, short[] b) {
  List<Short> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.length, b.length); i++) {
   result.add((short)Math.pow(((i < a.length) ? a[i] : 1),1/ ((i < b.length) ? b[i] : 1)));
  }
  short[] resultArray = new short[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static long[] rootLong(long[] a, long[] b) {
  List<Long> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.length, b.length); i++) {
   result.add((long)Math.pow(((i < a.length) ? a[i] : 1), 1/((i < b.length) ? b[i] : 1)));
  }
  long[] resultArray = new long[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static byte[] rootByte(byte[] a, byte[] b) {
  List<Byte> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.length, b.length); i++) {
   result.add((byte)Math.pow(((i < a.length) ? a[i] : 1), 1/((i < b.length) ? b[i] : 1)));
  }
  byte[] resultArray = new byte[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static List<Integer> rootInt(List<Integer> a, List<Integer> b) {
  List<Integer> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
   result.add((int)Math.pow(((i < a.size()) ? a.get(i) : 1), 1/((i < b.size()) ? b.get(i) : 1)));
  }
  return result;
 }
 public static List<Double> rootDouble(List<Double> a, List<Double> b) {
  List<Double> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
   result.add(Math.pow(((i < a.size()) ? a.get(i) : 1), 1/((i < b.size()) ? b.get(i) : 1)));
  }
  return result;
 }
 public static List<Float> rootFloat(List<Float> a, List<Float> b) {
  List<Float> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
   result.add((float)Math.pow(((i < a.size()) ? a.get(i) : 1), 1/((i < b.size()) ? b.get(i) : 1)));
  }
  return result;
 }
 public static List<Short> rootShort(List<Short> a, List<Short> b) {
  List<Short> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
   result.add((short)Math.pow(((i < a.size()) ? a.get(i) : 1),1/ ((i < b.size()) ? b.get(i) : 1)));
  }
  return result;
 }
 public static List<Long> rootLong(List<Long> a, List<Long> b) {
  List<Long> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
   result.add((long)Math.pow(((i < a.size()) ? a.get(i) : 1),1/ ((i < b.size()) ? b.get(i) : 1)));
  }
  return result;
 }
 public static List<Byte> rootByte(List<Byte> a, List<Byte> b) {
  List<Byte> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
   result.add((byte)Math.pow(((i < a.size()) ? a.get(i) : 1),1/ ((i < b.size()) ? b.get(i) : 1)));
  }
  return result;
 }
 public static int[] rootInt(int a, int[] b) {
  List<Integer> result = new ArrayList<>();
  for (int i : b) {
   result.add(a + i);
  }
  int[] resultArray = new int[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static double[] rootDouble(double a, double[] b) {
  List<Double> result = new ArrayList<>();
  for (double i : b) {
   result.add(a + i);
  }
  double[] resultArray = new double[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static float[] rootFloat(float a, float[] b) {
  List<Float> result = new ArrayList<>();
  for (float i : b) {
   result.add(a + i);
  }
  float[] resultArray = new float[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static short[] rootShort(short a, short[] b) {
  List<Short> result = new ArrayList<>();
  for (short i : b) {
   result.add((short)(a + i));
  }
  short[] resultArray = new short[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static long[] rootLong(long a, long[] b) {
  List<Long> result = new ArrayList<>();
  for (long i : b) {
   result.add(a + i);
  }
  long[] resultArray = new long[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static byte[] rootByte(byte a, byte[] b) {
  List<Byte> result = new ArrayList<>();
  for (byte i : b) {
   result.add((byte)(a + i));
  }
  byte[] resultArray = new byte[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static List<Integer> rootInt(int a, List<Integer> b) {
  List<Integer> result = new ArrayList<>();
  for (int i : b) {
   result.add(a + i);
  }
  return result;
 }
 public static List<Double> rootDouble(double a, List<Double> b) {
  List<Double> result = new ArrayList<>();
  for (double i : b) {
   result.add(a + i);
  }
  return result;
 }
 public static List<Float> rootFloat(float a, List<Float> b) {
  List<Float> result = new ArrayList<>();
  for (float i : b) {
   result.add(a + i);
  }
  return result;
 }
 public static List<Short> rootShort(short a, List<Short> b) {
  List<Short> result = new ArrayList<>();
  for (short i : b) {
   result.add((short)(a + i));
  }
  return result;
 }
 public static List<Long> rootLong(long a, List<Long> b) {
  List<Long> result = new ArrayList<>();
  for (long i : b) {
   result.add(a + i);
  }
  return result;
 }
 public static List<Byte> rootByte(byte a, List<Byte> b) {
  List<Byte> result = new ArrayList<>();
  for (byte i : b) {
   result.add((byte)(a + i));
  }
  return result;
 }
}
